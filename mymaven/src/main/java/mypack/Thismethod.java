package mypack;

public class Thismethod
{
	void display()
	{
		System.out.println("hello");
		
	}
    void show()
   {
	this.display();
	System.out.println("method");
   }
	public static void main(String[] args) 
	{
		Thismethod m=new Thismethod();
		m.show();
	}

}
