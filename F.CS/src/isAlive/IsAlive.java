package isAlive;

public class IsAlive {

	public static void main(String[] args) {
		Main myThread = new Main();
//		System.out.println(myThread.isAlive());
//		System.out.println(myThread.activeCount());
		myThread.start();
		myThread.run();
//		System.out.println(myThread.activeCount());
	}

}
	
	class Main extends Thread {
		@Override
		  public void run() {
		    System.out.println("This code is running in a thread");
		  }
	}
