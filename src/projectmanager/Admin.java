/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmanager;

/**
 *
 * @author Al-Hassan Abdel-Raof
 * 
 */
public class Admin extends Person {

    public Admin() {

    }

    public Admin(String name, int id, String user, String pass, int age,String address, double salary) {
        super(name, id, user, pass, age, address,salary );
    }

    

    @Override
    public String toString() {
        return "I'm Employee : " + name + "\n" + "ID : " + id + " Age : " + age + " Salary : " + salary + "\n" + "\nUserName: " + userName + "\t Password: " + pass + "\n";
    }

    @Override
    public boolean login(String userName, String Pass) {

        if (userName.equals("Admin@yahoo.com") && Pass.equals("12345678")) {
            return true;
        }
        return false;

    }

}