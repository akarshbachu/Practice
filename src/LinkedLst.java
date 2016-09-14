//structure of node
public class LinkedLst {
	
	public int data;
	public LinkedLst next;
	
	public LinkedLst(int data,LinkedLst next){
		this.data=data;
		this.next=next;
	}
	//this will return the content of node
	public String toString(){
		return data+"";
	}
	
}
class LkdList{
	static LinkedLst head=null;
	public static void main(String[] args) {
		
		insert(10);
		insert(20);
		insert(30);
		display();
	}
		public static void insert(int data){
		
		LinkedLst front=new LinkedLst(data,null);
		if(head==null){
			head=front;
			front.next=null;
		}
		else{
			front.next=head;
			head=front;
		}
		
	}
		public static void display(){
			LinkedLst front=head;
			while(front!=null){
				System.out.println(front);
				front=front.next;
			}
		}
	
}
