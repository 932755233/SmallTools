package com.zzy.pht;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class MainJFrame extends JFrame {
    JTextField editorPane = new JTextField(1);
    JButton button = new JButton("确定");
    JTextField editorPane2 = new JTextField(1);
    JTextField editorPane3 = new JTextField(1);

    public MainJFrame(String title) throws HeadlessException {
        super(title);


        setBounds(100, 100, 300, 300);
        setLayout(null);

        getContentPane().add(editorPane);
        getContentPane().add(button);
        getContentPane().add(editorPane2);
        getContentPane().add(editorPane3);

        editorPane.setBounds(10, 10, 300 - 20, 50);
        button.setBounds(10, editorPane.getY() + 10 + 50, 300 - 20, 50);
        editorPane2.setBounds(10, button.getY() + 10 + 50, 300 - 20, 50);
        editorPane3.setBounds(10, editorPane2.getY() + 10 + 50, 300 - 20, 50);


        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {
                editorPane.setBounds(10, 10, getWidth() - 20, 50);
                button.setBounds(10, editorPane.getY() + 10 + 50, getWidth() - 20, 50);
                editorPane2.setBounds(10, button.getY() + 10 + 50, getWidth() - 20, 50);
                editorPane3.setBounds(10, editorPane2.getY() + 10 + 50, 300 - 20, 50);
            }

            @Override
            public void componentMoved(ComponentEvent e) {

            }

            @Override
            public void componentShown(ComponentEvent e) {

            }

            @Override
            public void componentHidden(ComponentEvent e) {

            }
        });

    }


    public static void main(String[] arg) {
        MainJFrame mainJFrame = new MainJFrame("生成密码");

        mainJFrame.editorPane.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "第一个编辑框啥都没写呢", "提示", JOptionPane.ERROR_MESSAGE);

            }
        });

        mainJFrame.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = mainJFrame.editorPane.getText().trim();
                System.out.println("password-----" + password);
                if (password != null && !"".equals(password)) {

                    String oldPasswordN = MD5.getMd5WithUpperCase(password);
                    String newPasswordN = MD5.getMyMd5(password);

                    mainJFrame.editorPane2.setText(oldPasswordN);
                    System.out.println("oldPasswordN-----" + oldPasswordN);

                    mainJFrame.editorPane3.setText(newPasswordN);
                    System.out.println("newPasswordN-----" + newPasswordN);
                } else {
                    JOptionPane.showMessageDialog(null, "第一个编辑框啥都没写呢", "提示", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
