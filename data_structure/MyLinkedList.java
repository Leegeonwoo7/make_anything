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
	}
}
