//����һ��������Car
public abstract class Car
{
	private int numOfLeg;
	private String color;
	public abstract void info();
	public Car(){}; //���ڸ�������е���
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