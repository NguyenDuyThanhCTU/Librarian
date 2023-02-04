/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarian;

import XuLyAnh.Edit_Img;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.ResultSet;
import SQLServer.ConnectThanh;

/**
 *
 * @author ADMIN
 */
public class Add_Publications extends javax.swing.JFrame {

    
    DefaultTableModel DTM;
    private int ma;
    
    public Add_Publications() {
        initComponents();
        DTM = (DefaultTableModel) AP_Table.getModel();
        setMaAP();
        setTheLoai();
    }
    
    public void setMaAP(){
        try {
            Statement s = ConnectThanh.Connection().createStatement();
            ResultSet rs = s.executeQuery("select MAX(maAP) from AnPham");
            while(rs.next()){
                int n = rs.getInt(1);
                ma = n + 1;
                String str = String.valueOf(n+1);
                txtMaAP.setText(str);
            }
            
            ConnectThanh.Connection().close();
            
        }catch(Exception e){
            txtMaAP.setText("1");
            ma = 1;
        } 
    }
    
    public void setTheLoai(){
        try{
            Statement s = ConnectThanh.Connection().createStatement();
            ResultSet rs = s.executeQuery("select * from Theloai");
            while(rs.next()){
                comboTheloai.addItem(rs.getString("TheLoai"));
            }
            
            ConnectThanh.Connection().close();
            
        }catch(Exception e){
            e.printStackTrace();
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

        jMenu1 = new javax.swing.JMenu();
        Add_Panel = new javax.swing.JPanel();
        lbl_Heading = new javax.swing.JLabel();
        lblMaAP = new javax.swing.JLabel();
        lblTenAP = new javax.swing.JLabel();
        lbltheloia = new javax.swing.JLabel();
        lblTacGia = new javax.swing.JLabel();
        lblPHuThu = new javax.swing.JLabel();
        lblSoLuong = new javax.swing.JLabel();
        lblAnh = new javax.swing.JLabel();
        btnChonAnh = new javax.swing.JButton();
        lblImg = new javax.swing.JLabel();
        btnLuu = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnAddLoai = new javax.swing.JButton();
        txtMaAP = new javax.swing.JTextField();
        txtTenAP = new javax.swing.JTextField();
        comboTheloai = new javax.swing.JComboBox<>();
        txtTacgia = new javax.swing.JTextField();
        txtPhuthu = new javax.swing.JTextField();
        txtSoluong = new javax.swing.JTextField();
        Table_Panel = new javax.swing.JPanel();
        btnLuuTru = new javax.swing.JButton();
        TableAP = new javax.swing.JScrollPane();
        AP_Table = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LIBRARIAN");
        setResizable(false);

        Add_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Add_Panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_Heading.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_Heading.setForeground(new java.awt.Color(0, 0, 204));
        lbl_Heading.setText("Thêm Ấn Phẩm Mới");

        lblMaAP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblMaAP.setText("Mã ấn phẩm");

        lblTenAP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblTenAP.setText("Tên ấn phẩm");

        lbltheloia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbltheloia.setText("Thể loại");

        lblTacGia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblTacGia.setText("Tác giả");

        lblPHuThu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPHuThu.setText("Phụ thu (VND/Ngay)");

        lblSoLuong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblSoLuong.setText("Số lượng");

        lblAnh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblAnh.setText("Hình ảnh");

        btnChonAnh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnChonAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        btnChonAnh.setText("Chọn ảnh");
        btnChonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonAnhActionPerformed(evt);
            }
        });

        btnLuu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/table.png"))); // NOI18N
        btnLuu.setText("Lưu vào bảng");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-document.png"))); // NOI18N
        btnAdd.setText("Thêm mới");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnAddLoai.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAddLoai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/plus.png"))); // NOI18N
        btnAddLoai.setText("Thêm Thể loại");
        btnAddLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLoaiActionPerformed(evt);
            }
        });

        txtMaAP.setEnabled(false);
        txtMaAP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtTenAP.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        comboTheloai.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtTacgia.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtPhuthu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtSoluong.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        Table_Panel.setBackground(new java.awt.Color(255, 255, 255));
        Table_Panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnLuuTru.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnLuuTru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/floppy-disk.png"))); // NOI18N
        btnLuuTru.setText("Lưu trữ");
        btnLuuTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuTruActionPerformed(evt);
            }
        });

        AP_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã ấn phẩm", "Tên ấn phẩm", "Thể loại", "Tác giả", "Số lượng", "Hiện có", "Phụ thu", "Hình ảnh"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableAP.setViewportView(AP_Table);

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png"))); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Table_PanelLayout = new javax.swing.GroupLayout(Table_Panel);
        Table_Panel.setLayout(Table_PanelLayout);
        Table_PanelLayout.setHorizontalGroup(
            Table_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Table_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLuuTru, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(479, 479, 479)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(Table_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TableAP)
                .addContainerGap())
        );
        Table_PanelLayout.setVerticalGroup(
            Table_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Table_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TableAP, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(Table_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit)
                    .addComponent(btnLuuTru))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Add_PanelLayout = new javax.swing.GroupLayout(Add_Panel);
        Add_Panel.setLayout(Add_PanelLayout);
        Add_PanelLayout.setHorizontalGroup(
            Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_PanelLayout.createSequentialGroup()
                .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Add_PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTenAP)
                            .addComponent(lblMaAP)
                            .addComponent(lbltheloia))
                        .addGap(18, 18, 18)
                        .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboTheloai, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaAP, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenAP, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Add_PanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Add_PanelLayout.createSequentialGroup()
                        .addComponent(lblTacGia)
                        .addGap(18, 18, 18)
                        .addComponent(txtTacgia, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Add_PanelLayout.createSequentialGroup()
                        .addComponent(lblPHuThu)
                        .addGap(26, 26, 26)
                        .addComponent(txtPhuthu, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Add_PanelLayout.createSequentialGroup()
                        .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSoLuong)
                            .addComponent(lblAnh))
                        .addGap(98, 98, 98)
                        .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAddLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Heading))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
            .addComponent(Table_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Add_PanelLayout.setVerticalGroup(
            Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Add_PanelLayout.createSequentialGroup()
                        .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11))
                    .addGroup(Add_PanelLayout.createSequentialGroup()
                        .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Add_PanelLayout.createSequentialGroup()
                                .addComponent(lbl_Heading)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Add_PanelLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMaAP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Add_PanelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTenAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTenAP, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPHuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPhuthu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboTheloai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbltheloia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Add_PanelLayout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnChonAnh))))
                        .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Add_PanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(Add_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnLuu)
                                    .addComponent(btnAdd)))
                            .addGroup(Add_PanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnAddLoai)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)))
                .addComponent(Table_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Add_Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Add_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String pathImg = null;
    private void btnChonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonAnhActionPerformed
        JFileChooser filechooser = new JFileChooser();
        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("Hình Ảnh", "jpg", "png");
        filechooser.setFileFilter(imgFilter);
        filechooser.setMultiSelectionEnabled(false);
        int n = filechooser.showDialog(this, "Chọn Ảnh");
        if(n == JFileChooser.APPROVE_OPTION){
            File f = filechooser.getSelectedFile();
            pathImg = f.getAbsolutePath();
            ImageIcon icon = Edit_Img.Edit_Img(pathImg, lblImg);
            lblImg.setIcon(icon);
        }
    }//GEN-LAST:event_btnChonAnhActionPerformed

    private void btnAddLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLoaiActionPerformed
        String m = JOptionPane.showInputDialog(this, "Nhập thể loại mới:", "THÊM THỂ LOẠI", JOptionPane.DEFAULT_OPTION);
        comboTheloai.addItem(m);
        int ma = 0;
        if(m.equals("") == false){
            try{
                Statement s = ConnectThanh.Connection().createStatement();
                ResultSet rs = s.executeQuery("select MAX(IDTheLoai) from Theloai");
                while(rs.next()){
                    ma = rs.getInt(1);
                }
                ma = ma + 1;
                s.execute("Insert into Theloai values ('" + m + "', '" + ma + "');");

                ConnectThanh.Connection().close();
                
                JOptionPane.showMessageDialog(this, "Đã thêm thể loại thành công", "THÔNG BÁO", JOptionPane.PLAIN_MESSAGE);

            }catch(Exception e){
                e.printStackTrace();
            }
        }
            
 
    }//GEN-LAST:event_btnAddLoaiActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        txtMaAP.setText(String.valueOf(ma + 1));
        txtTenAP.setText("");
        txtTacgia.setText("");
        txtPhuthu.setText("");
        txtSoluong.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        String maap = txtMaAP.getText();
        String tenap = txtTenAP.getText();
        String theloai = (String)comboTheloai.getSelectedItem();
        String tacgia = txtTacgia.getText();
        String phuthu = txtPhuthu.getText();
        String soluong = txtSoluong.getText();
        String pathimg = pathImg;
        String hienco = soluong;
        
        DTM.addRow(new Object [] {
            maap, tenap, theloai, tacgia, soluong, hienco, phuthu, pathimg
        });
        
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnLuuTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuTruActionPerformed
        //Duyet qua bang
        try {
            Statement s = ConnectThanh.Connection().createStatement();
            for(int i = 0; i < DTM.getRowCount(); i++){
                String maap = (String) DTM.getValueAt(i, 0);
                String tenap = (String) DTM.getValueAt(i, 1);
                String theloai = (String) DTM.getValueAt(i, 2);
                String tacgia = (String) DTM.getValueAt(i, 3);
                String soluong = (String) DTM.getValueAt(i, 4);
                String hienco = (String) DTM.getValueAt(i, 5);
                String phuthu = (String) DTM.getValueAt(i, 6);
                String path = (String) DTM.getValueAt(i, 7);
                
                int ma = Integer.valueOf(maap);
                int sl = Integer.valueOf(soluong);
                int hc = Integer.valueOf(hienco);
                int pt = Integer.valueOf(phuthu);
                
                s.execute("Insert into AnPham values ('" + ma + "','" + tenap + "','" + theloai + "','" + tacgia
                                + "','" + sl + "','" + pt + "','" + path + "','" + hc+ "');");
                DTM.removeRow(i);
            }
            
            ConnectThanh.Connection().close();
            
            
            JOptionPane.showMessageDialog(this, "Lưu trữ thành công", "THÔNG BÁO", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnLuuTruActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AP_Table;
    private javax.swing.JPanel Add_Panel;
    private javax.swing.JScrollPane TableAP;
    private javax.swing.JPanel Table_Panel;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddLoai;
    private javax.swing.JButton btnChonAnh;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnLuuTru;
    private javax.swing.JComboBox<String> comboTheloai;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel lblAnh;
    private javax.swing.JLabel lblImg;
    private javax.swing.JLabel lblMaAP;
    private javax.swing.JLabel lblPHuThu;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTacGia;
    private javax.swing.JLabel lblTenAP;
    private javax.swing.JLabel lbl_Heading;
    private javax.swing.JLabel lbltheloia;
    private javax.swing.JTextField txtMaAP;
    private javax.swing.JTextField txtPhuthu;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtTacgia;
    private javax.swing.JTextField txtTenAP;
    // End of variables declaration//GEN-END:variables
}