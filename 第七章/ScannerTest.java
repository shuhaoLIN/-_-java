import java.util.Scanner;
public class ScannerTest
{
	public static void main(String[] args)
	{
		//system.in�Ǳ�׼����
		Scanner read = new Scanner(System.in);
		//�������ö�ȡ����ļ����
		//read.useDelimiter("\n");
		while(read.hasNext()){
			System.out.println("������"+read.next());
		}
	}
}