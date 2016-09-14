
interface xyz{
int add();	
public static int add1(){
	return 2+3;
}
}

interface abc{
	int add();
	public static int add1(){
		System.out.println("hello");
		return 2+3;
		
	}
}
public class InterfaceImplJava8 implements xyz,abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImplJava8 x=new InterfaceImplJava8();
		int z=x.add();
		System.out.println(z);
		int y=add1();
		System.out.println(y);
	}
	private static int add1() {
		// TODO Auto-generated method stub
		return 3+3;
	}
	public int add(){
		return 3+4; 
	 }

}
