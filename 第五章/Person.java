public class Person
{
	public int foo;
	public Person()
	{
		//int foo =3;  //��ʵ���foo�������û�й�ϵ������������
		foo = 7;//����ʡ��this
		//������������foo���ڣ����Ǵ���һ��ͬ���ľֲ���������һ��Ҫ����this
	}
	public static void main(String[] args)
	{
		Person p = new Person();
		System.out.println(p.foo);
	}
}