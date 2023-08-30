
public class RoughWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Jhansi@priya.com";
		int val=s.indexOf('@');
		int val1=s.indexOf('.');
		System.out.println(val);
		System.out.println(val1);
		String a=s.substring(val+1, val1);
		System.out.println(s.indexOf('@'));
		System.out.println(s.lastIndexOf('@'));
		

	}

}
