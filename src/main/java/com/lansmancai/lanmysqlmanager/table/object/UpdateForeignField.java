package com.lansmancai.lanmysqlmanager.table.object;

/**
 * �ڲ����б��޸ĵ��������
 * 
 */
public class UpdateForeignField {

	//�������µ����
	private ForeignField newForeignField;
	
	//���ݿ��оɵ����
	private ForeignField sourceForeignField;

	public UpdateForeignField(ForeignField sourceForeignField, 
			ForeignField newForeignField) {
		this.newForeignField = newForeignField;
		this.sourceForeignField = sourceForeignField;
	}

	public ForeignField getNewForeignField() {
		return newForeignField;
	}

	public void setNewForeignField(ForeignField newForeignField) {
		this.newForeignField = newForeignField;
	}

	public ForeignField getSourceForeignField() {
		return sourceForeignField;
	}

	public void setSourceForeignField(ForeignField sourceForeignField) {
		this.sourceForeignField = sourceForeignField;
	}
	
	
}
