package Thread_implementation;


public class Ex04 implements Runnable{

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new Ex04());
		thread1.start();
		
		Thread thread2 = new Thread(new Ex04());
		thread2.start();
		
		
		System.out.println("Starting main Thread");
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " = " + i);
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After main Thread");
	}
	
	public void run() {
		

		System.out.println("Starting new Thread : " + Thread.currentThread().getName());
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " = " + i);
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After new Thread : " + Thread.currentThread().getName());

	}

}
