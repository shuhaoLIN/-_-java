/**
 * ��һ���ࣺ��ͨ�ˣ�
 * ��ͨ�˽������������͵�����ĸ��࣬���ᶨ��һЩ�����������Լ�����
 * @author linshuhao
 */
class Person
{
	private static int eyeNum = 2;
	private String name;
	private String job;

	public int getEyeNum()
	{
		return this.eyeNum;
	}
	public void setEyeNum(int eyeNum)
	{
		this.eyeNum = eyeNum;
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getJob()
	{
		return this.job;
	}
	public void setJob(String job)
	{
		this.job = job;
	}

	public void introduce()
	{
		System.out.println("����person��!");
	}
}

class Teacher extends Person
{
	public Teacher(String name)
	{
		this.setName(name);
		this.setJob("Teacher");
	}
	public void introduce()
	{
		System.out.println("����teacher�࣡");
	}
}

class Headmaster extends Teacher
{
	private int salary;
	public Headmaster(String name,int salary)
	{
		super(name);
		this.salary = salary;
	}
	public void introduce()
	{
		System.out.println("�ҽ�"+this.getName()+",����һ��"+getJob()+",�ҵ�нˮ�ǣ�"+this.salary);
	}
}
public class P3
{
	public static void main(String[] args)
	{
		Headmaster hm = new Headmaster("Tom",123456);
		hm.introduce();
	}
}