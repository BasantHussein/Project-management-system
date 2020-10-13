/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmanager;

import java.io.Serializable;
import java.util.ArrayList;


/**
 *
 * @author lenovo
 */
public class TeamLeader extends Person implements Serializable{
    
    private final String EmpFileName = "TeamLeader.bin";
    public static ArrayList<TeamLeader> Leaders = new ArrayList<TeamLeader>();
    private int ProjectID;
    public TeamLeader() {
    }

    public TeamLeader(String name, int id, String user, String pass, int age,String address,double salary,int PID) {
        super(name, id, user, pass, age, address,salary);
        this.ProjectID = PID;
    }
    
    public int getPID(){
    return this.ProjectID;
    }
    
    public void setPID(int PID){
    this.ProjectID = PID;
    }
    
    public boolean addLeader() {
        loadFromFile();
        Leaders.add(this);
        return commitToFile();
    }

    public boolean commitToFile() {
        return FManger.write(EmpFileName, Leaders);
    }

    public void loadFromFile() {
        Leaders = (ArrayList<TeamLeader>) FManger.read(EmpFileName);
    }

    private int getLeadIndex(int id) {
        for (int i = 0; i < Leaders.size(); i++) {
            if (Leaders.get(i).getID() == id) {
                return i;
            }
        }

        return -1;
    }
    
     public TeamLeader searchLeader(int id) {
        TeamLeader temp = new TeamLeader();
        loadFromFile();
        int index = getLeadIndex(id);
        if (index != -1) {
            return Leaders.get(index);
        } else {
            return temp;
        }
    }

    public String displayAllLeaders() {
        loadFromFile();
        String S = "\nAll Leaders Data:\n";
        for (TeamLeader x : Leaders) {
            S = S + x.toString();
        }
        return S;
    }
   
    public ArrayList<TeamLeader> listEmployees() {
        loadFromFile();
        return Leaders;
    }
    
     public boolean updateLeader(int oldID, TeamLeader x) {
        loadFromFile();
        int index = getLeadIndex(oldID);

        if (index != -1) {
            Leaders.set(index, x);

            return commitToFile();
        }

        return false;
    }

     public boolean updateTL() {
        loadFromFile();
        int index = getLeadIndex(this.id);

        if (index != -1) {
            Leaders.set(index, this);

            return commitToFile();
        }

        return false;
    }

     
    public boolean deleteLeader(int id) {
        loadFromFile();
        int index = getLeadIndex(id);

        if (index != -1) {
            Leaders.remove(index);

            return commitToFile();
        }

        return false;
    }
    
  @Override
    public String toString() {
        return "\nI'm a TeamLeader : " + name + " " + "\n" + "ID : " + id + "\nAge : " + age + "\nUserName: " + userName + "\t Password: " + pass + "\nAddress" + address + "\n";
    }

   @Override
    public boolean login(String userName, String Pass) {
        loadFromFile();
        for (TeamLeader x : Leaders) {
            if (userName.equals(x.userName) && Pass.equals(x.pass)) {
                return true;
            }
        }
        return false;
    }
    
     
    
    
}
