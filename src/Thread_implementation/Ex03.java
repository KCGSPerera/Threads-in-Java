package Thread_implementation;

public class Ex03 extends Thread{

public static void main(String[] args) {
		
		Ex03 ex2 = new Ex03();
		Ex03 ex3 = new Ex03();	 
		ex2.start();
		ex3.start();
		
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
