/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmanager;

import java.io.File;
import GUI.LoginFrame;


/**
 *
 * @author Omar Qabeel
 */
//import InternalFrames_Panels.ProjectManager_Project.TeamL_AddPanel;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project Path: " + projectPath);
        File currentDir = new File(projectPath); // current directory				
        checkDirectoryContents(currentDir);

        new LoginFrame().setVisible(true);
    }

    public static void checkDirectoryContents(File dir) {
        File[] files = dir.listFiles();
        boolean employeeFile = true;
        boolean TLFile = true;
        boolean PMFile = true;
        boolean ReportFile = true;

        for (File file : files) {

            if (file.getName().contains("Employee.bin")) {
                employeeFile = false;
            }  else if (file.getName().contains("TeamLeaders.bin")) {
                TLFile = false;
            }  else if (file.getName().contains("Pmanager.bin")) {
                PMFile = false;
            }  else if (file.getName().contains("Reports.bin")) {
                ReportFile = false;
            }
        }
        if (employeeFile) {
            Employee x = new Employee();
            x.commitToFile();
        }

        if (TLFile) {
        TeamLeader x = new TeamLeader();
        x.commitToFile();
        }
        
        if (PMFile) {
        ProjectManager x = new ProjectManager();
        x.commitToFile();
        }
        
        if (ReportFile) {
            Report x = new Report();
            x.commitToFile();
        }
       
    }

    }
    

