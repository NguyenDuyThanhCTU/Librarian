package librarian;

import SQLServer.ConnectThanh;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import librarian.List_Profile;
import librarian.Search_Publications;
 




/**
 *
 * @author thanh
 */
public class Deal extends javax.swing.JFrame {
    /**
     * Creates new form Deal
     */
    private String Trangthai;
    private DefaultTableModel T;
    private DefaultTableModel A;
    
    public Deal() {
        initComponents();
        setLocationRelativeTo(null);
        T = (DefaultTableModel) MuonSachTB.getModel();
        A = (DefaultTableModel) TrasachTB.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        MuonsachPn = new javax.swing.JPanel();
        HeaderLb = new javax.swing.JLabel();
        MuonSachSp = new javax.swing.JScrollPane();
        MuonSachTB = new javax.swing.JTable();
        controler = new javax.swing.JPanel();
        ThemBt = new javax.swing.JButton();
        LuuBt = new javax.swing.JButton();
        HuyBt = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        IDdocgiaLb = new javax.swing.JLabel();
        IDdocgiaTx = new javax.swing.JTextField();
        NguoimuonLb = new javax.swing.JLabel();
        Tendocgiatx = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        IDAnphamLb = new javax.swing.JLabel();
        IDAnphamTx = new javax.swing.JTextField();
        TenAnPhamLb = new javax.swing.JLabel();
        TenAnphamtx = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        AnPhamlb1 = new javax.swing.JLabel();
        NgaymuonLb = new javax.swing.JLabel();
        NgaytraLb = new javax.swing.JLabel();
        SoluongTx = new javax.swing.JTextField();
        NgaymuonTx = new javax.swing.JTextField();
        NgaytraTx = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        btnExit1 = new javax.swing.JButton();
        Trasachpn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        controler1 = new javax.swing.JPanel();
        NguoimuonLb1 = new javax.swing.JLabel();
        ThemBt1 = new javax.swing.JButton();
        TendocgiaTx1 = new javax.swing.JTextField();
        NguoimuonLb2 = new javax.swing.JLabel();
        IDdocgiatrasachTx = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        NguoimuonLb3 = new javax.swing.JLabel();
        IDAnphamtx1 = new javax.swing.JTextField();
        MuonSachSp1 = new javax.swing.JScrollPane();
        TrasachTB = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        HeaderLb.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        HeaderLb.setText("MƯỢN SÁCH");

        MuonSachTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Mã Ấn Phẩm", "Họ tên", "Tên Ấn Phẩm", "Số điện thoại", "Ngày mượn", "Hạn Trả", "Số lượng", "Thành tiền"
            }
        ));
        MuonSachTB.setName(""); // NOI18N
        MuonSachSp.setViewportView(MuonSachTB);

        controler.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ThemBt.setText("Thêm");
        ThemBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemBtActionPerformed(evt);
            }
        });

        LuuBt.setText("Lưu");
        LuuBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuuBtActionPerformed(evt);
            }
        });

        HuyBt.setText("Xóa");
        HuyBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HuyBtActionPerformed(evt);
            }
        });

        IDdocgiaLb.setText("ID đọc giả");

        IDdocgiaTx.setToolTipText("");
        IDdocgiaTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDdocgiaTxActionPerformed(evt);
            }
        });

        NguoimuonLb.setText("Tên đọc giả");

        Tendocgiatx.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDdocgiaLb)
                    .addComponent(NguoimuonLb))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tendocgiatx)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(IDdocgiaTx, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 134, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDdocgiaLb)
                    .addComponent(IDdocgiaTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NguoimuonLb)
                    .addComponent(Tendocgiatx))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        IDAnphamLb.setText("ID An pham");

        IDAnphamTx.setToolTipText("");
        IDAnphamTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDAnphamTxActionPerformed(evt);
            }
        });

        TenAnPhamLb.setText("Ten An Pham");

        TenAnphamtx.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDAnphamLb)
                    .addComponent(TenAnPhamLb))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TenAnphamtx)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(IDAnphamTx, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 133, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDAnphamLb)
                    .addComponent(IDAnphamTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TenAnPhamLb)
                    .addComponent(TenAnphamtx))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AnPhamlb1.setText("Số lượng");

        NgaymuonLb.setText("Ngày mượn");

        NgaytraLb.setText("Ngày trả");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AnPhamlb1)
                    .addComponent(NgaymuonLb)
                    .addComponent(NgaytraLb))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NgaytraTx, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NgaymuonTx, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SoluongTx, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AnPhamlb1)
                    .addComponent(SoluongTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NgaymuonLb)
                    .addComponent(NgaymuonTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NgaytraLb)
                    .addComponent(NgaytraTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout controlerLayout = new javax.swing.GroupLayout(controler);
        controler.setLayout(controlerLayout);
        controlerLayout.setHorizontalGroup(
            controlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlerLayout.createSequentialGroup()
                .addGroup(controlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlerLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(ThemBt)
                        .addGap(47, 47, 47)
                        .addComponent(LuuBt)
                        .addGap(39, 39, 39)
                        .addComponent(HuyBt, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(controlerLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(controlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        controlerLayout.setVerticalGroup(
            controlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(controlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThemBt)
                    .addComponent(LuuBt)
                    .addComponent(HuyBt))
                .addGap(51, 51, 51))
        );

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png"))); // NOI18N

        btnExit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png"))); // NOI18N
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MuonsachPnLayout = new javax.swing.GroupLayout(MuonsachPn);
        MuonsachPn.setLayout(MuonsachPnLayout);
        MuonsachPnLayout.setHorizontalGroup(
            MuonsachPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MuonsachPnLayout.createSequentialGroup()
                .addGap(530, 530, 530)
                .addComponent(HeaderLb)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(MuonsachPnLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(MuonsachPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(controler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(MuonSachSp, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(MuonsachPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MuonsachPnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnExit)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        MuonsachPnLayout.setVerticalGroup(
            MuonsachPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MuonsachPnLayout.createSequentialGroup()
                .addComponent(HeaderLb, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(MuonsachPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MuonsachPnLayout.createSequentialGroup()
                        .addComponent(MuonSachSp, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(41, Short.MAX_VALUE))
                    .addGroup(MuonsachPnLayout.createSequentialGroup()
                        .addComponent(controler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit1)
                        .addGap(64, 64, 64))))
            .addGroup(MuonsachPnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MuonsachPnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnExit)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("mượn sách", MuonsachPn);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("TRẢ SÁCH");

        controler1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        NguoimuonLb1.setText("ID");

        ThemBt1.setText("Xác nhận");
        ThemBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemBt1ActionPerformed(evt);
            }
        });

        TendocgiaTx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TendocgiaTx1ActionPerformed(evt);
            }
        });

        NguoimuonLb2.setText("Tên đọc giả");

        IDdocgiatrasachTx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDdocgiatrasachTxActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Trả sách");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        NguoimuonLb3.setText("ID Ấn phẩm");

        IDAnphamtx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDAnphamtx1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controler1Layout = new javax.swing.GroupLayout(controler1);
        controler1.setLayout(controler1Layout);
        controler1Layout.setHorizontalGroup(
            controler1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controler1Layout.createSequentialGroup()
                .addGroup(controler1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controler1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(controler1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(controler1Layout.createSequentialGroup()
                                .addComponent(NguoimuonLb2)
                                .addGap(3, 185, Short.MAX_VALUE))
                            .addGroup(controler1Layout.createSequentialGroup()
                                .addComponent(NguoimuonLb3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(controler1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(controler1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(controler1Layout.createSequentialGroup()
                                .addComponent(ThemBt1)
                                .addGap(34, 34, 34)
                                .addComponent(jToggleButton1)
                                .addGap(10, 10, 10))
                            .addGroup(controler1Layout.createSequentialGroup()
                                .addComponent(NguoimuonLb1)
                                .addGap(64, 64, 64)
                                .addGroup(controler1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TendocgiaTx1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IDAnphamtx1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IDdocgiatrasachTx, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(62, 62, 62))
        );
        controler1Layout.setVerticalGroup(
            controler1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controler1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(controler1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NguoimuonLb1)
                    .addComponent(IDdocgiatrasachTx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(controler1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NguoimuonLb2)
                    .addComponent(TendocgiaTx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(controler1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NguoimuonLb3)
                    .addComponent(IDAnphamtx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(controler1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ThemBt1)
                    .addComponent(jToggleButton1))
                .addGap(66, 66, 66))
        );

        TrasachTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Mã ấn phẩm", "Tên đọc giả", "Ngày mượn", "Hạn trả", "Trạng thái"
            }
        ));
        MuonSachSp1.setViewportView(TrasachTB);
        if (TrasachTB.getColumnModel().getColumnCount() > 0) {
            TrasachTB.getColumnModel().getColumn(0).setResizable(false);
            TrasachTB.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout TrasachpnLayout = new javax.swing.GroupLayout(Trasachpn);
        Trasachpn.setLayout(TrasachpnLayout);
        TrasachpnLayout.setHorizontalGroup(
            TrasachpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrasachpnLayout.createSequentialGroup()
                .addGroup(TrasachpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TrasachpnLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(controler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(MuonSachSp1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TrasachpnLayout.createSequentialGroup()
                        .addGap(518, 518, 518)
                        .addComponent(jLabel2)))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        TrasachpnLayout.setVerticalGroup(
            TrasachpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrasachpnLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TrasachpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MuonSachSp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(controler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(250, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("trả sách", Trasachpn);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDAnphamtx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDAnphamtx1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDAnphamtx1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        try {
            java.sql.Statement s = ConnectThanh.Connection().createStatement();
            for(int i = 0; i < A.getRowCount(); i++){
                String ID = (String) A.getValueAt(i, 0);
                String maap = (String) A.getValueAt(i, 1);

                s.execute("Delete from MuonSach where ID ='"+ ID +"' And maAP ='"+ maap +"' ;");
                A.removeRow(i);
            }

            ConnectThanh.Connection().close();

            JOptionPane.showMessageDialog(this, "Đã trả", "THÔNG BÁO", JOptionPane.INFORMATION_MESSAGE);

        }catch(Exception e){
            e.printStackTrace();
        }

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void IDdocgiatrasachTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDdocgiatrasachTxActionPerformed
        try {
            String ID = IDdocgiatrasachTx.getText();
            java.sql.Statement s = ConnectThanh.Connection().createStatement();
            ResultSet rs = s.executeQuery("select HoTen from Nguoidung where ID ='" + ID + "'; ");
            while ( rs.next() ) {
                TendocgiaTx1.setText(rs.getString("HoTen"));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_IDdocgiatrasachTxActionPerformed

    private void TendocgiaTx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TendocgiaTx1ActionPerformed

    }//GEN-LAST:event_TendocgiaTx1ActionPerformed

    private void ThemBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemBt1ActionPerformed
        String IDdocgia = IDdocgiatrasachTx.getText();
        String Tendocgia = Tendocgiatx.getText();
        String IDAnpham = IDAnphamtx1.getText();

        String Tendocgia1 =null;
        String Ngaymuon=null;
        String Ngaytra=null;
        String trangthai=null;
        String ID = null;
        String maap = null;

        int sl = 0;
        try {
            java.sql.Statement s = ConnectThanh.Connection().createStatement();
            ResultSet rs = s.executeQuery("select * from MuonSach where ID ='" + IDdocgia + "' and maAP ='" +IDAnpham+ "'; ");
            while(rs.next()){
                Tendocgia1 = rs.getString("Hoten");
                Ngaymuon = rs.getString("Ngaymuon");
                Ngaytra = rs.getString("Ngaytra");
                trangthai = "chua tra";
                ID = rs.getString("ID");
                maap = rs.getString("maAP");

            }

            A.addRow(new Object[] {
                ID,maap,Tendocgia1, Ngaymuon, Ngaytra, trangthai
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_ThemBt1ActionPerformed

    private void IDAnphamTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDAnphamTxActionPerformed
        try {
            String maAP = IDAnphamTx.getText();
            java.sql.Statement s = ConnectThanh.Connection().createStatement();
            ResultSet rs = s.executeQuery("select tenAP from AnPham where maAP ='" + maAP + "'; ");
            while ( rs.next() ) {
                TenAnphamtx.setText(rs.getString("tenAP"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_IDAnphamTxActionPerformed

    private void IDdocgiaTxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDdocgiaTxActionPerformed
        try {
            String ID = IDdocgiaTx.getText();
            java.sql.Statement s = ConnectThanh.Connection().createStatement();
            ResultSet rs = s.executeQuery("select HoTen from Nguoidung where ID ='" + ID + "'; ");
            while ( rs.next() ) {
                Tendocgiatx.setText(rs.getString("HoTen"));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_IDdocgiaTxActionPerformed

    private void HuyBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HuyBtActionPerformed
        IDdocgiaTx.setText("");
        Tendocgiatx.setText("");
        SoluongTx.setText("");
        NgaymuonTx.setText("");
        NgaytraTx.setText("");
    }//GEN-LAST:event_HuyBtActionPerformed

    private void LuuBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuuBtActionPerformed
        try {
            java.sql.Statement s = ConnectThanh.Connection().createStatement();
            for(int i = 0; i < T.getRowCount(); i++){
                String ID = (String) T.getValueAt(i, 0);
                String maAP = (String) T.getValueAt(i, 1);
                String Hoten = (String) T.getValueAt(i, 2);
                String tenAP = (String) T.getValueAt(i, 3);
                String Sodienthoai = (String) T.getValueAt(i, 4);
                String Ngaymuon = (String) T.getValueAt(i, 5);
                String Ngaytra = (String) T.getValueAt(i, 6);
                String soluong = (String) T.getValueAt(i, 7);
                String thanhtien = (String) T.getValueAt(i, 8);

                s.execute("Insert into MuonSach values ('" + ID + "','" + maAP + "','" + Hoten + "','" + tenAP
                    + "','" + Sodienthoai + "','" + Ngaymuon + "','" + Ngaytra + "','" + soluong+ "','" + thanhtien+ "');");
                T.removeRow(i);
            }

            ConnectThanh.Connection().close();

            JOptionPane.showMessageDialog(this, "Lưu trữ thành công", "THÔNG BÁO", JOptionPane.INFORMATION_MESSAGE);

        }catch(Exception e){
            e.printStackTrace();
        }

    }//GEN-LAST:event_LuuBtActionPerformed

    private void ThemBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemBtActionPerformed
        String IDdocgia = IDdocgiaTx.getText();
        String Tendocgia = Tendocgiatx.getText();
        String IDAnpham = IDAnphamTx.getText();
        String TenAnpham = TenAnphamtx.getText();

        String Soluong = SoluongTx.getText();
        String Ngaymuon = NgaymuonTx.getText();
        String Ngaytra = NgaytraTx.getText();

        String SDT = null;
        String ThanhTien = null;
        String phuthu = null;
        String hienco = null;
        int sl = 0;
        try {
            java.sql.Statement s = ConnectThanh.Connection().createStatement();
            ResultSet rs = s.executeQuery("select SĐT from Nguoidung where ID ='" + IDdocgia + "'; ");
            while(rs.next()){
                SDT = rs.getString("SĐT");
            }

            ResultSet rs1 = s.executeQuery("select Phuthu, hienco from AnPham where maAP ='" + IDAnpham + "'; ");
            while(rs1.next()){
                phuthu = rs1.getString("Phuthu");
                hienco = rs1.getString("hienco");
                int pt = Integer.valueOf(phuthu);
                sl = Integer.valueOf(Soluong);
                int tt = pt * sl;
                ThanhTien = String.valueOf(tt);
            }

            T.addRow(new Object[] {
                IDdocgia, IDAnpham, Tendocgia, TenAnpham, SDT, Ngaymuon, Ngaytra, Soluong, ThanhTien
            });

            int hc = Integer.valueOf(hienco);
            hc = hc - sl;
            s.execute("Update AnPham set hienco = '" + hc + "' where maAP = '" + IDAnpham + "';" );

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_ThemBtActionPerformed

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        this.setVisible(false);
        Menu m = new Menu();
        m.setVisible(true);
        m.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnExit1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Deal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Deal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Deal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Deal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Deal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnPhamlb1;
    private javax.swing.JLabel HeaderLb;
    private javax.swing.JToggleButton HuyBt;
    private javax.swing.JLabel IDAnphamLb;
    private javax.swing.JTextField IDAnphamTx;
    private javax.swing.JTextField IDAnphamtx1;
    private javax.swing.JLabel IDdocgiaLb;
    private javax.swing.JTextField IDdocgiaTx;
    private javax.swing.JTextField IDdocgiatrasachTx;
    private javax.swing.JButton LuuBt;
    private javax.swing.JScrollPane MuonSachSp;
    private javax.swing.JScrollPane MuonSachSp1;
    private javax.swing.JTable MuonSachTB;
    private javax.swing.JPanel MuonsachPn;
    private javax.swing.JLabel NgaymuonLb;
    private javax.swing.JTextField NgaymuonTx;
    private javax.swing.JLabel NgaytraLb;
    private javax.swing.JTextField NgaytraTx;
    private javax.swing.JLabel NguoimuonLb;
    private javax.swing.JLabel NguoimuonLb1;
    private javax.swing.JLabel NguoimuonLb2;
    private javax.swing.JLabel NguoimuonLb3;
    private javax.swing.JTextField SoluongTx;
    private javax.swing.JLabel TenAnPhamLb;
    private javax.swing.JTextField TenAnphamtx;
    private javax.swing.JTextField TendocgiaTx1;
    private javax.swing.JTextField Tendocgiatx;
    private javax.swing.JButton ThemBt;
    private javax.swing.JButton ThemBt1;
    private javax.swing.JTable TrasachTB;
    private javax.swing.JPanel Trasachpn;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExit1;
    private javax.swing.JPanel controler;
    private javax.swing.JPanel controler1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}