package diwithsetter;

public class Square
{
	Number no;

	public Number getNo() {
		return no;
	}

	public void setNo(Number no) {
		this.no = no;
	}
	public int sqr()
	{
		return no.getNo()*no.getNo();
	}

}
