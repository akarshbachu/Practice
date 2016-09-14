package practicepkg;

public class BlocksP {
	//non static block
	{
		System.out.println("nonstatic");
		
	}
	static{
		System.out.println("static");
	}
	static int a=10;
	BlocksP(int a){
		this.a=a;
		System.out.println("constructor"+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main");
		new BlocksP(a);
		
	}

}
