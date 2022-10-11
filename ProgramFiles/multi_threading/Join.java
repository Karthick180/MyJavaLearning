package multi_threading;

public class Join {

	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(()-> {
			for (int i=0;i<5;i++) {
				System.out.println("Hi "+Thread.currentThread().getPriority());
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		}, "Good thread");
		Thread t2 = new Thread(()-> {
			for (int i=0;i<5;i++) {
				System.out.println("Hello "+Thread.currentThread().getPriority());
				try {Thread.sleep(1000);}catch(Exception e) {}
			}
		}, " Bad thread"); // obj of runnable and thread name
		
		//Setting priority for thread scale is 1-10
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		// fetching the thread priority
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.start();
		try {Thread.sleep(10);}catch(Exception e) {}
		t2.start();
		
		System.out.println(t1.isAlive()); // to check your thread is running or not
		
		// joining our thread to main thread
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		
		System.out.println("Bye");

	}

}
