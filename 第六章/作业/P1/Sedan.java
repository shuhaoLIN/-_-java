//轿车类,继承于Car
public class Sedan extends Car
{
	private int manNum;
	public Sedan(String color,int numOfLeg,int manNum){
		super(color,numOfLeg);
		this.manNum = manNum;
	}
	public void info(){
		System.out.println("这是轿车，颜色为"+getColor()+",有"+getNumOfLeg()+"个轮子，"
			+"载人量为"+getManNum()+"人");
	}
	public int getManNum(){
		return this.manNum;
	}
	public static void main(String[] args){
		Car sedan = new Sedan("绿色",4,4);
		sedan.info();
	}
}