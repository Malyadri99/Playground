import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      int size,index;
      Scanner s=new Scanner(System.in);
      size=s.nextInt();
      int arr[]=new int[size];
      for(index=0;index<size;index++)
        arr[index]=s.nextInt();
     java.util.Arrays.sort(arr);
      int miss_number;
      for(index=0;index<size;index++)
      {
        miss_number=index+1;
        if(arr[index]!=miss_number)
        {
          if(arr[index]>miss_number){
            System.out.println(+(miss_number));
            break;
          }
          else
            System.out.println(+(miss_number));
        }
      }
    }
}