package controlstatements;

public class WhileLoopPr4 {
	public static void main(String[] args) {
	int i=1;
	char ch;
	
	while(i<=20)
	{
		System.out.print(i);
		if(i%3==0)
		{
			System.out.print("Java");
		}
		System.out.println();
		i++;
	}
}
}
