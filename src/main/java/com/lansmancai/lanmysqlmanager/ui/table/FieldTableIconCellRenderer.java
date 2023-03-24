package com.lansmancai.lanmysqlmanager.ui.table;

import java.awt.Component;

import javax.swing.Icon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 * �ַ��б����Ⱦ����
 * 
 */
public class FieldTableIconCellRenderer extends DefaultTableCellRenderer {

	
	public Component getTableCellRendererComponent(JTable table, Object value,
			boolean isSelected, boolean hasFocus, int row, int column) {
		//�жϵ�Ԫ���ֵ���ͣ��ֱ����setIcon��setText����
		if (value instanceof Icon) this.setIcon((Icon)value);
		else this.setText((String)value);
		this.setHorizontalAlignment(CENTER);
		return this;
	}
}
