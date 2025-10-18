package controlstatements;

public class WhileLoopPr2 {
	public static void main(String[] args) {
		int i=1;
//		int j=1;
		char ch='A';
		int num=1;
		
		while(i<=3)
		{
			int j=1;
			while(j<=3)
			{
				System.out.print(" "+num+""+ch+" ");
				num++;
				ch++;
				j++;
			}
			System.out.println();
			i++;
		}
		
		
	}

}
