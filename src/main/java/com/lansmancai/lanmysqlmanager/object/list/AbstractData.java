package com.lansmancai.lanmysqlmanager.object.list;

import javax.swing.Icon;

import com.lansmancai.lanmysqlmanager.object.ViewObject;

/**
 * 数据列表的抽象类
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
