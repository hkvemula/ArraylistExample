package MergeArrays;

import java.util.Scanner;

public class LinkList {

	class Node{
		String val;
		Node next;
		public Node(String val){
			this.val = val;
		}
	}

	static Node head = null;
	static Node tail = null;
	public void addNode(String val){
		if(head==null){
			Node temp = new Node(val);
			head = temp;
			tail = temp;
		}else{
			tail.next = new Node(val);
			tail = tail.next;
		}
	}
	public void printLinkedList(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.val+" ");
			temp = temp.next;
		}
	}

	public static void sortList() {  
		Node current = head, index = null;  
		String temp="";  
		if(head == null) {  
			return;  
		}  
		else {  
			while(current != null) {    
				index = current.next;  
				while(index != null) {    
					if(current.val.compareTo(index.val) >0) {  
						temp = current.val;  
						current.val = index.val;  
						index.val = temp;  
					}  
					index = index.next;  
				}  
				current = current.next;  
			}      
		}  
	} 

	public static void main(String[] args) {
		LinkList listImpl = new LinkList();
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the number of nodes of the single linked list:");
		int n = sn.nextInt();
		System.out.println("Enter the elements of the linked list:");
		for(int i = 0;i<=n; i++) {
			String str = sn.nextLine();
			listImpl.addNode(str);
		}
		sn.close();

		sortList();
		System.out.print("The elements of the linked list : ");
		listImpl.printLinkedList();
	}
}
