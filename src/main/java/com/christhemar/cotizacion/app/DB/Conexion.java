package com.christhemar.cotizacion.app.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlConnectionPoolDataSource;

public class Conexion {
	
	private static final String USER="root";
	private static final String PASSWORD="root";
	private static final String JDBC="jdbc:mysql://localhost:3306/bd_control?useTimeZone=true&serverTimeZone=UTC";
	
	public static Connection getConexion() throws SQLException {
		Connection connect=DriverManager.getConnection(JDBC, USER, PASSWORD);
		System.out.println("Conectado con la bd");
		return connect;
	}
	
}
