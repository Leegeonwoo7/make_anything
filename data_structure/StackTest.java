package data_structure;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		for(int i=1; i<=5; i++) {
			stack.push(i);
		}
		System.out.println(stack);
		System.out.println("검색한 값: " + stack.search(3));
		
		int random = (int)(Math.random() * 5) + 1;
		System.out.println(random);
		
		for(int i=1; i<=random; i++) {
			stack.pop();
		}
		
		if(stack.isEmpty()) {
			System.out.println("스택메모리가 비어있습니다.");
		}else {
			System.out.println("스택메모리 안에 값이 있습니다.");
		}
	}
}
