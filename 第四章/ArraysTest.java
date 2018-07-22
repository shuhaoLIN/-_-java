import java.util.Arrays;
public class  ArraysTest
{
	public static void main(String[] args)
	{
		int[] a = new int[]{1,2,3,4};
		int[] a2 = new int[]{1,2,3,4};
		System.out.println(Arrays.equals(a , a2));
		System.out.println(Arrays.equals(a,a2));
		int[] b = Arrays.copyOf(a,6);
		System.out.println(Arrays.equals(a,b));
		System.out.println(Arrays.toString(b));
		Arrays.fill(b,2,4,1);
		System.out.println(Arrays.toString(b));
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
	}
}