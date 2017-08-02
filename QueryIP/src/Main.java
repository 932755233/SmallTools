import sun.tools.jconsole.inspector.OperationEntry;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    public Main() throws HeadlessException {
        this.setTitle("获取本机IP");

//        设置位置和宽度
//        this.setBounds(0, 0, 300, 300);
        this.setSize(300, 300);
        JLabel label = new JLabel();
        label.setText("IP地址：");


        this.setLayout(new FlowLayout());


        JButton button = new JButton();
        button.setText("按钮");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               int n = JOptionPane.showConfirmDialog(null, "你好", "提示", JOptionPane.OK_CANCEL_OPTION);
               System.out.println(n);
            }
        });


//        添加组件
        this.add(label);
        this.add(button);


        // frame关闭时的操作
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        如果传null，为屏幕中间
        this.setLocationRelativeTo(null);
//        传入true才会显示界面
        this.setVisible(true);
    }

    public static void main(String[] args) {

        new Main();


    }
}
