import java.lang.String;
public class StringOperation 
{
	void print()
	{
		String str="Hello";
		String[] name= {"Jamuna","Shri"};
		String trim="		jbadkjn jsdfh sfj";
		String para="					Welcome everyone \'hi\'"
				+ "warm greeting to all";
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.length());
		System.out.println(str.indexOf("l"));
		System.out.println(str.concat(name[0]));
		System.out.println(para);
		System.out.println(para.trim());
		System.out.println(trim.trim());
	}

public static void main(String[] args)
{
	StringOperation o=new StringOperation();
	o.print();
}
}
