/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;
import backend.Trainer;

import backend.AdminRole;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ahmed-sameh
 */
public class ViewTrainers extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
      
      AdminRole adm;
    public ViewTrainers(AdminRole admin) {
        initComponents();
        this.adm = admin ;
            this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        fillTable();
    }
    
    public void fillTable() {
        
        List<Trainer> records = adm.getListOfTrainers();

        DefaultTableModel m = (DefaultTableModel) tableTrainers.getModel();
        m.setRowCount(0);
        for (int i = 0; i < records.size(); i++) {
            m.addRow(new Object[]{records.get(i).getTrainerId(), records.get(i).getName(),records.get(i).getEmail(), records.get(i).getSpeciality(),records.get(i).getPhoneNumber()});

        }

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableTrainers = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableTrainers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Email", "Specialty", "Phone Number"
            }
        ));
        jScrollPane1.setViewportView(tableTrainers);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableTrainers;
    // End of variables declaration//GEN-END:variables
}
