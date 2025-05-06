/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
/**
 *
 * @author ADMIN
 */
public class mySQLConnect {
    private String user="root";
    private String password="";
    private String url="jdbc:mysql://localhost:3306/cnm?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
    private Connection conn=null;
    private Statement st=null;
    private static final Logger logger=System.getLogger(mySQLConnect.class.getName());

    public mySQLConnect() {
    }
    
    
    public void connect(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection(url,user,password);
            logger.log(Level.INFO,"Ket noi thanh cong");
        }catch(ClassNotFoundException | SQLException ex){
            logger.log(Level.ERROR,"Ket noi that bai",ex);
            
        }
    }
    public void disConnect(){
        try{
            conn.close();
        }catch(SQLException ex){
            logger.log(Level.ERROR,"ngat Ket noi that bai",ex);
        }
    }
    public ResultSet executeQuery(String sql){
        ResultSet rs=null;
        try{
            connect();
            st=conn.createStatement();
            rs=st.executeQuery(sql);
        }catch(SQLException ex){
            logger.log(Level.ERROR,"thuc hien truy van that bai",ex);
        }
        return rs;
    }
    public void executeUpdate(String sql){
        try{
            connect();
            st=conn.createStatement();
            st.executeUpdate(sql);
            disConnect();
        }catch(SQLException ex){
            logger.log(Level.ERROR,"Cap nhat truy van that bai",ex);
        }
    }
    public static void main(String[] args){
        mySQLConnect db=new mySQLConnect();
        db.connect();
    }
}
