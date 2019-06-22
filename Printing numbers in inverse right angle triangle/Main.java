import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int n,col_no,row_no;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      for(row_no=n;row_no>=1;row_no--)
      {
        for(col_no=row_no;col_no>=1;col_no--)
          System.out.print(col_no);
        System.out.println();
      }
          
	}
}