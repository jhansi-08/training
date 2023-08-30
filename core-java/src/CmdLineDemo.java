
public class CmdLineDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (String a : args) {
			System.out.println(a);
			
		}
		int x=5;
		Integer xo=x;  //Boxing 
		int z=xo;  //Unboxing
		System.out.println(x+xo*z); //This one here, Boxing and Unboxing together is called Auto-boxing
		System.out.println(Integer.parseInt());
		
		

	}

}
