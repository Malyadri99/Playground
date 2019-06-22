import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    int n,m,i;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    m=3;
    for(i=1;i<=n;i++)
    {
      System.out.print(i);
      if(i%m==0)
        System.out.print(",");
    }
  }
}