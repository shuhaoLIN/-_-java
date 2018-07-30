//package teacher;
//import person.*;
/**
 * 教师类，继承于人类类，职业job为特定的teacher。
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
	 * 重写父类的introduce函数
	 */
	public void introduce()
	{
		System.out.println("我是teacher类！");
	}
}