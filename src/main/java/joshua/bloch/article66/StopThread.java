package joshua.bloch.article66;

import java.util.concurrent.TimeUnit;

// but in my computer with current version java. It does work!
public class StopThread {
	private static boolean stopRequested;

	public static void main(String[] args) throws InterruptedException {

		Thread backgroundTread = new Thread(new Runnable() {
			@Override
			public void run() {
				int i = 0;
				while (!stopRequested) {
					i++;
					System.out.println(i);
				}
			}
		});

		backgroundTread.start();
		TimeUnit.SECONDS.sleep(1);
		stopRequested = true;
	}

}
