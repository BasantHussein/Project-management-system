/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmanager;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Al-Hassan Abdel-Raof
 */
public class Salary implements Serializable {
    protected Date PaymentDate;
    protected String PaymentMethod;
    protected double HourlyWage;
    protected double MonthlySalary;
    
   public Date getPD(){
   return PaymentDate;
   }
   public String getPM(){
   return PaymentMethod;
   }
   public double getHW(){
   return HourlyWage;
   }
   public double getMS(){
   return MonthlySalary;
   }
   
   public void setPD(Date PD){
   this.PaymentDate = PD;
   }
   public void setPM(String PM){
   this.PaymentMethod = PM;
   }
   public void setHW(double HW){
   this.HourlyWage = HW;
   }
   public void setMS(double MS){
   this.MonthlySalary = MS;
   }
}
