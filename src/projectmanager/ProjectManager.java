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
public class ProjectManager extends Person implements Serializable{
    
    private final String EmpFileName = "Pmanager.bin";
    public static ArrayList<ProjectManager> Pmanagers = new ArrayList<ProjectManager>();
    
    public ProjectManager() {
    }

    public ProjectManager(String name, int id, String user, String pass, int age,String address,double salary) {
        super(name, id, user, pass, age, address,salary);
    }
    
    public boolean addPM() {
        loadFromFile();
        Pmanagers.add(this);
        return commitToFile();
    }

    public boolean commitToFile() {
        return FManger.write(EmpFileName, Pmanagers);
    }

    public void loadFromFile() {
        Pmanagers = (ArrayList<ProjectManager>) FManger.read(EmpFileName);
    }

    private int getPMIndex(int id) {
        for (int i = 0; i < Pmanagers.size(); i++) {
            if (Pmanagers.get(i).getID() == id) {
                return i;
            }
        }

        return -1;
    }
    
    public ArrayList<ProjectManager> listPms() {
        loadFromFile();
        return Pmanagers;
    }
     public ProjectManager searchPM(int id) {
        ProjectManager temp = new ProjectManager();
        loadFromFile();
        int index = getPMIndex(id);
        if (index != -1) {
            return Pmanagers.get(index);
        } else {
            return temp;
        }
    }

    public String displayAllPM() {
        loadFromFile();
        String S = "\nAll PMs Data:\n";
        for (ProjectManager x : Pmanagers) {
            S = S + x.toString();
        }
        return S;
    }
    
     public boolean updateProjectManager(int oldID, ProjectManager x) {
        loadFromFile();
        int index = getPMIndex(oldID);

        if (index != -1) {
            Pmanagers.set(index, x);

            return commitToFile();
        }

        return false;
    }

      public boolean updatePM() {
        loadFromFile();
        int index = getPMIndex(this.id);

        if (index != -1) {
            Pmanagers.set(index, this);

            return commitToFile();
        }

        return false;
    }
    public boolean deletePM(int id) {
        loadFromFile();
        int index = getPMIndex(id);

        if (index != -1) {
            Pmanagers.remove(index);

            return commitToFile();
        }

        return false;
    }
    

    @Override
    public String toString() {
        return "\nI'm a ProjectManager : " + name + " " + "\n" + "ID : " + id + "\nAge : " + age + "\nUserName: " + userName + "\t Password: " + pass + "\nAddress" + address + "\n";
    }

   @Override
    public boolean login(String userName, String Pass) {
        loadFromFile();
        for (ProjectManager x : Pmanagers) {
            if (userName.equals(x.userName) && Pass.equals(x.pass)) {
                return true;
            }
        }
        return false;
    }
    
}
