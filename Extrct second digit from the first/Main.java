import java.io.*;
import java.util.*;
import java.lang.*;
class Main{
  public static void main(String args[])
  {
    int n;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    int m=0;
    while(n>10)
    {
      m=n%10;
      n/=10;
      
    }
    int second_dig=m;
    System.out.println(second_dig);
  }
}
    