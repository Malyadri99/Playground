import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner s=new Scanner(System.in);
      String s1=s.nextLine();
      String s2=s.nextLine();
      int parts=s.nextInt();
      int i;
      String s3=s1.replace(s1,s2);
      String temp[]=s3.split(" ",parts);
      for(i=0;i<temp.length;i++)
        System.out.println(temp[i]);
    }
}