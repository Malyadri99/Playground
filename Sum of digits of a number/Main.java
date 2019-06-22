import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int n;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      int sum=0;
      int m;
      while(n>0)
      {
        m=n%10;
        sum+=m;
        n/=10;
      }
      System.out.println(sum);
	}
}