package com.zzy;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() throws HeadlessException {
        this.setTitle("获取地址");

        JLabel label = new JLabel("ip地址：");

        for (int i=0;i<5;i++) {
            JButton button = new JButton("开始");

            this.add(button);
        }

        this.add(label);

        this.setLayout(new FlowLayout());

//        设置窗口宽度和高度
        this.setSize(300,300);

//        设置这个属性点击关闭会退出整个应用，不加就不会
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置为null窗口在窗口中间
//        this.setLocationRelativeTo(null);
//        设置为true显示窗口，必须
        this.setVisible(true);
    }

    public static void main(String[] args) {
	// write your code here
        new Main();
    }
}
