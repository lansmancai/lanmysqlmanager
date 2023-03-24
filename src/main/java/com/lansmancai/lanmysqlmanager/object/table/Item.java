package com.lansmancai.lanmysqlmanager.object.table;

/**
 * �������е���
 * 
 */
public class Item {
	
	private String value;
	
	private String text;

	public Item(String value, String text) {
		this.value = value;
		this.text = text;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String toString() {
		return this.text;
	}
}
