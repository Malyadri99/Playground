import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      int n;
      Scanner s = new Scanner(System.in);
      n= s.nextInt();
      int sq = square(n);
      System.out.println(sq);
        
	} 
 static int square(int n)
  {
    return n*n;
  }
}