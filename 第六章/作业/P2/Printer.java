interface Product
{
	int getProduceTime();
}
public class Printer implements Output ,Product
{
	private String[] printData = new String[MAX_CACHE_LINE];
	//用以记录当前需打印的作业数
	private int dataNum = 0;
	/**
	 * 将打印队列里面的数据全部打印出来
	 */
	public void out()
	{
		//只要还有作业，继续打印
		while (dataNum > 0){
			System.out.println("打印机打印："+printData[0]);
			//把作业队列整体前移一位，并将剩下的作业数减一
			System.arraycopy(printData ,1,printData,0,--dataNum);
		}
	}
	/**
	 * 将数据装入打印队列里面
	 * @param msg [装入的数据]
	 */
	public void getData(String msg)
	{
		if(dataNum >= MAX_CACHE_LINE){
			System.out.println("输出队列已满，添加失败");
		}
		else {
			//把打印数据添加到队列里面，已保存的数据的数量加一
			printData[dataNum++] = msg;
		}
	}
	public int getProduceTime()
	{
		return 45;
	}
	public static void main(String[] args)
	{
		//创建一个Printer以Output为引用
		Output o = new Printer();
		o.getData("first");
		o.getData("second");
		o.out();
		o.getData("third");
		o.getData("four");
		o.out();
		
	}
}