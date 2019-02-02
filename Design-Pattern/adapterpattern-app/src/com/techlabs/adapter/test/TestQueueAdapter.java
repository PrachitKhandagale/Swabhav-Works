package com.techlabs.adapter.test;

import com.techlabs.adapter.QueusAdapter;

public class TestQueueAdapter {

	public static void main(String[] args) {
		QueusAdapter<Integer> queueAdapter = new QueusAdapter<Integer>();
		queueAdapter.enqueue(10);
		queueAdapter.enqueue(20);
		queueAdapter.enqueue(30);
		System.out.println("Removed element:"+queueAdapter.dequeue());
		System.out.println("Count:"+queueAdapter.count());
		for (Integer i : queueAdapter) {
			System.out.println(i);
		}

		QueusAdapter<String> queueAdapter2 = new QueusAdapter<String>();
		queueAdapter2.enqueue("Prachit");
		queueAdapter2.enqueue("Vinod");
		queueAdapter2.enqueue("Ajay");
		System.out.println("Removed element:"+queueAdapter2.dequeue());
		for (String string : queueAdapter2) {
			System.out.println(string);
		}
	}
}
