package javapackage;

public class Main {

	public static void main(String[] args) {
		// 미지정 자료형 1개를 갖는 클래스의 인스턴스 만들기
		Integer [] ar = {100, 200, 300};
		Generic <Integer> obj1 = new Generic<Integer>(ar);
		obj1.disp();
		
		String [] br = {"태연","종현"};
		//클래스를 만들때 사용한 E가 String으로 치환되어 동작
		Generic <String> obj2 = new Generic <String> (br);
		obj2.disp();

	}

}
