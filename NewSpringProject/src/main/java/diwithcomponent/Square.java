package diwithcomponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Square 
{
	@Autowired
	Number no;

	public Number getNo() 
	{
		return no;
	}

	
	public int sqr()
	{
		return no.getNo()*no.getNo();
	}

}
