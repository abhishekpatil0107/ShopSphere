package commandline;

public class ArithmeticSwitchEx 
{
	public static void main(String[] args) 
	{
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		char op=args[2].charAt(0);
		
		int result=0;
		switch(op)
		{
		case '+':result=num1+num2;
			System.out.println("Addition is : "+result);
			break;
		case '-':result=num1-num2;
		System.out.println("Sub is : "+result);
		break;
		case '*':result=num1*num2;
		System.out.println("Multi is : "+result);
		break;
		case '/':result=num1/num2;
		System.out.println("Div is : "+result);
		break;
		case '%':result=num1%num2;
		System.out.println("Rem is : "+result);
		break;
		default:System.out.println("Operator is invalid");
		}
		
	}

}
