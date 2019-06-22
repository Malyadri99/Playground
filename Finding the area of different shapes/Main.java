import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      int choice;
      Scanner s=new Scanner(System.in);
      choice=s.nextInt();
      switch(choice)
      {
        case 1:
          int side;
          side=s.nextInt();
          int area;
          area=side*side;
          System.out.print(area);
          break;
        case 2:
          int length, breadth;
          length=s.nextInt();
          breadth=s.nextInt();
          int area1;
          area1=length*breadth;
          System.out.print(area1);
          break;
        case 3:
          int base,height;
          base=s.nextInt();
          height=s.nextInt();
          double area3;
          area3=(base*height)/2;
          System.out.print(area3);
          break;
        case 4:
          int radius;
          radius=s.nextInt();
          double area2;
            area2=3.14*radius*radius;
          System.out.println(area2);
          break;
      }
     
    }
}