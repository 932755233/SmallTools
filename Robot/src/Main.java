import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main extends JFrame {

    JLabel label = null;

    public Main() throws HeadlessException {
        this.setTitle("主页");


        this.setSize(500, 500);


        label = new JLabel("输出");
        this.add(label);


        //获取当前jar包路径
//        String path = this.getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
//        int lastIndex = path.lastIndexOf(File.separator) + 1;
//        path = path.substring(0, lastIndex);
//        label.setText(path);


        File file = new File("artifacts");
//        label.setText(file.getAbsolutePath() + "---" + file.listFiles()[0].getAbsolutePath());

        Connection conn = null;
        Statement statement = null;
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:test.db");
            statement = conn.createStatement();

            String sql = "CREATE TABLE DIALOGUE " +
                    "(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    " wen TEXT NOT NULL, " +
                    " da TEXT NOT NULL); " ;
//            String sql = "INSERT INTO DIALOGUE VALUES ('你好','你好');";


            statement.executeUpdate(sql);





            statement.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
            label.setText(e.toString());
        }


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        new Main();

    }
}
