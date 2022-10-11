package multi_threading;

class Hi extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
}

class Hello extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {}
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) { // main is also a thread
		Hi h = new Hi();
		Hello he = new Hello();

		h.start();
		try {Thread.sleep(10); }catch(Exception e) {}
		he.start();
	}

}
