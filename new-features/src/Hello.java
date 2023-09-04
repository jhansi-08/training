
@FunctionalInterface
public interface Hello {
	
	String sayHello();
		
	default String sayBye() {  // You cannot define a method inside an Interface, but if u add default error goes away
		return "Good Bye!";
	}
	
	static void greeting() {   // static methods can be defined inside inteface
		System.out.println("Good day!");
	}
}
