import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    int n,index;
    boolean batch=true;
    Scanner s = new Scanner(System.in);
    n=s.nextInt();
    int a[]= new int[n];
    for(index=0;index<n;index++)
    {
      a[index]=s.nextInt();
    }
    int sum=a[0]+a[1]+a[2];
    for(index=3;index<n;index+=3)
    {
      int cur_sum=a[index]+a[index+1]+a[index+2];
      if(sum!=cur_sum)
        batch=false;
    }
    if(batch==true)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}