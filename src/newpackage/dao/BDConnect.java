///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package newpackage.dao;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.sql.Connection;
///**
// *
// * @author DELL
// */
//public class BDConnect {
//	public static void main(String args[]){  
//    	try{  
//    	Class.forName("com.mysql.cj.jdbc.Driver");  
//    	Connection con=DriverManager.getConnection(  
//    	"jdbc:mysql://localhost:2012/db_mnstudent","root","truongcao");  
//    	  
//    	Statement stmt=con.createStatement();  
//    	ResultSet rs=stmt.executeQuery("select * from student");  
//    	while(rs.next())  
//    	System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getDate(3) + " " + rs.getString(4) + " " + rs.getString(5) + " " + rs.getString(6) + " " + rs.getInt(7));  
//    	con.close();  
//    	}catch(Exception e){ System.out.println(e);}  
//    }  
//}
