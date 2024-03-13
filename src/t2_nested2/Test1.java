package t2_nested2;

// 중첩클래스 : 인스턴스 멤버 클래스
public class Test1 {
	int su = 300; 
	
	public Test1() {
		System.out.println("이곳은 Test1클래스 입니다."); 
	}
	
	public void modTest1() {
		System.out.println("이곳은 Test1클래스의 modTest1메소드 입니다."); 
	}
	
	public static class Aa { 
		int suA = 400;
		static int suB = 450;
		
		public Aa() {
			System.out.println("이곳은 중첩클래스 Aa클래스 입니다.");
		}
		
		public void modTest1A() {
			System.out.println("이곳은 Aa클래스의 modTest1A메소드 입니다."); 
		}
		
		public static void modTest1B() {
			System.out.println("이곳은 Aa클래스의 modTestB메소드 입니다.");
		}
	}
}

class Aa {
	public Aa() {
		System.out.println("이곳은 Aa클래스 입니다.");
	}
}