package mypack;

public class Details 
{
String name ;
int age;
float fee;
void display(String name,int age)
{
	this.name=name;
	this.age=age;
}
void display(String name,float fee)
{
	this.name=name;
	this.fee=fee;
	
}
void display()
{
	System.out.println(name+" "+age+" "+fee);
}

	public static void main(String[] args)
	{
	Details d=new Details();
	d.display("aaa",23);
	d.display();
	Details d2=new Details();
	d2.display("bbb",3.4f);
	d2.display();
	

	}

}
