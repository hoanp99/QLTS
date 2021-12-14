/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.ThiSinh;

/**
 *
 * @author Audd
 */
public class XemDiemPanel extends javax.swing.JPanel {
    private ThiSinh a = BUS.ThiSinhBUS.getAThiSinh(BUS.TaiKhoanBUS.a.getUserName());
    /**
     * Creates new form XemDiemPanel
     */
    public XemDiemPanel() {
        initComponents();
        txtSBD.setText(a.getID());
        ll.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSBD = new javax.swing.JTextField();
        btnXem = new javax.swing.JButton();
        btnDong = new javax.swing.JButton();
        ll = new javax.swing.JLabel();
        lblThongBao = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Xem Điểm");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Số Báo Danh:");

        txtSBD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnXem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-search-16.png"))); // NOI18N
        btnXem.setText("Xem");
        btnXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemActionPerformed(evt);
            }
        });

        btnDong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-close-16.png"))); // NOI18N
        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        ll.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ll.setText("Điểm Các Môn:");

        lblThongBao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSBD, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnXem)
                        .addGap(18, 18, 18)
                        .addComponent(btnDong))
                    .addComponent(ll)
                    .addComponent(lblThongBao))
                .addContainerGap(668, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXem)
                    .addComponent(btnDong))
                .addGap(18, 18, 18)
                .addComponent(ll)
                .addGap(18, 18, 18)
                .addComponent(lblThongBao)
                .addContainerGap(256, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        XemDiemPanel.this.getParent().remove(XemDiemPanel.this);
        MainFormUser.check2 = 0;
    }//GEN-LAST:event_btnDongActionPerformed

    private void btnXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemActionPerformed
        ll.setVisible(true);
        BUS.DiemBUS.xemDiem(txtSBD.getText(), lblThongBao);
    }//GEN-LAST:event_btnXemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JButton btnXem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblThongBao;
    private javax.swing.JLabel ll;
    private javax.swing.JTextField txtSBD;
    // End of variables declaration//GEN-END:variables
}