public class ComparableOperatorTest
{
	public static void main(String[] args)
	{
		System.out.println("true 和 false 是否相等"+(true ==false));
		ComparableOperatorTest t1 = new ComparableOperatorTest();
		ComparableOperatorTest t2 = new ComparableOperatorTest();
		//t1和t2是同一个类的引用，所以可以进行比较，但是因为指向不同，所以不相等
		System.out.println("t1 和 t2是否相等"+(t1==t2));
		ComparableOperatorTest t3 = t1;
		System.out.println((t1==t3));//这是错误的，因为5是int型，不能赋值给byte
	}
}