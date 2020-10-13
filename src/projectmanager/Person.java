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
public abstract class Person implements  Ilogin,Serializable {

    protected int id;
    protected String name;
    protected String userName;
    protected String pass;
    protected int age;
    protected String address;

    /**
     *
     */
    protected int entrytime;
    protected int exittime;

    /**
     *
     */
    public ArrayList<Integer> WorkHours = new ArrayList<Integer>();
    protected Salary salary = new Salary();
    FileMangerBinary FManger = new FileMangerBinary();

    static MyException MyEX = new MyException("Hassan Exception");

    public Person() {
    }

  
    public Person(String name, int id, String user, String pass, int age,String address , double salary) {
       
        if (id < 0) {
            this.id = MyEX.checkPositive("ID");
        } else {
            this.id = id;
        }
        this.name = name;
        this.salary.MonthlySalary = salary;
        if (age < 0) {
            this.age = MyEX.checkPositive("Age");
        } else {
            this.age = age;
        }

        if (!user.contains("@") || !user.contains(".")) {
            this.userName = MyEX.checkEmail("User name");
        } else {
            this.userName = user;
        }

        if (pass.length() < 8) {
            this.pass = MyEX.checkPassLength("Password");
        } else {
            this.pass = pass;
        }
        this.address = address;
    }

    @Override
    public abstract String toString();

    //setter
    public void setID(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary.MonthlySalary = salary;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    /*public void setSalary(double Salary) {
    this.salary = Salary;
    }*/
    public void setAddress(String address ) {
        this.address = address;
    }
    public void setEntry(int entrytime){
        this.entrytime = entrytime;
    }
    public void setExit(int exittime){
        this.exittime = exittime;
        DayHours();
    }

    //getter
    public String getuserName() {
        return this.userName;
    }

    public String getPass() {
        return this.pass;
    }

    public int getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
    
     public String getaddress() {
        return this.address;
    }

    public double getSalary() {
        return this.salary.MonthlySalary;
    }
     /*   public double getSalary() {
     return this.salary;
     }*/
    
    public void DayHours(){   
        WorkHours.add(exittime-entrytime);
    }
}
