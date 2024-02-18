// Define Node class 
class Node{

	public int data;
	public Node next;

	// Constructor for node without value.
	Node(){
		this.data=0;
		this.next=null;
	}

	// Constructor for node with value.
	Node(int data){
		this.data=data;
		this.next=null;
	}
}


public class SingleLinkedListImplementation{

	// Creating a global head
	static Node head;

	// Converson of array to Linked list
	public void arrayToLinkedList(int[] arr){
		head = new Node(arr[0]);
		Node currNode = head;

		for(int i=1;i<arr.length;i++){
			Node tempNode = new Node(arr[i]);
			currNode.next = tempNode;
			currNode = tempNode;
		}
	}

	// Add element in the begning of the Linked list
	public void addNodeToStart(int x){
		Node newNode = new Node(x);
		newNode.next = head;	//connect new node to head.
		head=newNode;	// shift head to new node
	}

	// Delete head node from linked list
	public void deleteNodeToStart(){
		head = head.next;	// to delete just shift head node to next node.
	}

	// Add node at given position
	public void addNodeInMiddle(int i, int x){
		Node currNode = head;
		Node newNode = new Node(x);
		int count = 1;	// to track of node

		// get the position where we need to add node
		while(currNode !=null && count != i-1){
			currNode = currNode.next;
			count++;
		}
		
		Node temp = currNode.next;	// hold next node in temp node
		currNode.next = newNode;	// connect current node to new node
		newNode.next = temp;		// now, connect new node to next node
	}

	// delete node at given position
	public void deleteNodeInMiddle(int i){
		Node currNode = head;
		int count=1;

		// get the index which need to deleted
		while(currNode.next !=null && count != i-1){
			currNode = currNode.next;
			count++;
		}
		// after getting that node just connect that node its next node
		currNode.next = currNode.next.next;
		
	}

	// Add node at the end
	public void addNodeToEnd(int x){
		Node newNode = new Node(x);
		Node currNode = head;

		while(currNode.next != null){
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}

	// Delete last node of linked list
	public void deleteNodeToEnd(){
		Node currNode = head;
		while(currNode.next != null){
			currNode = currNode.next;
			// Make next node null
			if(currNode.next.next == null)
				currNode.next=null;
		}
		
	}

	

	public void printLinkedList(Node head){
		Node currNode=head;

		while(currNode != null){
			System.out.print(currNode.data + "-->");
			currNode = currNode.next;
		}
	}
	
	public static void main(String [] args){

		System.out.println("************* main method start ***********\n");

		SingleLinkedListImplementation singleLL = new SingleLinkedListImplementation();

		// Test Array to Linked List method.
		int [] arr = {4,3,6,7,9,8,1};
		singleLL.arrayToLinkedList(arr);

		// Print Linked List before any operation
		System.out.println("----- Before any operation LL -----\n");
		singleLL.printLinkedList(head);
		System.out.println("\n\n");


		// Test Add node in the start
		// singleLL.addNodeToStart(69);

		// Test delete node in the start
		// singleLL.deleteNodeToStart();

		// Add node in the middle
		// singleLL.addNodeInMiddle(2,33);

		// Delete node in middle 
		// singleLL.deleteNodeInMiddle(3);

		// Add node to the end
		// singleLL.addNodeToEnd(12);

		// Delete node at end
		singleLL.deleteNodeToEnd();

		// Print Linked List
		// System.out.println("----- After operation LL -----");
		singleLL.printLinkedList(head);

		System.out.println("\n\n************* main method end ***********");

	}
}