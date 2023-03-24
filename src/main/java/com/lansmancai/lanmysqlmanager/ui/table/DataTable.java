package com.lansmancai.lanmysqlmanager.ui.table;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ChangeEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import com.lansmancai.lanmysqlmanager.ui.DataFrame;

/**
 * �����б����
 * 
 */
public class DataTable extends JTable {

	//�������ͷʱ, ��ʾ��ǰ��ѡ�����
	private int selectColumn = -1;
	
	public DataTable(DefaultTableModel model) {
		super(model);
		final JTableHeader header = this.getTableHeader();
		//Ϊ��ͷ�������¼�������
		header.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				header.getTable().clearSelection();
				int tableColumn = header.columnAtPoint(e.getPoint());
				selectColumn = tableColumn;
			}
		});
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				selectColumn = -1;
				updateUI();
			}
		});
		//������ʽ
		this.setColumnSelectionAllowed(true);
		this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		this.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		this.setRowHeight(25);
	}
	
	//����selectColumn����ֵ
	public int getSelectColumn() {
		return this.selectColumn;
	}

	//�ж�һ����Ԫ���Ƿ�ѡ��, ��дJTable�ķ���
	public boolean isCellSelected(int row, int column) {
		//��������뵱ǰѡ�������ͬ,����true
		if (this.selectColumn == column) return true;
		return super.isCellSelected(row, column);
	}


}
