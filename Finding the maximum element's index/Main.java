import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    int n,index;
   Scanner s=new Scanner(System.in);
    n=s.nextInt();
    int a[]=new int[n];
    for(index=0;index<n;index++)
      a[index]=s.nextInt();
    int max_index=0;
    for(index=1;index<n;index++)
    {
      if(a[max_index]<a[index])
        max_index=index;
    }
    System.out.println(max_index);
  }
}