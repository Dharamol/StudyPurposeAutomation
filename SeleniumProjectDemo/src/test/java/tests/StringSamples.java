package tests;

public class StringSamples {
	public static void main(String[] args) {
		String a="88348hqvvqf8";
		StringBuilder value = new StringBuilder();
		for(int i=0;i<a.length();i++)
		{
			if(Character.isLetter(a.charAt(i)))
			{
				value.append(a.charAt(i));
			}
			
		}
		System.out.println(value);
		
	}

}
