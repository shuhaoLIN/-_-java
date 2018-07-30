public class student
{
	private String name;
	private int age;
	private String gender;
	private String phone;
	private String address;
	private String email;
	public student(){

	}

	public student(String name ,int age)
	{
		this.name = name;
		this.age = age;
	}
	public student(String name ,String email ,String address)
	{
		this.name = name;
		this.email = email;
		this.address = address;
	}
	public student(String name,int age,String gender,String phone,String address,String email)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age = age;
	}

	public String getGender(){
		return this.gender;
	}
	public void setGender(String gender){
		this.gender = gender;
	}

	public String getPhone(){
		return this.phone;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getAddress(){
		return this.address;
	}
	public void setAddress(String address){
		this.address = address;
	}

	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}

	
	public void eat(){
		System.out.println("I can eat!");
	}
	public void drink(){
		System.out.println("I can drink!");
	}
	public void play(){
		System.out.println("I can play!");
	}
	public void sleep(){
		System.out.println("I can sleep!");
	}

	public static void main(String[] args)
	{
		student st1 = new student();
		System.out.println(st1.getAddress());
		student st = new student("linshuhao",20,"nan","12345678912","暨南大学珠海校区","123456789@123");
		System.out.println(st.getEmail());
	}
}