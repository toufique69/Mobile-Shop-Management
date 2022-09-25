/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileshop;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Toufique Hasan
 */
public final class EmployeeInfo extends javax.swing.JFrame {

    /**
     * Creates new form AdminInfo
     */
    
    public ConnectDB conn = new ConnectDB();
    public Connection conx = null;
    public int _success = 0;
    
    public EmployeeInfo() {
        initComponents();
        showDate();
    }
    
    public void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MMM-yyyy");
        joindate.setText(s.format(d));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        employeename = new javax.swing.JTextField();
        SubmitButton = new javax.swing.JButton();
        username = new javax.swing.JTextField();
        designation = new javax.swing.JTextField();
        phoneno = new javax.swing.JTextField();
        salary = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        NewButton = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        joindate = new javax.swing.JTextField();
        backbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Emoloyee Information");
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        employeename.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N

        SubmitButton.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        SubmitButton.setLabel("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        username.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N

        designation.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N

        phoneno.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N

        salary.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel2.setText("Employee Name");

        jLabel3.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel3.setText("User Name");

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel6.setText("Designation");

        jLabel7.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel7.setText("Phone No.");

        jLabel8.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel8.setText("Address");

        jLabel9.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel9.setText("Salary");

        gender.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        jLabel10.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Toufique Hasan\\Documents\\NetBeansProjects\\MobileShop\\src\\mobileshop\\employee-logo.png")); // NOI18N
        jLabel10.setText("EMPLOYEE INFORMATION");

        password.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        password.setToolTipText("Characters Including 3 Numbers (wzyz123)");

        NewButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Toufique Hasan\\Documents\\NetBeansProjects\\MobileShop\\src\\mobileshop\\new-logo.png")); // NOI18N
        NewButton.setToolTipText("New ");
        NewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewButtonActionPerformed(evt);
            }
        });

        SearchButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Toufique Hasan\\Documents\\NetBeansProjects\\MobileShop\\src\\mobileshop\\search-logo.png")); // NOI18N
        SearchButton.setToolTipText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        address.setColumns(20);
        address.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jLabel11.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel11.setText("Join Date");

        joindate.setFont(new java.awt.Font("Agency FB", 0, 20)); // NOI18N
        joindate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joindateActionPerformed(evt);
            }
        });

        backbutton.setBackground(new java.awt.Color(204, 255, 204));
        backbutton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Toufique Hasan\\Documents\\NetBeansProjects\\MobileShop\\src\\mobileshop\\back-icon.png")); // NOI18N
        backbutton.setToolTipText("Back");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SubmitButton))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeename, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(designation, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(phoneno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(salary)
                            .addComponent(joindate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backbutton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NewButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SearchButton, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NewButton)
                        .addGap(18, 18, 18)
                        .addComponent(SearchButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(employeename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(designation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(joindate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(SubmitButton)
                        .addGap(33, 33, 33))
                    .addComponent(backbutton, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        getAccessibleContext().setAccessibleName("ADMIN INFO");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        SaveData();
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void NewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewButtonActionPerformed
        // TODO add your handling code here:
        NewData();
    }//GEN-LAST:event_NewButtonActionPerformed

    private void salaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salaryActionPerformed

    private void joindateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joindateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joindateActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        AdminHome ah = new AdminHome();
        ah.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backbuttonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
        SearchEmployee ah = new SearchEmployee();
        ah.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SearchButtonActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EmployeeInfo().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NewButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JTextArea address;
    private javax.swing.JButton backbutton;
    private javax.swing.JTextField designation;
    private javax.swing.JTextField employeename;
    private javax.swing.JComboBox gender;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField joindate;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phoneno;
    private javax.swing.JTextField salary;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    private void SaveData() {
        conx = conn.getConnection();

        try{
            String sql = "insert into EMPLOYEE_INFO (EmployeeName, UserName, UserPass, Gender, Designation, PhoneNo, Address, Salary, JoinDate) values(?,?,?,?,?,?,?,?,?)";
            //String sql = "insert into EMPLOYEE_INFO (EmployeeName, UserName, UserPass, Gender, Designation, PhoneNo, Address, Salary, JoinDate) values(?,?,?,?,?,?,?,?,?)";
            //OraclePreparedStatement pst = (OraclePreparedStatement) conn.conn;
            PreparedStatement pst = conx.prepareCall(sql);
            
            if (employeename.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Admin Name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (username.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter User Name","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (password.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Password must be characters with 3 numbers","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (designation.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Designation","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (phoneno.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Phone No.","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (address.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Address","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if (salary.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter Salary","Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            
            
            
            pst.setString(1, employeename.getText());
            pst.setString(2, username.getText());
            pst.setString(3, password.getText());
            pst.setString(4, (String) gender.getSelectedItem());
            pst.setString(5, designation.getText());
            pst.setString(6, phoneno.getText());
            pst.setString(7, address.getText());
            pst.setString(8, salary.getText());
            pst.setString(9, joindate.getText());
            
             _success = pst.executeUpdate();
             JOptionPane.showMessageDialog(this,"Successfully Submitted !!!","Record",JOptionPane.INFORMATION_MESSAGE);
             NewData();
            //rs = (OracleResultSet) pst.executeUpdate(sql);

        }catch(SQLException | HeadlessException e){
        JOptionPane.showMessageDialog(null, e);
        }
    }  

    private void NewData() {
        //flag = 0;
        
        employeename.setText("");
        username.setText("");
        password.setText("");
        gender.setSelectedIndex(-1);
        designation.setText("");
        phoneno.setText("");
        address.setText("");
        salary.setText("");
    }
}
