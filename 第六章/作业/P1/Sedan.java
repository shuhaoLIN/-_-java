//�γ���,�̳���Car
public class Sedan extends Car
{
	private int manNum;
	public Sedan(String color,int numOfLeg,int manNum){
		super(color,numOfLeg);
		this.manNum = manNum;
	}
	public void info(){
		System.out.println("���ǽγ�����ɫΪ"+getColor()+",��"+getNumOfLeg()+"�����ӣ�"
			+"������Ϊ"+getManNum()+"��");
	}
	public int getManNum(){
		return this.manNum;
	}
	public static void main(String[] args){
		Car sedan = new Sedan("��ɫ",4,4);
		sedan.info();
	}
}