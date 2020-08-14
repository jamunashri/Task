
public class Operator {

	void sum(int a,int b)
	{
		int c=a+b;
		System.out.println("C="+c);
	}
	void print()
	{
		System.out.println("hi"+"hello");
	}
public static void main(String arg[])
{
	Operator o=new Operator();
	o.sum(10,20);
	o.print();
}
}
