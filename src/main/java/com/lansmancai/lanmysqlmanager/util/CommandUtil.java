package com.lansmancai.lanmysqlmanager.util;

import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;

import com.lansmancai.lanmysqlmanager.exception.CommandException;

/**
 * �������
 * 
 */
public class CommandUtil {

	public final static String WINDOWS_COMMAND = "cmd /c ";
	
	/**
	 * ִ��������ؽ���������
	 * @param command
	 * @return
	 */
	public static InputStream executeCommand(String command) {
		try {
			//��windows�½���������һ��bat�ļ�, ��ִ�и�bat�ļ�
			File batFile = new File("temp/dump.bat");
			if (!batFile.exists()) batFile.createNewFile();
			//������д���ļ���
			FileWriter writer = new FileWriter(batFile);
			writer.write(command);
			writer.close();
			//ִ�и�bat�ļ�
			Process process =Runtime.getRuntime().exec(WINDOWS_COMMAND + batFile.getAbsolutePath());
			process.waitFor();
			//��bat�ļ�ɾ��
			batFile.delete();
			return process.getInputStream();
		} catch (Exception e) {
			throw new CommandException("ִ���������" + command);
		}
	}
}
