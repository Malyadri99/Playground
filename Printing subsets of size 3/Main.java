import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      int index,index1,size,arr[],index2;
      Scanner s=new Scanner(System.in);
      size=s.nextInt();
      arr=new int[size];
      for(index=0;index<size;index++)
        arr[index]=s.nextInt();
      for(index=0;index<size-1;index++)
      {
        for(index1=index+1;index1<size;index1++)
        {
          for(index2=index1+1;index2<size;index2++)
           System.out.print("("+arr[index]+", "+arr[index1]+", "+arr[index2]+")"+" ");
         // System.out.println();
        }
        System.out.println();
      }
    }
}