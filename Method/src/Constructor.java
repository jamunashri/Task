import java.util.Scanner;

public class Constructor {
	int i=100;
	public Constructor()
	{
		System.out.println("Enter the integer number");
		Scanner sn=new Scanner(System.in);
		System.out.println(sn.nextInt());
		System.out.println(i);
		}
public static void main(String[] args)
{
	Constructor c=new Constructor();
	
	}
}
