public class P2
{
	public static void main(String[] args)
	{
		int nums=5;
		int length=2*nums-1;
		int numOfLine;
		int numOfSpace;
		for(int i=1;i<=nums;i++){
			numOfLine = 2*i -1;
			numOfSpace = (length - numOfLine)/2;
			for(int j=0;j<numOfSpace;j++){
				System.out.print(" ");
			}
			for(int k=0;k<numOfLine;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}