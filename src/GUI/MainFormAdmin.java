/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Audd
 */
public class MainFormAdmin extends javax.swing.JFrame {
    static int check = 0, check1 = 0, check2 = 0;
    /**
     * Creates new form MainFormAdmin
     */
    public MainFormAdmin() {
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

        sidepane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        menuItem1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        menuItem3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        menuItem4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        menuItem2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        menuItem5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        menuItem6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        menuItem7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        logopane = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        mainpane = new javax.swing.JPanel();
        mainTabPanel = new javax.swing.JTabbedPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidepane.setBackground(new java.awt.Color(204, 204, 255));
        sidepane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sidepane.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-menu-32.png"))); // NOI18N
        jLabel1.setText("Menu Ch??nh");

        menuItem1.setBackground(new java.awt.Color(204, 204, 255));
        menuItem1.setPreferredSize(new java.awt.Dimension(141, 65));
        menuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuItem1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuItem1MouseExited(evt);
            }
        });
        menuItem1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-document-32.png"))); // NOI18N
        jLabel10.setText("??i???m th?? sinh");
        menuItem1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 17, -1, -1));

        menuItem3.setBackground(new java.awt.Color(204, 204, 255));
        menuItem3.setPreferredSize(new java.awt.Dimension(141, 62));
        menuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuItem3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuItem3MouseExited(evt);
            }
        });
        menuItem3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-account-32.png"))); // NOI18N
        jLabel5.setText("T??i Kho???n th?? sinh");
        menuItem3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, -1));

        menuItem4.setBackground(new java.awt.Color(204, 204, 255));
        menuItem4.setPreferredSize(new java.awt.Dimension(141, 62));
        menuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuItem4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuItem4MouseExited(evt);
            }
        });
        menuItem4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-help-32.png"))); // NOI18N
        jLabel6.setText("Tr??? Gi??p");
        menuItem4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        menuItem2.setBackground(new java.awt.Color(204, 204, 255));
        menuItem2.setPreferredSize(new java.awt.Dimension(141, 65));
        menuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuItem2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuItem2MouseExited(evt);
            }
        });
        menuItem2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-management-32.png"))); // NOI18N
        jLabel3.setText("H??? s?? th?? sinh");
        menuItem2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, 36));

        menuItem5.setBackground(new java.awt.Color(204, 204, 255));
        menuItem5.setPreferredSize(new java.awt.Dimension(141, 65));
        menuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuItem5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuItem5MouseExited(evt);
            }
        });
        menuItem5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-information-32.png"))); // NOI18N
        jLabel11.setText("Th??ng tin ph???n m???m");
        menuItem5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        menuItem6.setBackground(new java.awt.Color(204, 204, 255));
        menuItem6.setPreferredSize(new java.awt.Dimension(141, 65));
        menuItem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuItem6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuItem6MouseExited(evt);
            }
        });
        menuItem6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-sign-out-32.png"))); // NOI18N
        jLabel7.setText("????ng Xu???t");
        menuItem6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        menuItem7.setBackground(new java.awt.Color(204, 204, 255));
        menuItem7.setPreferredSize(new java.awt.Dimension(141, 62));
        menuItem7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItem7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuItem7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuItem7MouseExited(evt);
            }
        });
        menuItem7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-exit-32.png"))); // NOI18N
        jLabel8.setText("Tho??t");
        menuItem7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout sidepaneLayout = new javax.swing.GroupLayout(sidepane);
        sidepane.setLayout(sidepaneLayout);
        sidepaneLayout.setHorizontalGroup(
            sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuItem1, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
            .addComponent(menuItem3, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
            .addComponent(menuItem4, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
            .addComponent(menuItem2, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
            .addComponent(menuItem6, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(menuItem7, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
            .addComponent(menuItem5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(sidepaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidepaneLayout.setVerticalGroup(
            sidepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepaneLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuItem1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuItem2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuItem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuItem4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuItem5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuItem6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(menuItem7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(261, Short.MAX_VALUE))
        );

        logopane.setBackground(new java.awt.Color(153, 153, 255));
        logopane.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel9.setText("Ph???n M???m Qu???n L?? Tuy???n Sinh");

        jLabel2.setText("v1.0");

        javax.swing.GroupLayout logopaneLayout = new javax.swing.GroupLayout(logopane);
        logopane.setLayout(logopaneLayout);
        logopaneLayout.setHorizontalGroup(
            logopaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logopaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
            .addGroup(logopaneLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(logopaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator4)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(323, Short.MAX_VALUE))
        );
        logopaneLayout.setVerticalGroup(
            logopaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logopaneLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        mainpane.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout mainpaneLayout = new javax.swing.GroupLayout(mainpane);
        mainpane.setLayout(mainpaneLayout);
        mainpaneLayout.setHorizontalGroup(
            mainpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabPanel)
        );
        mainpaneLayout.setVerticalGroup(
            mainpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabPanel)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidepane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logopane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainpane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logopane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainpane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setColor(JPanel jPanel){
        jPanel.setBackground(new java.awt.Color(153,153,255));
    }
    
    private void resetColor(JPanel jPanel){
        jPanel.setBackground(new java.awt.Color(204, 204, 255));
    }
    private void menuItem1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem1MouseEntered
        setColor(menuItem1);
    }//GEN-LAST:event_menuItem1MouseEntered

    private void menuItem1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem1MouseExited
        resetColor(menuItem1);
    }//GEN-LAST:event_menuItem1MouseExited

    private void menuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem1MouseClicked
        if (check == 0){
            check = 1;
            ImageIcon icon = new ImageIcon(getClass().getResource("/Image/icons8-document-16.png"));
            mainTabPanel.addTab("Qu???n L?? ??i???m", icon, new DiemPanel(), "Qu???n L?? ??i???m");
        }
    }//GEN-LAST:event_menuItem1MouseClicked

    private void menuItem2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem2MouseEntered
        setColor(menuItem2);
    }//GEN-LAST:event_menuItem2MouseEntered

    private void menuItem2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem2MouseExited
        resetColor(menuItem2);
    }//GEN-LAST:event_menuItem2MouseExited

    private void menuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem2MouseClicked
        if (check1 == 0){
            check1 = 1;
            ImageIcon icon = new ImageIcon(getClass().getResource("/Image/icons8-management-16.png"));
            try {
                mainTabPanel.addTab("Qu???n L?? H??? S??", icon, new HoSoPanel(), "Qu???n L?? H??? S??");
            } catch (SQLException ex) {
                Logger.getLogger(MainFormAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_menuItem2MouseClicked

    private void menuItem3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem3MouseEntered
        setColor(menuItem3);
    }//GEN-LAST:event_menuItem3MouseEntered

    private void menuItem3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem3MouseExited
        resetColor(menuItem3);
    }//GEN-LAST:event_menuItem3MouseExited

    private void menuItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem3MouseClicked
        if (check2 == 0){
            check2 = 1;
            ImageIcon icon = new ImageIcon(getClass().getResource("/Image/icons8-account-16.png"));
            try {
                mainTabPanel.addTab("Qu???n L?? T??i Kho???n", icon, new TaiKhoanPanel(), "Qu???n L?? T??i Kho???n");
            } catch (SQLException ex) {
                Logger.getLogger(MainFormAdmin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_menuItem3MouseClicked

    private void menuItem4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem4MouseEntered
        setColor(menuItem4);
    }//GEN-LAST:event_menuItem4MouseEntered

    private void menuItem4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem4MouseExited
        resetColor(menuItem4);
    }//GEN-LAST:event_menuItem4MouseExited

    private void menuItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItem4MouseClicked

    private void menuItem5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem5MouseEntered
        setColor(menuItem5);
    }//GEN-LAST:event_menuItem5MouseEntered

    private void menuItem5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem5MouseExited
        resetColor(menuItem5);
    }//GEN-LAST:event_menuItem5MouseExited

    private void menuItem5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItem5MouseClicked

    private void menuItem6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem6MouseEntered
        setColor(menuItem6);
    }//GEN-LAST:event_menuItem6MouseEntered

    private void menuItem6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem6MouseExited
        resetColor(menuItem6);
    }//GEN-LAST:event_menuItem6MouseExited

    private void menuItem6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem6MouseClicked
        int dk = JOptionPane.showConfirmDialog(this, "B???n c?? ch???c ch???n mu???n ????ng xu???t kh??ng?", "Th??ng B??o", JOptionPane.OK_CANCEL_OPTION);
        if(dk == JOptionPane.OK_OPTION){
            this.dispose();
            new LoginForm().setVisible(true);
        }
    }//GEN-LAST:event_menuItem6MouseClicked

    private void menuItem7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem7MouseEntered
        setColor(menuItem7);
    }//GEN-LAST:event_menuItem7MouseEntered

    private void menuItem7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem7MouseExited
        resetColor(menuItem7);
    }//GEN-LAST:event_menuItem7MouseExited

    private void menuItem7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItem7MouseClicked
        int dk = JOptionPane.showConfirmDialog(this, "B???n c?? ch???c ch???n mu???n tho??t kh??ng?", "Th??ng B??o", JOptionPane.OK_CANCEL_OPTION);
        if(dk == JOptionPane.OK_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_menuItem7MouseClicked
    
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
            java.util.logging.Logger.getLogger(MainFormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFormAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFormAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel logopane;
    private javax.swing.JTabbedPane mainTabPanel;
    private javax.swing.JPanel mainpane;
    private javax.swing.JPanel menuItem1;
    private javax.swing.JPanel menuItem2;
    private javax.swing.JPanel menuItem3;
    private javax.swing.JPanel menuItem4;
    private javax.swing.JPanel menuItem5;
    private javax.swing.JPanel menuItem6;
    private javax.swing.JPanel menuItem7;
    private javax.swing.JPanel sidepane;
    // End of variables declaration//GEN-END:variables
}
