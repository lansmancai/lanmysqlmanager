package com.lansmancai.lanmysqlmanager.object.table;

/**
 * ���ݱ���еĵ�Ԫ�����
 * 
 */
public class DataCell {

	//�õ�Ԫ�����ڵ���
	private int row;
	
	//�õ�Ԫ�����ڵ���
	private DataColumn column;
	
	//�õ�Ԫ���ֵ
	private String value;
		
	public DataCell(int row, DataColumn column, String value) {
		this.row = row;
		this.column = column;
		this.value = value;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public DataColumn getColumn() {
		return column;
	}
	
	public void setColumn(DataColumn column) {
		this.column = column;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}

	public String toString() {
		return this.value;
	}
	
	
}
