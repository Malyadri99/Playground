import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      int n,i;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      for(i=1;i<=n;i++)
      {
        if(i%2!=0)
          System.out.println(i);
      }
	}
}