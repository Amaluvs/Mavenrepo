package mypack;

public class Manager extends Employ
{
	public int Ta=500;
	Manager()
	{
		super();
		System.out.println("child constructor");
	}
	public void display()
	{
		System.out.println(Ta);
	
	System.out.println(super.bonus);
	super.show();
	}
	
	public static void main(String[] args) 
	{
		Manager m=new Manager();
		m.display();
		

	}

}
