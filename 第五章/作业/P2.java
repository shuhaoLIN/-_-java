import java.util.Scanner;
class P2
{

	public static void main(String[] args)
	{	
		int N = 3;
		student[] st = new student[N];
		Scanner read = new Scanner(System.in);
		for(int i=0;i<N;i++){
			System.out.println("������ѧ���������������Լ���ַ���Կո��������");
			String name = read.next();
			String email = read.next();
			String address = read.next();
			st[i] = new student(name,email,address);
		}
		System.out.println("����ѧ�����ݽ�����");
		// for(int i=0;i<N;i++){
		// 	System.out.println(st[i].getName()+st[i].getEmail());
		// }
		int flag;
		int choice;
		while(true){
			flag = 0;
			System.out.println("������Ҫ��ѯ��ѧ��������");
			String searchName = read.next();
			for(int i=0;i<N;i++){
				if(searchName.equals(st[i].getName())){
					System.out.println("��ѯ��ѧ������ϢΪ��"+st[i].getName()+"  "+st[i].getEmail()+"  "+st[i].getAddress());
					flag = 1;
					break;
				}
			}
			if(flag == 0){
				System.out.println("�Ҳ�����ѧ����Ϣ�����������룡");
			}
			System.out.println("�Ƿ�Ҫ�������ң� 1:���� 2:�˳�");
			choice = read.nextInt();
			if(choice == 1){
			}
			else{
				System.out.println("byebye!!!");
				break;
			}
		}

	}

}