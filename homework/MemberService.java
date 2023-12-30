package homework;

import java.util.Scanner;

public class MemberService { //일처리
	private MemberDTO[]	arr = new MemberDTO[5];
	private int index = 0;
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("************");
			System.out.println("\t1. 가입");
			System.out.println("\t2. 출력");
			System.out.println("\t3. 수정");
			System.out.println("\t4. 탈퇴");
			System.out.println("\t5. 끝내기");
			System.out.println("************");
			System.out.print("\t번호: ");
			int input = sc.nextInt();
			
			if(input == 5) break;
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
			System.out.println("5명의 정원이 꽉 찼습니다.");
		} else {
			System.out.print("이름 입력: ");
			String name = sc.next();
			System.out.print("나이 입력: ");
			int age = sc.nextInt();
			System.out.print("핸드폰 입력: ");
			String phone = sc.next();
			System.out.print("주소 입력: ");
			String address = sc.next();
			
			MemberDTO member = new MemberDTO();
			member.setName(name);
			member.setAge(age);
			member.setPhone(phone);
			member.setAddress(address);
			
			arr[index++] = member;
		}
	}
	
	public void list() {
		System.out.println("이름\t나이\t핸드폰\t주소");
		for(int i=0; i<index; i++) {
			System.out.print(arr[i].getName()+"\t");
			System.out.print(arr[i].getAge()+"\t");
			System.out.print(arr[i].getPhone()+"\t");
			System.out.print(arr[i].getAddress()+"\t");
		}
	}

	public void update() {

	}

	public void delete() {

	}
	
	private boolean isFull() {
		if(index == arr.length-1) {
			return true;
		}else {
			return false;
		}
	}
}
