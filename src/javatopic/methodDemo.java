package javatopic;

public class methodDemo {
	
	public void getdata() {
		System.out.println("method with creating objective");
	}
	
	public static void getdata2() {
		System.out.println("method without creating objective");
	}
	public static void getdata3() {
		System.out.println("method without creating objective 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodDemo d=new methodDemo();
		d.getdata();
		
		getdata2();
		
		getdata3();
		
		

	}

}
