package interfaces;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		SilverCard s=new SilverCard();  s.getData();
		GoldenCard g=new GoldenCard();  g.getData();
		
		s.showCardDetails();
		g.showCardDetails();
		boolean i=true;
		while(i)
		{
			System.out.println();
			System.out.println("1. View GoldenCard Balance\n2. Credit Golden Card\n3. Debit from GoldenCard");
			System.out.println("4. View SilverCard Balance\n5. Credit Silver Card\n6. Debit from SilverCard");
			System.out.println("7.Exit");
			System.out.println();
			System.out.println("Enter your choice: ");
			int ch=sc.nextInt();
			
		switch(ch)
		{
		case 1: g.viewBalance();  break;
		case 2: g.payCard(); g.viewBalance();  break;
		case 3: g.useCard(); g.viewBalance();  break;
		
		case 4: s.viewBalance();  break;
		case 5: s.payCard();  s.viewBalance();  break;
		case 6: s.useCard();  s.viewBalance();  break;
		
		default : System.out.println("Invalid Choice...");
		
		case 7: i=false; break;
		}
		}
	}

}
