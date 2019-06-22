import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    int row,col,i,j;
    Scanner s=new Scanner(System.in);
    row=s.nextInt();
    col=s.nextInt();
    int a[][]=new int[row][col];
    for(i=0;i<row;i++)
      for(j=0;j<col;j++)
        a[i][j]=s.nextInt();
    for(i=0;i<row;i++)
    {
      for(j=0;j<col;j++)
      {
        System.out.print(a[j][i]+" ");
      }
      System.out.println();
    }
  }
}