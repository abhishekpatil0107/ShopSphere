package mvc;

public class RestoBean 
{
	private String c_id;
	private String c_item;
	private String price;
	private String feedback;
	
	public String getPrice()
	{
		return price;
	}
	public void setPrice(String price)
	{
		this.price = price;
	}
	public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	public String getC_item() {
		return c_item;
	}

	public void setC_item(String c_item) {
		this.c_item = c_item;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	@Override
	public String toString()
	{
		return "RestoBean [c_id=" + c_id + ", c_item=" + c_item + ", price=" + price + ", feedback=" + feedback + "]";
	}

	
	
}
