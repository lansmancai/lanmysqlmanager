package com.lansmancai.lanmysqlmanager.object.tree;

import java.util.List;

import javax.swing.Icon;

import com.lansmancai.lanmysqlmanager.object.ViewObject;
import com.lansmancai.lanmysqlmanager.object.list.TableData;
import com.lansmancai.lanmysqlmanager.util.ImageUtil;


public class TableNode implements ViewObject {

	//所属的数据库节点
	private Database database;
	
	public TableNode(Database database) {
		this.database = database;
	}
	
	
	public Icon getIcon() {
		// TODO Auto-generated method stub
		return ImageUtil.TABLE_TREE_ICON;
	}

	
	public String toString() {
		// TODO Auto-generated method stub
		return "表";
	}

	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}
}
