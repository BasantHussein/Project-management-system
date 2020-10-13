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
 * @author Al-Hassan Abdel-Raof
 */
public class Employee extends Person implements Serializable {

    
    public static long start;
    public static String user;
    private final String EmpFileName = "Employee.bin";
    long workinghours;
    public static ArrayList<Employee> Employees = new ArrayList<Employee>();
    public static ArrayList<Employee> Employees2 = new ArrayList<Employee>();
    private int TeamLeaderID;

    public Employee() {
    }

    public Employee(String name, int id, String user, String pass, int age,String address, double salary,int TeamLeaderID ) {
        super(name, id, user, pass, age, address,salary);
        this.TeamLeaderID = TeamLeaderID;
    }
    
    public int getemployeeuser(String user) {
        for (int i = 0; i < Employees.size(); i++) {
            if (Employees.get(i).getuserName().equals(user)) {
                return i;
            }
        }

        return -1;
    }
    
    public Employee EWH(String user) {
        Employee temp = new Employee();
        loadFromFile();
        int index = getemployeeuser(user);
        if (index != -1) {
            return Employees.get(index);
        } else {
            return temp;
        }
        
        
    }
    
    public void setTID (int TeamLeaderID){
        this.TeamLeaderID=TeamLeaderID;
        
    }
     public int getTID (){
        return TeamLeaderID;
    }

    public boolean addEmployee() {
        loadFromFile();
        Employees.add(this);
        return commitToFile();
    }

    public boolean commitToFile() {
        return FManger.write(EmpFileName, Employees);
    }

    public void loadFromFile() {
        Employees = (ArrayList<Employee>) FManger.read(EmpFileName);
    }
    
    public ArrayList<Employee> searchByTID (int TLD) {
        loadFromFile();
        Employees2.clear();
        for (int i = 0; i < Employees.size(); i++) {
            if (Employees.get(i).getTID() == TLD) {
                Employees2.add(Employees.get(i));
            }
        }
        return null;
      
    }

    private int getEmpIndex(int id) {
        for (int i = 0; i < Employees.size(); i++) {
            if (Employees.get(i).getID() == id) {
                return i;
            }
        }
        return -1;
    }

    public Employee searchEmployee(int id) {
        Employee temp = new Employee();
        loadFromFile();
        int index = getEmpIndex(id);
        if (index != -1) {
            return Employees.get(index);
        } else {
            return temp;
        }
    }

    public String displayAllEmployee() {
        loadFromFile();
        String S = "\nAll Student Data:\n";
        for (Employee x : Employees) {
            S = S + x.toString();
        }
        return S;
    }
    
    public ArrayList<Employee> listEmployees() {
        loadFromFile();
        return Employees;
    }
    
   public boolean updateEmployee(int oldID, Employee x) {
        loadFromFile();
        int index = getEmpIndex(oldID);

        if (index != -1) {
            Employees.set(index, x);

            return commitToFile();
        }
        return false;
    }
   public boolean updateEmp() {
        loadFromFile();
        int index = getEmpIndex(this.id);

        if (index != -1) {
            Employees.set(index, this);

            return commitToFile();
        }
        return false;
    }

   
    public boolean deleteEmployee(int id) {
        loadFromFile();
        int index = getEmpIndex(id);

        if (index != -1) {
            Employees.remove(index);

            return commitToFile();
        }

        return false;
    }

    @Override
    public String toString() {
        return "\n I'm Employee : " + name + "\n" + "ID : " + id + " Age : " + age + " Salary : " + salary + "\n" + "Dept. : " + "\nUserName: " + userName + "\t Password: " + pass + "\n";
    }

    @Override
    public boolean login(String userName, String Pass) {
        loadFromFile();
        for (Employee x : Employees) {
            if (userName.equals(x.userName) && Pass.equals(x.pass)) {
                return true;
            }
        }
        return false;
    }

}
