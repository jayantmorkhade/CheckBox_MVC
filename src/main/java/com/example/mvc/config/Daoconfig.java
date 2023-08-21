package com.example.mvc.config;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.CommonDataSource;
import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Daoconfig {
	public static DataSource dataSource = null;

	public static CommonDataSource getDataSource() throws PropertyVetoException {
		ComboPooledDataSource connectionpds = new ComboPooledDataSource();
		connectionpds.setDriverClass("com.mysql.jdbc.Driver");
		connectionpds.setJdbcUrl("jdbc:mysql://localhost:3306/crud_mvc");
		connectionpds.setUser("root");
		connectionpds.setPassword("root");
		return connectionpds;

	}

	public static Connection getConnection() throws SQLException, PropertyVetoException {
		if (dataSource == null) {
			dataSource = (ComboPooledDataSource) Daoconfig.getDataSource();
		}
		Connection connection = dataSource.getConnection();
		connection.setAutoCommit(true);
		return connection;
	}

}
