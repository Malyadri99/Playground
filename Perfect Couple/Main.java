import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      int size,index1,index2,value,arr[];
      Scanner s=new Scanner(System.in);
      size=s.nextInt();
      arr=new int[size];
      for(index1=0;index1<size;index1++)
        arr[index1]=s.nextInt();
      value=s.nextInt();
      for(index1=0;index1<size;index1++)
      {
        for(index2=index1+1;index2<size;index2++)
        {
          int sum=arr[index1]+arr[index2];
          if(sum==value)
            System.out.println(arr[index1]+", "+arr[index2]);
        }
      }
      
    }
}