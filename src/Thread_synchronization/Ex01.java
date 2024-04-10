package Thread_synchronization;


class Sample{
	
	public void display() {
		
		System.out.println("Before  " + Thread.currentThread().getName());
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " = " + i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("After  " + Thread.currentThread().getName());
	}
	
}


public class Ex01 implements Runnable{

	Sample sample;
	
	public Ex01(Sample sample) {
		this.sample =  sample;
	}
	
	public static void main(String[] args) {

		Sample sample = new Sample();
		
		Thread thread1 = new Thread(new Ex01(sample));
		thread1.start();
		
		Thread thread2 = new Thread(new Ex01(sample));
		thread2.start();
	}
	
	public void run() {
		
		sample.display();
	}

}
