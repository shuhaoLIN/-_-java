interface Product
{
	int getProduceTime();
}
public class Printer implements Output ,Product
{
	private String[] printData = new String[MAX_CACHE_LINE];
	//���Լ�¼��ǰ���ӡ����ҵ��
	private int dataNum = 0;
	/**
	 * ����ӡ�������������ȫ����ӡ����
	 */
	public void out()
	{
		//ֻҪ������ҵ��������ӡ
		while (dataNum > 0){
			System.out.println("��ӡ����ӡ��"+printData[0]);
			//����ҵ��������ǰ��һλ������ʣ�µ���ҵ����һ
			System.arraycopy(printData ,1,printData,0,--dataNum);
		}
	}
	/**
	 * ������װ���ӡ��������
	 * @param msg [װ�������]
	 */
	public void getData(String msg)
	{
		if(dataNum >= MAX_CACHE_LINE){
			System.out.println("����������������ʧ��");
		}
		else {
			//�Ѵ�ӡ������ӵ��������棬�ѱ�������ݵ�������һ
			printData[dataNum++] = msg;
		}
	}
	public int getProduceTime()
	{
		return 45;
	}
	public static void main(String[] args)
	{
		//����һ��Printer��OutputΪ����
		Output o = new Printer();
		o.getData("first");
		o.getData("second");
		o.out();
		o.getData("third");
		o.getData("four");
		o.out();
		
	}
}