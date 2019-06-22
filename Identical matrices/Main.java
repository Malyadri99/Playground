import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //your code here
    int r,c,i,j,flag;
    Scanner s=new Scanner(System.in);
    r=s.nextInt();
    c=s.nextInt();
    int a[][]=new int[r][c];
    int b[][]=new int[r][c];
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
        a[i][j]=s.nextInt();
    }
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
        b[i][j]=s.nextInt();
    }
    flag=0;
    for(i=0;i<r;i++)
    {
      for(j=0;j<c;j++)
      {
        if(a[i][j]!=b[i][j]){
          flag=1;
          break;
        }
      }
    }
    if(flag==0)
      System.out.println("Yes");
    else
      System.out.println("No");
        
  }
}