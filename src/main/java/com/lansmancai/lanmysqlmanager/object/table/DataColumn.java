package com.lansmancai.lanmysqlmanager.object.table;

/**
 * �����б��е��ж���
 * 
 */
public class DataColumn {

	//������JTable�е�����
	private int index;
	
	//���е�����
	private String text;

	public DataColumn(int index, String text) {
		this.index = index;
		this.text = text;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return this.text;
	}
	
	
}
