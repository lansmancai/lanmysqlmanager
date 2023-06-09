package com.lansmancai.lanmysqlmanager.ui;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.lansmancai.lanmysqlmanager.object.tree.Database;
import com.lansmancai.lanmysqlmanager.object.tree.ServerConnection;

/**
 * 添加数据库界面
 * 
 */
public class DatabaseFrame extends JFrame {

	private Box mainBox = Box.createVerticalBox();
	
	private Box fieldBox = Box.createHorizontalBox();
	
	private Box buttonBox = Box.createHorizontalBox();
	
	private JLabel dbNameLabel = new JLabel("数据库名称：");
	
	private JTextField dbNameField = new JTextField(20);
	
	private JButton confirmButton = new JButton("确定");
	
	private JButton cancelButton = new JButton("取消");
	
	private ServerConnection serverConnection;
	
	private MainFrame mainFrame;
	
	public DatabaseFrame(MainFrame mainFrame, ServerConnection serverConnection) {
		this.serverConnection = serverConnection;
		this.mainFrame = mainFrame;
		this.fieldBox.add(Box.createHorizontalStrut(20));
		this.fieldBox.add(this.dbNameLabel);
		this.fieldBox.add(this.dbNameField);
		this.fieldBox.add(Box.createHorizontalStrut(20));
		
		this.buttonBox.add(Box.createHorizontalStrut(40));
		this.buttonBox.add(this.confirmButton);
		this.buttonBox.add(Box.createHorizontalStrut(30));
		this.buttonBox.add(this.cancelButton);
		
		this.mainBox.add(Box.createVerticalStrut(20));
		this.mainBox.add(this.fieldBox);
		this.mainBox.add(Box.createVerticalStrut(20));
		this.mainBox.add(this.buttonBox);
		this.mainBox.add(Box.createVerticalStrut(10));
		this.add(this.mainBox);
		this.setLocation(350, 300);
		this.setResizable(false);
		this.setTitle("新建数据库");
		this.pack();
		initListeners();
	}
	
	private void initListeners() {
		this.confirmButton.addActionListener(new AbstractAction() {
			public void actionPerformed(ActionEvent e) {
				saveDatabase();
			}
		});
	}
	
	//保存一个数据库
	private void saveDatabase() {
		String dbName = this.dbNameField.getText();
		if (dbName.trim().equals("")) {
			showMessage("请输入数据库名称", "错误");
			return;
		}
		try {
			Database db = new Database(dbName, this.serverConnection);
			db.create();
			this.mainFrame.addDatabase(db);
			this.setVisible(false);
		} catch (Exception e) {
			showMessage(e.getMessage(), "错误");
		}

	}
	
	private int showMessage(String s, String title) {
		return JOptionPane.showConfirmDialog(this, s, title,
				JOptionPane.OK_CANCEL_OPTION);
	}

}
