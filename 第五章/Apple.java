import static java.lang.System.*;
class Apple
{
	int weight;
	String special;
	String address;
	public Apple()
	{
		out.println("��һ����");
	}
	public Apple(int weight,String special)
	{
		out.println("�ڶ�����");
		this.weight = weight;
		this.special = special;
	}
	public Apple(int weight,String special,String address)
	{
		this(weight,special);
		out.println("��������");
		this.address = address;
	}
	public static void main(String[] args)
	{
		Apple ap = new Apple();
		Apple ap2 = new Apple(10,"��֭");
		Apple ap3 = new Apple(10,"����","�㶫");
		out.println(ap.weight);
		out.println(ap2.weight + ap2.special);
		out.println("��ð�");
	}
}