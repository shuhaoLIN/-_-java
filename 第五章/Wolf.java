class Creature
{
	public Creature()
	{
		System.out.println("Creature�޲����Ĺ�����");
	}
}
class Animal extends Creature
{	
	//// }
	public Animal(String name)
	{
		System.out.println("Animal��һ�������Ĺ�������"
			+ "�ö����nameΪ" + name);
	}
	public Animal(String name , int age)
	{
		// ʹ��this����ͬһ�����صĹ�����
		this(name);
		System.out.println("Animal�����������Ĺ�������"
			+ "��ageΪ" + age);
	}
}
public class Wolf extends Animal
{
	public Wolf()
	{
		//�������û���޲ι���������������û����ʽ�ĵ����丸����вι���������ᵼ��
		//���������Ϊ���������Զ�ȥѰ�Ҹ�����޲ι������������Ҳ�����
		// ��ʽ���ø��������������Ĺ�����
		//super("��̫��", 3);
		System.out.println("Wolf�޲����Ĺ�����");
	}
	public static void main(String[] args)
	{
		new Wolf();
	}
}

// class Creature
// {
	
// 	{
// 		System.out.println("Creature�ķǾ�̬��ʼ����");
// 	}
// 	static{
// 		System.out.println("�����������е�");
// 	}
// 	public Creature(){
// 		System.out.println("Creature�޲����Ĺ�����");
// 	}
// 	public Creature(String name)
// 	{
// 		this();
// 		System.out.println("Creature����name�����Ĺ�������name������"+name);
// 	}
// 	}
 
 
// class Animal extends Creature
// {
// 	{
// 		System.out.println("Animal�ķǾ�̬��ʼ����");
// 	}
// 	static
// 	{
// 		System.out.println("���ǵڶ������е�");
// 	}
// 	public Animal()
// 	{
		
// 	}
// 	public  Animal(String name)
// 	{
// 	    super(name);
// 	    System.out.println("Animal��һ�������Ĺ�������name������"+name);
// 	}
// 	public Animal(String name,int age)
// 	{
// 		this(name);
// 		System.out.println("Animal�����������Ĺ���������age��"+age);
// 	}
// 	}
 
// public class Wolf extends  Animal
// {
// 	{
// 		System.out.println("Wolf�ķǾ�̬��ʼ����");
// 	}
// 	static
// 	{
// 		System.out.println("���ǵ��������е�");
// 	}
// 	public Wolf()
// 	{
// 		super("��̫��",3);
// 		System.out.println("Wolf���޲����Ĺ�����");
// 	}
// 	public Wolf(double weight)
// 	{
// 		this();
// 		System.out.println("Wolf�Ĵ�weight�����Ĺ�������weight������"+ weight);
// 	}
	
 
 

// public static void main(String[] args) {
// 	new Wolf(5.6);
// 	//new Wolf(6.5);
// }

// }