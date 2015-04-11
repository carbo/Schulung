package UebMultithreading.implementingrunnable;

public class BigCompanyThread {
 
	/**
	 * @author Crunchify.com
	 */
 
	public static void main(String args[]) {
		new ThreadTest("eBay").start();
		new ThreadTest("Paypal").start();
		new ThreadTest("Google").start();
	}
}
 

