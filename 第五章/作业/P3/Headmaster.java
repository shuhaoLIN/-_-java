//package teacher.headmaster;
/**
 * �������࣬�ǽ�ʦ�������
 * ����һ����������salary
 * @author linshuhao
 * @version 1.0
 */
import teacher.*;
public class Headmaster extends Teacher
{
	private int salary;
	/**
	 * ���ø���Ĺ�������ʵ�ָ���
	 * @param  name   [description]
	 * @param  salary [description]
	 * @return        [description]
	 */
	public Headmaster(String name,int salary)
	{
		super(name);
		this.salary = salary;
	}
	/**
	 * ��дintroduce����
	 */
	public void introduce()
	{
		System.out.println("�ҽ�"+this.getName()+",����һ��"+getJob()+",�ҵ�нˮ�ǣ�"+this.salary);
	}
}