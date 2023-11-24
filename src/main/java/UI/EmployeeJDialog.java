/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package UI;

import entity.Employee;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import dao.EmployeeDAO;
import javax.swing.DefaultComboBoxModel;
import utils.Auth;
import utils.MsgBox;
import entity.Department;
import dao.DepartmentDAO;
import entity.Position;
import dao.PositionDAO;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import utils.IconUtil;
import utils.XFile;

/**
 *
 * @author Lenovo
 */
public class EmployeeJDialog extends javax.swing.JDialog {

    /**
     * Creates new form NhanVien
     */
    public EmployeeJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.fillTable();
        this.fillcboDepartment();
        this.fillcboPosition();
        this.updateStatus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        fileImageChooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        rdoOther = new javax.swing.JRadioButton();
        rdoFemale = new javax.swing.JRadioButton();
        rdoMale = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        rboNhanVien = new javax.swing.JRadioButton();
        rboKeToan = new javax.swing.JRadioButton();
        rboTruongPhong = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        txtBaseSalary = new javax.swing.JTextField();
        cbo = new javax.swing.JLabel();
        cboDep = new javax.swing.JComboBox<>();
        lbl17 = new javax.swing.JLabel();
        cboPos = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        lblPics = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployees = new javax.swing.JTable();
        btnExit1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thông Tin Nhân Viên");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("THÔNG TIN NHÂN VIÊN");

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jPanel7.setLayout(new java.awt.GridLayout(10, 2, -160, 10));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("ID");
        jPanel7.add(jLabel2);
        jPanel7.add(txtID);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("First Name");
        jPanel7.add(jLabel3);
        jPanel7.add(txtFirstName);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Last Name");
        jPanel7.add(jLabel5);

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        jPanel7.add(txtLastName);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Sex");
        jPanel7.add(jLabel6);

        buttonGroup1.add(rdoOther);
        rdoOther.setText("Other");

        buttonGroup1.add(rdoFemale);
        rdoFemale.setText("Female");

