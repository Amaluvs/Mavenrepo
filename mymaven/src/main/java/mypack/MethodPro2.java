package mypack;

//constructor program


public class MethodPro2 
{

	String name;
	int age;
	MethodPro2(String name,int age)
	{
		this.name=name;
		this.age=age;
		//System.out.println(name+" "+age);
	}
	MethodPro2(int age)
	{
		this.age=age;
		//System.out.println(age);
	}
	
	public static void main(String args[])
	{
		MethodPro2 c =new MethodPro2("aaa",56);
		System.out.println(c.name);
		System.out.println(c.age);
		
		MethodPro2 c1=new MethodPro2(32);
		System.out.println(c1.age);
	}
}
	


