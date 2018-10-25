import java.util.Scanner;

 public class PE7 {

	static boolean is(long n) {
		int sqrt = (int) Math.sqrt(n) + 1; 
		for (int i = 2; i < sqrt; i++)
		{ if (n % i == 0) { 
		 return false;
			}
		}
		return true;
		}

	
    public static void main(String args[]) {
    	int i=0;
    	long n=2;
    	long p=0;
    	while(true) {
    		if(is(n)) {
    			i++;
    			p=n;
    		}
    		if(i==10001) {
    			break;
    		}
    		n++;
    	}
    	System.out.println(p);
    }
}