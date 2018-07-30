//定义一个继承Car的卡车类
public class Lorry extends Car
{
	private int loadCapacity;
	private String idCard;
	public Lorry(String color ,int numOfLeg, int loadCapacity,String idCard){
		super(color,numOfLeg);
		this.loadCapacity = loadCapacity;
		this.idCard = idCard;
	}
	public void info(){
		System.out.println("这是卡车，颜色为"+getColor()+",有"+getNumOfLeg()+"个轮子,"
			+"载重量为"+getLoadCapacity()+"kg,车牌号为"+getIdCard());
	}
	public int getLoadCapacity(){
		return this.loadCapacity;
	}
	public String getIdCard(){
		return this.idCard;
	}
	public static void main(String[] args){
		Car lorry = new Lorry("绿色",4,20000,"粤G123456");
		lorry.info();
	}
}