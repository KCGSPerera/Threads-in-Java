package Thread_implementation;


// Thread Implementation by extending thread class

public class Ex_01 extends Thread{

	public static void main(String[] args) {
		
		System.out.println("Starting main thread");
		
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " = " + i);
		}
		
		System.out.println("After main Thread");
		
		Ex_01 ex_01 = new Ex_01();
		ex_01.start();
	}
	
	public void run() {
		
		System.out.println("Starting new Thread");
		
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " = " + i );
		}
		
		System.out.println("After new Thread");
	}

}
