import java.util.Scanner;
class Main
{
  public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
    int a=1;
		int n = in.nextInt();
		for(int cur_row =1; cur_row <= n; cur_row++) {
			for(int cur_col=1; cur_col <= cur_row ; cur_col++) {
              if(a%2==0)
              {
                System.out.print('#');
                a++;
              }
              else
              {
                System.out.print('*');
                a++;
              }
			}
    		System.out.print("\n");
		}
	}
}