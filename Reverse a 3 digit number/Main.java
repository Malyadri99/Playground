import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    int n,a;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    for(int i=0;i<3;i++)
    {
      a=n%10;
      n=n/10;
      System.out.print(a);
    }
  }
}