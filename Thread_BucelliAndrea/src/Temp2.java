
public class Temp2 extends Thread {
	private int count = 10;


	public void countDown() {
		count --;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
		

	public int getCountDown() {
		return count;
	}
}
