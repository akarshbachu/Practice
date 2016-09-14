package practicepkg;

public class StringsP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("hello");
		String s2=new String("hello");
		String s3=s;
		System.out.println(s3==s);//same address for both so true
		System.out.println(s==s2);// false because address is comparedd here both have diff address
		System.out.println(System.identityHashCode(s));//address
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println(s.equals(s2));
		
		System.out.println(s.codePointAt(0));
		System.out.println(s.concat("helllll"));//it just concats and display but old string is not modified
		System.out.println(s);
	}

}
