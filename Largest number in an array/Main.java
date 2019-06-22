import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      int size,index;
      Scanner s= new Scanner(System.in);
      size=s.nextInt();
      int arr[]=new int[size];
      for(index=0;index<size;index++)
        arr[index]=s.nextInt();
      int max;
      max=arr[0];
      for(index=1;index<size;index++)
      {
        if(arr[index]>max)
          max=arr[index];
      }
      System.out.println(max);
    }
}