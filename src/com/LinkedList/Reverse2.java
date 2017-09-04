package com.LinkedList;

public class Reverse2 extends LinkedListss {

	public static void main(String[] args) {

		LinkedListss lists = new LinkedListss();
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

// Reversing LinkedLists using Recursion

class LinkedListss {

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
		if (node == null || node.next == null) {
			return node;
		}

		Node remaining = reverse(node.next);
		node.next.next = node;
		node.next = null;
		return remaining;
	}

	void printList(Node node) {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}

	}
}
