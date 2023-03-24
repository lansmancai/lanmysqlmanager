package com.lansmancai.lanmysqlmanager.ui.tree;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import com.lansmancai.lanmysqlmanager.object.tree.ServerConnection;
import com.lansmancai.lanmysqlmanager.ui.MainFrame;

/**
 * ��������¼�������
 * 
 */
public class TreeListener extends MouseAdapter {

	private MainFrame mainFrame;
	
	public TreeListener(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}
	
	
	public void mousePressed(MouseEvent e) {
		if (e.getModifiers() == MouseEvent.BUTTON1_MASK) {
			//���������鿴���Ľڵ�
			this.mainFrame.viewTreeDatas();
		}
		if (e.getModifiers() == MouseEvent.BUTTON3_MASK) {
			//�Ҽ��˵�
			this.mainFrame.showTreeMenu(e);
		}
		
	}

}
