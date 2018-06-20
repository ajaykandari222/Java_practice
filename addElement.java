package LinkedList;

public class addElement {
	Node head;
	 static class Node{
		 int data;
		 Node next;
		 Node(int data){this.data = data; next = null;}
	 } 
     
	 void push(int data) {
		 Node N = new Node(data);
		 N.next =head;
		 head = N;
		}
	 
	 void append(int data) {
		 Node N = new Node(data);
		 if(head==null) {head = N; N.next = null;}
		 
	 }
	 void print() {
		 Node N = head;
		 while(N != null) {
			 System.out.println(N.data);
			 N =N.next;
			 
		 }
	 }
	 
	public static void main(String[] args) {
	   addElement AE = new addElement();
	   AE.push(1);
	   AE.push(2);
	   AE.push(3);
	  
	   AE.print();
	  
	}
	

}
