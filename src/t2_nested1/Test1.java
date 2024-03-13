package t2_nested1;

// 중첩클래스 : 인스턴스 멤버 클래스
public class Test1 {
	int su = 100; //필드
	
	public Test1() {
		System.out.println("이곳은 Test1클래스 입니다."); //생성자
	}
	
	public void modTest1() {
		System.out.println("이곳은 Test1클래스의 modTest1메소드 입니다."); //메소드
	}
	
	public class Aa { //중첩클래스
		//int su = 100; //독립된 클래스라서 위와 같은 필드를 써도 에러가 안 남
		int suA = 200;
		//static int suB = 250;
		
		public Aa() {
			System.out.println("이곳은 중첩클래스 Aa클래스 입니다.");
		}
		
		public void modTest1A() {
			System.out.println("이곳은 Aa클래스의 modTest1A메소드 입니다."); //메소드
		}
		
//		public static void modTest1B() {} //인트서ㄴ스객체 안에스 스테이틱 상ㅇ용 불가
	}
}

class Aa {
	public Aa() {
		System.out.println("이곳은 Aa클래스 입니다.");
	}
}