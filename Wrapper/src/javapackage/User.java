package javapackage;

public class User implements Comparable<User> { // 4.Comparable은 Generic이니까 <>안에 똑같이 넣어줘야 함

	// 1. 번호,이름,점수를 하나로 저장하는 클래스를 만들어보자 : User
	private int num;
	private String name;
	private int score;

	@Override // 2. Getters and setters >> 3. toString() 여기까지가 기본 셋팅!
	public String toString() {
		return "User [num=" + num + ", name=" + name + ", score=" + score + "]";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(User o) { // 5.에러나있던 User에서 Add unimplemented method를 클릭하니까 오버라이딩 완료.
		// 6.어떤 비교를 하고 싶은지 재정의를 해주자.
		// 부등호 방향을 바꿔버리면 num의 내림차순으로 정렬이 가능하다.
		/*
		if (this.num > o.num) {
			return 1;
		} else if (this.num == o.num) {
			return 0;
		} else {
			return -1;
		}
		*/	
			return this.name.compareTo(o.name); //이름으로 비교하고 싶을땐 이 한 줄이면 끝난다. 
			// 가나다 역순으로 하고 싶다면 마지막에 * -1로 compareTo로 나온 값을 바꿔버림 된다.
		}
	}


