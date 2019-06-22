import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int n;
      Scanner s = new Scanner(System.in);
      n = s.nextInt();
      prime(n);
	}
  static void prime(int n)
  {
    int i,j,count;
    for(i=2;i<=n;i++)
    {
      count =0;
     for(j=2;j<=n;j++)
     {
       if(i%j==0)
         count++;
     }
    if(count<2)
      System.out.println(i);
    }
  }
 
      
}