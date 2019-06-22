import java.io.*;
import java.lang.*;
import java.util.*;
class Main{
  public static void main(String args[])
  {
    int m,n;
    Scanner s = new Scanner(System.in);
    m=s.nextInt();
    n=s.nextInt();
    System.out.println(power(m,n));
  }
static  int power(int m,int n)
  {
    int pow=1;
    for(int i=0;i<n;i++)
    {
      pow = pow *m;
    }
    return pow;
  }
}
      