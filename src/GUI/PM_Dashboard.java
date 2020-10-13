/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import Internal.Frames.AddReport;
import Internal.Frames.Admin_LeaderFrame;
import Internal.Frames.Project_AddFrame;
import projectmanager.Project;

/**
 *
 * @author lenovo
 */
public class PM_Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form ProjectManagerDashboard
     */
    public PM_Dashboard() {
        initComponents();
    }
    
    public PM_Dashboard(int id) {
        initComponents();
        setdata(id);
    }
    
    public void setdata(int id){
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuItem_Exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuItem_TL = new javax.swing.JMenuItem();
        MenuItem_Project = new javax.swing.JMenuItem();
        jMenu3_Report = new javax.swing.JMenu();
        MenueItem_AddReport = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        MenuItem_Percentage = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projectmanager");

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 896, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        MenuItem_Exit.setText("Exit");
        MenuItem_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_ExitActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItem_Exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Manage");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        MenuItem_TL.setText("Team Leader");
        MenuItem_TL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_TLActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItem_TL);

        MenuItem_Project.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, 0));
        MenuItem_Project.setText("Add Projects");
        MenuItem_Project.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_ProjectActionPerformed(evt);
            }
        });
        jMenu2.add(MenuItem_Project);

        jMenuBar1.add(jMenu2);

        jMenu3_Report.setText("Report");

        MenueItem_AddReport.setText("Add Report");
        MenueItem_AddReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenueItem_AddReportActionPerformed(evt);
            }
        });
        jMenu3_Report.add(MenueItem_AddReport);

        jMenuBar1.add(jMenu3_Report);

        jMenu4.setText("View");

        MenuItem_Percentage.setText("Percentage of Completed Prpojects");
        MenuItem_Percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItem_PercentageActionPerformed(evt);
            }
        });
        jMenu4.add(MenuItem_Percentage);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItem_TLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_TLActionPerformed
        // TODO add your handling code here:
         Admin_LeaderFrame f = new Admin_LeaderFrame();
        desktop.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_MenuItem_TLActionPerformed

    private void MenuItem_ProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ProjectActionPerformed
        // TODO add your handling code here:
          //Project x = new Project();
          //x.commitToFile();
           Project_AddFrame p = new Project_AddFrame();
           desktop.add(p);
           p.setVisible(true);
    }//GEN-LAST:event_MenuItem_ProjectActionPerformed

    private void MenuItem_PercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_PercentageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuItem_PercentageActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void MenuItem_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItem_ExitActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_MenuItem_ExitActionPerformed

    private void MenueItem_AddReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenueItem_AddReportActionPerformed
        // TODO add your handling code here:
        AddReport r = new AddReport();
        desktop.add(r);
        r.setVisible(true);
    }//GEN-LAST:event_MenueItem_AddReportActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PM_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PM_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PM_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PM_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PM_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItem_Exit;
    private javax.swing.JMenuItem MenuItem_Percentage;
    private javax.swing.JMenuItem MenuItem_Project;
    private javax.swing.JMenuItem MenuItem_TL;
    private javax.swing.JMenuItem MenueItem_AddReport;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3_Report;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}