package practicepkg;
public class Practice1 {
	int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MIN_VALUE);
		xyz x=new xyz();
		x.abc();
		Practice1 p=new Practice1();
		//System.out.println(x.a);
	}
}
class xyz extends Practice1 {
	int a=100;
	void abc(){
		System.out.println(a);
		
		System.out.println(super.a);
	}
}
