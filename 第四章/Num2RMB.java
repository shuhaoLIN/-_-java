import java.math.*;
import java.util.Arrays;
public class Num2RMB
{
	private String[] hanArr = {"��","һ","��","��","��","��","��","��","��","��","ʮ"};
	private String[] unitArr = {"","ʮ","��","ǧ"};
	/**
	 * ��һ���������ֽ�������Լ�С�����ֵ��ַ���
	 * @param num Ҫ�ֽ�ĸ�����
	 * @return �ֽ���������������Լ�С�����֣���һ������Ԫ�����������֣��ڶ�������Ԫ����С������
	 */
	private String[] divide(double num)
	{
		//��һ��������ǿ��ת��Ϊlong�ͣ��������������
		long zheng = (long)num;
		//�ø�����num��ȥzheng�����С������
		long xiao = Math.round((num-zheng)*100);//��С�����ֳ���100Ȼ��ȡ��
		return new String[] {zheng+"",String.valueOf(xiao)};
		//����Ҫ����ϰ����Ȼ��������
	}
	/**
	 * �����ǽ���ֵƥ���϶�Ӧ������
	 * @param numStr Ҫ����ƥ���4λ��ֵ�����Ѿ��ֽ����
	 * @return ��Ӧ�������ַ���
	 */
	private String toHanStr(String numStr)
	{
		String result = "";
		for(int i=0;i<numStr.length();i++){
			if(numStr.charAt(i) == '0'){
				//������м����0�Ļ�
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