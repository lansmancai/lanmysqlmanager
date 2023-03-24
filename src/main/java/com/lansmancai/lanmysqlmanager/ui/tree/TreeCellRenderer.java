package com.lansmancai.lanmysqlmanager.ui.tree;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;

import com.lansmancai.lanmysqlmanager.object.ViewObject;
import com.lansmancai.lanmysqlmanager.util.ImageUtil;

/**
 * �������ڵ�Ĵ�����
 *
 */
@SuppressWarnings("serial")
public class TreeCellRenderer extends DefaultTreeCellRenderer {
	public Component getTreeCellRendererComponent(JTree tree, Object value,
			boolean sel, boolean expanded, boolean leaf, int row,
			boolean hasFocus) {
		DefaultMutableTreeNode node = (DefaultMutableTreeNode)value;
		//���ÿ���ڵ��ViewObject
		ViewObject obj = (ViewObject)node.getUserObject();
		if (obj == null) return this;
		//����ͼƬ���ļ�
		this.setText(obj.toString());
		this.setIcon(obj.getIcon());
		//�ж��Ƿ�ѡ������������ɫ
		if (sel) this.setForeground(Color.red);
		else this.setForeground(getTextNonSelectionColor());
		return this;
	}
}
