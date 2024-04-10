package Thread_synchronization_3;

//Using Synchronized block for synchronization

class Sample{
	
	public void display(Sample sample) {
		
		synchronized(sample) {
			
			System.out.println("Befor " + Thread.currentThread().getName());
			for(int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + " " +  i);
			}
			System.out.println("After " + Thread.currentThread().getName());

		}
	}
}

public class Ex01 implements Runnable{

	Sample sample;
	
	public Ex01(Sample sample) {
		this.sample = sample;
	}
	
	public static void main(String[] args) {
		
		Sample sample = new Sample();
		
		Thread thread1 = new Thread(new Ex01(sample));
		thread1.start();
		Thread thread2 = new Thread(new Ex01(sample));
		thread2.start();
	}
	
	public void run() {
		sample.display(sample);
	}

}
