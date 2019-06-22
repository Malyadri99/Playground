import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      int m,n,i,j;
      Scanner s=new Scanner(System.in);
      m=s.nextInt();
      n=s.nextInt();
      for(i=m;i>0;i--)
      {
        for(j=n;j>0;j--)
        {
          if(i>=j)
            System.out.print(i);
          else
            System.out.print(j);
        }
        System.out.println();
      }
    }
}