import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      int a,b,c,res,result;
      Scanner s = new Scanner(System.in);
      a=s.nextInt();
      b=s.nextInt();
      c=s.nextInt();
      res=gcd(a,b);
      result=gcd(res,c);
      System.out.println(result);
	}
  static int gcd(int x,int y)
  {
    int j=1;
    for(int i=1;i<=x && i<=y ; i++)
    {
      if((x%i==0)&&(y%i==0))
        j=i;
    }
    return j;
  }
    
}