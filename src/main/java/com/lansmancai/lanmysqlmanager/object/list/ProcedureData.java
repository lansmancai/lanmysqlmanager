package com.lansmancai.lanmysqlmanager.object.list;

import javax.swing.Icon;

import com.lansmancai.lanmysqlmanager.exception.QueryException;
import com.lansmancai.lanmysqlmanager.object.tree.Database;
import com.lansmancai.lanmysqlmanager.util.ImageUtil;
import com.lansmancai.lanmysqlmanager.util.MySQLUtil;

/**
 * �б��еĴ洢������ʾ����
 * 
 */
public class ProcedureData extends AbstractData {

	//�洢���̻��ߺ���
	private String type;
	
	private Database database;
	//�洢���̻��ߺ�������
	private String content;
	//����
	private String arg;
	//����ֵ���������У�
	private String returnString;
	
	public ProcedureData(Database database, String type, String content) {
		this.type = type;
		this.database = database;
		this.content = content;
	}
	
	public String getArg() {
		return arg;
	}

	public void setArg(String arg) {
		this.arg = arg;
	}

	public String getReturnString() {
		return returnString;
	}

	public void setReturnString(String returnString) {
		this.returnString = returnString;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * �����洢����
	 */
	public void createProcedure() {
		try {
			String sql = MySQLUtil.CREATE_PROCEDURE + this.name + 
			" (" + this.arg + ") " + this.content;
			this.database.getStatement().execute(sql);
		} catch (Exception e) {
			throw new QueryException("�����洢���̴���" + e.getMessage());
		}
	}
	
	/**
	 * �޸Ĵ洢����
	 */
	public void updateProcedure() {
		try {
			//�޸Ĵ洢������Ҫ�Ȱ�ԭ������ɾ��
			//ɾ�����
			String dropSQL = MySQLUtil.DROP_PROCEDURE + this.name;
			this.database.getStatement().execute(dropSQL);
			//�������
			String createSQL = MySQLUtil.CREATE_PROCEDURE + this.name + 
			" (" + this.arg + ") " + this.content;
			this.database.getStatement().execute(createSQL);
		} catch (Exception e) {
			throw new QueryException("�޸Ĵ洢���̴���" + e.getMessage());
		}
	}
	
	/**
	 * ɾ���洢���̻��ߺ���
	 */
	public void drop() {
		try {
			String dropSQL = "";
			if (this.type.equals(MySQLUtil.PROCEDURE_TYPE)) {
				//ɾ���洢����
				dropSQL = MySQLUtil.DROP_PROCEDURE + this.name;
			} else {
				//ɾ������
				dropSQL = MySQLUtil.DROP_FUNCTION + this.name;
			}
			this.database.getStatement().execute(dropSQL);
		} catch (Exception e) {
			throw new QueryException("�޸Ĵ洢���̴���" + this.name);
		}
	}
	
	/**
	 * ��������
	 */
	public void createFunction() {
		try {
			String sql = MySQLUtil.CREATE_FUNCTION + this.name + 
			" (" + this.arg + ") returns " + this.returnString + " " + this.content;
			this.database.getStatement().execute(sql);
		} catch (Exception e) {
			throw new QueryException("������������" + e.getMessage());
		}
	}
	
	/**
	 * �޸ĺ���
	 */
	public void updateFunction() {
		try {
			//�޸Ĵ洢������Ҫ�Ȱ�ԭ������ɾ��
			String dropSQL = MySQLUtil.DROP_FUNCTION + this.name;
			this.database.getStatement().execute(dropSQL);
			String createSQL = MySQLUtil.CREATE_FUNCTION + this.name + 
			" (" + this.arg + ") returns " + this.returnString + " \n" + this.content;
			this.database.getStatement().execute(createSQL);
		} catch (Exception e) {
			throw new QueryException("�޸ĺ�������" + e.getMessage());
		}
	}

	public Icon getIcon() {
		if (MySQLUtil.FUNCTION_TYPE.equals(this.type)) return ImageUtil.FUNCTION_DATA_ICON;
		return ImageUtil.PROCEDURE_DATA_ICON;
	}

	public String toString() {
		return this.name;
	}

}
