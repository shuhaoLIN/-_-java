import java.io.*;
import java.util.*;
public class SystemTest
{
	public static void main(String[] args) throws Exception
	{
		//��ȡϵͳ�����л�������
		Map<String ,String> env = System.getenv();
		for(String name : env.keySet()){
			System.out.println(name + "-->"+env.get(name));
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		//��ȡָ������������ֵ
		System.out.println(System.getenv("JAVA_HOME"));
				System.out.println();
		System.out.println();
		System.out.println();

		//��ȡ���е�ϵͳ����
		Properties props = System.getProperties();
				System.out.println();
		System.out.println();
		System.out.println();

		//���������Ա��浽props.txt
		props.store(new FileOutputStream("props.txt") , "System Properties");
				System.out.println();
		System.out.println();
		System.out.println();

		//����ض���ϵͳ����
		System.out.println(System.getProperty("os.name"));
	}
}