package javapackage;

public class StringTest {

	public static void main(String[] args) {
		String str = "hello";
		String result = str + "java";
		str.toUpperCase();
		//str은 변화가 없음
		System.out.println(str);
		
		//문자열을 heap에 저장해서 내용을 변경 할 수 있는 클래스의 인스턴스 생성
		StringBuilder sb = new StringBuilder("Hello");
		
		// 얘가 복사를 한 건지 원본을 진짜 쓰는 건지 확인 : 해시코드를 찍어보자.
		System.out.println(System.identityHashCode(sb));
		sb.append("java");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		// 위 아래 hashcode값이 같으므로 현재 영역에서 작업했다는걸 알 수 있음
		// 공부할 때 해시코드 자주 활용 : 어떤 영역에서 작업중인지 확인
	}

}
