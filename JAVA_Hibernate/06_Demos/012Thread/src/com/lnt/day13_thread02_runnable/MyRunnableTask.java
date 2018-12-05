package com.lnt.day13_thread02_runnable;
//Step 1: creating a thread by extending Thread class
public class MyRunnableTask implements Runnable{
	//Step 2:Override the run method and write the business logic in it to be performed by the Thread
	@Override
	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i+" task completed..");
			//Thread.currentThread() - Thread[Thread-0,5,main] Thread[threadName,priority,method-name]
			try {
				Thread.sleep(2000);//1000 milisec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//sleep method is static method of Thread clss
			//it makes the thread sleep for the specific time (long milisec)
			//it throws InterruptedException , therefore must be wrapped in try-catch block
		}
	}
	public static void main(String[] args) {
		//Step 3: create the Runnable Object
		Runnable target = new MyRunnableTask();//runnable target is created
		//Step 4: create the Thread Object by passing the runnable reference
		// public Thread(Runnable target) {}
		Thread t1 = new Thread(target);//thread is created with runnable target		
		t1.setName("t1");
	    //Step 5: invoke start() method the Thread Object which will give call back to run()  method
		t1.start();
		Thread t2 = new Thread(target,"t2");//thread is created with runnable target and thread-name
		t2.start();
		Thread t3 = new Thread(target,"t3");//thread is created with runnable target and thread-name
		t3.start();
	}
}
