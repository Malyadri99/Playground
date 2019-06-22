import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    int size,i,k;
    Scanner s=new Scanner(System.in);
    size=s.nextInt();
    int arr[]=new int[size];
    for(i=0;i<size;i++)
      arr[i]=s.nextInt();
    for(i=0;i<size;i++)
    {
      
      
        for(k=i+1;k<size;k++)
        {
          if(arr[i]<arr[k])
            System.out.println(+arr[i]+","+arr[k]);
        }
      
    }
            
  }
}