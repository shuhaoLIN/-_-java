import java.util.Scanner;
public class ScannerTest
{
	public static void main(String[] args)
	{
		//system.in是标准输入
		Scanner read = new Scanner(System.in);
		//这是设置读取输入的间隔符
		//read.useDelimiter("\n");
		while(read.hasNext()){
			System.out.println("输入是"+read.next());
		}
	}
}