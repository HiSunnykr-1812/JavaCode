package javatopic;

public class IndianTraffic implements Central {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Central a=new IndianTraffic();
		a.GreenGo();
		a.RedStop();
		a.YellowReady();
		
		IndianTraffic at=new IndianTraffic();
		at.walk();

	}

	@Override
	public void GreenGo() {
		// TODO Auto-generated method stub
		System.out.println("Traffic turn green and vechiles can start moving");
	}

	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		System.out.println("Traffice turn Red All the should stop");
	}

	@Override
	public void YellowReady() {
		// TODO Auto-generated method stub
		System.out.println("Traffic turn yellow All vechiles should be ready to move");
	}
	public void walk() {
		System.out.println("indian don't wait for any signal to walk through road :)");
	}

}
