//����һ������������̳�Car
public class Tractor extends Car
{
	private int loadCapacity;
	public Tractor(String color, int numOfLeg, int loadCapacity){
		super(color,numOfLeg);
		this.loadCapacity = loadCapacity;
	}
	public void info(){
		System.out.println("��������������ɫΪ"+getColor()+",��"+getNumOfLeg()+"������,"+
			"������Ϊ"+this.loadCapacity+"ǧ��");
	}
	public static void main(String[] args)
	{
		Car tractor = new Tractor("��ɫ",3,10000);
		tractor.info();

	}
}