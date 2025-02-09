
public class CircularLinkedList {
 
	class  Node{
		int data;
		Node next;
		
		
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	
	
	private Node head = null;
	private Node tail = null;
	
	public void insertElement(int element) {
		Node newNode = new Node(element);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
			head.next = head;
			
		}
		else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
			
		}
		
	}
	public void printList() {
		Node current = head;
		if(head == null) {
			System.out.println("list is empty");
		}
		else {
			System.out.print(current.data+ " ");
			while(current.next  != head) {
				current = current.next;
				System.out.print(current.data +" ");
			}
			System.out.println();
		}
		
	}
	public void removeElement() {
		Node current = head;
		if(head == null) {
			System.out.println("list is empty already");
		}
		else {
			System.out.println("removed "+ head.data+ " from list ");
			head = head.next;
			tail.next = head;
		}
	}	
}
