package pack;

public class Wrapper {

	public static void main(String[] args) {
		// 기본형 정수 데이터를 참조형 Integer로 만들어보자
		Integer i = new Integer(100);
		i = 300; // 이것이 Autoboxing! 기본형을 참조형으로 자동 변환해주는 것
		
		//기본형을 참조형으로 표현할수있으니까 Object 클래스에는 다 때려 넣을 수 있다
		Object obj = 300;
		// obj는 Intgeger를 저장하기는 했지만 변수의 자료형이 object라서 
		// object의 것만 사용이 가능하다.
		// 즉 intValue()를 사용 못함
		// 원래 자료형에 있던 걸 사용하려면 강제로 원래 자료형으로 변환시켜야 한다.
		System.out.println(((Integer)obj).intValue());

	}

}
