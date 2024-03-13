package t4_exception;

public class Exception1_ClassNotFount {
	public static void main(String[] args) {
		
		// java.lang.Object
		
		try {
			Class.forName("java.lang.Object2");
			System.out.println("java.lang패키지에는 Object2클래스가 있습니다.");
		} catch (ClassNotFoundException e) {
			//System.out.println("java.lang패키지에는 Object2클래스가 없습니다.");
			//e.printStackTrace(); //->에러메세지를 정확하게 보고싶을때,정확한 에러가 보고싶을때 (에러 발생했을 때 자바가 제공해주는 메세지)
			System.out.println("java.lang패키지에는 Object2클래스가 없습니다. : " + e.getMessage());
		}
		System.out.println("작업 끝");
	}
}
