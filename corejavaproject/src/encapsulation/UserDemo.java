package encapsulation;

public class UserDemo {
public static void main(String[]args) {
		
		User u=new User();
		u.setUid(60);
		u.setFname("Abhi");
		u.setEmail("abhishekdpatil7187.com");
		u.setPassword("Laptop");
		
		
		System.out.println(u.getUid());
		System.out.println(u.getFname());
		System.out.println(u.getEmail());
		System.out.println(u.getPassword());
		
		User u1=new User(12,"asd","jdj@gmail.com","omi344");
		
		
		System.out.println(u1);
		
		
	}


}
