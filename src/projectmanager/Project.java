/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmanager;

import java.io.Serializable;
import java.util.ArrayList;
import static projectmanager.Task.Tasks;

/*
 * @author Al-Hassan Abdel-Raof
 */
public class Project implements Serializable {

    
    private final String ProjectFileName = "Project.bin";
    public static ArrayList<Project> Projects = new ArrayList<Project>();
    public static ArrayList<Task> Tasks2 = new ArrayList<Task>();
    FileMangerBinary FManger = new FileMangerBinary();
    int ID;
    String Name;
    String Descirption;
    
    public Project(){}
    public Project(int ID, String Name, String Des){
        
    this.ID = ID;
    this.Name = Name;
    this.Descirption = Des;
    }
    
    public void setName(String Name){
    this.Name = Name;

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
    public int getID(){
    return this.ID;
    }
    public boolean addProject() {
        loadFromFile();
        Projects.add(this);
        return commitToFile();
    }

    public boolean commitToFile() {
        return FManger.write(ProjectFileName, Projects);
    }

    public void loadFromFile() {
        Projects = (ArrayList<Project>) FManger.read(ProjectFileName);
    }
    public ArrayList<Project> listProjetcs() {
        loadFromFile();
        return Projects;
    }
        public ArrayList<Task> ProjectTasks(){
    loadFromFile();
    for (int i = 0; i < Tasks.size(); i++) {
            if (Tasks.get(i).getPID() == this.ID) {
              Tasks2.add(Tasks.get(i));
            }}
    return Tasks2;   
    }
    public ArrayList<Task> ProjectNotCTasks(){
    loadFromFile();
    for (int i = 0; i < Tasks.size(); i++) {
            if ((Tasks.get(i).getPID() == this.ID) && !Tasks.get(i).State) {
              Tasks2.add(Tasks.get(i));
            }}
    return Tasks2;   
    }
    
}
