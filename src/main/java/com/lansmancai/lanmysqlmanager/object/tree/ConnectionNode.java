package com.lansmancai.lanmysqlmanager.object.tree;

import java.sql.Connection;

import com.lansmancai.lanmysqlmanager.object.ViewObject;

/**
 * ��Ҫ�������ӵĽڵ�ĸ��࣬ Database��ServerConnection
 */
public abstract class ConnectionNode implements ViewObject {

	protected Connection connection;
	
	public abstract Connection connect();
	
	public Connection getConnection() {
		return this.connection;
	}
	
	public void setConnection(Connection connection) {
		this.connection = connection;
	}
}
