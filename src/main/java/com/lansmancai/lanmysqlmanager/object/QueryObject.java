package com.lansmancai.lanmysqlmanager.object;

import java.sql.ResultSet;

/**
 * ���в�ѯ�Ľӿ�, ��DataFrame��ʹ��
 */
public interface QueryObject {
	
	/**
	 * �õ�����
	 * @return
	 */
	ResultSet getDatas(String orderString);
	
	/**
	 * �õ���ѯ������
	 * @return
	 */
	String getQueryName();
	
	/**
	 * ���ز�ѯ��SQL
	 * @return
	 */
	String getQuerySQL(String orderString);
	
}
