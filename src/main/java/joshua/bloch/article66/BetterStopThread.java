package joshua.bloch.article66;

import java.util.concurrent.TimeUnit;

public class BetterStopThread {
	private static boolean stopRequested;

	private static synchronized boolean stopRequested() {
		return stopRequested;
	}

	private static synchronized void requestStop() {
		stopRequested = true;
	}

	public static void main(String[] args) throws InterruptedException {

		Thread backgroundTread = new Thread(new Runnable() {
			@Override
			public void run() {
				int i = 0;
				while (!stopRequested()) {
					i++;
					System.out.println(i);
				}
			}
		});

		backgroundTread.start();
		TimeUnit.SECONDS.sleep(1);
		requestStop();
	}

}
