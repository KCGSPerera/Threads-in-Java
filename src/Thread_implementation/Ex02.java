package Thread_implementation;

public class Ex02 extends Thread{

	public static void main(String[] args) {
		
		Ex02 ex2 = new Ex02();
		ex2.start();
		
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
		
		System.out.println("Starting new Thread");
		
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " = " + i);
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("After new Thread");

	}

}
