package t4_exception;

import java.util.Arrays;

public class Exception1_Interrupted2 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		System.out.println("금주의 로또 번호는 : ");
		atom: for(int i=0; i<6; i++) {
			int rand = (int)(Math.random()*45 + 1);
			for(int j=0; j<i; j++) {
				if(lotto[j] == rand) {
					i--;
					continue atom;
				}
			}
			for(int j=0; j<3; j++) {
				System.out.print(".");
				try {Thread.sleep(300);} catch(InterruptedException e) {}
			}
			System.out.println(rand);
			lotto[i] = rand;
		}
		try {Thread.sleep(500);} catch(InterruptedException e) {}
		Arrays.sort(lotto);
		System.out.print("\n행운을 빕니다 : ");
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
