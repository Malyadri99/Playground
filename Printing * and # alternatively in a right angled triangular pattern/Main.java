import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      int n;
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
     int star_count=0; 
     int hash_count=0;
      int i,j;
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=i;j++)
        {
          if(star_count>hash_count){
            System.out.print("#");
            hash_count++;
          }
          else
          {
            System.out.print("*");
            star_count++;
          }
        }
        System.out.println();
      }
      
    }
}