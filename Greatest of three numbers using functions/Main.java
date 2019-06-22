import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int a,b,c;
      Scanner s = new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();
      c=s.nextInt();
      System.out.println(greatest_of_three(a,b,c));
	}
  static int greatest_of_three(int a, int b, int c)
  {
    int temp;
    if(a>b)
    temp=a;
    else
      temp =b;
    if(temp>c)
      return temp;
    else
      return c;
  }
}