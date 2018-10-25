 public class PE12 {
	 static long sum1(long n) {
		 long sum=0;
		 for(int i=1;i<=n;i++) {
			 sum=sum+i;
		 }
		 return sum;
	 }
	 static int no(long n) {
			int f=0;
					for(int i=1;i<=n;i++) {
						if(n%i==0) {
							f++;
						}
					}
			return f;
			
	 }
    public static void main(String args[]) {
System.out.println("hi");    
 int i=1;
     long s1=0;
    	while(true) {
    	 long sum=sum1(i);
    	 int f1=no(sum);
    	 if(f1>500) {
    		 s1=sum;    		
    		 break;
    	 }
    	 i++;
    	 
     }
System.out.println(s1);
    }
    }