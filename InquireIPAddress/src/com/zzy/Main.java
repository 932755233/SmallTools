package com.zzy;

import io.reactivex.*;
import io.reactivex.disposables.Disposable;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Callable;

public class Main extends JFrame {

    JLabel label;

    public Main() throws HeadlessException {
        this.setTitle("获取地址");

        label = new JLabel("ip地址：");
        label.setSize(300,300);

//        for (int i = 0; i < 5; i++) {
//            JButton button = new JButton("开始");
//
//            this.add(button);
//        }

        this.add(label);

//        this.setLayout(new FlowLayout());

//        设置窗口宽度和高度
        this.setSize(300, 300);

//        设置这个属性点击关闭会退出整个应用，不加就不会
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 设置为null窗口在窗口中间
//        this.setLocationRelativeTo(null);


//        new MyThread(this);
//        new MyThread(this);
//        new MyThread(this);
//        设置为true显示窗口，必须
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
