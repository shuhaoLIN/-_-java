import java.awt.*;

/**
 * Created by lenovo on 2018/7/30.
 */
public class FlowLayoutTest {
    public static void main(String[] args) {
        Frame f = new Frame("���Դ���");
        //����frameʹ��FlowLayout���ֹ�����
        f.setLayout(new FlowLayout(FlowLayout.LEFT,50,50));
        for(int i=0;i<10;i++){
            Button bt = new Button("��ť"+i);
            bt.setSize(100,100);
//            f.add(new Button("��ť"+i).setSize(10,10));
            f.add(bt);
        }
        //f����ѵĴ�С����չʾ
        f.pack();
        //        f.setBounds(50,50,600,600);
        f.setVisible(true);
    }
}