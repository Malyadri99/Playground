import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int n;
      Scanner s = new Scanner(System.in);
      n= s.nextInt();
      int son=sum_of_numbers(n);
      System.out.println(son);
	}
  static int sum_of_numbers(int n)
  {
    return ((n)*(n+1))/2;
  }
}