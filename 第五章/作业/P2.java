import java.util.Scanner;
class P2
{

	public static void main(String[] args)
	{	
		int N = 3;
		student[] st = new student[N];
		Scanner read = new Scanner(System.in);
		for(int i=0;i<N;i++){
			System.out.println("请输入学生的姓名，邮箱以及地址（以空格隔开）：");
			String name = read.next();
			String email = read.next();
			String address = read.next();
			st[i] = new student(name,email,address);
		}
		System.out.println("输入学生数据结束！");
		// for(int i=0;i<N;i++){
		// 	System.out.println(st[i].getName()+st[i].getEmail());
		// }
		int flag;
		int choice;
		while(true){
			flag = 0;
			System.out.println("请输入要查询的学生的姓名");
			String searchName = read.next();
			for(int i=0;i<N;i++){
				if(searchName.equals(st[i].getName())){
					System.out.println("查询的学生的信息为："+st[i].getName()+"  "+st[i].getEmail()+"  "+st[i].getAddress());
					flag = 1;
					break;
				}
			}
			if(flag == 0){
				System.out.println("找不到该学生信息，请重新输入！");
			}
			System.out.println("是否还要继续查找？ 1:继续 2:退出");
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