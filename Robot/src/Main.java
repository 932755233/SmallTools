import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{

    public Main() throws HeadlessException {
        this.setTitle("主页");


        this.setSize(300,300);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        new Main();
    }
}
