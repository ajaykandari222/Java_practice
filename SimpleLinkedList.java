package LinkedList;

public class SimpleLinkedList {
    Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){this.data= data; next = null;}
	
	}
	
	void print() {
		Node N = head;
		while( N != null) {
			System.out.println(N.data);
			N= N.next;
		}
	}

	public static void main(String[] args) {
		SimpleLinkedList L = new SimpleLinkedList();
		L.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);

	
	L.head.next = second ;
	L.head.next.next =   third;
	L.print();
	
	
	
	}
}
