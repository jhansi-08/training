
public class RoughWork {

	public static void main(String[] args) {
		int N = 1042;
		String x;
		x = Integer.toBinaryString(N);
		System.out.println(x);
		int count1=0;
		int count=0;
		outerloop:
		for(int i=0;i<x.length();i++)
		{
		   count=0;
		   if (x.charAt(i)=='1') {
			   
			   for(int j=i+1;i<x.length();j++) {
				   if (x.charAt(j)=='1') {
					   break outerloop;
				   }
				   else {
					   count++;
				   }
			   }
		   }
		   if(count1<count) {
			   count1=count;
		   }
		}
		System.out.println(count1);
	}
}
