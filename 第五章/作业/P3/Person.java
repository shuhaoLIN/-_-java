/**
 * 第一个类：普通人；
 * 普通人将会是其他类型的人物的父类，将会定义一些基础的属性以及方法
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
		System.out.println("我是person类!");
	}
}