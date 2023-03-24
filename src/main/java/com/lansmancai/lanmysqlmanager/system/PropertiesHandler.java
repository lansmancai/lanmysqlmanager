package com.lansmancai.lanmysqlmanager.system;

import java.util.List;

import com.lansmancai.lanmysqlmanager.object.tree.ServerConnection;

/**
 * properties�ļ�����ӿ�
 * 
 */
public interface PropertiesHandler {

	/**
	 * ��һ��ServerConnection���󱣴���ϵͳ��properties��, 
	 * ��properties�ļ����ļ�����ServerConnection��connectioName
	 * @param conn
	 */
	void saveServerConnection(ServerConnection conn);
	
	/**
	 * ȥ���ص�connectionsĿ¼�ж�ȡȫ���������ļ�, ����װ��ServerConnection����
	 * @return
	 */
	List<ServerConnection> getServerConnections();
}
