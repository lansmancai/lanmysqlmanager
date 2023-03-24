package com.lansmancai.lanmysqlmanager.database;

import java.io.File;
import java.util.List;

import com.lansmancai.lanmysqlmanager.object.GlobalContext;
import com.lansmancai.lanmysqlmanager.object.list.TableData;
import com.lansmancai.lanmysqlmanager.object.tree.Database;
import com.lansmancai.lanmysqlmanager.object.tree.ServerConnection;

/**
 * ���ݴ���ӿڣ����ڵ����ű���ִ�нű�
 * 
 */
public interface BackupHandler {

	/**
	 * ����һ�����ݿ⵽�ļ�targetFile��
	 * @param ctx
	 * @param db
	 * @param targetFile
	 */
	void dumpDatabase(GlobalContext ctx, Database db, File targetFile);
	
	/**
	 * ���������
	 * @param ctx
	 * @param table
	 * @param db
	 * @param targetFile
	 */
	void dumpTable(GlobalContext ctx, List<TableData> table, Database db, 
			File targetFile);
	
	/**
	 * Ϊĳ�����ݿ⵼��һ��SQL�ļ�
	 * @param ctx
	 * @param db
	 * @param sqlFile
	 */
	void executeSQLFile(GlobalContext ctx, Database db, File sqlFile);
	
	/**
	 * Ϊĳ�����������ӵ���һ��SQL�ļ�
	 * @param ctx
	 * @param conn
	 * @param sqlFile
	 */
	void executeSQLFile(GlobalContext ctx, ServerConnection conn, File sqlFile);
}
