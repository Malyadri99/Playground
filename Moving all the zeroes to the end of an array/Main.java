import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      int size,index,arr[];
      Scanner s = new Scanner(System.in);
      size=s.nextInt();
      arr=new int[size];
      for(index=0;index<size;index++)
        arr[index]=s.nextInt();
      zeroes_at_end(size,arr);
      for(index=0;index<size;index++)
        System.out.print(arr[index]+" ");
          
    }
  public static void zeroes_at_end(int arr_size , int arr[])
  {
    int count=0;
    int index;
    for(index=0;index<arr_size;index++)
    {
      if(arr[index]!=0){
      int temp=arr[index];
      arr[index]=arr[count];
      arr[count]=temp;
      count++;
      }
    }
  }
}