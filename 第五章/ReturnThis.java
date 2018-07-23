public class ReturnThis
{
	public int age;
	public ReturnThis grow()
	{
		age++;
		//返回调用该方法的对象
		return this;
	}
	public static void main(String[] args)
	{
		ReturnThis rt = new ReturnThis();
		//可以连续调用同一个方法
		rt.grow()
			.grow()
				.grow();//因为返回的是this对象，所以还是可以继续调用
		System.out.println(rt.age);
	}
}