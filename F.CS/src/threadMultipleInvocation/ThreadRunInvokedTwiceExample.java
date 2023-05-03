package threadMultipleInvocation;

class MyThread2 extends Thread {
	public void run()
	{
		System.out.println("Идэвхитэй урсгалын нэр: "
						+ Thread.currentThread().getName());
		System.out.println("run() метод дуудагдлаа.");
	}
}

public	class ThreadRunInvokedTwiceExample {
	public static void main(String[] args)
	{
		MyThread2 t = new MyThread2();
		t.run();
		t.run();
	}
}
