/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarian;


import SQLServer.ConnectThanh;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;



public class Add_Profile extends javax.swing.JFrame {

    /**
     * Creates new form Add_Profile
     */
    public Add_Profile() {
        initComponents();
        setMathe();
    }
    
    public void setMathe(){
        try{
            Statement s = ConnectThanh.Connection().createStatement();
            ResultSet rs = s.executeQuery("select MAX(ID) from Nguoidung");
            
            while(rs.next()){
                int n = rs.getInt(1);
                 String str = String.valueOf(n+1);
                txtMathe.setText(str);
            }
            
            ConnectThanh.Connection().close();
        }catch(Exception e){
            txtMathe.setText("1");
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

        lblTMHS = new javax.swing.JLabel();
        lblMathe = new javax.swing.JLabel();
        lblHoten = new javax.swing.JLabel();
        lblSĐT = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblDiachi = new javax.swing.JLabel();
        lblComent = new javax.swing.JLabel();
        txtMathe = new javax.swing.JTextField();
        txtHoten = new javax.swing.JTextField();
        txtSĐT = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDiachi = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnHuybo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LIBRARIAN");
        setResizable(false);

        lblTMHS.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTMHS.setText("Tạo Hồ Sơ Mới");

        lblMathe.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblMathe.setText("Mã Thẻ");

        lblHoten.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblHoten.setText("Họ Tên");

        lblSĐT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblSĐT.setText("SĐT");

        lblEmail.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblEmail.setText("Email");

        lblDiachi.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDiachi.setText("Địa Chỉ");

        lblComent.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        lblComent.setForeground(new java.awt.Color(255, 51, 51));
        lblComent.setText("Kiểm tra kỹ thông tin trước khi tạo thẻ");

        txtMathe.setEnabled(false);
        txtMathe.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtHoten.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtSĐT.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtDiachi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnAdd.setBackground(new java.awt.Color(204, 204, 204));
        btnAdd.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/document.png"))); // NOI18N
        btnAdd.setText("Tạo Hồ Sơ");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnHuybo.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        btnHuybo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete.png"))); // NOI18N
        btnHuybo.setText("Hủy Bỏ");
        btnHuybo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addComponent(btnHuybo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(189, 189, 189)
                            .addComponent(lblTMHS, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMathe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSĐT, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(59, 59, 59)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMathe)
                                .addComponent(txtHoten)
                                .addComponent(txtSĐT)
                                .addComponent(txtEmail)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lblComent, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTMHS)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMathe, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMathe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSĐT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSĐT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblComent)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnHuybo))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(txtMathe.getText().equals("") || txtHoten.getText().equals("") || txtSĐT.getText().equals("")
                || txtEmail.getText().equals("") || txtDiachi.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Tất cả các trường không được để trống !!!", "THÔNG BÁO", JOptionPane.ERROR_MESSAGE);
        else{
            int input = JOptionPane.showConfirmDialog(this, "Tạo Hồ Sơ", "THÔNG BÁO", JOptionPane.YES_NO_OPTION);
            if(input == 0){
                //Cập nhật csdl
                try {
                    String Mathe_tmp = txtMathe.getText();
                    String Hoten_tmp = txtHoten.getText();
                    String SDT_tmp = txtSĐT.getText();
                    String Email_tmp = txtEmail.getText();
                    String DiaChi_tmp = txtDiachi.getText();
            
                    int so_ma = Integer.parseInt(Mathe_tmp);
                    
                    Statement s = ConnectThanh.Connection().createStatement();
                    s.execute("Insert into Nguoidung values ('" + so_ma + "','" + Hoten_tmp + "','" + SDT_tmp + "','"
                                    + Email_tmp + "','" + DiaChi_tmp +"');");
                    JOptionPane.showMessageDialog(this, "Tạo hồ sơ thành công ", "THÔNG BÁO", JOptionPane.DEFAULT_OPTION);
                    
                   ConnectThanh.Connection().close();
                }catch(Exception e){
                    e.printStackTrace();
                }           
            }
        }                
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnHuyboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyboActionPerformed
        this.setVisible(false);
        
    }//GEN-LAST:event_btnHuyboActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnHuybo;
    private javax.swing.JLabel lblComent;
    private javax.swing.JLabel lblDiachi;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHoten;
    private javax.swing.JLabel lblMathe;
    private javax.swing.JLabel lblSĐT;
    private javax.swing.JLabel lblTMHS;
    private javax.swing.JTextField txtDiachi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtMathe;
    private javax.swing.JTextField txtSĐT;
    // End of variables declaration//GEN-END:variables
}
