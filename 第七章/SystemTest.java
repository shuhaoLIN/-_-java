import java.io.*;
import java.util.*;
public class SystemTest
{
	public static void main(String[] args) throws Exception
	{
		//获取系统的所有环境变量
		Map<String ,String> env = System.getenv();
		for(String name : env.keySet()){
			System.out.println(name + "-->"+env.get(name));
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		//获取指定环境变量的值
		System.out.println(System.getenv("JAVA_HOME"));
				System.out.println();
		System.out.println();
		System.out.println();

		//获取所有的系统属性
		Properties props = System.getProperties();
				System.out.println();
		System.out.println();
		System.out.println();

		//将所有属性保存到props.txt
		props.store(new FileOutputStream("props.txt") , "System Properties");
				System.out.println();
		System.out.println();
		System.out.println();

		//输出特定的系统属性
		System.out.println(System.getProperty("os.name"));
	}
}