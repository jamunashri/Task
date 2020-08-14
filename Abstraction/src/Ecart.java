
public class Ecart extends Abstract
{
	int custmer_id;
 public void purchase(int custmer_id)
 {
	 System.out.println(""+custmer_id);
 }
	
 public static void main(String args[])
 {
	Ecart e1=new Ecart();
	e1.purchase(12);
	e1.purchase();
 }
}
