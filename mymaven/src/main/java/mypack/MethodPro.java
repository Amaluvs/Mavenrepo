package mypack;

public class MethodPro 
{
	String name;
	int age;
	void display(String name1,int age1)
	{
		name=name1;
		age=age1;
		System.out.println("name is "+name);
		System.out.println("age is"+age);
		
	}
	void display(String name1)
	{
		name=name1;
		System.out.println("name is "+name);
	}
	void display()
	{
		System.out.println("age is"+age);
	}
	
public static void main(String[] args)
	{
	MethodPro e=new MethodPro();
	e.display("sinu",12);
	
	MethodPro e1=new MethodPro();
    e1.display("minu");
    
    e.display();
   

	
		
	}


}
