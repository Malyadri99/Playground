import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      int n,cur_row,cur_col;
      Scanner s = new Scanner(System.in);
      n=s.nextInt();
      for(cur_row=1;cur_row<=n;cur_row++)
      {
        for(cur_col=1;cur_col<=n;cur_col++)
        {
          if((cur_row%2==0) && (cur_col==1))
            System.out.print(cur_row+1);
         else if((cur_row%2!=0) && (cur_col == n))
           System.out.print(cur_row+1);
          else
            System.out.print(cur_row);
        }
        System.out.println();
      }
      
	}
}