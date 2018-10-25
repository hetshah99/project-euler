import java.util.Scanner;

 public class PE6 {

	
	
    public static void main(String args[]) {
    	long s1=0;
    	long s2=0;
    	for(int i=1;i<=100;i++) {
    		s2=s2+i;
    		s1=s1+(int)Math.pow(i, 2);
    	}
    	s2=(long)Math.pow(s2, 2);
    	System.out.println(s2-s1);
    }
}