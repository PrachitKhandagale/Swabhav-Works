package com.techlabs.prolinklist;

public class LinkList<T> {
	private Node<T> node;
	private int listCount;

	public LinkList(T t) {
		node = new Node(t);
		listCount = 0;
	}

	public void display() {
		Node<T> current = node;
		this.node=current;
		while (current.getNext() != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
		System.out.println(current.getData());
	}

	public void add(T d) {
		Node<T> end = new Node(d);
		Node<T> current = node;

		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(end);
		listCount++;
	}

	public void remove(T d) {
		Node<T> current = node;
		while (current.getNext() != null) {
			if (current.getNext().getData() == d) {
				current.setNext(current.getNext().getNext());
				listCount--;
			}
			current = current.getNext();
		}
	}

}
