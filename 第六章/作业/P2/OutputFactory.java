public class OutputFactory
{
	public Output getOutput()
	{
		//�������д������ڿ���ϵͳ����ʹ�õ����ĸ�ʵ��
		return new Printer();
		//return new BetterPrinter();
	}

	public static void main(String[] args)
	{
		//����������ķ�װ������һ���ӿ��Լ�һ�������࣬��������ʵ�ֵķ�����װ������
		//�ⲿ��ȫ��֪����������ôʵ�ֵ�
		OutputFactory of = new OutputFactory();
		Computer c = new Computer(of.getOutput());
		c.keyIn("first");
		c.keyIn("second");
		c.print();
	}
}