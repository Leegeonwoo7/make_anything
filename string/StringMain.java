package string;

public class StringMain {

	public static void main(String[] args) {
		String a = "apple"; //힙영역에 같은 주소에 할당되어 a,b모두 같은주소를 가지고있음
		String b = "apple";
		
		if(a==b) System.out.println("a와 b의 참조값은 같다.");
		else System.out.println("a와 b의 참조값은 다르다");
		if(a.equals(b)) System.out.println("a와 b의 문자열은 같다.");
		else System.out.println("a와 b의 문자열은 다르다.");
		System.out.println();
		
		String c = new String("apple"); //서로 다른 인스턴스를 참조하고있음.
		String d = new String("apple");
		
		if(c==d) System.out.println("c와 d의 참조값은 같다.");
		else System.out.println("c와 d의 참조값은 다르다");
		if(c.equals(d)) System.out.println("c와 d의 문자열은 같다.");
		else System.out.println("c와 d의 문자열은 다르다.");
		System.out.println();
		
		String e = "오늘 날짜는 " + 2023 + 12 +29;
		System.out.println("e = " + e);
		System.out.println("문자열의 크기 = " + e.length());
		System.out.println();
		
		System.out.println("5번째의 위치의 문자 = " + e.charAt(4)); //index는 0부터, 공백도 포함
		System.out.println("부분 문자열의 추출 = " + e.substring(7));
		System.out.println("부분 문자열의 추출 = " + e.substring(7, 11));
		
		System.out.println("대문자 변경 = " + "Hello".toUpperCase());
		System.out.println("대문자 변경 = " + "Hello".toLowerCase());
		
		System.out.println("문자열 검색 = " + e.indexOf("짜"));
		System.out.println("문자열 검색 = " + e.indexOf("20"));
		System.out.println("문자열 검색 = " + e.indexOf("fkdl"));
		
		System.out.println("문자열 치환 = " + e.replace("날짜", "일자"));
		

	}

}
