public class Bird
{
	public void fly(){
		System.out.println("I can fly!");
	}
	public static void main(String[] args)
	{
		// Obird od = new Obird();
		// od.fly();
		Obird bd = new Obird();
		//bd.fly();
		if( bd instanceof Bird){
			System.out.println("dddd");
		}
	}
}
class Obird extends Bird
{
	public void fly(){
		System.out.println("I can fly too!");
	}
	//这个是重写父类的fly，然后再重载fly
	public void fly(String name)
	{
		System.out.println(name);
	}
	
}
