package practise;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2;
		int counter=0;
       for(int i=1;i<=num;i++) {
    	   if(num%i==0) {
    		   counter++;
    	   }
       }
       if(counter==2) {
    	   System.out.println("Number is prime : "+num);
       }
       else {
    	   System.out.println("Number is not prime : "+num);
       }
	}

}
