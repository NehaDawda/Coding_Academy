/**
 * 
 */
package com.lnt.day13_thread045_producer_consumer;

/**
 * @author Smita
 *
 */

/*
 In computing, the producer–consumer problem (also known as the bounded-buffer 
 problem) is a classic example of a multi-process synchronization problem. 
 The problem describes two processes, the producer and the consumer, 
 which share a common, fixed-size buffer used as a queue.

The producer’s job is to generate data, put it into the buffer, and start again.
At the same time, the consumer is consuming the data (i.e. removing it from the buffer), 
one piece at a time.
Problem
To make sure that the producer won’t try to add data into the buffer if it’s full and 
that the consumer won’t try to remove data from an empty buffer.

Solution 
The producer is to either go to sleep or discard data if the buffer is full. 
The next time the consumer removes an item from the buffer, it notifies the producer, 
who starts to fill the buffer again. In the same way, 
the consumer can go to sleep if it finds the buffer to be empty. 
The next time the producer puts data into the buffer, it wakes up the sleeping consumer.
An inadequate solution could result in a deadlock where both processes are waiting to be awakened.
 */
//Java program to implement solution of producer 
//consumer problem. 
import java.util.LinkedList;

public class ProducerConsumer {
	public static void main(String[] args) throws InterruptedException {
		// Object of a class that has both produce()
		// and consume() methods
		final CakeShop cakeShop = new CakeShop();

		// Create producer thread
		Runnable p1 = new Producer(cakeShop);
		Thread t1 = new Thread(p1);

		// Create consumer thread
		Runnable c1 = new Consumer(cakeShop);
		Thread t2 = new Thread(c1);

		// Start both threads
		t1.start();
		t2.start();

	}
}

class Producer implements Runnable {
	private CakeShop cakeShop;

	public Producer(CakeShop cakeShop) {
		this.cakeShop = cakeShop;
	}

	@Override
	public void run() {
		try {
			cakeShop.produce();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class Consumer implements Runnable {
	private CakeShop cakeShop;

	public Consumer(CakeShop cakeShop) {
		this.cakeShop = cakeShop;
	}

	@Override
	public void run() {
		try {
			cakeShop.consume();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

// This class has a displayCounter, producer (adds items to displayCounter
// and consumber (removes items).
class CakeShop {
	// Create a displayCounter shared by producer and consumer
	// Size of displayCounter is 2.
	LinkedList<Integer> displayCounter = new LinkedList<>();
	int capacity = 2;

	// Function called by producer thread
	public void produce() throws InterruptedException {
		int cakeQuantity = 1;
		while (true) {
			synchronized (this) {
				// producer thread waits while displayCounter
				// is full
				while (displayCounter.size() == capacity)
					wait();

				System.out.println("Producer produced-" + cakeQuantity);

				// to insert the jobs in the displayCounter
				displayCounter.add(cakeQuantity++);

				// notifies the consumer thread that
				// now it can start consuming
				notify();

				// makes the working of program easier
				// to understand
				Thread.sleep(1000);
			}
		}
	}

	// Function called by consumer thread
	public void consume() throws InterruptedException {
		while (true) {
			synchronized (this) {
				// consumer thread waits while displayCounter
				// is empty
				while (displayCounter.size() == 0)
					wait();

				// to retrive the first job in the displayCounter
				int val = displayCounter.removeFirst();

				System.out.println("Consumer consumed-" + val);

				// Wake up producer thread
				notify();

				// and sleep
				Thread.sleep(1000);
			}
		}
	}
}
