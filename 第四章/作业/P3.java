/**
 * ��һ���ǽ�����ϵĴ𰸱�д��
 */
public class P3
{
	public static void main(String[] args)
	{
		//����뾶��5
		double R=5;
		//ֱ����13
		for(double y=-R;y<=R;y+=2){ //��Ϊsyste.out.println���������Ǹ�����ӡ�����Բ���Ϊ2
			double a = Math.asin(y/R);//������������y����Ƕȣ����ȣ�����Ϊy=R*sin(a),����sin(a)=y/x
			double x = R*Math.cos(a);//���x����
			for(double j=-R;j<=R;j++){ //�������x���������ģ�ֻ���ǰ�Բ����ӡ����Բ��-R��ʼ
				System.out.print(Math.abs(j<0?j+x:j-x) < 0.5?'*':' '); //double �жϲ�����== ֻ�����ٽ��ж�
			}
			System.out.println();
		}
	}
}