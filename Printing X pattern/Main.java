import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      int n,cur_row,cur_col;
      Scanner s = new Scanner(System.in);
      n=s.nextInt();
      for(cur_row=1;cur_row<=n;cur_row++)
      {
        for(cur_col=1;cur_col<=n;cur_col++)
        {
          if((cur_row == cur_col) || ( cur_row + cur_col == n+1))
            System.out.print("*");
          else
            System.out.print(" ");
        }
        System.out.println();
      }
	}
}