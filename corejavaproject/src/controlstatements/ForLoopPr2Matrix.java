package controlstatements;

public class ForLoopPr2Matrix {
	public static void main(String[] args) {
		int i;
		int j;
		int num=1;
		char ch='A';
		for(i=1;i<=3;i++)
		{
			for(j=1;j<=3;j++)
			{
				System.out.print(" "+ch+""+num+" "); ch++;  num++;
//				System.out.print(ch); ch++;
//				System.out.print(num);  num++;
			}
			System.out.println();
		}
		
	}

}