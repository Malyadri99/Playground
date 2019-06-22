import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      int base,exponent,i;
     Scanner s=new Scanner(System.in);
      base=s.nextInt();
      exponent=s.nextInt();
      i=1;
      int power=base;
      while(i<exponent)
      {
        power*=base;
        i++;
      }
      System.out.println(power);
    }
}