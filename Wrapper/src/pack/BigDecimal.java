package pack;

public class BigDecimal {

	public static void main(String[] args) {
		// 실수 연산의 문제점을 알아보자
		double d1 = 1.6000000000000000000000000000;
		double d2 = 0.1000000000000000000000000000;
		System.out.println(d1+d2); // 1.7000002가 나온다!!!
		
		// 이런 문제를 해결하는게 BigDecimal이다.
		BigDecimal b1 = new BigDecimal("1.60000000000000000000000");
		BigDecimal b2 = new BigDecimal("0.10000000000000000000000");
		System.out.println(b1.add(b2));
		
		// 프로그래밍 언어와 DB를 연동하는 경우... DB가 정밀한 숫자를 저장하는 경우가 많음
		// float, double보다 BigDecimal로 받는게 더 좋다.

	}

}
