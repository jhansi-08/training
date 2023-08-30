
public class EmailValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Rule 1-Min 4 chars before @
		// Rule 2-Min 3 chars between @ and .
		// Rule 3-Min 2 chars after .
		// Rule 4-Only 1 occurrence of @ and . is allowed
		// Note : No regular expressions allowed 
		String email="zuba@gmail.com";
		// rule 1 : check for index of '@'
		// rule 2 : index of '.'-index of '@'
		// rule 3 length - val1
		int val=email.indexOf('@');
		int val1=email.indexOf('.');
		String a=email.substring(val+1, val1);
		int count=0;
		if (val>=4 && a.length()>=3 && ((email.length()-val1)-1)>=2){
			for ( int i=0;i<email.length();i++){
				if (email.charAt(i)=='@' || email.charAt(i)=='.'){
					count++;
				}
			}
			if(count==2) {
				System.out.println("A valid email ID");
			}	
		}
		else{
			System.out.println("Not a valid email ID");
		}					
	}
}
