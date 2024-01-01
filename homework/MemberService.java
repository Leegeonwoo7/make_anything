package homework;

import java.util.Scanner;

public class MemberService { //일처리
	private MemberDTO[]	arr = new MemberDTO[2];
	private int index = 0;
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("************");
			System.out.println("1. 가입");
			System.out.println("2. 출력");
			System.out.println("3. 수정");
			System.out.println("4. 탈퇴");
			System.out.println("5. 끝내기");
			System.out.println("************");
			System.out.print("번호: ");
			int input = sc.nextInt();
			
			if(input == 5) {
				System.out.println("프로그램 종료");
				break;
			}
			else if(input == 1) {
				insert();
			}else if(input == 2) {
				list();
			}else if(input == 3) {
				update();
			}else if(input == 4) {
				delete();
			}
		}
	}

	public void insert() {
		Scanner sc = new Scanner(System.in);
		if(isFull()) {
			System.out.println(arr.length + " 명의 정원이 꽉 찼습니다.");
		} else {
			System.out.print("이름 입력: ");
			String name = sc.next();
			System.out.print("나이 입력: ");
			int age = sc.nextInt();
			System.out.print("핸드폰 입력: ");
			String phone = sc.next();
			sc.nextLine();
			System.out.print("주소 입력: ");
			String address = sc.nextLine();
			
			MemberDTO member = new MemberDTO();
			member.setName(name);
			member.setAge(age);
			member.setPhone(phone);
			member.setAddress(address);
			
			arr[index++] = member;
			System.out.println("1 row(s) created");
			
			
		}
	}
	
	public void list() {
		System.out.println("이름\t나이\t핸드폰\t\t주소");
		
		if(isEmpty()) {
			System.out.println("회원내역이 없습니다.");
			return;
		}
		for(int i=0; i<index; i++) {
			if(arr[i] != null) {
			System.out.print(arr[i].getName()+"\t");
			System.out.print(arr[i].getAge()+"\t");
			System.out.print(arr[i].getPhone()+"\t");
			System.out.println(arr[i].getAddress()+"\t");
			}
		}
	}

	public void update() {
		Scanner sc = new Scanner(System.in);
		int serch = -1;
		
		System.out.print("해당고객의 핸드폰번호 입력: ");
		String phoneNum = sc.next();
		
		for(int i=0; i<index; i++) {
			if(arr[i].getPhone().equals(phoneNum)) {
				serch = i;
			}
		}
		
		if(serch == -1) {
			System.out.println("해당 번호의 회원이 없습니다.");
			return;
		}
		
		System.out.print("수정 할 이름 입력: ");
		arr[serch].setName(sc.next());
		System.out.print("수정 할 나이 입력: ");
		arr[serch].setAge(sc.nextInt());
		System.out.print("수정 할 핸드폰 입력: ");
		arr[serch].setPhone(sc.next());
		sc.nextLine();
		System.out.print("수정 할 주소 입력: ");
		arr[serch].setAddress(sc.nextLine());
		
		System.out.println("1 row(s) updated");
		
	}

	public void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.print("핸드폰 번호 입력: ");
		String delPhone = sc.next();
		
		int delIndex = -1;
		
		for(int i=0; i<index; i++) {
			if(arr[i].getPhone().equals(delPhone)) {
				delIndex = i;
			}
		}
		if(delIndex == -1) {
			System.out.println("찾는 회원이 없습니다.");
		}
		arr[delIndex] = null;
		System.out.println("1 row deleted");
	}
	
	
	
	private boolean isFull() {
		if(index == arr.length) {
			return true;
		}else {
			return false;
		}
	}
	
	private boolean isEmpty() {
		if(index != arr.length) {
			return true;
		}else {
			return false;
		}
	}
}
