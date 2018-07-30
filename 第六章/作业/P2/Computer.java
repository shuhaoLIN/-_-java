//模拟一台计算机，有打印功能，其实是组合了一个Output对象，进行实现
//为什么要组合一个Output对象，而不组合一个Printer对象呢？
//因为这样子的话，我以后就只需要知道一个Output对象，但是这个对象是由printer实现的
//还是有BetterPrinter实现的就与我无关了，就像操作系统里面说的，接口就是定义了一个规范，
//然后具体怎么实现，计算机是不管的，只要你遵循的是这一个 规范就可以接入，这样子就实现了逻辑设备
public class Computer
{
	private Output out;
	public Computer(Output out)
	{
		this.out = out;
	}
	//定义一个模拟获取字符串输入的方法
	public void keyIn(String msg)
	{
		out.getData(msg);
	}
	//定义一个模拟打印的方法
	public void print()
	{
		out.out();
	}
}