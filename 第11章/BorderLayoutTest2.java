import java.awt.*;

/**
 * Created by lenovo on 2018/7/30.
 */
public class BorderLayoutTest2 {
    public static void main(String[] args) {
        Frame f = new Frame("���Դ���");
        f.setLayout(new BorderLayout(30,5));
        f.add(new Button("��") ,BorderLayout.SOUTH);
        f.add(new Button("��") , BorderLayout.NORTH);
        Panel p = new Panel();
        p.add(new Button("������"));
        p.add(new TextField(20));
        f.add(p);

        f.add(new Button("��") ,BorderLayout.EAST);
        f.add(new Button("��") ,BorderLayout.WEST);
        f.pack();
        f.setVisible(true);
    }
}
