
public final class Aadhar {

	private final long uid;
	private final String retina;
	
	public Aadhar(long uid, String retina) {
		this.uid = uid;
		this.retina = retina;
	}

	public long getUid() {
		return uid;
	}

	public String getRetina() {
		return retina;
	}
	
	
	
	@Override
	public String toString() {
		return "Aadhar [uid=" + uid + ", retina=" + retina + "]";
	}

	public static void main(String[] args) {
		
		Aadhar a = new Aadhar(19283877281L, "Yes");
		System.out.println(a);
		
		
	}
	
}
