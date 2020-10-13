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
 * @author Omar Qabeel
 */
public class Task implements Serializable {
    
    private final String TaskFileName = "Task.bin";

    public static ArrayList<Task> Tasks = new ArrayList<Task>();
    public static ArrayList<Task> Tasks2 = new ArrayList<Task>();
    int ID;
    int ProjectID;
    int TeamLeaderID;
    String Name;
    String Descirption;
    int EmployeeID;
    boolean State = false;
    FileMangerBinary FManger = new FileMangerBinary();
    public Task(){}
    public Task(int ID,int ProjectID ,String Name, String Des, int e){   
    this.ID = ID;
    this.Name = Name;
    this.Descirption = Des;
    this.ProjectID = ProjectID;
    this.EmployeeID = e;
    }
    
    public void setName(String Name){
    this.Name = Name;
    }
    
    public void setState (boolean State){
        this.State=State;
    }
    
    public boolean getState (boolean State){
       return this.State;
    }
    
    public void setDes(String Des){
    this.Descirption = Des;
    }
    
    public String getName(){
    return this.Name;
    }
    
    public String getDes(){
    return this.Descirption;
    }
    
    public void setID(int ID){
    this.ID = ID;
    }
    public void setPID(int PID){
    this.ProjectID = PID;
    }
    
    public void setTID(int TID){
    this.TeamLeaderID = TID;
    }
    public int getID(){
    return this.ID;
    }
    public int getEID(){
    return this.EmployeeID;
    }
    public int getTID(){
    return this.TeamLeaderID;
    }
    public int getPID(){
    return this.ProjectID;
    }
    public void AssignTask(int e){
    this.EmployeeID = e;
    }
    public boolean addTask() {
        loadFromFile();
        Tasks.add(this);
        return commitToFile();
    }

    public boolean commitToFile() {
        return FManger.write(TaskFileName, Tasks);
    }

    public void loadFromFile() {
        Tasks = (ArrayList<Task>) FManger.read(TaskFileName);
    }
    public ArrayList<Task> listTasks() {
        loadFromFile();
        return Tasks;
    }
    public ArrayList<Task> ProjectTasks(int ProjectID){
    loadFromFile();
    Tasks2.clear();
    for (int i = 0; i < Tasks.size(); i++) {
            if (Tasks.get(i).getPID() == ProjectID) {
              Tasks2.add(Tasks.get(i));
            }}
    return Tasks2;   
    }
    public ArrayList<Task> ProjectNotCTasks(int ProjectID){
    loadFromFile();
    Tasks2.clear();
    for (int i = 0; i < Tasks.size(); i++) {
            if ((Tasks.get(i).getPID() == ProjectID) && !Tasks.get(i).State) {
              Tasks2.add(Tasks.get(i));
            }}
    return Tasks2;   
    }
    public ArrayList<Task> TeamTasks(int TeamLeaderID){
    loadFromFile();
    Tasks2.clear();
    for (int i = 0; i < Tasks.size(); i++) {
            if (Tasks.get(i).getTID() == TeamLeaderID) {
              Tasks2.add(Tasks.get(i));
            }}
    return Tasks2;   
    }
    public ArrayList<Task> TeamNotCTasks(int TeamLeaderID){
    loadFromFile();
    Tasks2.clear();
    for (int i = 0; i < Tasks.size(); i++) {
            if ((Tasks.get(i).getTID() == TeamLeaderID) && !Tasks.get(i).State) {
              Tasks2.add(Tasks.get(i));
            }}
    return Tasks2;   
    }
    public ArrayList<Task> EmployeeTasks(int EmployeeID){
    loadFromFile();
    Tasks2.clear();
    for (int i = 0; i < Tasks.size(); i++) {
            if (Tasks.get(i).getEID() == EmployeeID) {
              Tasks2.add(Tasks.get(i));
            }}
    return Tasks2;   
    }
    public ArrayList<Task> EmployeeNotCTasks(int EmployeeID){
    loadFromFile();
    Tasks2.clear();
    for (int i = 0; i < Tasks.size(); i++) {
            if ((Tasks.get(i).getEID() == EmployeeID) && !Tasks.get(i).State) {
              Tasks2.add(Tasks.get(i));
            }}
    return Tasks2;   
    }
    
    public boolean ChangeState(){
        if (State == false){
            State=true;
        }
        //else State = false;
        return false;
    }
    
    public ArrayList<Task> ViewCompletedTasks(ArrayList<Task> Tasks2 )
    {   loadFromFile();
        int i;
        for(i=0; i<Tasks.size(); i++)
        {
            if(Tasks.get(i).ChangeState()== true)
            {
                Tasks2.add(Tasks.get(i));
            } 
        }
        return Tasks2;
    }
 
    
    
}
