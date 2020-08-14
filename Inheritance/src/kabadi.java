
public class kabadi extends Sports
{
	public void score()
	{
		System.out.println("9members works done");
	}
public static void main(String args[])
{
	kabadi k=new kabadi();
	k.score();
	Sports s=new Sports();
	s.score();//it prints kabadi and Sports score method but not Soccer method
	/* we use public class kabadi extends Sports,Soccor then its going to be viewd as much as possible*/
			
}
}
