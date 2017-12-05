package br.unincor.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	private String SERVER;
	private String PORT;
	private String DB_NAME;
	private String USER;
	private String PASSWORD;
	
	public Connection CON;

	public DBConnection() {
		super();
		SERVER = "192.168.56.102";
		PORT = "3306";
		DB_NAME = "escola";
		USER = "aluno";
		PASSWORD = "*****";
		CON = null;
	}
	
	public void openDBConnection(){
		try {
			CON = DriverManager.getConnection(getURL(),USER,PASSWORD);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void closeDBConnection() {
		try {
			if (CON != null){
				CON.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private String getURL(){
		return "jdbc:mysql://"+ SERVER + ":"+ PORT + "/" + DB_NAME+"?useSSL=false";
	}
}


