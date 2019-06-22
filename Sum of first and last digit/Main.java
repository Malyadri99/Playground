import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int n;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      int m;
      m=n%10;
      int first_dig=m;
      while(n>0)
      {
        m=n%10;
        n/=10;
        
      }
      int last_dig=m;
      System.out.println(+first_dig+last_dig);
	}
}