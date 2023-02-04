/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.Objects;

/**
 *
 * @author thanh
 */
public class Publications {
    private String maAP;
    private String tenAP;
    private String Theloai;
    private String Tacgia;
    private String Phuthu;
    private String Soluong;
    private String Pathing;
    private String hienco;

    public Publications(String string, String string0, String string1, String string2, String string3, String string4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Publications(String string, String string0, String string1, String string2, String string3, String string4, String string5, String string6) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getPathing() {
        return Pathing;
    }

    public void setPathing(String Pathing) {
        this.Pathing = Pathing;
    }

    public Publications() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    public String getMaAP() {
        return maAP;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.Soluong);
        hash = 31 * hash + Objects.hashCode(this.Pathing);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Publications other = (Publications) obj;
        return true;
    }

    public void setMaAP(String maAP) {
        this.maAP = maAP;
    }

    public String getTenAP() {
        return tenAP;
    }

    public String getHienco() {
        return hienco;
    }

    public void setHienco(String hienco) {
        this.hienco = hienco;
    }

    public void setTenAP(String tenAP) {
        this.tenAP = tenAP;
    }

    public String getTheloai() {
        return Theloai;
    }

    public void setTheloai(String Theloai) {
        this.Theloai = Theloai;
    }

    public String getTacgia() {
        return Tacgia;
    }

    public void setTacgia(String Tacgia) {
        this.Tacgia = Tacgia;
    }

    public String getPhuthu() {
        return Phuthu;
    }

    public void setPhuthu(String Phuthu) {
        this.Phuthu = Phuthu;
    }

    public String getSoluong() {
        return hienco;
    }

    public void setSoluong(String Soluong) {
        this.hienco = Soluong;
    }


    public Publications(String maAP, String Theloai, String Tacgia, String Phuthu, String Soluong, String Pathing, String hienco) {
        this.maAP = maAP;
        this.Theloai = Theloai;
        this.Tacgia = Tacgia;
        this.Phuthu = Phuthu;
        this.Soluong = Soluong;
        this.Pathing = Pathing;
        this.hienco = hienco;
    }

    
}
