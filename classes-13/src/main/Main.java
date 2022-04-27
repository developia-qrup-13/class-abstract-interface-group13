package main;


public class Main {

	public static void main(String[] args) {

		User user=new User();
		user.name="Togrul";
		user.surName="Bedelov";
		user.age=25;
		System.out.println("Adınız " + user.name);
		System.out.println("Soyadınız " + user.surName);
		System.out.println("Yaşınız " + user.age);
		System.out.println(user.lastName(user.name, user.surName));
	
		System.out.println();
		System.out.println(user.hashCode());
		System.out.println(user.equals(user));
		System.out.println(user);
		
		
//		User.InnerClass innerClass=new User.InnerClass(); // static olan InnerClassın obyektinin yaradılması
		
		User.InnerClass innerClass=user.new InnerClass(); // static olmayan InnerClassın obyektinin yaradılması
		innerClass.a=1;
		System.out.println(innerClass.a);


	}

}
