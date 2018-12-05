
package com.lnt.day13_thread05_priority;
//Step 1: creating a thread by extending Thread class
public class ThreadPriority implements Runnable{
	//Step 2:Override the run method and write the business logic in it to be performed by the Thread
	@Override
	public void run() {		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()
					+" : Priority is : "+Thread.currentThread().getPriority()
					+" - "+i+" task completed..");
			//Thread.currentThread() - Thread[Thread-0,5,main] Thread[threadName,priority,method-name]			
		}
	}
	public static void main(String[] args) {
		//Step 3: create the Runnable Object
		Runnable target = new ThreadPriority();//runnable target is created
		//Step 4: create the Thread Object by passing the runnable reference
		// public Thread(Runnable target) {}
		Thread t1 = new Thread(target);//thread is created with runnable target		
		t1.setName("t1");
		Thread t3 = new Thread(target,"t3");//thread is created with runnable target and thread-name
		Thread t2 = new Thread(target,"t2");//thread is created with runnable target and thread-name
		t1.setPriority(10); //t1.setPriority(Thread.MAX_PRIORITY); -10
		//Step 5: invoke start() method the Thread Object which will give call back to run()  method
		t1.start();
		t3.setPriority(1);//MIN_PRIORITY -0
		t2.start();		//t2 is having default priority .... NORM_PRIORITY - 5
		t3.start();
		//the lowest priority thread which run in the background is known as Daemon Thread
		//we can set the daemon thread
		Thread t4= new Thread(target,"t4");
		t4.setDaemon(true);
		System.out.println("Is t4 a daemon thread : "+t4.isDaemon());
		System.out.println("Is t1 a daemon thread : "+t1.isDaemon());
		System.out.println("Is t3 a daemon thread : "+t3.isDaemon());
		//in java Garbage collector (GC)is a daemon thread , a utility which deallocated the memory of an 
		//object which no more longer in use and referring to null by invoking 
		//finalize method of Object class
	}
}