package com.lansmancai.lanmysqlmanager.object.tree;

import javax.swing.Icon;

import com.lansmancai.lanmysqlmanager.object.ViewObject;
import com.lansmancai.lanmysqlmanager.util.ImageUtil;



/**
 * ��ͼ�ڵ�
 *
 */
public class ViewNode implements ViewObject {

	private Database database;
	
	public ViewNode(Database database) {
		this.database = database;
	}

	
	public Icon getIcon() {
		return ImageUtil.VIEW_TREE_ICON;
	}

	
	public String toString() {
		return "��ͼ";
	}

	public Database getDatabase() {
		return database;
	}

	public void setDatabase(Database database) {
		this.database = database;
	}
	
}
