import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      int i,n,arm,notarm;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      notarm=n;
      arm=0;
      int l=String.valueOf(n).length();
     // div=java.lang.Math.pow(10,l);
      while(n>0)
      {
        
        int digit=n%10;
        arm+=java.lang.Math.pow(digit,l);
        n=n/10;
      }
     if(arm==notarm)
       System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}