package javapackage;

public class Stringmain {

	public static void main(String[] args) {
		String URI = "/member/login";
		// 이와 같은 문자열이 있을때 login만 추출하고 싶다면?
		// 파일 경로에서 파일 이름만 추출한다던가 웹 요청 주소에서 공통되지 않은 부분 추출 할 때 사용
		//split을 이용하거나 indexof, substring을 이용하기도 함
		
		//split을 이용해서 배열을 만들고 가장 마지막에 있는 값을 출력
		String [] sp = URI.split("/");
		System.out.println(sp[sp.length-1]);
		
		// 마지막 /의 위치를 찾아서 그 다음부터 끝까지 분할해라
		int idx = URI.lastIndexOf("/");
		System.out.println(URI.substring(idx+1));
		
		
		//현재 운영체제가 windows인지 먼저 확인
		//os에 windows라는 문자열이 포함되어 있는지 확인하자.
		String os1 = System.getProperty("os.name");
		System.out.println(os1); // 이러면 windows10 이런식으로 나오니까...
		
		// 버전에 상관없이 이게 윈도우인질 알아야한다.
		idx = os1.toLowerCase().indexOf("windows");
		if(idx < 0) { // windows가 없다면 음수로 처리하니까
			System.out.println("not window");
		}
		else {
			System.out.println("it's window");
		}
		
		// 자바 버전 확인해보기 - 특정 버전은 뭐 다운해라 이럴 때 유용함
		String os2 = System.getProperty("java.version");
		System.out.println(os2);

	}

}
