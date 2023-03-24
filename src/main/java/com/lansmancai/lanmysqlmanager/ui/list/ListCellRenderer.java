package com.lansmancai.lanmysqlmanager.ui.list;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

import com.lansmancai.lanmysqlmanager.object.ViewObject;

/**
 * ¡–±Ì‰÷»æ¿‡
 * 
 */
public class ListCellRenderer extends DefaultListCellRenderer {
	public Component getListCellRendererComponent(JList list, Object value,
			int index, boolean isSelected, boolean cellHasFocus) {
		JLabel label = (JLabel)super.getListCellRendererComponent(list, 
				value, index, isSelected, cellHasFocus);
		ViewObject vd = (ViewObject)value;
		label.setIcon(vd.getIcon());
		label.setToolTipText(vd.toString());
		if (isSelected) {
			setBackground(Color.blue);
			setForeground(Color.white);
		}
		return this;
	}
}
