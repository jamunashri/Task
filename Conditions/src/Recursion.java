public class Recursion {
  public static void main(String[] args) {
    int result = rec(5);
    System.out.println(result);
  }
  public static int rec(int k) {
    if (k<1) {
    		return 1;
    } 
    else
    {
        return k * rec(k - 1);
    }
  }
}
