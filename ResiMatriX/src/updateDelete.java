import java.sql.*;
import Project.ConnectionProvider;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Faizan Habib
 */
public class updateDelete extends javax.swing.JFrame {
    public void clear() {
        enrolField.setEditable(true);
        enrolField.setText("");
        nameField.setText("");
        fatherField.setText("");
        courseField.setText("");
        batchField.setText("");
        facultyField.setText("");
        deptField.setText("");
        mobileField.setText("");
        roomField.setText("");
        livingStatusCombo.removeAllItems();
    }
    /**
     * Creates new form updateDelete
     */
    public updateDelete() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        enrolField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        fatherField = new javax.swing.JTextField();
        courseField = new javax.swing.JTextField();
        batchField = new javax.swing.JTextField();
        facultyField = new javax.swing.JTextField();
        deptField = new javax.swing.JTextField();
        mobileField = new javax.swing.JTextField();
        roomField = new javax.swing.JTextField();
        livingStatusCombo = new javax.swing.JComboBox<>();
        searchBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(480, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close all jframe.png"))); // NOI18N
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 6, 55, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Enrolment Number");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 45, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Student Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Father Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 131, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Course");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 178, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Batch");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 222, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Faculty");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 266, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Department");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Mobile Number");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 354, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Room Number");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 398, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Living Status");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 447, -1, -1));

        enrolField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(enrolField, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 42, 306, -1));

        nameField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 87, 423, -1));

        fatherField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(fatherField, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 131, 423, -1));

        courseField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(courseField, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 175, 423, -1));

        batchField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(batchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 219, 423, -1));

        facultyField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(facultyField, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 263, 423, -1));

        deptField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(deptField, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 307, 423, -1));

        mobileField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(mobileField, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 351, 423, -1));

        roomField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(roomField, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 395, 423, -1));

        livingStatusCombo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(livingStatusCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 444, -1, -1));

        searchBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 42, -1, -1));

        updateBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 444, -1, -1));

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 444, -1, -1));

        clearBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 444, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pages background.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String enrolNum = enrolField.getText();
        
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("select *from student where enrolNum = '"+enrolNum+"'");
            
            if (rs.first()) {
                enrolField.setEditable(false);
                nameField.setText(rs.getString(1));
                fatherField.setText(rs.getString(2));
                courseField.setText(rs.getString(4));
                batchField.setText(rs.getString(5));
                facultyField.setText(rs.getString(6));
                deptField.setText(rs.getString(7));
                mobileField.setText(rs.getString(8));
                roomField.setText(rs.getString(10));
                roomField.setEditable(false);
                
                if (rs.getString(11).equals("living")) {
                    livingStatusCombo.addItem("living");
                    livingStatusCombo.addItem("leaved");
                } else {
                    livingStatusCombo.addItem("leaved");
                    livingStatusCombo.addItem("living");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Student does not exit!");
                clear();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_closeBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        String studentName = nameField.getText();
        String fatherName = fatherField.getText();
        String enrolNumber = enrolField.getText();
        String course = courseField.getText();
        String batch = batchField.getText();
        String faculty = facultyField.getText();
        String dept = deptField.getText();
        String mobileNumber = mobileField.getText();
        String roomNumber = roomField.getText();
        String status = (String)livingStatusCombo.getSelectedItem();
        
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            
            if (status.equals("living")) {
                st.executeUpdate("update room set roomStatus = 'Booked' where roomNumber = '"+roomNumber+"'");
            } else {
                st.executeUpdate("update room set roomStatus = 'Not Booked' where roomNumber = '"+roomNumber+"'");
            }
            
            PreparedStatement ps = con.prepareStatement("update student set sName = ?, fName = ?, course = ?, batch = ?, faculty = ?, dept = ?, mobileNum = ?, roomNum = ?, status = ? where enrolNum = ?");
            ps.setString(1, studentName);
            ps.setString(2, fatherName);
            ps.setString(3, course);
            ps.setString(4, batch);
            ps.setString(5, faculty);
            ps.setString(6, dept);
            ps.setString(7, mobileNumber);
            ps.setString(8, roomNumber);
            ps.setString(9, status);
            ps.setString(10, enrolNumber);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Successfully Updated");
            clear();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        String enrolNumber = enrolField.getText();
        String roomNumber = roomField.getText();
        
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("delete from student where enrolNum = '"+enrolNumber+"'");
            st.executeUpdate("update room set roomStatus = 'Not Booked' where roomNumber = '"+roomNumber+"'");
            JOptionPane.showMessageDialog(null, "Successfully Deleted");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_clearBtnActionPerformed

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
            java.util.logging.Logger.getLogger(updateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateDelete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateDelete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField batchField;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JTextField courseField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField deptField;
    private javax.swing.JTextField enrolField;
    private javax.swing.JTextField facultyField;
    private javax.swing.JTextField fatherField;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JComboBox<String> livingStatusCombo;
    private javax.swing.JTextField mobileField;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField roomField;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
