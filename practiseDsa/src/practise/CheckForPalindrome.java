package practise;

public class CheckForPalindrome {

	public static void main(String[] args) {
		// check for
		String pal = "Chethan";
		String res ="";
		for(int i=pal.length()-1;i>=0;i--) {
			res+=pal.charAt(i);
		}
        if(res.equals(pal)) {
        	System.out.println("String is palindrome");
        }
        else {
        	System.out.println("String is not a palindrome");
        }
	}

}
