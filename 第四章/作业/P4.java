//���������ϵĴ𰸽��б�д��
public class P4
{
	public static void main(String[] args)
	{
		String str = "�й�abc";
		substring(str,2,4);
	}
	public static String substring(String str,int start, int end)
	{
		String result = "";
		if(str == null){
			System.out.println("No string input");
		}
		else {
			//Դ�ַ�����
			//���ؼ��㣩��Stringת����Ϊbyte�ֽ�����
			byte[] bt = str.getBytes();
			System.out.println("�ַ���ת���ֽ�����ĳ����ǣ�"+bt.length);

			//ֱ�ӹ���һ���µ�string
			result = new String(bt , start, end);
			System.out.println("�س�������"+result);
		}
		return result;
	}
}