package pack;

public class System {

	public static void main(String[] args) {
		
		// 운영체제 버전 확인해보기
		System.out.println(System.getProperty("os.name"));
		//자바 버전 확인해보기
		System.out.println(System.getProperty("java.version"));
	}
}