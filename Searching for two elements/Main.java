import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      int size,sea_ele1,sea_ele2;
      Scanner s=new Scanner(System.in);
      size=s.nextInt();
      int a[]=new int[size];
      for(int index=0; index<size; index++)
      {
        a[index]=s.nextInt();
      }
      sea_ele1=s.nextInt();
      sea_ele2=s.nextInt();
      int index1=-1;
      int index2=-1;
      for(int index=0;index<size; index++)
      {
        if(a[index]==sea_ele1)
          index1=index;
        if(a[index]==sea_ele2)
          index2=index;
      }
      System.out.println(index1);
      System.out.println(index2);
        
    }
}