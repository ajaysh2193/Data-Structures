package com.LinkedList;

public class RemDuplicatesUnSorted extends LinkedListsss {

	public static void main(String[] args) {
		LinkedListsss list = new LinkedListsss();
		list.head = new Node(10);
		list.head.next = new Node(12);
		list.head.next.next = new Node(11);
		list.head.next.next.next = new Node(11);
		list.head.next.next.next.next = new Node(12);
		list.head.next.next.next.next.next = new Node(11);
		list.head.next.next.next.next.next.next = new Node(10);

		System.out.println("Linked List before removing duplicates : \n ");
		list.printList(head);

		list.remove_duplicates();
		System.out.println("");
		System.out.println("Linked List after removing duplicates : \n ");
		list.printList(head);
	}

}

class LinkedListsss {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	void remove_duplicates() {
		Node ptr1 = null, ptr2 = null, dup = null;
		ptr1 = head;

		while (ptr1 != null && ptr1.next != null) {
			ptr2 = ptr1;

			while (ptr2.next != null) {

				if (ptr1.data == ptr2.next.data) {

					dup = ptr2.next;
					ptr2.next = ptr2.next.next;
					System.gc();
				} else {
					ptr2 = ptr2.next;
				}
			}
			ptr1 = ptr1.next;
		}
	}

	void printList(Node node) {
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

}