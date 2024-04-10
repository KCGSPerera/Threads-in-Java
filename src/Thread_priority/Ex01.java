package Thread_priority;

// Try adding different priorities to Threads.

public class Ex01 implements Runnable{

	public static void main(String[] args) {
		
		Ex01  ex01 = new Ex01();
		
		Thread t1 = new Thread(ex01);
		t1.setName("MAX");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		
		Thread t2 = new Thread(ex01);
		t2.setName("NORM");
		t2.setPriority(Thread.NORM_PRIORITY);
		t2.start();
		
		Thread t3 = new Thread(ex01);
		t3.setName("MIN");
		t3.setPriority(Thread.MIN_PRIORITY);
		t3.start();
		
	}
	
	public void run() {
		
		System.out.println("Starting " + Thread.currentThread().getName());
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " = " + i);
		}
		System.out.println("After " + Thread.currentThread().getName());
		
	}

}
