package thread.start;

class MyThread extends Thread {
	public void run()
	{
		System.out.println("Идэвхитэй урсгалын нэр: "
						+ Thread.currentThread().getName());
		System.out.println("run() метод дуудагдлаа.");
	}
}

 public class ThreadStartExample {
	public static void main(String[] args)
	{
		MyThread t = new MyThread();
		t.start();  // start() методыг дуудаж байна
	}
}
