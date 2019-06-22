import java.util.*;
class Main
{
  public static void main(String args[])
  {
    // your code here
    int r,c,i,j;
    Scanner s=new Scanner(System.in);
    r=s.nextInt();
    c=s.nextInt();
    int a[][]=new int[r][c];
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
        a[i][j]=s.nextInt();
    }
    for(int k=0;k<c;k++)
    {
      for(i=0,j=k;i<c&&j<c;i++,j++)
        System.out.print(a[i][j]+" ");
      //System.out.println();
    }
  }
}