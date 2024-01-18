package java8;

interface Executable {
	void execute();
}

class Runner {
	public void run(Executable e) {
		System.out.println("Executing code block...");
		e.execute();
	}

}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runner runner = new Runner();
		runner.run(new Executable() {

			@Override
			public void execute() {
				// TODO Auto-generated method stub
				System.out.println("Hello there");

			}
		});
		System.out.println("******************//Lambda expression****************************");
		
		runner.run(()->System.out.println("this is lambda expression"));

	}
}
