package com.lnt.day13_thread04_lifecycle;
//step 1 : implements Runnable
public class ThreadLifeCycle implements Runnable{
	//step 2 : @Override run
	@Override
	public void run() {
		for (int i = 1; i <=5; i++) {
			System.out.println("...OS invokes the run method and now the "
					+ "Thread is in running state");
			try {
				Thread.sleep(5000);
				System.out.println("... Thread is in blocked state state");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("... Thread  resumed from sleep and again is in running state");
		}		
	}

	public static void main(String[] args) {
		Runnable target = new ThreadLifeCycle();
		Thread t1 = new Thread(target, "T1");
		//thread is create and is int new state
		System.out.println("...Thread is create and is int new state");
		t1.start();
		System.out.println("...Thread started but not running, as it is in Runnable state");		
		System.out.println("...Thread completed its task and now.... Terminating");
	}
}
