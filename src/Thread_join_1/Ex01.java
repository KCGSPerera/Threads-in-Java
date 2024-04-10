package Thread_join_1;

public class Ex01 implements Runnable{

	public static void main(String[] args) {
		
		Ex01 ex01 = new Ex01();
		
		Thread thread1 = new Thread(ex01);
		thread1.start();
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread thread2 = new Thread(ex01);
		thread2.start();
		
		try {
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// main thread loop
		System.out.println("Before " + Thread.currentThread().getName());
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " = " + i );
		}
		System.out.println("After " + Thread.currentThread().getName());
	}
	
	public void run() {
		
		System.out.println("Before " + Thread.currentThread().getName());
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		System.out.println("After " + Thread.currentThread().getName());
	}

}
