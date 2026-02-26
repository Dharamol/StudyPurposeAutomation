package characterClass;

public class CountOfchars {
	public static void main(String[] args) {
		String a="876hgdh)(#^jd";
		int letterCount=0,specialCount=0,digitCount=0;
		for(int i=0;i<a.length();i++)
		{
			if(Character.isLetter(a.charAt(i)))
			{
				letterCount++;
			}
			else if(Character.isDigit(a.charAt(i)))
			{
				digitCount++;
			}
			else
			{
				specialCount++;
			}
			
		}
		System.out.println("count of special char is "+specialCount +", count of digit is "+digitCount+" count of letter cont is "+letterCount);
		
	}

}
