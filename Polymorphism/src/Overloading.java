
public class Overloading {
void mul(int a,int b)
{

	System.out.println(a*b);
}
	void mul(double a,double b,double c)
	{
		
	System.out.println(a*b*c);
	}
	public static void main(String args[])
	{
		Overloading e=new Overloading();
		e.mul(10,20);
		e.mul(10,20,30);
	}
}
