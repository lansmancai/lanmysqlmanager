package com.lansmancai.lanmysqlmanager.object.list;

import javax.swing.Icon;

import com.lansmancai.lanmysqlmanager.object.ViewObject;

/**
 * �����б�ĳ�����
 * 
 */
public abstract class AbstractData implements ViewObject {
	
	protected String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract String toString();
}
