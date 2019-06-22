import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      int size,index1,index2;
      Scanner s=new Scanner(System.in);
      size=s.nextInt();
      int arr[]=new int[size];
      for(index1=0;index1<size;index1++)
        arr[index1]=s.nextInt();
      int is_palindrome=0;
      index1=0;
      for(index2=size-1;index2>=0;index2--)
      {
        if(arr[index1]==arr[index2])
        {
          is_palindrome=1;
          index1++;
        }
        else
          is_palindrome=0;
      }
      if(is_palindrome==1)
        System.out.println("Yes");
      else
        System.out.println("No");
        
    }
}