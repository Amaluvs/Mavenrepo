package mypack;

public class ConProgram1 
{
	String name;
	int age;
	ConProgram1(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println(name+" "+age);
	}
	ConProgram1(int age)
	{
		this.age=age;
		System.out.println(age);
	}
	
	public static void main(String args[])
	{
		ConProgram1 c=new ConProgram1("aaa",56);
		ConProgram1 c1=new ConProgram1(32);
	}
}
	
	


