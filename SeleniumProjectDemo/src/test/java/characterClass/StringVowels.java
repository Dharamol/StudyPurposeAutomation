package characterClass;

public class StringVowels {
	public static void main(String[] args) {
		String s="lasdhyteqiuicvcasnljsiduwoeioqi";
		s= s.replaceAll("[^AEIOUaeiou]", "");
		System.out.println(s);
	}

}
