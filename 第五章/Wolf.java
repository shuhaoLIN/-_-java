class Creature
{
	public Creature()
	{
		System.out.println("Creature无参数的构造器");
	}
}
class Animal extends Creature
{	
	//// }
	public Animal(String name)
	{
		System.out.println("Animal带一个参数的构造器，"
			+ "该动物的name为" + name);
	}
	public Animal(String name , int age)
	{
		// 使用this调用同一个重载的构造器
		this(name);
		System.out.println("Animal带两个参数的构造器，"
			+ "其age为" + age);
	}
}
public class Wolf extends Animal
{
	public Wolf()
	{
		//如果父类没有无参构造器，而且子类没有显式的调用其父类的有参构造器，则会导致
		//编译错误，因为编译器会自动去寻找父类的无参构造器，但是找不到。
		// 显式调用父类有两个参数的构造器
		//super("灰太狼", 3);
		System.out.println("Wolf无参数的构造器");
	}
	public static void main(String[] args)
	{
		new Wolf();
	}
}

// class Creature
// {
	
// 	{
// 		System.out.println("Creature的非静态初始化块");
// 	}
// 	static{
// 		System.out.println("我是最先运行的");
// 	}
// 	public Creature(){
// 		System.out.println("Creature无参数的构造器");
// 	}
// 	public Creature(String name)
// 	{
// 		this();
// 		System.out.println("Creature带有name参数的构造器，name参数："+name);
// 	}
// 	}
 
 
// class Animal extends Creature
// {
// 	{
// 		System.out.println("Animal的非静态初始化块");
// 	}
// 	static
// 	{
// 		System.out.println("我是第二个运行的");
// 	}
// 	public Animal()
// 	{
		
// 	}
// 	public  Animal(String name)
// 	{
// 	    super(name);
// 	    System.out.println("Animal带一个参数的构造器，name参数："+name);
// 	}
// 	public Animal(String name,int age)
// 	{
// 		this(name);
// 		System.out.println("Animal带两个参数的构造器，其age："+age);
// 	}
// 	}
 
// public class Wolf extends  Animal
// {
// 	{
// 		System.out.println("Wolf的非静态初始化块");
// 	}
// 	static
// 	{
// 		System.out.println("我是第三个运行的");
// 	}
// 	public Wolf()
// 	{
// 		super("灰太狼",3);
// 		System.out.println("Wolf的无参数的构造器");
// 	}
// 	public Wolf(double weight)
// 	{
// 		this();
// 		System.out.println("Wolf的带weight参数的构造器，weight参数："+ weight);
// 	}
	
 
 

// public static void main(String[] args) {
// 	new Wolf(5.6);
// 	//new Wolf(6.5);
// }

// }