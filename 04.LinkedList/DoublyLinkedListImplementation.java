class Node{

    public int data;
    public Node next;
    public Node prev;

    Node(){
        this.data=0;
        this.next=null;
        this.prev=null;
    }

    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class DoublyLinkedListImplementation{

    static Node head;

    public void arrToLinkedList(int[] arr){
        head = new Node(arr[0]);
        Node currNode = head;
        Node prevNode = null;

        for(int i=1;i<arr.length;i++){
            Node newNode = new Node(arr[i]);
            currNode.next= newNode;
            currNode.prev= prevNode;
            prevNode=currNode;
            currNode= newNode;
        }
    }

    public void addNodeToStart(int val){
        Node newNode = new Node(val);
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public void deleteNodeAtStart(){
        head=head.next;
        head.prev=null;
    }

    public void addNodeInMiddle(int index, int val){
        Node currNode = head;
        Node prevNode = null;
        Node newNode = new Node(val);
        int count = 1;    

        while(currNode != null && count != index-1){
            prevNode = currNode;
            currNode = currNode.next;
            count++;
        }

        Node temp = currNode.next;
        currNode.next = newNode;
        prevNode=currNode;
        newNode.next=temp;
        newNode.prev=prevNode;
    }

    public void deleteNodeInMiddle(int index){
        Node currNode = head;
        Node prevNode = null;
        int count = 1;

        while(currNode.next != null && count != index-1){
            prevNode=currNode;
            currNode = currNode.next;
            count++;
        }
        currNode.next = currNode.next.next;
        currNode.prev=prevNode;
    }

    public void addNodeToEnd(int val){
        Node newNode = new Node(val);
        Node currNode = head;
        Node prevNode = null;

        while(currNode.next != null){
            prevNode=currNode;
            currNode=currNode.next;
        }
        currNode.next=newNode;
        newNode.prev=prevNode;
    }

    public void deleteNodeToEnd(){
        Node currNode = head;
        while(currNode.next != null){
            currNode=currNode.next;
            if(currNode.next.next == null){
                currNode.next=null;
            }
        }
    }


    public void printLinkedList(Node head){
        Node currNode = head;

        while(currNode != null){
            if(currNode.next == null)
                System.out.print(currNode.data + " ");
            else
                System.out.print(currNode.data + " <--> ");
            currNode=currNode.next;
        }
    }



    public static void main(String [] args){

        System.out.println("\n\n********* start of main method *********\n\n");

        DoublyLinkedListImplementation dll = new DoublyLinkedListImplementation();
        int[] arr = {3,5,8,9,1,2,6};

        // Convert an array into doubly linked list
        dll.arrToLinkedList(arr);

        // print linked list before any operation
        System.out.println("Linked list before operation \n");
        dll.printLinkedList(head);
        System.out.println("\n\n");

        // Add node to the begining of linked list
        // dll.addNodeToStart(37);

        // Delete node at the start of linked list
        // dll.deleteNodeAtStart();

        // Add node in the middle of linked list
        // dll.addNodeInMiddle(2, 67);

        // delete node in the middle of linked list
        // dll.deleteNodeInMiddle(3);

        // Add node to the end of linked list
        // dll.addNodeToEnd(98);

        // delete node to the end of linked list
        dll.deleteNodeToEnd();

        // print linked list
        dll.printLinkedList(head);

        System.out.println("\n\n********* end of main method ***********\n\n");

    }

}