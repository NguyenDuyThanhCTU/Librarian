/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import SQLServer.ConnectThanh;
import entities.Profile;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author thanh
 */
public class Profile_Model {
        
    public ArrayList<Profile> Data_Profile(){
 //       Statement c = ConnectThanh.Connection().createStatement();
        ArrayList<Profile> list = new ArrayList<>();
        String sql = "Select * from Nguoidung";
        
        try{
            Connection conn = ConnectThanh.Connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            //insert, update, delete: executeQuery
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Profile p = new Profile(rs.getString("ID"),rs.getString("HoTen"),rs.getString("SoDienThoai"),rs.getString("Email"),rs.getString("DiaChi"));
                list.add(p);
            }
            
        }catch(Exception e){
    }
        return list;
    }
    public static void main(String[] args) {
        Profile_Model profile_model = new Profile_Model();
        System.out.println(profile_model.Data_Profile().get(0));
    }
    
}
