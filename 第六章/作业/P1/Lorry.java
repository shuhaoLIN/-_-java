//����һ���̳�Car�Ŀ�����
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
		System.out.println("���ǿ�������ɫΪ"+getColor()+",��"+getNumOfLeg()+"������,"
			+"������Ϊ"+getLoadCapacity()+"kg,���ƺ�Ϊ"+getIdCard());
	}
	public int getLoadCapacity(){
		return this.loadCapacity;
	}
	public String getIdCard(){
		return this.idCard;
	}
	public static void main(String[] args){
		Car lorry = new Lorry("��ɫ",4,20000,"��G123456");
		lorry.info();
	}
}