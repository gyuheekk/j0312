package t4_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception1_FileNotfoundException {
	public static void main(String[] args) {
		
		try {
//			FileInputStream is = new FileInputStream("test.txt");
			FileInputStream is = new FileInputStream("D:\\javaclass\\java\\works\\j0312\\src\\t4_execption\\Excrption_FileNotfoundxcepion.java");
			System.out.println("text.txt 파일이 존재합니다.");
		} catch (FileNotFoundException e) {
			System.out.println("text.txt 파일이 없습니다.");
			e.printStackTrace();
		}
		System.out.println("작업 끝");
	}
}
