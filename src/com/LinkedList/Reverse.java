package com.LinkedList;

public class Reverse extends LinkedLists {

	public static void main(String[] args) {

		LinkedLists lists = new LinkedLists();
		lists.head = new Node(85);
		lists.head.next = new Node(15);
		lists.head.next.next = new Node(4);
		lists.head.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		lists.printList(head);
		head = lists.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		lists.printList(head);
	}

}

// Reversing LinkedLists using Iteration
class LinkedLists {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	Node reverse(Node node) {
		Node prev = null;
		Node current = node;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
}