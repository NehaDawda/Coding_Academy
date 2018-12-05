package com.lnt.day13_thread03_join;
public class JoinDemo implements Runnable {
/* their are 2 threads
 * t1
 * t2 
 * t1 has to complete task from 1 to 50
 * and after completion of t1 task , 
 * then only t2 can start the completion of task 51 to 100
 */	
	@Override
	public void run() {
		String threadName= Thread.currentThread().getName();
		if(threadName.equals("T1")){
			for (int i = 1; i <=50; i++) {
				System.out.println(threadName+" - "+i+" task completed..");
				
			}
		}
		if(threadName.equals("T2")){
			for (int i = 51; i <=100; i++) {
				System.out.println(threadName+" - "+i+" task completed..");
				
			}
		}		
	}
	public static void main(String[] args) throws InterruptedException {
		Runnable target = new JoinDemo();
		Thread t1 = new Thread(target, "T1");
		Thread t2 = new Thread(target, "T2");
		t1.start();
		t1.join();//throws InterruptedException
		//It waits for a thread to complete its task.
		//(let t1 completed and the the current waiting thread will join the task after my completion)
		t2.start();
/*i want t2 to strat only when t1 has completed its task*/
		//this can be achieved using which method???
	}

}
