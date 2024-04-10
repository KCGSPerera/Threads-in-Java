package Daemon_threads;


public class Ex01 implements Runnable{

	public static void main(String[] args) {
		
		Ex01  ex01 = new Ex01();
		
		Thread t1 = new Thread(ex01);
		t1.setName("Thread1");
		t1.setDaemon(true);
		t1.start();
		
		System.out.println("Starting " + Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("After " + Thread.currentThread().getName());

		
	}
	
	public void run() {
		
		System.out.println("Starting " + Thread.currentThread().getName());
		
		try {
			System.out.println("As Thread 1 is a Daemon Thread, Rest of the Thread will not be executed");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " = " + i);
		}
		System.out.println("After " + Thread.currentThread().getName());
		
	}
}
