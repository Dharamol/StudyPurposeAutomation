package project;

public class ContainsTets {
	public static void main(String[] args) {
		String s ="Hi dhara is it ok";
		boolean b=s.contains("hi");
		boolean c =s.equalsIgnoreCase("hi Dhara is it ok");
		System.out.println(b);
		System.out.println(c);
		boolean result =toComare("dhara");
		System.out.println(result);

	}
		
		public static boolean  toComare(String input)
		{
			boolean result =input.toLowerCase().matches(".*[aeiou]*.");  
			return result;
		}
	
		
	}

