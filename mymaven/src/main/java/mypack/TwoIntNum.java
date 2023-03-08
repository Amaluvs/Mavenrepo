package mypack;

public class TwoIntNum 
{
	int a,b;
	int sum;
	int c;
	float x,y,z;
	public int sum(int a,int b)
	{
		this.a=a;
		this.b=b;
		sum=a+b;
		return sum;
		
	}
	public int sum(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		sum=a+b+c;
		return sum;
		
	}
	public float sum(float x,float y,float z)
	{
		
		this.x=x;
		this.y=y;
		this.z=z;
		float sum=x+y+z;
		return sum;
		
	}

	public static void main(String[] args)
	{
		TwoIntNum t=new TwoIntNum();
		System.out.println(t.sum(2,4));
		System.out.println(t.sum(2,4,6));
		System.out.println(t.sum(1.0f,2.2f,4.1f));
		
	}

}
