import http.CallBack;
import http.HttpManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main extends JFrame {

    Image image;
    JLabel label = null;
    JButton button = null;
    JPanel panel = null;

    public Main() throws HeadlessException {
        // 设置控件属性
        this.setTitle("主页");
//        this.setSize(500, 500);
        this.setBounds(50, 50, 500, 500);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // 创建子控件
        panel = new JPanel();
        label = new JLabel("状态");
        button = new JButton("获取");
        // 添加子控件
        add(label);
        add(button);
        add(panel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 点击后获取图片
                if (image ==null) {
                    loadImage();
                }



                HttpManager.requestGet("https://ssl.ptlogin2.qq.com/ptqrlogin?u1=http%3A%2F%2Fw.qq.com%2Fproxy.html&ptqrtoken=128496221&ptredirect=0&h=1&t=1&g=1&from_ui=1&ptlang=2052&action=0-0-1503565677561&js_ver=10228&js_type=1&login_sig=k7jzsZAKyCwHSLSFMcX4Cn1ttHj8LgEVmteaJ1DTljsIMWsrY*KQmJQp*t1rXIHd&pt_uistyle=40&aid=501004106&daid=164&mibao_css=m_webqq&", new CallBack() {
                    @Override
                    public void doSucceed(String result) {
                        label.setText(result);
                    }

                    @Override
                    public void doFailure(String message) {
                        label.setText(message);
                    }
                });
            }
        });

        //获取当前jar包路径
//        String path = this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
//        int lastIndex = path.lastIndexOf(File.separator) + 1;
//        path = path.substring(0, lastIndex);
//        label.setText(path);


//        File file = new File("artifacts");
//        label.setText(file.getAbsolutePath() + "---" + file.listFiles()[0].getAbsolutePath());

//        Connection conn = null;
//        Statement statement = null;
//        try {
//            Class.forName("org.sqlite.JDBC");
//            conn = DriverManager.getConnection("jdbc:sqlite:test.db");
//            statement = conn.createStatement();
//
////            String sql = "CREATE TABLE DIALOGUE " +
////                    "(id INTEGER PRIMARY KEY AUTOINCREMENT," +
////                    " wen TEXT NOT NULL, " +
////                    " da TEXT NOT NULL); ";
//            String sql = "INSERT INTO DIALOGUE(wen,da) VALUES ('你好','你好');";
//
//
//            statement.executeUpdate(sql);
//
//
//            statement.close();
//            conn.close();
//
//        } catch (Exception e) {
//            e.printStackTrace();
////            label.setText(e.toString());
//        }


        this.setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Main main = new Main();
        // 获取图片
//        main.loadImage();





    }


    public void loadImage() {
        Toolkit toolkit = null;
        toolkit = Toolkit.getDefaultToolkit();
        URL url = null;
        try {
            url = new URL("https://ssl.ptlogin2.qq.com/ptqrshow?appid=501004106&e=2&l=M&s=3&d=72&v=4&t=0.43162739399845007&daid=164");
            image = toolkit.getImage(url);
            repaint();

        } catch (Exception e) {
            e.printStackTrace();
        }

//        Graphics graphics = this.getGraphics();

//        graphics.drawImage(image, 6, 36, this);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.out.println("paint");
//        super.paint(g);
        if (image != null) {
            g.drawImage(image, 10, button.getY()+button.getHeight()*2+10, this);
        }
//        g.drawString("2222222", 100, 100);
    }

    @Override
    public boolean imageUpdate(Image img, int infoflags, int x, int y, int w, int h) {
        repaint();
        System.out.println("图片加载");
        return super.imageUpdate(img, infoflags, x, y, w, h);
    }
}
