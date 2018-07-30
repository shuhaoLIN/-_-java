//import teacher.headmaster.*;//这样编译出错
//import teacher.headmaster.Headmaster;//这样编译通过
public class Test
{
	public static void main(String[] args)
	{
		Headmaster hm = new Headmaster("Tom",123456);
		hm.introduce();
	}
}