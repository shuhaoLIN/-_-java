public class OutputFactory
{
	public Output getOutput()
	{
		//下面两行代码用于控制系统到底使用的是哪个实例
		return new Printer();
		//return new BetterPrinter();
	}

	public static void main(String[] args)
	{
		//这才是真正的封装，用了一个接口以及一个调用类，将真正的实现的方法包装起来，
		//外部完全不知道里面是怎么实现的
		OutputFactory of = new OutputFactory();
		Computer c = new Computer(of.getOutput());
		c.keyIn("first");
		c.keyIn("second");
		c.print();
	}
}