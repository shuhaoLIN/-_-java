//定义一个抽象类Car
public abstract class Car
{
	private int numOfLeg;
	private String color;
	public abstract void info();
	public Car(){}; //用于给子类进行调用
	public Car(String color,int numOfLeg){
		this.color = color;
		this.numOfLeg = numOfLeg;
	}
	public String getColor(){
		return this.color;
	}
	public int getNumOfLeg(){
		return this.numOfLeg;
	}
}