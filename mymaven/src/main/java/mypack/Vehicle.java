package mypack;

public class Vehicle
{
	 static String name;
	 static int id;
	 
	 void display(String name1)
	{
		name=name1;
		System.out.println(name);
	}
	void show(int id1)
	 {
		id=id1;
System.out.println(id);
		 
	 }
    public static void main(String args[])
    {
Vehicle v=new Vehicle();
v.display("bini");
 v.  show(8);
    }
}


