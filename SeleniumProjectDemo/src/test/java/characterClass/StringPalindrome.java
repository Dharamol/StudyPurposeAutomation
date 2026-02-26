package characterClass;

public class StringPalindrome {
	public static void main(String[] args) {
		String a ="Ayr87HGvwh)*(&";
		a=a.replaceAll("[^a-zA-Z]", "").toLowerCase();
		System.out.println(a);
		StringBuilder value = new StringBuilder(a);
		StringBuilder reverse = new StringBuilder(a).reverse();
		
		System.out.println(value);
		System.out.println(reverse);
		if(value.toString().equals(reverse.toString()))
				{
			System.out.println("The string is palindrome");
				}
		else
		{
			System.out.println("The string is not a palindrome");
		}	
		
	}

}
