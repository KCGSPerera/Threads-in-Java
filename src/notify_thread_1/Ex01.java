package notify_thread_1;

// Using wait() and notify() methods in threads.

class WaitThread extends Thread{
	
	Ex01 ex01;
	
	public WaitThread(Ex01 ex01) {
		this.ex01 = ex01;
	}
	
	public void run() {
		synchronized (ex01) {
			System.out.println("Strting " + Thread.currentThread().getName());
			try {
				ex01.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			for(int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + " = " + i);
			}
			System.out.println("After " + Thread.currentThread().getName());

		}
	}
}


class NotifyThread extends Thread{
	
	Ex01 ex01;
	
	public NotifyThread(Ex01 ex01) {
		this.ex01 = ex01;
	}
	
	public void run() {
		synchronized (ex01) {
			System.out.println("Strting " + Thread.currentThread().getName());
			ex01.notify();
			System.out.println("After " + Thread.currentThread().getName());

		}
	}
}

public class Ex01  {

	public static void main(String[] args) {
		
		Ex01 ex01 = new Ex01();
		
		WaitThread thread2 = new WaitThread(ex01);
		thread2.setName("WaitThread");
		thread2.start();
		
		NotifyThread thread1 = new NotifyThread(ex01);
		thread1.setName("NotifyThread");
		thread1.start();
	
	}
	

}
