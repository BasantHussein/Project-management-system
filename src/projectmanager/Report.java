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
public class Report implements Serializable {
 
    private final String ReportFileName = "Report.bin";

    public static ArrayList<Report> Reports = new ArrayList<Report>();
    FileMangerBinary FManger = new FileMangerBinary();
    int ID;
    String Decription;
    int EmpID;
    public Report() {
    }

    public void setDes(String Des){
    this.Decription = Des;

    }
    
    public void setEmpID(int EmpID){
    this.EmpID = EmpID;
    }
    
    public String getDes(){
    return this.Decription;
    }
    
    public int getEmpID(){
    return this.EmpID;
    }
    
    public void setID(int ID){
    this.ID = ID;
    }
    public int getID(){
    return this.ID;
    }
    
    public Report(String Des,int EmpID) {
        this.Decription = Des;
        this.EmpID = EmpID;
        this.ID = ID;
    }

    public boolean addReport() {
        loadFromFile();
        Reports.add(this);
        return commitToFile();
    }

    public boolean commitToFile() {
        return FManger.write(ReportFileName, Reports);
    }

    public void loadFromFile() {
        Reports = (ArrayList<Report>) FManger.read(ReportFileName);
    }

    private int getReportIndex(int id) {
        for (int i = 0; i < Reports.size(); i++) {
            if (Reports.get(i).getID() == id) {
                return i;
            }
        }

        return -1;
    }

    public Report searchReport(int id) {
        Report temp = new Report();
        loadFromFile();
        int index = getReportIndex(id);
        if (index != -1) {
            return Reports.get(index);
        } else {
            return temp;
        }
    }

    public String displayAllReport() {
        loadFromFile();
        String S = "\nAll Student Data:\n";
        for (Report x : Reports) {
            S = S + x.toString();
        }
        return S;
    }
    
    public ArrayList<Report> listReport() {
        loadFromFile();
        return Reports;
    }
    
    /*public boolean updateReport(int oldID, Report x) {
    loadFromFile();
    int index = getReportIndex(oldID);
    
    if (index != -1) {
    Reports.set(index, x);
    
    return commitToFile();
    }
    
    return false;
    }*/

    public boolean deleteReport(int id) {
        loadFromFile();
        int index = getReportIndex(id);

        if (index != -1) {
            Reports.remove(index);

            return commitToFile();
        }

        return false;
    }

    
}
