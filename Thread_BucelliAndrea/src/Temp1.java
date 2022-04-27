
public class Temp1 extends Thread {
	private int count = 10;

	public void countDown() {
					
		count--;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		

	public int getCountDown() {
		return count;
	}
}
