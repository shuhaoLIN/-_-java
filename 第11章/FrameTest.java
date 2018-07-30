import java.awt.*;
public class FrameTest
{
	public static void main(String[] args)
	{
		Frame f = new Frame("测试窗口");
		//创建一个panel容器
		Panel p = new Panel();
		p.add(new TextField(20));
		p.add(new Button("点击我"));
		f.add(p);
		//设置窗口位置以及大小
		f.setBounds(30,30,500,500);
		f.setVisible(true);
	}
}