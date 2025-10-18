package diwithsetter;

public class Cube
{
	Number no;

	public Number getNo() {
		return no;
	}

	public void setNo(Number no) {
		this.no = no;
	}
	public int cube()
	{
		return no.getNo()*no.getNo()*no.getNo();
	}

}
