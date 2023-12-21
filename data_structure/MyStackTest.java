package data_structure;

public class MyStackTest {
	public static void main(String[] args) {
		MyStack myStack = new MyStack(5);
		myStack.push(5);
		myStack.push(6);
		myStack.printAll();
		myStack.peek();
		myStack.printAll();
		myStack.pop();
		myStack.printAll();
		myStack.pop();
		myStack.printAll();
		myStack.pop();
		myStack.push(4);
		System.out.println(myStack.serch(0));
		myStack.printAll();
		
		
	}
}
