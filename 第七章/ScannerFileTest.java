import java.util.Scanner;
import java.io.File;
public class ScannerFileTest
{
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(new File("ScannerTest.java"));
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
	}
	
}