package mypack;

public class Methodchild extends Methodsuper
{
	void display()
	{
		super.show();
		System.out.println("animal babies");
	}

	public static void main(String[] args) 
	{
		Methodchild m=new Methodchild();
		m.display();

	}

}
