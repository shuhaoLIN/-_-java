/**
 * �����ʵ�ֽ�������ת����Ϊ����Ҷ������ַ���
 * 
 */
public class P5
{
	static String[] numOfChina = {"��","һ","��","��","��","��","��","��","��","��","ʮ"};
	static String[] zhengshu = {"Ԫ","ʮ","��","ǧ","��","ʮ��","����","ǧ��","��"};
	static String[] xiaoshu = {"��","��"};

	public static void main(String[] args)
	{
		double nums = 123456.78;
		toChina(nums);
	}
	public static void toChina(double nums)
	{
		long zheng = (long)nums;
		int xiao = (int)Math.round((nums - zheng)*100);//����ֻȡ��λС��
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
			System.out.println("����������������������");
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
			//���ַ�ת��Ϊ����
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