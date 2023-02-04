/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarian;

import XuLyAnh.Edit_Img;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author thanh
 */
public class Login extends javax.swing.JFrame{

    /**
     * Creates new form Login
     */
    private int count = 0;
    
    public Login() {
        initComponents();
        setTitle("Login");
        
        Falsejb.setVisible(false);
        this.AnLb.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotS = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        BackgroundP = new javax.swing.JPanel();
        HinhAnhP = new javax.swing.JPanel();
        JLabelImage = new javax.swing.JLabel();
        ThaotacP = new javax.swing.JPanel();
        XinChaolb = new javax.swing.JLabel();
        TaiKhoanLb = new javax.swing.JLabel();
        MatKhauLb = new javax.swing.JLabel();
        TaiKhoantx = new javax.swing.JTextField();
        MatKhauTx = new javax.swing.JPasswordField();
        DangNhapbt = new javax.swing.JButton();
        NhomatkhauCb = new javax.swing.JCheckBox();
        AnLb = new javax.swing.JLabel();
        HienthiLb = new javax.swing.JLabel();
        Falsejb = new javax.swing.JLabel();
        Logolb = new javax.swing.JLabel();
        Contentlb = new javax.swing.JLabel();
        TopS = new javax.swing.JSeparator();

        BotS.setBackground(new java.awt.Color(0, 255, 204));
        BotS.setForeground(new java.awt.Color(0, 255, 204));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1027, 578));

        jPanel1.setPreferredSize(new java.awt.Dimension(1027, 578));

        BackgroundP.setPreferredSize(new java.awt.Dimension(1027, 578));

        JLabelImage.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                JLabelImageAncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout HinhAnhPLayout = new javax.swing.GroupLayout(HinhAnhP);
        HinhAnhP.setLayout(HinhAnhPLayout);
        HinhAnhPLayout.setHorizontalGroup(
            HinhAnhPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelImage, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        HinhAnhPLayout.setVerticalGroup(
            HinhAnhPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelImage, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
        );

        ThaotacP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        XinChaolb.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        XinChaolb.setText("XIN CHÀO");

        TaiKhoanLb.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        TaiKhoanLb.setText("Tài khoản");

        MatKhauLb.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        MatKhauLb.setText("Mật khẩu");

        MatKhauTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatKhauTxActionPerformed(evt);
            }
        });

        DangNhapbt.setText("Đăng nhập");
        DangNhapbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangNhapbtActionPerformed(evt);
            }
        });

        NhomatkhauCb.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        NhomatkhauCb.setText("Nhớ mật khẩu");
        NhomatkhauCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhomatkhauCbActionPerformed(evt);
            }
        });

        AnLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hidden.png"))); // NOI18N
        AnLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AnLbMousePressed(evt);
            }
        });

        HienthiLb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/view.png"))); // NOI18N
        HienthiLb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HienthiLbMousePressed(evt);
            }
        });

        javax.swing.GroupLayout ThaotacPLayout = new javax.swing.GroupLayout(ThaotacP);
        ThaotacP.setLayout(ThaotacPLayout);
        ThaotacPLayout.setHorizontalGroup(
            ThaotacPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThaotacPLayout.createSequentialGroup()
                .addGroup(ThaotacPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThaotacPLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(XinChaolb, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ThaotacPLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(ThaotacPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TaiKhoanLb)
                            .addComponent(MatKhauLb))
                        .addGap(30, 30, 30)
                        .addGroup(ThaotacPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MatKhauTx, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(TaiKhoantx))
                        .addGap(18, 18, 18)
                        .addComponent(AnLb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HienthiLb)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThaotacPLayout.createSequentialGroup()
                .addGap(0, 82, Short.MAX_VALUE)
                .addGroup(ThaotacPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ThaotacPLayout.createSequentialGroup()
                        .addComponent(DangNhapbt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Falsejb, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(NhomatkhauCb))
                .addGap(121, 121, 121))
        );
        ThaotacPLayout.setVerticalGroup(
            ThaotacPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThaotacPLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(XinChaolb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(ThaotacPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TaiKhoanLb)
                    .addComponent(TaiKhoantx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(ThaotacPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThaotacPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MatKhauLb)
                        .addComponent(MatKhauTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AnLb, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HienthiLb, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(NhomatkhauCb)
                .addGap(35, 35, 35)
                .addGroup(ThaotacPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DangNhapbt)
                    .addComponent(Falsejb, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        Logolb.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                LogolbAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        Contentlb.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Contentlb.setText("LIBRARIAN");

        TopS.setBackground(new java.awt.Color(0, 255, 204));
        TopS.setForeground(new java.awt.Color(0, 255, 204));

        javax.swing.GroupLayout BackgroundPLayout = new javax.swing.GroupLayout(BackgroundP);
        BackgroundP.setLayout(BackgroundPLayout);
        BackgroundPLayout.setHorizontalGroup(
            BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundPLayout.createSequentialGroup()
                        .addComponent(Logolb, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(Contentlb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TopS, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundPLayout.createSequentialGroup()
                        .addComponent(HinhAnhP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(ThaotacP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))))
        );
        BackgroundPLayout.setVerticalGroup(
            BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundPLayout.createSequentialGroup()
                .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Logolb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Contentlb, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundPLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(TopS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(BackgroundPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundPLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(ThaotacP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundPLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HinhAnhP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(BackgroundP, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
      public void run1(){
        int i = 15;
        while(i == 0){
            i--;
            Falsejb.setText("Vui lòng chờ trong" +String.valueOf(i));
        }
    }

  
    
    private void LogolbAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_LogolbAncestorAdded
        // TODO add your handling code here:
        ImageIcon icon = Edit_Img.Edit_Img("X:\\Image-Login-menu\\bookshelf-icon.png",Logolb );
        Logolb.setIcon(icon);
    }//GEN-LAST:event_LogolbAncestorAdded

    private void HienthiLbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HienthiLbMousePressed
        AnLb.setVisible(true);
        HienthiLb.setVisible(false);

        MatKhauTx.setEchoChar((char)0);
    }//GEN-LAST:event_HienthiLbMousePressed

    private void AnLbMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AnLbMousePressed
        HienthiLb.setVisible(true);
        AnLb.setVisible(false);

        MatKhauTx.setEchoChar('*');
    }//GEN-LAST:event_AnLbMousePressed

    private void NhomatkhauCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhomatkhauCbActionPerformed
        if(NhomatkhauCb.isSelected())
        JOptionPane.showMessageDialog(this, "Đã ghi nhớ mật khẩu","THÔNG BÁO",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_NhomatkhauCbActionPerformed

    private void DangNhapbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangNhapbtActionPerformed
        String username = TaiKhoantx.getText();
        String password = new String (MatKhauTx.getPassword());
        this.count++;
//        this.Username = TaiKhoantx.getText();
//        this.Password = new String(MatKhauTx.getPassword());
        
        //Tạo ra chuỗi động để hiển thị thông báo nếu có.
       // StringBuffer sb = new StringBuffer();

        if(username.equals("")||password.equals("")){
            JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu không đc để trống", "THÔNG BÁO", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        if(username.equals("Admin") && password.equals("admin")){
            this.setVisible(false);
            Menu ap = new Menu();
            ap.setVisible(true);
            ap.setLocationRelativeTo(null);
//                if(NhomatkhauCb.isSelected())
//                    TaiKhoantx.;
//                    this.Password.equals("Tri12345");
        }
        else{
            JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu không chính xác", "THÔNG BÁO", JOptionPane.ERROR_MESSAGE);
            for(int i = 0;i<=5;i++){
                if(this.count>=5){
                    JOptionPane.showMessageDialog(null, "Tài khoản của bạn bị tạm khóa, vui lòng chờ 15s","THÔNG BÁO",JOptionPane.WARNING_MESSAGE);
                    DangNhapbt.setVisible(false);
                                       
                    Falsejb.setVisible(true);
                    Falsejb.setText("Vui lòng chờ trong"+String.valueOf(i));
                    //trả về sau khi thông báo để không hiện thêm thông báo
                    return;
                }
            }
        }
    }//GEN-LAST:event_DangNhapbtActionPerformed

    private void MatKhauTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatKhauTxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MatKhauTxActionPerformed

    private void JLabelImageAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_JLabelImageAncestorMoved
        // TODO add your handling code here:
        ImageIcon icon = Edit_Img.Edit_Img("X:\\Image-Login-menu\\Wallpaper1.jpg",JLabelImage );
        JLabelImage.setIcon(icon);
        
            
    }//GEN-LAST:event_JLabelImageAncestorMoved

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Login().setVisible(true);
                Login login = new Login();
                login.setVisible(true);
                login.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnLb;
    private javax.swing.JPanel BackgroundP;
    private javax.swing.JSeparator BotS;
    private javax.swing.JLabel Contentlb;
    private javax.swing.JButton DangNhapbt;
    private javax.swing.JLabel Falsejb;
    private javax.swing.JLabel HienthiLb;
    private javax.swing.JPanel HinhAnhP;
    private javax.swing.JLabel JLabelImage;
    private javax.swing.JLabel Logolb;
    private javax.swing.JLabel MatKhauLb;
    private javax.swing.JPasswordField MatKhauTx;
    private javax.swing.JCheckBox NhomatkhauCb;
    private javax.swing.JLabel TaiKhoanLb;
    private javax.swing.JTextField TaiKhoantx;
    private javax.swing.JPanel ThaotacP;
    private javax.swing.JSeparator TopS;
    private javax.swing.JLabel XinChaolb;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}