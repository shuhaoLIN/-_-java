import java.awt.*;
public class FrameTest
{
	public static void main(String[] args)
	{
		Frame f = new Frame("���Դ���");
		//����һ��panel����
		Panel p = new Panel();
		p.add(new TextField(20));
		p.add(new Button("�����"));
		f.add(p);
		//���ô���λ���Լ���С
		f.setBounds(30,30,500,500);
		f.setVisible(true);
	}
}