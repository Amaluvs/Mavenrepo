package mypack;

public class Student
{
    static String name;
	static int age;
	static int id;
	static float fee;
	static void display(String name1,int age1,int id1)
	{
		name=name1;
		age=age1;
		id=id1;
	}
	static  void display(String name1,int age1,float fee1)
	{
		name=name1;
		age=age1;
		
		fee=fee1;
	}
	static void details()
	{
		System.out.println(name+" "+age+" "+id+" "+fee);
	}

	public static void main(String[] args) 
	{
	
		display("bee",76,7654);
		details();
		display("fly",43,5000.0f);
		details();

	}

}

	
