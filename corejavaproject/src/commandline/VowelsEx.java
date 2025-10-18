package commandline;
//CommandLine is used when we want to give the input or write input 
//at runtime and read the output from console that time we can used
//Command Line arguments
public class VowelsEx
{
	public static void main(String[] args)   //its string array arguments
	{
		char ch=args[0].charAt(0);  //used this method cause i want to convert string to char
									//array elements into char array elements
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("Its vowel character");
		}
		else
		{
			System.out.println("Its not vowel char");
		}
	}

}
