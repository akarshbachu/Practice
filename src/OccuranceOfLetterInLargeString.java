
public class OccuranceOfLetterInLargeString {
	 public static void main(String[] args) {
	    	
	    	
	    	String testString="aaabcaa";
	    	long java8 = testString.chars().filter(ch -> ch =='a').count();
	    	System.out.println(java8);
	    }
}
