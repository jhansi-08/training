
public class Demo<Z> {

	private Z data;
	
	public Demo(Z data) {
		this.data = data;		
	}
	
	public Object getData() {
		return data;
	}
	
	public void setData(Z data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		
		Demo<String> d1 = new Demo<String>("Hola");
//		d1.setData(3.14);
		System.out.println(d1.getData());
		
		Demo<Integer> d2 = new Demo<Integer>(99);
//		d2.setData("Bonjour");
		System.out.println(d2.getData());
		
		Demo<Person> d3 = new Demo<Person>(new Person("kim", 11));
		System.out.println(d3.getData());
	}
}
