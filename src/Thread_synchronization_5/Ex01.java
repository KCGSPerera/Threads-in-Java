package Thread_synchronization_5;


//Using 2 new Sample objects toward with the Thread statement 
//If you are using 2 objects, have to use the "Sample.class" inside the synchronized block condition. (Instead of the "sample" object)

class Sample{
	
	public void display(Sample sample) {
		
		synchronized(Sample.class) {
			
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
				
		Thread thread1 = new Thread(new Ex01(new Sample()));
		thread1.start();
		Thread thread2 = new Thread(new Ex01(new Sample()));
		thread2.start();
	}
	
	public void run() {
		sample.display(sample);
	}


}

