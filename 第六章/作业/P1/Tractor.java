//定义一个拖拉机的类继承Car
public class Tractor extends Car
{
	private int loadCapacity;
	public Tractor(String color, int numOfLeg, int loadCapacity){
		super(color,numOfLeg);
		this.loadCapacity = loadCapacity;
	}
	public void info(){
		System.out.println("这是拖拉机，颜色为"+getColor()+",有"+getNumOfLeg()+"个轮子,"+
			"载重量为"+this.loadCapacity+"千克");
	}
	public static void main(String[] args)
	{
		Car tractor = new Tractor("黄色",3,10000);
		tractor.info();

	}
}