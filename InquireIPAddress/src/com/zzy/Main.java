package com.zzy;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    JLabel label;

    public Main() throws HeadlessException {
        this.setTitle("获取地址");

        label = new JLabel("ip地址：");

//        添加控件
        this.add(label);

//        设置布局
        this.setLayout(new FlowLayout());

//        设置窗口宽度和高度  单位是i像素
        this.setSize(400, 400);

//        设置这个属性点击关闭会退出整个应用，不加就不会
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置为null窗口在窗口中间
        this.setLocationRelativeTo(null);

//        设置为true才能显示窗口，必须
        this.setVisible(true);


    }

    public static void main(String[] args) {
        // write your code here
        Main main = new Main();

        HttpManager.getInstance().post(new CallBack() {
            @Override
            public void onSucceed(String result) {
                main.label.setText(result);
            }

            @Override
            public void onFailure() {

            }
        });


    }


}
