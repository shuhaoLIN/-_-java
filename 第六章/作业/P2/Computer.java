//ģ��һ̨��������д�ӡ���ܣ���ʵ�������һ��Output���󣬽���ʵ��
//ΪʲôҪ���һ��Output���󣬶������һ��Printer�����أ�
//��Ϊ�����ӵĻ������Ժ��ֻ��Ҫ֪��һ��Output���󣬵��������������printerʵ�ֵ�
//������BetterPrinterʵ�ֵľ������޹��ˣ��������ϵͳ����˵�ģ��ӿھ��Ƕ�����һ���淶��
//Ȼ�������ôʵ�֣�������ǲ��ܵģ�ֻҪ����ѭ������һ�� �淶�Ϳ��Խ��룬�����Ӿ�ʵ�����߼��豸
public class Computer
{
	private Output out;
	public Computer(Output out)
	{
		this.out = out;
	}
	//����һ��ģ���ȡ�ַ�������ķ���
	public void keyIn(String msg)
	{
		out.getData(msg);
	}
	//����һ��ģ���ӡ�ķ���
	public void print()
	{
		out.out();
	}
}