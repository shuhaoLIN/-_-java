/**
 * ��һ���ࣺ��ͨ�ˣ�
 * ��ͨ�˽������������͵�����ĸ��࣬���ᶨ��һЩ�����������Լ�����
 * @author linshuhao
 * @version 1.0
 */
package person;
public class Person
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