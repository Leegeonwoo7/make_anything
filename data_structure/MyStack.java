package data_structure;

public class MyStack {
	int index;
	int size;
	int[] myStack;

	public MyStack(int size) {
		myStack = new int[size];
		index = -1;
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("메모리가 부족합니다.");
		}
		myStack[++index] = data;
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("메모리가 비어있습니다.");
		}else {
			System.out.println(myStack[index]);
			myStack[index--] = 0;	
		}
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("메모리가 비어있습니다");
		}else {
			System.out.println(myStack[index]);
		}
		
	}
	
	public int serch(int index) {
		if(isEmpty()) {
			System.out.println("메모리가 비어있습니다.");
		}
		return myStack[index];
	}
	
	public boolean isEmpty() {
		return (index == -1);
	}
	
	public boolean isFull() {
		return (index == myStack.length - 1);
	}
	
	public void printAll() {
		if(isEmpty()) {
			System.out.println("메모리가 비어있습니다.");
		}
		System.out.print("[ ");
		for(int num : myStack) {
			System.out.print(num + " ");
		}
		System.out.print("]");
		System.out.println();
	}
}
