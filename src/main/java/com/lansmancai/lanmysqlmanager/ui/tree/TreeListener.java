package com.lansmancai.lanmysqlmanager.ui.tree;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import com.lansmancai.lanmysqlmanager.object.tree.ServerConnection;
import com.lansmancai.lanmysqlmanager.ui.MainFrame;

/**
 * 树的鼠标事件监听器
 * 
 */
public class TreeListener extends MouseAdapter {

	private MainFrame mainFrame;
	
	public TreeListener(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}
	
	
	public void mousePressed(MouseEvent e) {
		if (e.getModifiers() == MouseEvent.BUTTON1_MASK) {
			//左键点击，查看树的节点
			this.mainFrame.viewTreeDatas();
		}
		if (e.getModifiers() == MouseEvent.BUTTON3_MASK) {
			//右键菜单
			this.mainFrame.showTreeMenu(e);
		}
		
	}

}
