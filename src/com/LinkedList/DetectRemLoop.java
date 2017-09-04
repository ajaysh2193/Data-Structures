package com.LinkedList;

public class DetectRemLoop extends LinkedList2 {

	public static void main(String[] args) {
		LinkedList2 list = new LinkedList2();
		list.head = new Node(50);
		list.head.next = new Node(20);
		list.head.next.next = new Node(15);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(10);

		head.next.next.next.next.next = head.next.next;
		list.detectAndRemoveLoop(head);
		System.out.println("Linked List after removing loop : ");
		list.printList(head);
	}
}

class LinkedList2 {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void detectAndRemoveLoop(Node node) {

		if (node == null || node.next == null)
			return;

		Node slow = node, fast = node;

		slow = slow.next;
		fast = fast.next.next;

		while (fast != null && fast.next != null) {
			if (slow == fast)
				break;

			slow = slow.next;
			fast = fast.next.next;
		}

		if (slow == fast) {
			slow = node;
			while (slow.next != fast.next) {
				slow = slow.next;
				fast = fast.next;
			}

			fast.next = null;
		}
	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
}
