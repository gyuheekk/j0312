package t2_nested3;

// 중첩클래스 : 로컬클래스
public class Test1 {
	int su = 500; 
	
	public Test1() {
		System.out.println("이곳은 Test1클래스 입니다."); 
	}
	
	public void modTest1() {
		System.out.println("이곳은 Test1클래스의 modTest1메소드 입니다."); 
	}
	
	public void modClass() {
		int atom = 900;
		System.out.println("이곳은 Test1클래스의 modClass()메소드 입니다.");
		System.out.println("이곳은 Test1클래스의 modClass()메소드안의 atom변수 입니다." + atom);
		
		class Aa { 
			int suA = 550;
			
			public Aa() {
				System.out.println("이곳은 중첩클래스 Aa클래스 입니다.");
			}
			
			public void modTest1A() {
				System.out.println("이곳은 Aa클래스의 modTest1A메소드 입니다."); 
			}
		}
		System.out.println("=====================================================");
	
		Aa aa = new Aa();
		System.out.println("중첩클래스 안의 suA : " + aa.suA);
		aa.modTest1A();
	}
	
	public void modClass2() {
		class Aa {}
	}
	
	public void modClass3() {
		class Bb {}
	}
}

class Aa {
	public Aa() {
		System.out.println("이곳은 Aa클래스 입니다.");
	}
}