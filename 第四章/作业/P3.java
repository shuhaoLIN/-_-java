/**
 * 这一题是借鉴网上的答案编写的
 */
public class P3
{
	public static void main(String[] args)
	{
		//假设半径是5
		double R=5;
		//直径是13
		for(double y=-R;y<=R;y+=2){ //因为syste.out.println看起来像是隔汗打印，所以步长为2
			double a = Math.asin(y/R);//根据纵行坐标y算出角度（弧度），因为y=R*sin(a),所以sin(a)=y/x
			double x = R*Math.cos(a);//算出x坐标
			for(double j=-R;j<=R;j++){ //算出来的x坐标是正的，只能是半圆，打印整个圆从-R开始
				System.out.print(Math.abs(j<0?j+x:j-x) < 0.5?'*':' '); //double 判断不能用== 只能用临近判断
			}
			System.out.println();
		}
	}
}