        buttonGroup1.add(rdoMale);
        rdoMale.setText("Male");
        rdoMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rboNamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(rdoMale)
                .addGap(18, 18, 18)
                .addComponent(rdoFemale)
                .addGap(18, 18, 18)
                .addComponent(rdoOther))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rdoMale)
                .addComponent(rdoFemale)
                .addComponent(rdoOther))
        );

        jPanel7.add(jPanel6);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Phone");
        jPanel7.add(jLabel4);

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        jPanel7.add(txtPhone);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Email");
        jPanel7.add(jLabel13);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        jPanel7.add(txtEmail);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Role");
        jLabel14.setMinimumSize(new java.awt.Dimension(28, 10));
        jPanel7.add(jLabel14);

        buttonGroup2.add(rboNhanVien);
        rboNhanVien.setText("Employee");

        buttonGroup2.add(rboKeToan);
        rboKeToan.setText("Accountant");

        buttonGroup2.add(rboTruongPhong);
        rboTruongPhong.setText("Manager");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addComponent(rboTruongPhong)
                .addGap(18, 18, 18)
                .addComponent(rboKeToan)
                .addGap(18, 18, 18)
                .addComponent(rboNhanVien))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rboTruongPhong)
                .addComponent(rboKeToan)
                .addComponent(rboNhanVien))
        );

        jPanel7.add(jPanel8);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("BaseSalary");
        jPanel7.add(jLabel15);

        txtBaseSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBaseSalaryActionPerformed(evt);
            }
        });
        jPanel7.add(txtBaseSalary);

        cbo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cbo.setText("Department");
        jPanel7.add(cbo);

        cboDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDepActionPerformed(evt);
            }
        });
        jPanel7.add(cboDep);

        lbl17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl17.setText("Position");
        lbl17.setMaximumSize(new java.awt.Dimension(20, 20));
        lbl17.setMinimumSize(new java.awt.Dimension(20, 20));
        jPanel7.add(lbl17);

        cboPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPosActionPerformed(evt);
            }
        });
        jPanel7.add(cboPos);

        jPanel10.setLayout(new java.awt.GridLayout(1, 4, 20, 0));

        btnFirst.setText("First");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel10.add(btnFirst);

        btnPrev.setText("Previous");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel10.add(btnPrev);

        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel10.add(btnNext);

        btnLast.setText("Last");
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel10.add(btnLast);

        lblPics.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPics.setText("ẢNH");
        lblPics.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        lblPics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPicsMouseClicked(evt);
            }
        });

        jPanel5.setLayout(new java.awt.GridLayout(2, 2, 20, 20));

        btnNew.setText("NEW");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel5.add(btnNew);

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel5.add(btnAdd);

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel5.add(btnUpdate);

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel5.add(btnDelete);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit)
                        .addGap(76, 76, 76))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPics, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(67, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblPics, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tabs.addTab("CẬP NHẬT", jPanel2);

        btnSearch.setText("SEARCH");

        tblEmployees.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "Sex", "Phone", "Email", "Department", "Position"
            }
        ));
        tblEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployees);

        btnExit1.setText("EXIT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnExit1)
                        .addGap(34, 34, 34))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnExit1)
                .addGap(21, 21, 21))
        );

        tabs.addTab("DANH SÁCH", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBaseSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBaseSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBaseSalaryActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void rboNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rboNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rboNamActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        this.last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        this.clearForm();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        this.Add();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        this.Update();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        this.Delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void cboDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDepActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cboDepActionPerformed

    private void cboPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cboPosActionPerformed

    private void tblEmployeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeesMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount() == 1){
            this.row = tblEmployees.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblEmployeesMouseClicked

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        this.next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        // TODO add your handling code here:
        this.prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:
        this.first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void lblPicsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPicsMouseClicked
        // TODO add your handling code here:
        selectImage();
    }//GEN-LAST:event_lblPicsMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EmployeeJDialog dialog = new EmployeeJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    EmployeeDAO edao = new EmployeeDAO();
    DepartmentDAO ddao = new DepartmentDAO();
    PositionDAO pdao = new PositionDAO();
    
    int row = -1;
    
    void fillTable(){
        DefaultTableModel model = (DefaultTableModel) tblEmployees.getModel();
        model.setRowCount(0);
        try {
            List<Employee> list = edao.selectAll();
            for (Employee e : list){
                Object[] row = {
                    e.getId(),
                    e.getFirstName(),
                    e.getLastName(),
                    e.getSex(),
                    e.getPhoneNumber(),
                    e.getEmail(),
                    e.getDepartment().getDepName(),
                    e.getPosition().getPosName()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    void fillcboDepartment(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboDep.getModel();
        model.removeAllElements();
        List<String> list = ddao.getDepName();
        for (String s : list) {
            model.addElement(s);
        }
    }
    
    void fillcboPosition(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboPos.getModel();
        model.removeAllElements();
        List<String> list = pdao.getPosName();
        for (String s : list) {
            model.addElement(s);
        }
    }
    
    void setForm(Employee e){
        txtID.setText(e.getId());
        txtFirstName.setText(e.getFirstName());
        txtLastName.setText(e.getLastName());
        if(e.getSex().equalsIgnoreCase("Male")){
            rdoMale.setSelected(true);
        }else if(e.getSex().equalsIgnoreCase("Female")){
            rdoFemale.setSelected(true);
        }else{
            rdoOther.setSelected(true);
        }
        
        txtPhone.setText(e.getPhoneNumber());
        txtEmail.setText(e.getEmail());
        
        if(e.getRole().equalsIgnoreCase("Manager")){
            rboTruongPhong.setSelected(true);
        }else if(e.getRole().equalsIgnoreCase("Accountant")){
            rboKeToan.setSelected(true);
        }else{
            rboNhanVien.setSelected(true);
        }
        
        txtBaseSalary.setText(Double.toString(e.getBaseSalary()));
        cboDep.setSelectedItem(e.getDepartment().getDepName());
        cboPos.setSelectedItem(e.getPosition().getPosName());
        cboDep.setToolTipText(e.getDepartment().getDepID());
        cboPos.setToolTipText(e.getPosition().getPosID());
        
        ImageIcon imageicon = new ImageIcon(e.getImage());
        ImageIcon fitImage = XFile.getScaledIcon(imageicon, 150, 150);
        lblPics.setIcon(fitImage);
    }
    
    Employee getForm(){
        Employee e = new Employee();
        e.setId(txtID.getText());
        e.setFirstName(txtFirstName.getText());
        e.setLastName(txtLastName.getText());
        
        if(rdoMale.isSelected()){
            e.setSex(String.valueOf(rdoMale.getText()));
        }else if(rdoFemale.isSelected()){
            e.setSex(String.valueOf(rdoFemale.getText()));
        }else{
            e.setSex(String.valueOf(rdoOther.getText()));
        }
        
        e.setPhoneNumber(txtPhone.getText());
        e.setEmail(txtEmail.getText());
        
        if(rboTruongPhong.isSelected()){
            e.setRole(String.valueOf(rboTruongPhong.getText()));
        }else if(rboKeToan.isSelected()){
            e.setRole(String.valueOf(rboKeToan.getText()));
        }else{
            e.setRole(String.valueOf(rboNhanVien.getText()));
        }
        
        e.setBaseSalary(Double.parseDouble(txtBaseSalary.getText()));
        e.setDepartment(ddao.selectByID(cboDep.getToolTipText()));
        e.setPosition(pdao.selectByID(cboPos.getToolTipText()));
        e.setImage(lblPics.getToolTipText());
        return e;
    }
    
    void Add(){
        Employee e = this.getForm();
            try {
                edao.insert(e); // thêm mới
                this.fillTable(); // đỗ lại bảng
                this.clearForm(); // xóa trắng form
                MsgBox.alert(this, "Thêm mới thành công!");
            } 
            catch (Exception ex) {
                MsgBox.alert(this, "Thêm mới thất bại!");
            }
    }
    
    void Update(){
        Employee e = this.getForm();
        try {
                edao.update(e); // cập nhật
                this.fillTable(); // đổ lại bảng
                MsgBox.alert(this, "Cập nhật thành công!");
            } 
            catch (Exception ex) {
                //MsgBox.alert(this, "Cập nhật thất bại!");
                System.out.println(ex);
            }
    }
    
    void Delete(){
        if(!Auth.isManager()){
            MsgBox.alert(this, "Bạn không có quyền xóa nhân viên!");
        }
        else{
            String id = txtID.getText();
            if(id.equals(Auth.user.getId())){
                MsgBox.alert(this, "Bạn không được xóa chính bạn!");
            }
            else if(MsgBox.confirm(this, "Bạn thực sự muốn xóa nhân viên này?")){
                try {
                    edao.delete(id);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Xóa thành công!");
                } 
                catch (Exception e) {
                    MsgBox.alert(this, "Xóa thất bại!");
                }
            }
        }
    }
    
    void first(){
        this.row = 0;
        this.edit();
    }
    void prev(){
        if(this.row > 0){
            this.row--;
            this.edit();
        }
    }
    void next(){
        if(this.row < tblEmployees.getRowCount() - 1){
            this.row++;
            this.edit();
        }
    }
    void last(){
        this.row = tblEmployees.getRowCount() - 1;
        this.edit();
    }
    
    void clearForm(){
        Employee e = new Employee();
        
        e.setSex("Other");        
        e.setPhoneNumber("");
        e.setEmail("");
        e.setRole("Employee");
        e.setBaseSalary(0);
        e.setDepartment(ddao.selectByID("D001"));
        e.setPosition(pdao.selectByID("P003"));
        
        this.setForm(e);
        this.row = -1;
        this.updateStatus();
    }
    
    void updateStatus(){
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblEmployees.getRowCount() - 1);
        // Trạng thái form
        txtID.setEditable(!edit);
        btnAdd.setEnabled(!edit);
        btnUpdate.setEnabled(edit);
        btnDelete.setEnabled(edit);
        
        // Trạng thái điều hướng
        btnFirst.setEnabled(edit && !first);
        btnPrev.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
    }
    
    void edit() {
        String id = (String) tblEmployees.getValueAt(this.row, 0);
        Employee e = edao.selectByID(id);
        this.setForm(e);
        tabs.setSelectedIndex(0);
        this.updateStatus();
    }
    
    boolean isValidated(){
        Employee e = this.getForm();
        if(e.getId().length() == 0){
            MsgBox.alert(this, "Không để trống mã nhân viên!");
        }
        else if(e.getLastName().length() == 0){
            MsgBox.alert(this, "Không để trống tên nhân viên!");
        }
        else if(e.getPhoneNumber().length() == 0){
            MsgBox.alert(this, "Không để trống số điện thoại!");
        }
        else{
            return true;
        }
        return false;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel cbo;
    private javax.swing.JComboBox<String> cboDep;
    private javax.swing.JComboBox<String> cboPos;
    private javax.swing.JFileChooser fileImageChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl17;
    private javax.swing.JLabel lblPics;
    private javax.swing.JRadioButton rboKeToan;
    private javax.swing.JRadioButton rboNhanVien;
    private javax.swing.JRadioButton rboTruongPhong;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JRadioButton rdoOther;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblEmployees;
    private javax.swing.JTextField txtBaseSalary;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void selectImage() {
        int option = fileImageChooser.showOpenDialog(this);
        if(option == JFileChooser.APPROVE_OPTION){
            File file = fileImageChooser.getSelectedFile();
            
            File folder = new File("./src/main/resources/images");
            File newFile = IconUtil.copyFileToStorageFolder(file, folder);
            IconUtil.setIconToLabel(newFile, lblPics);
            
            lblPics.setToolTipText(newFile.getName());
        }
    }
}