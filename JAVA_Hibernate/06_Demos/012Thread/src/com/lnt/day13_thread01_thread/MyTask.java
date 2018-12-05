/**
 * 
 */
package com.lnt.day13_thread01_thread;
/**
 * @author Smita
 *
 */
//Step 1: creating a thread by extending Thread class
public class MyTask extends Thread{
	public MyTask() {
		// TODO Auto-generated constructor stub
	}
	public MyTask(String name){
		super(name);
	}
	//Step 2: write the business logic in run method to be performed by the Thread
	//execution of a Thread
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" - "+i+" task completed..");
			//Thread.currentThread() - Thread[Thread-0,5,main] Thread[threadName,priority,method-name]
		}
	}
	public static void main(String[] args) {
		//Step 3: create the Thread Object
		Thread t1 = new MyTask();//thread is created
		t1.setName("t1");
		Thread t2 = new MyTask("t2");//thread is created by passing string thread-name
		Thread t3 = new MyTask("t3");//thread is created by passing string thread-name
		
		System.out.println(" is thread alive before calling start() ? ----- "+t1.isAlive());
		//when we start the thread then it becomes alive
		//Step 4: invoke start() method the Thread Object which will give call back to run()  method
		t1.start();//callback is given to run() method by operating system
		System.out.println(" is thread alive after calling start() ? ----- "+t1.isAlive());
		//thread execution is taken care by OS , as jvm is running on top of OS	
		t2.start();//in order to run the thread we have to invoke start method		
		t3.start();//in order to run the thread we have to invoke start method
	}
//in multi-threaded program the output is un-predictable,because the thread execution is taken care by OS
}
