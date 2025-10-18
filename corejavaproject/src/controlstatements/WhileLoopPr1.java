package controlstatements;

public class WhileLoopPr1 {
	public static void main(String[] args) {
		int i=1;
		char ch='A';
		
		while(i<=26)
		{
			if(ch=='K')
			{
				System.out.println("Kop");
			}
			else
			{
				System.out.println(ch);
			}
			ch++;
			i++;
		}
		
	}

}
