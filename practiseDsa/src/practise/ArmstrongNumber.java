package practise;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int num=371;
      int copy=num;
      int lastDigit=0;
      int result=0;
      while(copy!=0) {
    	  lastDigit = copy%10;
    	  result+= Math.pow(lastDigit, 3);
    	  copy=copy/10;
      }
      if(result==num) {
    	  System.out.println("It is an Armsttrong number : " + num);
      }
      else {
    	  System.out.println("It is not an armstrong number : " +num);
      } 
	}

}
