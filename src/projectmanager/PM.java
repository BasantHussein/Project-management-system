

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmanager;
import java.util.Scanner;

/**
 *
 * @author 10010
 */
public class PM extends Person {
    //protected Report report = new Report(); //Missingreport class
    protected Employee emp=new Employee();
    protected TeamLeader teamL=new TeamLeader();
    //protected Project peoject=new Project();
     
    Scanner input = new Scanner( System.in );
    String rep= input.nextLine();
    int employeeID=input.nextInt();
    public void assignReport(int employeeID,String rep)
    {
    //report.writreport(employeeID,rep);
   
            }
    
    //public void view(""),,func of completeded tasks

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*@Override
    public boolean LogIn(String userName, String Pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public boolean login(String userName, String Pass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
