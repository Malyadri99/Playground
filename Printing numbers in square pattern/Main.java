import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int n,i,j;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=n;j++)
        {
          System.out.print(i);
        }
        System.out.println();
      }
	}
}