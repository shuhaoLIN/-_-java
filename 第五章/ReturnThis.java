public class ReturnThis
{
	public int age;
	public ReturnThis grow()
	{
		age++;
		//���ص��ø÷����Ķ���
		return this;
	}
	public static void main(String[] args)
	{
		ReturnThis rt = new ReturnThis();
		//������������ͬһ������
		rt.grow()
			.grow()
				.grow();//��Ϊ���ص���this�������Ի��ǿ��Լ�������
		System.out.println(rt.age);
	}
}