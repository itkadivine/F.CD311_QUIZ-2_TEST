package thread.run;

class MyThread extends Thread {
	public void run()
	{
		System.out.println("Идэвхитэй урсгалын нэр: "
						+ Thread.currentThread().getName());

		System.out.println("run() метод дуудагдлаа.");
	}
}

public class ThreadRunExample {
	public static void main(String[] args)
	{
		MyThread t = new MyThread();
		t.run();
	}
}
