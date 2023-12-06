/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package UI;

import controller.CrudController;
import dao.DepartmentDAO;
import entity.Department;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;
import utils.Auth;
import utils.MsgBox;

/**
 *
 * @author ACER
 */
public class DepartmentJDialog1 extends javax.swing.JDialog implements CrudController<Department> {

    /**
     * Creates new form DepartmentJDialog
     */
    public DepartmentJDialog1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        txtID.setBorder(BorderFactory.createCompoundBorder(txtID.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 0)));
        txtDepName.setBorder(BorderFactory.createCompoundBorder(txtDepName.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 0)));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDepart = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtDepName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 20, 0));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 18, -1, -1));

        kGradientPanel2.setkEndColor(new java.awt.Color(204, 204, 255));
        kGradientPanel2.setkGradientFocus(200);
        kGradientPanel2.setkStartColor(new java.awt.Color(102, 102, 255));
        kGradientPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(153, 153, 255));
        jPanel6.setForeground(new java.awt.Color(153, 149, 236));

        tblDepart.setAutoCreateRowSorter(true);
        tblDepart.setBackground(new java.awt.Color(153, 149, 236));
        tblDepart.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tblDepart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Department Name", "Total Employees"
            }
        ));
        tblDepart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDepartMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDepart);

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

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(432, 432, 432))
        );

        kGradientPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, 360));

        btnDelete.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.setBorder(null);
        btnDelete.setPreferredSize(new java.awt.Dimension(80, 40));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.setBorder(null);
        btnUpdate.setPreferredSize(new java.awt.Dimension(80, 40));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, -1));

        btnAdd.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.setBorder(null);
        btnAdd.setPreferredSize(new java.awt.Dimension(80, 40));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        btnNew.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnNew.setText("NEW");
        btnNew.setBorder(null);
        btnNew.setPreferredSize(new java.awt.Dimension(80, 40));
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        kGradientPanel2.add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        btnFirst.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/first.png"))); // NOI18N
        btnFirst.setPreferredSize(new java.awt.Dimension(80, 40));
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel5.add(btnFirst);

        btnPrev.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        btnPrev.setText("<");
        btnPrev.setMargin(new java.awt.Insets(5, 14, 3, 14));
        btnPrev.setPreferredSize(new java.awt.Dimension(80, 40));
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel5.add(btnPrev);

        btnNext.setFont(new java.awt.Font("Segoe UI Emoji", 1, 20)); // NOI18N
        btnNext.setText(">");
        btnNext.setMargin(new java.awt.Insets(5, 14, 3, 14));
        btnNext.setPreferredSize(new java.awt.Dimension(80, 40));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel5.add(btnNext);

        btnLast.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/last.png"))); // NOI18N
        btnLast.setPreferredSize(new java.awt.Dimension(80, 40));
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel5.add(btnLast);

        kGradientPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 490, 350, 28));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DEPARTMENT ");
        kGradientPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 320, 59));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID ");
        kGradientPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 50, 59));

        txtID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtID.setBorder(null);
        txtID.setMargin(new java.awt.Insets(2, 16, 2, 16));
        txtID.setPreferredSize(new java.awt.Dimension(64, 30));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        kGradientPanel2.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 305, 40));

        txtDepName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtDepName.setBorder(null);
        txtDepName.setPreferredSize(new java.awt.Dimension(64, 30));
        txtDepName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepNameActionPerformed(evt);
            }
        });
        kGradientPanel2.add(txtDepName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 305, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Department Name :");
        kGradientPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 209, 305, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/star-removebg-preview.png"))); // NOI18N
        kGradientPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, -40, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon24-48/star-removebg-preview.png"))); // NOI18N
        kGradientPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 990, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.initialize();
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        this.initialize();
        txtID.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewActionPerformed

    private void txtDepNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepNameActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        this.moveFirst();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (isValidate()) {
            this.createEntity();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        this.updateEntity();
        txtID.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        this.deleteEntity();
        txtID.requestFocus();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        this.movePrev();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        this.moveNext();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        this.moveLast();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLastActionPerformed

    private void tblDepartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDepartMouseClicked
        if (evt.getClickCount() == 1) {
            this.editEntity();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDepartMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (txtSearch.getText().trim().isEmpty()) {
            MsgBox.alert(this, "Vui lòng nhập thông tin muốn tìm");
        }
        this.Search();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        this.Search();
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(DepartmentJDialog1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepartmentJDialog1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepartmentJDialog1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepartmentJDialog1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DepartmentJDialog1 dialog = new DepartmentJDialog1(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JTable tblDepart;
    private javax.swing.JTextField txtDepName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
    DepartmentDAO dDAO = new DepartmentDAO();

    @Override
    public Department getEntityFromForm() {
        Department dep = new Department();
        dep.setDepID(txtID.getText());
        dep.setDepName(txtDepName.getText());
        return dep;
    }

    @Override
    public void setEntityToForm(Department dep) {
        txtID.setText(dep.getDepID());
        txtDepName.setText(dep.getDepName());
    }

    @Override
    public void fillEntityListOnTable() {
        DefaultTableModel model = (DefaultTableModel) tblDepart.getModel();
        model.setRowCount(0);

        List<Department> dep = dDAO.selectAll();
        dep.forEach(d
                -> {
            int totalEmployees = dDAO.getTotalEmployees(d.getDepID());
            Object[] row = {
                d.getDepID(),
                d.getDepName(),
                totalEmployees
            };
            model.addRow(row);
        }
        );
    }

    @Override
    public Department getEntityFromSelectedRow() {
        int index = tblDepart.getSelectedRow();
        String id = (String) tblDepart.getValueAt(index, 0);
        Department dep = dDAO.selectByID(id);
        return dep;
    }

    @Override
    public void initialize() {
        this.fillEntityListOnTable();
        this.resetForm();
    }

    @Override
    public void createEntity() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền thêm mới");
        } else {
            Department dep = this.getEntityFromForm();
            try {
                dDAO.insert(dep);
                this.resetForm();
                this.fillEntityListOnTable();
                MsgBox.alert(this, "Thêm mới thành công");
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm mới thất bại");
            }
        }

    }

    @Override
    public void updateEntity() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền sửa");
        } else {
            Department dep = this.getEntityFromForm();
            try {
                dDAO.update(dep);
                this.resetForm();
                this.fillEntityListOnTable();
                MsgBox.alert(this, "Cập nhật thành công");
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhật thất bại");
            }
        }

    }

    @Override
    public void deleteEntity() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa!");
        } else if (MsgBox.confirm(this, "Bạn muốn xóa phòng ban này?")) {
            try {
                Department dep = this.getEntityFromForm();
                dDAO.delete(dep.getDepID());
                this.resetForm();
                this.fillEntityListOnTable();
                MsgBox.alert(this, "Xóa thành công");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa thất bại");
            }
        }

    }

    @Override
    public void editEntity() {
        Department dep = this.getEntityFromSelectedRow();
        this.setEntityToForm(dep);

    }

    @Override
    public void resetForm() {
        Department dep = new Department("", "");
        this.setEntityToForm(dep);
    }

    @Override
    public void setSelectedRowIndex(int index) {
        tblDepart.clearSelection();
        tblDepart.setRowSelectionInterval(index, index);
    }

    @Override
    public void moveFirst() {
        int index = 0;
        this.setSelectedRowIndex(index);
        this.editEntity();
    }

    @Override
    public void movePrev() {
        int index = tblDepart.getSelectedRow() - 1;
        if (index >= 0) {
            this.setSelectedRowIndex(index);
            this.editEntity();
        } else {
            MsgBox.alert(jPanel1, "Bạn đang ở hàng đầu tiên");
        }
    }

    @Override
    public void moveNext() {
        int index = tblDepart.getSelectedRow() + 1;
        if (index < tblDepart.getRowCount()) {
            this.setSelectedRowIndex(index);
            this.editEntity();
        } else {
            MsgBox.alert(jPanel1, "Bạn đang ở dòng cuối cùng");
        }
    }

    @Override
    public void moveLast() {
        int index = tblDepart.getRowCount() - 1;
        this.setSelectedRowIndex(index);
        this.editEntity();
    }

    boolean isValidate() {
        Department dep = this.getEntityFromForm();
        if (dep.getDepID().isEmpty()) {
            MsgBox.alert(this, "Vui lòng không được để trống ID");
            return false;
        } else if (dep.getDepName().isEmpty()) {
            MsgBox.alert(this, "Vui lòng không được để trống DepName");
            return false;
        } else {
            return true;
        }

    }

    void FillTableSearch() {
        DefaultTableModel model = (DefaultTableModel) tblDepart.getModel();
        model.setRowCount(0);
        try {
            String keyword = txtSearch.getText();
            List<Department> list = dDAO.selectByKeyWord(keyword);
            list.forEach(dp
                    -> {
                int totalEmployees = dDAO.getTotalEmployees(dp.getDepID());
                Object[] row = {
                    dp.getDepID(),
                    dp.getDepName(),
                    totalEmployees
                };
                model.addRow(row);
            }
            );
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void Search() {
        this.FillTableSearch();
        this.resetForm();
        int row = -1;

    }

}
