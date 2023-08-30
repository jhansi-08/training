public class RegExDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Jhansi"; // first character capital and minimum 4 characters
		String mobile = "9742957891";
		String email = "deeksha380@gmail.com";
		
		String nameRegex = "[A-Z]{1}[a-z]{3,}";
		String mobileRegxe = "[6-9]{1}[0-9]{9}";
		String emailRegex = "^(.+)@(\\S+)$";
		System.out.println(name.matches(nameRegex)?"Valid name":"Invalid name");
		System.out.println(mobile.matches(mobileRegxe)?"Valid Mobile":"Invalid mobile");
		System.out.println(email.matches(emailRegex)?"Valid email":"Invalid email");

	}

}
