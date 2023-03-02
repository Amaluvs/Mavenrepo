
//1.parameterized method


package mypack;

public class EmpConstru 
{
	String name;
	int age;
	void display(String name1,int age1)
	{
		name=name1;
		age=age1;
		
	}
	void display()
	{
		System.out.println(name+" "+age);
	}
public static void main(String[] args)
	{
	EmpConstru e=new EmpConstru();
	e.display("sinu",12);
	e.display();
	
	e.display("miu",10);
	e.display();
		
	}

}
