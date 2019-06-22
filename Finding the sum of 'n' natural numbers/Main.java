import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      int n;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      System.out.print(snn(n));
       
    
}
static int snn(int n)
{
  if(n<=1)
    return n;
  return n+snn(n-1);
}
}
    