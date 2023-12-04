/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package UI;

import dao.AdvancePaymentDAO;
import dao.EmployeeDAO;
import entity.AdvancePayment;
import entity.Employee;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.MsgBox;
import utils.XDate;

/**
 *
 * @author caube
 */
public class AdvancePaymentJDialog extends javax.swing.JDialog implements CrudController<AdvancePayment> {

    private AdvancePaymentDAO advancePaymentDAO = new AdvancePaymentDAO();
    private EmployeeDAO employeeDAO = new EmployeeDAO();
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    public AdvancePaymentJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        sdf.setLenient(false);
        fillTable(advancePaymentDAO.selectAll());
        fillCombobox();
            tblPayment.getTableHeader().setFont(new Font("Segoe UI",0,15) {
               
      }); tblPayment.getTableHeader().setBackground(new Color(230, 230, 230));
            tblPayment.getTableHeader().setForeground(Color.black);
          
             tblPayment.setRowHeight(26,26);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPayment = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        cboEmpID = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtAdvDate = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        txtAdvAmout = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel2.setkEndColor(new java.awt.Color(204, 204, 255));
        kGradientPanel2.setkGradientFocus(200);
        kGradientPanel2.setkStartColor(new java.awt.Color(102, 102, 255));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPayment.setBackground(new java.awt.Color(153, 149, 236));
        tblPayment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblPayment.setForeground(new java.awt.Color(255, 255, 255));
        tblPayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null},
                {"", null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Tiền ứng", "Ngày ứng", "Mã nhân viên"
            }
        ));
        tblPayment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblPayment.setFocusable(false);
        tblPayment.setGridColor(new java.awt.Color(255, 255, 255));
        tblPayment.setRowHeight(40);
        tblPayment.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tblPayment.setShowGrid(true);
        tblPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPaymentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPayment);

        kGradientPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 520, 320));

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        kGradientPanel2.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 160, 40));

        btnSearch.setBackground(new java.awt.Color(153, 149, 236));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/search_client_32px.png"))); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 120, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AdvancePayment");
        kGradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 31, 270, 40));

        btnDelete.setBackground(new java.awt.Color(153, 149, 236));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/delete_32px.png"))); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnDeleteItemStateChanged(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 110, 40));

        btnUpdate.setBackground(new java.awt.Color(153, 149, 236));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/create_32px.png"))); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 120, 40));

        btnClear.setBackground(new java.awt.Color(153, 149, 236));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/add.png"))); // NOI18N
        btnClear.setText("NEW");
        btnClear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 110, -1));

        btnSave.setBackground(new java.awt.Color(153, 149, 236));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/save_32px.png"))); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 120, -1));

        cboEmpID.setAlignmentX(1.0F);
        kGradientPanel2.add(cboEmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 220, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mã Nhân Viên");
        kGradientPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        txtAdvDate.setBackground(java.awt.Color.white);
        txtAdvDate.setAlignmentX(1.0F);
        kGradientPanel2.add(txtAdvDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 220, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ngày ứng");
        kGradientPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        txtAdvAmout.setAlignmentX(1.0F);
        txtAdvAmout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdvAmoutActionPerformed(evt);
            }
        });
        kGradientPanel2.add(txtAdvAmout, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 220, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tiền ứng");
        kGradientPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        txtID.setEditable(false);
        txtID.setBackground(java.awt.Color.white);
        txtID.setAlignmentX(1.0F);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        kGradientPanel2.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 220, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID");
        kGradientPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 33, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/background.gif"))); // NOI18N
        kGradientPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -10, 440, 490));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/background.gif"))); // NOI18N
        kGradientPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 520, 520));

        jPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        this.deleteEntity();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnDeleteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnDeleteItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteItemStateChanged

    private void txtAdvAmoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdvAmoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdvAmoutActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        resetForm();
        fillTable(advancePaymentDAO.selectAll());
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        this.updateEntity();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            if (validateForm()) {
                Employee employee = employeeDAO.selectByID(String.valueOf(cboEmpID.getSelectedItem()).trim());
                Date date = null;
                try {
                    date = txtAdvDate.getDate();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }

                AdvancePayment adv = new AdvancePayment();
                adv.setAdvAmount(Double.parseDouble(txtAdvAmout.getText()));
                adv.setDateAdv(date);
                adv.setEmployee(employee);
                advancePaymentDAO.insert(adv);
                fillTable(advancePaymentDAO.selectAll());
                resetForm();
                JOptionPane.showMessageDialog(this, "Đã lưu thành công");
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Mã nhân viên ko tồn tại");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPaymentMouseClicked
        int index = tblPayment.getSelectedRow();
        if (index != -1) {
            AdvancePayment advancePayment = advancePaymentDAO.selectAll().get(index);

            txtID.setText(advancePayment.getId() + "");
            txtAdvAmout.setText(advancePayment.getAdvAmount() + "");
            txtAdvDate.setDate(advancePayment.getDateAdv());
            cboEmpID.setSelectedItem(advancePayment.getEmployee().getId() + "");
        }
    }//GEN-LAST:event_tblPaymentMouseClicked

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        this.searchEntity();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        this.searchEntity();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
        this.searchEntity();
    }//GEN-LAST:event_txtSearchActionPerformed

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
            java.util.logging.Logger.getLogger(AdvancePaymentJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdvancePaymentJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdvancePaymentJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdvancePaymentJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdvancePaymentJDialog dialog = new AdvancePaymentJDialog(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboEmpID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JTable tblPayment;
    private javax.swing.JTextField txtAdvAmout;
    private com.toedter.calendar.JDateChooser txtAdvDate;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    AdvancePaymentDAO dao = new AdvancePaymentDAO();

    @Override
    public AdvancePayment getEntityFromForm() {
        int rowIndex = tblPayment.getSelectedRow();
        int colIndex = 0;
        Integer id = (Integer) tblPayment.getValueAt(rowIndex, colIndex);
//        return dao.getById(id);
        return null;
    }

    @Override
    public void setEntityToForm(AdvancePayment entity) {
        txtID.setText(Integer.toString(entity.getId()));
        txtAdvAmout.setText(Double.toString(entity.getAdvAmount()));
        txtAdvDate.setDate(Date.from(Instant.MIN));
        cboEmpID.setSelectedItem(entity.getEmployee().getId());
    }

    @Override
    public void fillEntityListOnTable() {
        List<entity.AdvancePayment> list = dao.selectAll();
        this.showListOnTable(list);
    }

    @Override
    public AdvancePayment getEntityFromSelectedRow() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void initialize() {
        setLocationRelativeTo(null);
        this.fillEntityListOnTable();
    }

    @Override
    public void createEntity() {
        try {
            if (validateForm()) {
                 Employee employee = employeeDAO.selectByID( String.valueOf(cboEmpID.getSelectedItem()).trim());
                 Date date = null;
                try {
                    date = txtAdvDate.getDate();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }

                AdvancePayment adv = new AdvancePayment();
                adv.setAdvAmount(Double.parseDouble(txtAdvAmout.getText()));
                adv.setDateAdv(date);
                adv.setEmployee(employee);
                advancePaymentDAO.insert(adv);
                fillTable(advancePaymentDAO.selectAll());
                resetForm();
                JOptionPane.showMessageDialog(this, "Đã lưu thành công");
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Mã nhân viên ko tồn tại");
        }
    }

    @Override
    public void updateEntity() {
        int index = tblPayment.getSelectedRow();
        if (index != -1) {
            if (validateForm()) {
                Employee employee = employeeDAO.selectByID(String.valueOf(cboEmpID.getSelectedItem()).trim());
                AdvancePayment advancePayment = advancePaymentDAO.selectAll().get(index);
                Date date = null;
                try {
                    date = txtAdvDate.getDate();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }

                advancePayment.setAdvAmount(Double.valueOf(txtAdvAmout.getText().trim()));
                advancePayment.setDateAdv(date);
                advancePayment.setEmployee(employee);

                advancePaymentDAO.update(advancePayment);
                fillTable(advancePaymentDAO.selectAll());
                resetForm();
                JOptionPane.showMessageDialog(this, "Đã cập nhật thành công");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng muốn cập nhật", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void deleteEntity() {
        int index = tblPayment.getSelectedRow();
        if (index != -1) {
            AdvancePayment advancePayment = advancePaymentDAO.selectAll().get(index);
            advancePaymentDAO.delete(advancePayment.getId() + "");
            fillTable(advancePaymentDAO.selectAll());
            JOptionPane.showMessageDialog(this, "Đã xóa thành công");
            resetForm();
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn dòng muốn cập nhật", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void editEntity() {
        
    }

    @Override
    public void resetForm() {
        txtID.setText("");
        txtAdvAmout.setText("");
        txtAdvDate.setDate(null);
        cboEmpID.setSelectedItem(0);
        tblPayment.clearSelection();
    }

    private void showListOnTable(List<entity.AdvancePayment> list) {
        DefaultTableModel model = (DefaultTableModel) tblPayment.getModel();
        model.setRowCount(0);
        for (entity.AdvancePayment e : list) {
            Object[] row = {e.getId(), e.getAdvAmount(), e.getDateAdv(), e.getEmployee()};
            model.addRow(row);
        }
    }

    public boolean validateForm() {
//        if (txtAdvAmout.getText().trim().isEmpty()
//                || txtAdvDate.getDate().toString().isEmpty() || txtEmpID.getToolTipText().trim().isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Không được để trống thông tin", "Lỗi", 2);
//            return false;
//        }

        try {
            Date date = txtAdvDate.getDate();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Sai định dạng ngày", "Lỗi", 2);
            return false;
        }

        try {
            Double.valueOf(txtAdvAmout.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Tiền ứng sai định dạng", "Lỗi", 2);
            return false;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tiền ứng sai định dạng", "Lỗi", 2);
            System.out.println(e);
            return false;
        }
        return true;
    }

    public void fillTable(List<AdvancePayment> list) {
        DefaultTableModel tableModel = (DefaultTableModel) tblPayment.getModel();
        tableModel.setRowCount(0);
        list.forEach(i -> tableModel.addRow(new Object[]{
            i.getId(), i.getAdvAmount(), i.getDateAdv(), i.getEmployee().getId()
        }));
    }
     // fill mã nv lên ccbb
    public void fillCombobox(){
        DefaultComboBoxModel boxModel = (DefaultComboBoxModel) cboEmpID.getModel();
        boxModel.removeAllElements();
        new AdvancePaymentDAO().getAllEmpID().forEach(i->{
            boxModel.addElement(i);
        });
    }
    
     private void searchEntity() {
       if (txtSearch.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chưa nhập thông tin", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            List<AdvancePayment> list = new ArrayList<>();
            for (AdvancePayment i : advancePaymentDAO.selectByKeyWord(txtSearch.getText())) {
                if (txtSearch.getText().trim().toLowerCase().equals(i.getEmployee().getId().toLowerCase())) {
                    list.add(i);
                }
            }
            fillTable(list);
        }
    }

}
