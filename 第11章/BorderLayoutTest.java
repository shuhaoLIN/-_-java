import java.awt.*;

/**
 * Created by lenovo on 2018/7/30.
 */
public class BorderLayoutTest {
    public static void main(String[] args) {
        Frame f = new Frame("���Դ���");
        f.setLayout(new BorderLayout(50,50));
        f.add(new Button("��") ,BorderLayout.SOUTH);
        f.add(new Button("��") , BorderLayout.NORTH);
        f.add(new Button("��"));
        // f.add(new Button("��") ,BorderLayout.EAST);
        // f.add(new Button("��") ,BorderLayout.WEST);

        f.pack();
        f.setVisible(true);
    }
}