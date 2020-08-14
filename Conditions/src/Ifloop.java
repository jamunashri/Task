import java.util.*;
public class Ifloop
{
void loop()
{
	Scanner in=new Scanner(System.in);
	System.out.println("Enter marks");
	int marks=in.nextInt();
	if(marks>35)
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
public static void main(String[] args)
{
	
	Ifloop is=new Ifloop();
	is.loop();
	
}

}
