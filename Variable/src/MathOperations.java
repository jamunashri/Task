
public class MathOperations {
	int i=100;
	int j=500;
	
	void show()
	{
		System.out.println(Math.max(i,j));
		System.out.println(Math.sqrt(i));
		System.out.println(Math.random());
		System.out.println((int)Math.random()*101);
		System.out.println(Math.abs(i));
		System.out.println(100<500);

		}
	public static void main(String[] args) {
		MathOperations m=new MathOperations();
		m.show();
		// TODO Auto-generated method stub
		}
}
