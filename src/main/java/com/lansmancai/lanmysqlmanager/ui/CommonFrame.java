package com.lansmancai.lanmysqlmanager.ui;

import javax.swing.JFrame;

/**
 * 有确定按钮的各个JFrame的父类
 */
public abstract class CommonFrame extends JFrame {

	protected abstract void confirm(String name);
}
