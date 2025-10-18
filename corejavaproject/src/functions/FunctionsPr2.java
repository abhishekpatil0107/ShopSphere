package functions;
import java.util.Scanner;
public class FunctionsPr2 {
	Scanner sc=new Scanner(System.in);
	int n;
	int m;
	int i;
	public void input() {

		
		System.out.println("enter n");
		n=sc.nextInt();
		System.out.println("enter m");
		m=sc.nextInt();
//		double FunctionsPr2 = Math.pow(n , m);
//		System.out.println("result " +FunctionsPr2);
//		System.out.println("o/p is " );
		int result=1;
		for(i=n;i<m;i++) {
			result *=n;// result *=n is result = result*n
		}
		System.out.println("o/p is " +result);
		
	}
	public static void main(String[] args)
	{
		FunctionsPr2 F1= new FunctionsPr2();
		F1.input();
		
		
	}

}
