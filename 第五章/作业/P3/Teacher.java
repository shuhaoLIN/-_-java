//package teacher;
//import person.*;
/**
 * ��ʦ�࣬�̳��������ְ࣬ҵjobΪ�ض���teacher��
 * @author linshuhao
 * @version 1.0
 */
public class Teacher extends Person
{
	public Teacher(String name)
	{
		this.setName(name);
		this.setJob("Teacher");
	}
	/**
	 * ��д�����introduce����
	 */
	public void introduce()
	{
		System.out.println("����teacher�࣡");
	}
}