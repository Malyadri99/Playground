import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      int n,i;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      int fact=1;
      for(i=1;i<=n;i++)
        fact*=i;
      System.out.println(fact);
               
	}
}