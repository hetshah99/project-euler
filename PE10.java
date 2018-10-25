
 public class PE10 {
	 static boolean is(long n) {
			
			int sqrt=(int)Math.sqrt(n)+1;
			for(int i=2;i<sqrt;i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
	 }
    public static void main(String args[]) {
      long ans=0;
      
      for(long i=2;i<2000000;i++) {
    	  if(is(i)) {
    		 System.out.println(i);
    		  ans=ans+i;
    	  }
      }
      System.out.println(ans);
    }
}