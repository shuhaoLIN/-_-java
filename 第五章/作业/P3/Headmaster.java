//package teacher.headmaster;
/**
 * 班主任类，是教师类的子类
 * 包含一个独有属性salary
 * @author linshuhao
 * @version 1.0
 */
import teacher.*;
public class Headmaster extends Teacher
{
	private int salary;
	/**
	 * 调用父类的构造器，实现复用
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
	 * 重写introduce函数
	 */
	public void introduce()
	{
		System.out.println("我叫"+this.getName()+",我是一名"+getJob()+",我的薪水是："+this.salary);
	}
}