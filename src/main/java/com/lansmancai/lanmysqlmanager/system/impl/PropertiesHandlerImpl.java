package com.lansmancai.lanmysqlmanager.system.impl;

import java.io.File;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.lansmancai.lanmysqlmanager.exception.FileException;
import com.lansmancai.lanmysqlmanager.object.tree.Database;
import com.lansmancai.lanmysqlmanager.object.tree.ProcedureNode;
import com.lansmancai.lanmysqlmanager.object.tree.ServerConnection;
import com.lansmancai.lanmysqlmanager.object.tree.TableNode;
import com.lansmancai.lanmysqlmanager.object.tree.ViewNode;
import com.lansmancai.lanmysqlmanager.system.PropertiesHandler;
import com.lansmancai.lanmysqlmanager.util.FileUtil;

/**
 * �����ļ�����ʵ����
 */
public class PropertiesHandlerImpl implements PropertiesHandler {

	
	public void saveServerConnection(ServerConnection conn) {
		//�õ������ļ���, ��Щproperties�ļ������connectionsĿ¼��
		String configFileName = FileUtil.CONNECTIONS_FOLDER + 
			conn.getConnectionName() + ".properties";
		//����properties�ļ�
		File connConfigFile = new File(configFileName);
		//�����ļ�
		FileUtil.createNewFile(connConfigFile);
		Properties props = new Properties();
		props.setProperty(FileUtil.HOST, conn.getHost());
		props.setProperty(FileUtil.PORT, conn.getPort());
		props.setProperty(FileUtil.USERNAME, conn.getUsername());
		props.setProperty(FileUtil.PASSWORD, conn.getPassword());
		//������д�������ļ�
		FileUtil.saveProperties(connConfigFile, props, "Connection " + 
				conn.getConnectionName() + " config.");
	}

	
	public List<ServerConnection> getServerConnections() {
		File[] propertyFiles = getPropertyFiles();
		List<ServerConnection> result = new ArrayList<ServerConnection>();
		for (File file : propertyFiles) {
			ServerConnection conn = createServerConnection(file);
			result.add(conn);
		}
		return result;
	}
		
	/**
	 * ��һ��properties�ļ���װ��ServerConnection����
	 * @param file
	 * @return
	 */
	private ServerConnection createServerConnection(File file) {
		try {
			
			Properties prop = FileUtil.getProperties(file);
			ServerConnection conn = new ServerConnection(FileUtil.getFileName(file), 
					prop.getProperty(FileUtil.USERNAME), 
					prop.getProperty(FileUtil.PASSWORD), 
					prop.getProperty(FileUtil.HOST), 
					prop.getProperty(FileUtil.PORT));
			return conn;
		} catch (Exception e) {
			throw new FileException("��ȡ�����ļ�����" + file.getAbsolutePath());
		}
	}
	
	
	//����connectionsĿ¼�����е��ļ�
	private File[] getPropertyFiles() {
		File connectioFolder = new File(FileUtil.CONNECTIONS_FOLDER);
		return connectioFolder.listFiles();
	}

}
