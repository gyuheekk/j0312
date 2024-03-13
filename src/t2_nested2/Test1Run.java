package t2_nested2;

public class Test1Run {
	public static void main(String[] args) {
		System.out.println("이곳은 Test1Run클래스의 main메소드 입니다.");
		System.out.println();
		
		Test1 t1 = new Test1();
		System.out.println("su : " + t1.su);
		t1.modTest1();
		System.out.println();
		
		new Aa(); //외부(일반)클래스
		System.out.println();
		
		Test1.Aa t1a = new Test1.Aa(); //정적 멤버 클래스(중첩클래스)
		System.out.println("suA : " + t1a.suA);
		t1a.modTest1A();
		t1a.modTest1B();
		System.out.println();
		
		System.out.println("suA : " + Test1.Aa.suB);
		Test1.Aa.modTest1B();
	}
}
