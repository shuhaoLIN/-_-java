import static java.lang.System.*;
class Apple
{
	int weight;
	String special;
	String address;
	public Apple()
	{
		out.println("第一个！");
	}
	public Apple(int weight,String special)
	{
		out.println("第二个！");
		this.weight = weight;
		this.special = special;
	}
	public Apple(int weight,String special,String address)
	{
		this(weight,special);
		out.println("第三个！");
		this.address = address;
	}
	public static void main(String[] args)
	{
		Apple ap = new Apple();
		Apple ap2 = new Apple(10,"多汁");
		Apple ap3 = new Apple(10,"哈哈","广东");
		out.println(ap.weight);
		out.println(ap2.weight + ap2.special);
		out.println("你好啊");
	}
}