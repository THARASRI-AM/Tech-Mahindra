package com.project1.LoginPage;
import  java.sql.*;
import java.util.*;

public class CreateTable {
	public static void main(String args[]) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "System";
		String password = "1234";
		
		try {
        	//DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
        	Class.forName ("oracle.jdbc.driver.OracleDriver");
        	Connection con = DriverManager.getConnection (url,user,password);
             Statement st = con.createStatement();
             String sql = "CREATE TABLE THARA.LoginCredentials" + "(Username VARCHAR2(50) NOT NULL,"+ "Password VARCHAR2(50) NOT NULL)";
             st.executeUpdate(sql);
             System.out.println("Created table in given database...");

             con.close ();
    }
        catch(Exception e){
        	System.out.println(e.getLocalizedMessage());
        }
    }

    	
		
	}
    
	

