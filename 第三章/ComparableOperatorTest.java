public class ComparableOperatorTest
{
	public static void main(String[] args)
	{
		System.out.println("true �� false �Ƿ����"+(true ==false));
		ComparableOperatorTest t1 = new ComparableOperatorTest();
		ComparableOperatorTest t2 = new ComparableOperatorTest();
		//t1��t2��ͬһ��������ã����Կ��Խ��бȽϣ�������Ϊָ��ͬ�����Բ����
		System.out.println("t1 �� t2�Ƿ����"+(t1==t2));
		ComparableOperatorTest t3 = t1;
		System.out.println((t1==t3));//���Ǵ���ģ���Ϊ5��int�ͣ����ܸ�ֵ��byte
	}
}