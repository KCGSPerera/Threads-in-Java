package Thread_yield;



public class Ex01 implements Runnable{

	public static void main(String[] args) {
		
		Ex01 ex01 = new Ex01();
		
		Thread thread1 = new Thread(ex01);
		thread1.start();
		
		Thread thread2 = new Thread(ex01);
		thread2.start();
		
		
		// main thread loop
		System.out.println("Before " + Thread.currentThread().getName());
		
		thread1.yield();  // why?
		
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
