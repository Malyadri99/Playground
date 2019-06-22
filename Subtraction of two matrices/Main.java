import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    int row,col,i,j;
    Scanner s = new Scanner(System.in);
    row=s.nextInt();
    col=s.nextInt();
    int a[][]=new int[row][col];
    int b[][]=new int[row][col];
    int diff[][]=new int[row][col];
    for(i=0;i<row;i++)
    {
      for(j=0;j<col;j++)
        a[i][j]=s.nextInt();
    }
    for(i=0;i<row;i++)
      for(j=0;j<col;j++)
        b[i][j]=s.nextInt();
    for(i=0;i<row;i++)
    {
      for(j=0;j<col;j++)
      {
        diff[i][j]=a[i][j]-b[i][j];
        System.out.print(diff[i][j]+" ");
      }
      System.out.println();
    }
      
  }
}