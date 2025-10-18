package diwithconst;

public class Addition 
{
	private Data c;
	
	public Addition(Data c)
	{
		this.c=c;
		
	}
	public Data getC()
	{
		return c;
	}
	public int add()
	{
		return c.getA()+c.getB();
	}

}
