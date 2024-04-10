package notify_thread_4;

// Using notifyAll() to notify all the wait() threads.

class WaitThread1 extends Thread{
	
	Ex01 ex01;
	
	public WaitThread1(Ex01 ex01) {
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


class WaitThread2 extends Thread{
	
	Ex01 ex01;
	
	public WaitThread2(Ex01 ex01) {
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
			ex01.notifyAll();
			System.out.println("After " + Thread.currentThread().getName());

		}
	}
}


public class Ex01 {

public static void main(String[] args) {
		
		Ex01 ex01 = new Ex01();
		
		WaitThread1 thread2 = new WaitThread1(ex01);
		thread2.setName("WaitThread1");
		thread2.start();
		
		WaitThread2 thread3 = new WaitThread2(ex01);
		thread3.setName("WaitThread2");
		thread3.start();
		
		NotifyThread thread1 = new NotifyThread(ex01);
		thread1.setName("NotifyThread");
		thread1.start();
	
	}
	
}

