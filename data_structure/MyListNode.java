package data_structure;

public class MyListNode {
	private String data; //데이터를 저장하는 변수
	public MyListNode link; //다른 노드를 참조할 링크노드
	
	public MyListNode() {
		this.data = null;
		this.link = null;
	}
	public MyListNode(String data) {
		this.data = null;
		this.link = null;
	}
	public MyListNode(String data, MyListNode link) {
		this.data = data;
		this.link = null;
	}
	
	public String getData() {
		return this.data;
	}
}
