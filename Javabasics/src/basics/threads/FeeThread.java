package basics.threads;


public class FeeThread extends Thread{

	@Override
	public void run() {
		super.run();
		System.out.println("getting signature from fee dept");
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(200);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
