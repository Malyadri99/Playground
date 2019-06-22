import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    int n,f;
    f=1;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    System.out.println(fact(n));
  }
  static int fact(int n)
  {
    if(n==1)
      return 1;
    else
      return n*fact(n-1);
  }
    
  
}