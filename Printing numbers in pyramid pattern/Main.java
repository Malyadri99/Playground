import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      int n,row_no,col_no;
      int number=1;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      for(row_no=1;row_no<=n;row_no++)
      {
        for(col_no=1;col_no<=(n-row_no);col_no++)
          System.out.print(" ");
        for(col_no=1;col_no<=row_no;col_no++){
          System.out.print(number+" ");
        number++;
        }
        System.out.println();
      }
          
    }    
}