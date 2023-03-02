package mypack;

public class ConProgram2 
{
	String name;
	int age;
	ConProgram2(String name,int age)
	{
		this.name=name;
		this.age=age;
		//System.out.println(name+" "+age);
	}
	ConProgram2(int age)
	{
		this.age=age;
		//System.out.println(age);
	}
	void display()
	{
		System.out.println(name+" "+age);
	}
	
	
	public static void main(String args[])
	{
		ConProgram2 c=new ConProgram2("meena",5);
		c.display();
		
		ConProgram2 c1=new ConProgram2(10);
		c1.display();
	}

	
}
