/**
 * 
 */
package Com.Java;

/**
 * @author MY PC
 *
 */
public class Threadex extends Thread {
	@Override
	public void run() { 
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Selenium");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		Threadex t = new Threadex();
		t.run();
		
	}

}
