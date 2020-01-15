package javapackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Arraystest {

	public static void main(String[] args) {

		// int > Integer와 String은 크기 비교가 가능해서 바로 정렬 가능
		/// Comparable은 인터페이스가 구현되어 있는지 확인

		// 정수배열 아무거나 생성
		int[] ar = { 30, 40, 50, 60, 10 };

		// 지저분하니까 정렬을 하자.
		Arrays.sort(ar);
		// iterator로 출력을 하자
		for (int temp : ar) {
			System.out.print(temp + "\t");
		}
		System.out.println("\n");

		// 문자 배열도 만들어 보자!
		String[] br = { "Red", "Black", "Grey", "Blue", "Green" };

		// 문자 배열도 지저분하니까 정렬하자.
		Arrays.sort(br);
		for (String temp2 : br) {
			System.out.print(temp2 + "\t");
		}
		System.out.println("\n");
		System.out.println("==================================");

		// 4.User class의 배열을 만들어보자
		// 인스턴스를 각각 만들어서 set으로 값을 넣어줘야 한다.
		User user1 = new User();
		user1.setNum(1);
		user1.setName("민호");
		user1.setScore(80);

		User user2 = new User();
		user2.setNum(2);
		user2.setName("종현");
		user2.setScore(100);

		User user3 = new User();
		user3.setNum(3);
		user3.setName("태민");
		user3.setScore(70);

		// 5. 만들어진 인스턴스를 배열에 담아보자
		User[] users = { user1, user2, user3 };

		// 6. 배열을 정렬해서 출력해보자!

		// Arrays.sort(users);

		// 7. 동적으로 바꿔보자
		Comparator<User> comp = new Comparator<User>() { // umimplemented impleted해주세요 하면 밑에 오버라이드 자동 생성

			@Override
			public int compare(User o1, User o2) {
				if (o1.getScore() > o2.getScore()) {
					return 1;
				} else if (o1.getScore() == o2.getScore()) {
					return 0;
				} else {
					return -1;
				}
			}
		};

		Scanner sc = new Scanner(System.in);
		System.out.print("정렬조건 선택(1.번호 2.이름 3.점수):");
		String select = sc.nextLine();
		Comparator <User> comp2 = null; // Comparator 초기값 셋팅 필요. 아무 값도 없으면 없는것과 같다.
		
		switch (select) {

		case "1":
			comp2 = new Comparator<User>() {
				@Override
				public int compare(User o1, User o2) {
					return o1.getNum() - o2.getNum(); // 두 점수를 빼서 -1,0,1만 나오면 돼!
				}
			};
			break;

		case "2":
			comp2 = new Comparator<User>() {
				@Override
				public int compare(User o1, User o2) {
					return o1.getName().compareTo(o2.getName()); //String은 CompareTo로 대소 비교가 가능하다.
				}
			};
			break;
			
		case "3":
			comp2 = new Comparator<User>() {
				@Override
				public int compare(User o1, User o2) {
					return o1.getScore() - o2.getScore();
				}
			};
			break;

		default:
			System.out.println("You put wrong key");
			System.exit(0);
		}

		// }Arrays.sort(users,comp);

		for (User user : users) { // User클래스의 1~6작업을 다하고 나야 이게 원하는 조건대로 정상출력된다!
			System.out.println(user);
		}

	}

}
