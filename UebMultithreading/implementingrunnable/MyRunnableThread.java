package UebMultithreading.implementingrunnable;

import com.sun.swing.internal.plaf.synth.resources.synth;

class MyRunnableThread implements Runnable {

	public static int myCount = 0;

	public MyRunnableThread() {

	}

	public void run() {
		while (MyRunnableThread.myCount <= 10) {
			try {
				System.out.println("Neben-Thread: "
						+ (++MyRunnableThread.myCount));
				Thread.sleep(100);
			} catch (InterruptedException iex) {
				System.out.println("Exception in thread: " + iex.getMessage());
			}
		}
	}
}
