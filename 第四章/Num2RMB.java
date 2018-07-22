import java.math.*;
import java.util.Arrays;
public class Num2RMB
{
	private String[] hanArr = {"零","一","二","三","四","五","六","七","八","九","十"};
	private String[] unitArr = {"","十","百","千"};
	/**
	 * 把一个浮点数分解成整数以及小数部分的字符串
	 * @param num 要分解的浮点数
	 * @return 分解出来的整数部分以及小数部分，第一个数组元素是整数部分，第二个数组元素是小数部分
	 */
	private String[] divide(double num)
	{
		//将一个浮点数强制转换为long型，获得其整数部分
		long zheng = (long)num;
		//用浮点数num减去zheng获得其小数部分
		long xiao = Math.round((num-zheng)*100);//将小数部分乘以100然后取整
		return new String[] {zheng+"",String.valueOf(xiao)};
		//还是要多练习，不然就忘记了
	}
	/**
	 * 下面是将数值匹配上对应的中文
	 * @param numStr 要进行匹配的4位数值串，已经分解好了
	 * @return 对应的中文字符串
	 */
	private String toHanStr(String numStr)
	{
		String result = "";
		for(int i=0;i<numStr.length();i++){
			if(numStr.charAt(i) == '0'){
				//如果是中间出现0的话
				if(i != (numStr.length()-1) && result != "" )
					result += hanArr[0];
				continue;
			}
			else{
				result += hanArr[numStr.charAt(i)-48];
				result += unitArr[numStr.length() - 1 - i];
			}
		}
		if (result == ""){
			return "0";
		}
		else return result;
	}
	public static void main(String[] args)
	{
		Num2RMB nr = new Num2RMB();
		System.out.println(Arrays.toString(nr.divide(19999.123)));
		System.out.println(nr.toHanStr("0009"));
	}
}