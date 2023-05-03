package preventConcurrencyProblem;

public class Main extends Thread {
	  public static int amount = 0;

	  public static void main(String[] args) {
		  System.out.println(Thread.activeCount());
		    Main thread = new Main();
		    thread.start();
		    // Wait for the thread to finish
		    while(thread.isAlive()) {
		    System.out.println("Waiting...");
		    }
		    
//			  Main thread2 = new Main();
//			    thread2.start();
	  // Update amount and print its value
//	  System.out.println("Main: " + amount);
//	  amount++;
//	  System.out.println("Main: " + amount);
	  System.out.println(Thread.activeCount());
	  }
	  
	  
	  public void run() {
	    amount++;
	  }
	  
}