import java.awt.*;

/**
 * Created by lenovo on 2018/7/30.
 */
public class FlowLayoutTest {
    public static void main(String[] args) {
        Frame f = new Frame("测试窗口");
        //设置frame使用FlowLayout布局管理器
        f.setLayout(new FlowLayout(FlowLayout.LEFT,20,5));
        for(int i=0;i<10;i++){
            Button bt = new Button("按钮"+i);
//            bt.setSize(50,50);
//            f.add(new Button("按钮"+i).setSize(10,10));
            f.add(bt);
        }
        //f以最佳的大小进行展示
        f.pack();
        //        f.setBounds(50,50,600,600);
        f.setVisible(true);
    }
}
