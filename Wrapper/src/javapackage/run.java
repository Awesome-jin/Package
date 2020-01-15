package javapackage;

import java.io.IOException;

public class run {

	public static void main(String[] args) {
		// Runtime 클래스의 인스턴스 2개 생성
		
		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();
		
		//해시코드 출력
		System.out.println("r1:" + System.identityHashCode(r1));
		System.out.println("r2:" + System.identityHashCode(r2));
	
		//메모장을 실행해보자
		// 메모장  실행 파일 뒤에 경로를 붙이면 해당 파일이 열린다
		try {
			r1.exec("notepad.exe C:\\doit\\memo.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
