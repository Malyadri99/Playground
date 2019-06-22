import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      int a;
      Scanner s=new Scanner(System.in);
      a=s.nextInt();
      int b;
      b=a/100;
      int c;
      c=a%10;
      System.out.println(+(b+c));
	}
}