
public class Main {
	public static void main(String[] args) {
	Temp1 t1 = new Temp1();
	Temp2 t2 = new Temp2();
	t2.start();
	
	try {
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
	}
	for(int i = 0; i < 10; i++) {
		t1.countDown();
		System.out.println("thread 1: " + t1.getCountDown());
		t2.countDown();		
		System.out.println("thread 2: " + t2.getCountDown());

	}
	
	}
}
