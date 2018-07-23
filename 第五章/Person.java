public class Person
{
	public int foo;
	public Person()
	{
		//int foo =3;  //其实这个foo跟上面的没有关系。。。。。。
		foo = 7;//可以省略this
		//但是如果上面的foo存在，即是存在一个同名的局部变量，则一定要加上this
	}
	public static void main(String[] args)
	{
		Person p = new Person();
		System.out.println(p.foo);
	}
}