import java.util.Scanner;
public class Days {
	void weekDays()
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("Enter Days of the Week as per Order	like"	+ "Monday");
		String ch=sn.nextLine();
		
		switch(ch)
		{
			case "Monday":
			{
				System.out.println("Monday");
				break;
			}
			case "Tuesday":
			{
				System.out.println("Tuesday");
				break;

			}
			case "Wednesday":
			{
				System.out.println("Wednesday");
				break;

			}
			case "Thursday":
			{
				System.out.println("Thursday");
				break;
				

				
				
			}
			case "Friday":
			{
				System.out.println("Friday");
				break;

			}
			default:
			{
				System.out.println("its  a week end day");
				break;
			
			}
				
				
	}
	}
	public static void main(String args[])
	{
		Days d=new Days();
		d.weekDays();
	}
}
	


