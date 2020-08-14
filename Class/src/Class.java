
public class Class {

	int salary;//when we didn't initialize value must be 0 as an integer
	
	void display()
	{
		System.out.println("Salary is "+salary);
		
	}

public static void main(String args[])
{
	Class cls=new Class();
	cls.display();
	
}
}