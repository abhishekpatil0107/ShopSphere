package classandobject;

public class Book {
	int bid=45;
	String bname="Chhava";
	String lang="Marathi";
	String author="Shivaji Sawant";
	String publication="Mehta Publishing House";
	String cat="Historical";
	int price=500;
	
	public static void main(String[] args) {
		System.out.println("Book details are : ");
		Book b=new Book();
		System.out.println("ID          : "+b.bid);
		System.out.println("Name        : "+b.bname);
		System.out.println("Language    : "+b.lang);
		System.out.println("Author      : "+b.author);
		System.out.println("Publication : "+b.publication);
		System.out.println("Category    : "+b.cat);
		System.out.println("Price       : "+b.price);
	}

}
