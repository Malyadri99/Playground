import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      int n,i;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      int sum=0;
      for(i=1;i<=n;i++)
        sum+=i;
      System.out.println(sum);
	}
}