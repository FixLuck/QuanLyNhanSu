/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package UI;

import dao.BonusDAO;
import dao.EmployeeDAO;
import entity.Bonus;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utils.MsgBox;

/**
 *
 * @author khoib
 */
public class BonusJDialog extends javax.swing.JDialog implements CrudController<Bonus> {

    /**
     * Creates new form BonusJDialog
     */
    public BonusJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        tabCapNhat = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnNEW = new javax.swing.JButton();
        btnADD = new javax.swing.JButton();
        btnUPDATE = new javax.swing.JButton();
        btnDELETE = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnFIRST = new javax.swing.JButton();
        btnNEXT = new javax.swing.JButton();
        btnPRE = new javax.swing.JButton();
        btnLAST = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtNOTE2 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtAMOUNT2 = new javax.swing.JTextField();
        lblSEQ = new javax.swing.JLabel();
        txtEMPID2 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        tabDanhSach = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLIST = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        btnTHOAT = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txtSEARCH = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnNEW.setText("New");
        btnNEW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNEWActionPerformed(evt);
            }
        });
        jPanel5.add(btnNEW);

        btnADD.setText("Add");
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });
        jPanel5.add(btnADD);

        btnUPDATE.setText("Update");
        btnUPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUPDATEActionPerformed(evt);
            }
        });
        jPanel5.add(btnUPDATE);

        btnDELETE.setText("Delete");
        btnDELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDELETEActionPerformed(evt);
            }
        });
        jPanel5.add(btnDELETE);

        btnFIRST.setText("<|");
        btnFIRST.setPreferredSize(new java.awt.Dimension(48, 23));
        btnFIRST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFIRSTActionPerformed(evt);
            }
        });
        jPanel4.add(btnFIRST);

        btnNEXT.setText(">>");
        btnNEXT.setPreferredSize(new java.awt.Dimension(48, 23));
        btnNEXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNEXTActionPerformed(evt);
            }
        });
        jPanel4.add(btnNEXT);

        btnPRE.setText("<<");
        btnPRE.setPreferredSize(new java.awt.Dimension(48, 23));
        btnPRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPREActionPerformed(evt);
            }
        });
        jPanel4.add(btnPRE);

        btnLAST.setText(">|");
        btnLAST.setPreferredSize(new java.awt.Dimension(48, 23));
        btnLAST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLASTActionPerformed(evt);
            }
        });
        jPanel4.add(btnLAST);

        txtNOTE2.setColumns(20);
        txtNOTE2.setRows(5);
        jScrollPane3.setViewportView(txtNOTE2);

        jLabel9.setText("Date :");

        jLabel10.setText("Note :");

        jLabel11.setText("Amount :");

        txtAMOUNT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAMOUNT2ActionPerformed(evt);
            }
        });

        lblSEQ.setText("Employee ID :");

        txtEMPID2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEMPID2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblSEQ, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEMPID2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAMOUNT2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSEQ)
                    .addComponent(txtEMPID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtAMOUNT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tabCapNhatLayout = new javax.swing.GroupLayout(tabCapNhat);
        tabCapNhat.setLayout(tabCapNhatLayout);
        tabCapNhatLayout.setHorizontalGroup(
            tabCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCapNhatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCapNhatLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tabCapNhatLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tabCapNhatLayout.setVerticalGroup(
            tabCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCapNhatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Cập nhật", tabCapNhat);

        tblLIST.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SEQ", "Amount", "Desciption", "Date", "Employee ID"
            }
        ));
        tblLIST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLISTMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLIST);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel8.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnTHOAT.setText("Thoát");
        btnTHOAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTHOATActionPerformed(evt);
            }
        });
        jPanel8.add(btnTHOAT);

        txtSEARCH.setPreferredSize(new java.awt.Dimension(450, 22));
        txtSEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSEARCHActionPerformed(evt);
            }
        });
        txtSEARCH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSEARCHKeyReleased(evt);
            }
        });
        jPanel6.add(txtSEARCH);

        javax.swing.GroupLayout tabDanhSachLayout = new javax.swing.GroupLayout(tabDanhSach);
        tabDanhSach.setLayout(tabDanhSachLayout);
        tabDanhSachLayout.setHorizontalGroup(
            tabDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDanhSachLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabDanhSachLayout.createSequentialGroup()
                        .addGroup(tabDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabDanhSachLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        tabDanhSachLayout.setVerticalGroup(
            tabDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabDanhSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Danh Sách", tabDanhSach);

        getContentPane().add(tabs, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNEWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNEWActionPerformed
        // TODO add your handling code here:
        this.resetForm();
    }//GEN-LAST:event_btnNEWActionPerformed

    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed
        // TODO add your handling code here:
        this.createEntity();
    }//GEN-LAST:event_btnADDActionPerformed

    private void btnUPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUPDATEActionPerformed
        // TODO add your handling code here:
        this.updateEntity();
    }//GEN-LAST:event_btnUPDATEActionPerformed

    private void btnDELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDELETEActionPerformed
        // TODO add your handling code here:
        this.deleteEntity();
    }//GEN-LAST:event_btnDELETEActionPerformed

    private void btnFIRSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFIRSTActionPerformed
        // TODO add your handling code here:
        this.moveFirst();
    }//GEN-LAST:event_btnFIRSTActionPerformed

    private void btnNEXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNEXTActionPerformed
        // TODO add your handling code here:
        this.moveNext();
    }//GEN-LAST:event_btnNEXTActionPerformed

    private void btnPREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPREActionPerformed
        // TODO add your handling code here:
        this.movePrev();
    }//GEN-LAST:event_btnPREActionPerformed

    private void btnLASTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLASTActionPerformed
        // TODO add your handling code here:
        this.moveLast();
    }//GEN-LAST:event_btnLASTActionPerformed

    private void txtAMOUNT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAMOUNT2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAMOUNT2ActionPerformed

    private void txtEMPID2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEMPID2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEMPID2ActionPerformed

    private void tblLISTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLISTMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 1) {
            this.editEntity();
            tabs.setSelectedIndex(0);
        }
    }//GEN-LAST:event_tblLISTMouseClicked

    private void btnTHOATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTHOATActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnTHOATActionPerformed

    private void txtSEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSEARCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSEARCHActionPerformed

    private void txtSEARCHKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSEARCHKeyReleased
        // TODO add your handling code here:
        this.fillEntityListOnTable();
    }//GEN-LAST:event_txtSEARCHKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        initialize();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(BonusJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BonusJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BonusJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BonusJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BonusJDialog dialog = new BonusJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnADD;
    private javax.swing.JButton btnDELETE;
    private javax.swing.JButton btnFIRST;
    private javax.swing.JButton btnLAST;
    private javax.swing.JButton btnNEW;
    private javax.swing.JButton btnNEXT;
    private javax.swing.JButton btnPRE;
    private javax.swing.JButton btnTHOAT;
    private javax.swing.JButton btnUPDATE;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblSEQ;
    private javax.swing.JPanel tabCapNhat;
    private javax.swing.JPanel tabDanhSach;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblLIST;
    private javax.swing.JTextField txtAMOUNT2;
    private javax.swing.JTextField txtEMPID2;
    private javax.swing.JTextArea txtNOTE2;
    private javax.swing.JTextField txtSEARCH;
    // End of variables declaration//GEN-END:variables

    BonusDAO bDAO = new BonusDAO();
    EmployeeDAO eDAO = new EmployeeDAO();
    
    @Override
    public Bonus getEntityFromForm() {
        Bonus bonus = new Bonus();
        String bonusString = txtAMOUNT2.getText();
        double bonusAmount = Double.parseDouble(bonusString);
        bonus.setSeq(Integer.parseInt(lblSEQ.getToolTipText()));
        bonus.setAmount(bonusAmount);
        bonus.setBonusDate((Date) jDateChooser1.getDate());
        bonus.setDesc(txtNOTE2.getText());
        bonus.setEmployee(eDAO.selectByID(txtEMPID2.getText()));
        return bonus;
        
    }
    
    @Override
    public void fillEntityListOnTable() {
        DefaultTableModel model = (DefaultTableModel) tblLIST.getModel();
        model.setRowCount(0);
        
        try {
            String Keyword = txtSEARCH.getText();
            List<Bonus> list = bDAO.selectByEmpID(Keyword);
//            List<Bonus> list = bDAO.selectAll();
            for (Bonus b : list) {
                Object[] rowData = new Object[]{b.getSeq(), b.getAmount(), b.getDesc(), b.getBonusDate(), b.getEmployee().getId()};
                model.addRow(rowData);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    @Override
    public Bonus getEntityFromSelectedRow() {
        
        int rowIndex = tblLIST.getSelectedRow();
        Integer id = (Integer) tblLIST.getValueAt(rowIndex, 0);
        Bonus bonus = bDAO.selectByID(String.valueOf(id));
        return bonus;
        
    }
    
    @Override
    public void initialize() {
        fillEntityListOnTable();
//        resetForm();
    }
    
    @Override
    public void createEntity() {
        Bonus bonus = this.getEntityFromForm();
        try {
            bDAO.insert(bonus);
            this.resetForm();
            this.fillEntityListOnTable();
            MsgBox.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới thất bại!");
        }
        
    }
    
    @Override
    public void updateEntity() {
        Bonus bonus = this.getEntityFromForm();
        try {
            bDAO.update(bonus);
            this.fillEntityListOnTable();
            MsgBox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại!");
        }
        
    }
    
    @Override
    public void deleteEntity() {
        Bonus bonus = this.getEntityFromForm();
        try {
            bDAO.delete(Integer.toString(bonus.getSeq()));
            this.resetForm();
            this.fillEntityListOnTable();
            MsgBox.alert(this, "Xóa thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Xóa thất bại!");
        }
        
    }
    
    @Override
    public void editEntity() {
        
        Bonus bonus = (Bonus) this.getEntityFromSelectedRow();
        this.setEntityToForm(bonus);
    }
    
    @Override
    public void resetForm() {
        Bonus bonus = new Bonus();
        bonus.setAmount(0);
        bonus.setDesc("");
        bonus.setEmployee(eDAO.selectByID("E001"));
        this.setEntityToForm(bonus);
    }
    
    @Override
    public void setSelectedRowIndex(int index) {
        tblLIST.clearSelection();
        tblLIST.setRowSelectionInterval(index, index);
    }
    
    @Override
    public void moveFirst() {
        int index = 0;
        this.setSelectedRowIndex(index);
        this.editEntity();
    }
    
    @Override
    public void movePrev() {
        int index = tblLIST.getSelectedRow() - 1;
        if (index >= 0) {
            this.setSelectedRowIndex(index);
            this.editEntity();
        } else {
            JOptionPane.showMessageDialog(this, "Bạn đã ở hàng đầu tiên!");
        }
    }
    
    @Override
    public void moveNext() {
        int index = tblLIST.getSelectedRow() + 1;
        
        if (index < tblLIST.getRowCount()) {
            this.setSelectedRowIndex(index);
            this.editEntity();
        } else {
            JOptionPane.showMessageDialog(this, "Bạn đã ở hàng cuối cùng!");
            
        }
    }
    
    @Override
    public void moveLast() {
        int index = tblLIST.getRowCount() - 1;
        this.setSelectedRowIndex(index);
        this.editEntity();
    }
    
    @Override
    public void setEntityToForm(Bonus e) {
        txtEMPID2.setText(e.getEmployee().getId().trim());
        jDateChooser1.setDate(e.getBonusDate());
        txtAMOUNT2.setText(Double.toString(e.getAmount()));
        txtNOTE2.setText(e.getDesc());
        lblSEQ.setToolTipText(Integer.toString(e.getSeq()));
        
    }
    
}
