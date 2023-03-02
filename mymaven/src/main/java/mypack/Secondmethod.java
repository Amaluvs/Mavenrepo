package mypack;

public class Secondmethod 
{
	
	String name ;
	int age;
	float fee;
	String display(String name,int age)
	{
		this.name=name;
		this.age=age;
		return(name+" "+age);
	}
	String display(String name,float fee)
	{
		this.name=name;
		this.fee=fee;
		return(name+" "+age);
		
	}
	public static void main(String[] args)
		{
		Details d=new Details();
		d.display("aaa",23);
		System.out.println(d.name);
		System.out.println(d.age);
		
		Details d2=new Details();
		d2.display("bbb",3.4f);
		System.out.println(d2.name);
		System.out.println(d2.fee);
		
		}
		}

	

	
	


