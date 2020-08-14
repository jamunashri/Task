import java.lang.*;
import java.io.*;

public class Shop {

	int custmer_id;
	String[] things= {"car","toy"};
	public void shop(int custmer_id)//there is no things* variable used here
	{
		System.out.println("Purchase by:" +custmer_id);
		System.out.println("Purchases are: "+things);//here is handling issue in String
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Shop sh=new Shop();
     String things=new String("car");
     System.out.println("Purchases are: "+things);
     sh.shop(10);
     
	}

}
