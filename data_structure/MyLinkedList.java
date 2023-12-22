package data_structure;

public class MyLinkedList {
	public MyListNode head;
	
	MyLinkedList(){
		head = null;
	}
	
	//노드 삽입(중간에 삽입)
	public void insertNode(MyListNode preNode, String data) {
		MyListNode newNode = new MyListNode(data);
		
		newNode.link = preNode.link;
		preNode.link = newNode;
	}
	
	//노드 삽입(마지막에 삽입)
	public void insertNode(String data) {
		MyListNode newNode = new MyListNode(data);
		if(head == null) {
			this.head = newNode;
		}else {
			MyListNode tempNode = head;
			while(tempNode.link != null) {
				tempNode = tempNode.link;
			}
			tempNode.link = newNode;
		}
	}
	
	//노드 삭제(중간 노드)
	public void deletNode(String data) {
		MyListNode preNode = head;
		MyListNode tempNode = head.link;
		
		if(data.equals(preNode.getData())) {
			head = preNode.link;
			preNode.link = null;
		}else {
			while(tempNode != null) {
				if(data.equals(tempNode.getData())) {
					
				}
			}
		}
	}
}
