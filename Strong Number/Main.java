import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int num,strong,i,dig,notstrong;
      Scanner s=new Scanner(System.in);
      num=s.nextInt();
      strong=num;
      int strong_num=0;
      notstrong=1;
      while(num>0)
      {
        dig=num%10;
        for(i=1;i<=dig;i++)
        {
          notstrong*=i;
        }
        strong_num+=notstrong;
        notstrong=1;
        num/=10;
      }
      if(strong==strong_num)
        System.out.println("Yes");
      else
        System.out.println("No");
      
	}
}