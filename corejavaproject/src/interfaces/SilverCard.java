package interfaces;
import java.util.*;
public class SilverCard implements CreditCardInterface{
	private int cardno;
	private String cardHolderName;
	private double cardBalance;
	Scanner sc=new Scanner(System.in);
	
	public void payCard()
	{
		System.out.println("Enter Amount: ");
		int amt=sc.nextInt();
		cardBalance=cardBalance+amt;
	}
	
	public void useCard()
	{
		System.out.println("Enter Amount: ");
		int amt=sc.nextInt();
		if(amt<cardBalance)
		{
		cardBalance=cardBalance-amt;
		}
		else
		{
			System.out.println("Low Balance...");
		}
	}
	
	public void viewBalance() {
		System.out.println("Remaining balance is: "+cardBalance);
	}
	
	public void getData()
	{
		System.out.println("Enter card holder name: ");  cardHolderName=sc.nextLine();
		System.out.println("Enter card baalnce: ");  cardBalance=sc.nextDouble();
		System.out.println("Enter card no. : ");   cardno=sc.nextInt();
	}
	
	public void showCardDetails()
	{
		System.out.println("Card Holder Name:"+cardHolderName);
		System.out.println("Card number: "+cardno);
		System.out.println("Card Balance is: "+cardBalance);
	}
	
	
	
	

}
