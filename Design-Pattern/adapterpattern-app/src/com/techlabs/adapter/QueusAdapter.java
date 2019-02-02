package com.techlabs.adapter;

import java.util.Iterator;
import java.util.LinkedList;

public class QueusAdapter<T> implements Iterable<T> {
	private LinkedList<T> queue = new LinkedList<T>();

	public void enqueue(T variable) {
		queue.addLast(variable);
	}

	public T dequeue() {
		return queue.removeFirst();
	}

	public int count() {
		return queue.size();
	}

	@Override
	public Iterator<T> iterator() {
		Iterator<T> iterator = queue.iterator();
		return iterator;
	}
}
