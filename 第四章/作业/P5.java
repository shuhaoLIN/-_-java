/**
 * 这个答案实现将浮点数转换成为人民币读法的字符串
 * 
 */
public class P5
{
	static String[] numOfChina = {"零","一","二","三","四","五","六","七","八","九","十"};
	static String[] zhengshu = {"元","十","百","千","万","十万","百万","千万","亿"};
	static String[] xiaoshu = {"角","分"};

	public static void main(String[] args)
	{
		double nums = 123456.78;
		toChina(nums);
	}
	public static void toChina(double nums)
	{
		long zheng = (long)nums;
		int xiao = (int)Math.round((nums - zheng)*100);//这里只取两位小数
		String zhengs = zheng+"";
		String str ="";
		switch(zhengs.length()){
			case 0:
			str = intNum(0,zhengs,xiao);
			break;
			case 1:
			str = intNum(1,zhengs,xiao);
			break;
			case 2:
			str = intNum(2,zhengs,xiao);
			break;
			case 3:
			str = intNum(3,zhengs,xiao);
			break;
			case 4:
			str = intNum(4,zhengs,xiao);
			break;
			case 5:
			str = intNum(5,zhengs,xiao);
			break;
			case 6:
			str = intNum(6,zhengs,xiao);
			break;
			case 7:
			str = intNum(7,zhengs,xiao);
			break;
			case 8:
			str = intNum(8,zhengs,xiao);
			break;
			case 9:
			str = intNum(9,zhengs,xiao);
			break;
			default:
			System.out.println("输入数据有误，请重新输入");
			break;
		}
		System.out.println(str);
	}
	public static String intNum(int length,String zhengs,int xiao )
	{
		String ling = "";
		int lenZhengs = zhengs.length();
		String str = "";
		for(int i=0;i<length;i++){
			//将字符转化为整形
			int num = (int )zhengs.charAt(i)-48;
			String s = numOfChina[num];
			if(0 == num){
				str = str + s;
			}else{
				str = str +s +zhengshu[lenZhengs-1];
			}
			lenZhengs--;
		}
		int n1 = xiao/10;
		int n0 = xiao%10;
		str = str +numOfChina[n1]+xiaoshu[0]+numOfChina[n0]+xiaoshu[1];
		return str;
	}
}