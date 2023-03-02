package mypack;

public class ThisCon
{
	int id;
	ThisCon()
	{
		
		System.out.println("fruits");
	}
	ThisCon(int id1)
	{
		this();
		id=id1;
		System.out.println(id);
	}
	public static void main(String[] args) 
	{
		ThisCon obj=new ThisCon(4);
		
		

	}

}
