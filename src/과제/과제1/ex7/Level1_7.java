package 과제.과제1.ex7;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_7 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_7 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);

		/* 문제풀이 위치 */

		String name = scanner.nextLine();
		boolean bool = scanner.nextBoolean();
		byte no= scanner.nextByte();
		char sex = scanner.next().charAt(0);
		short age = scanner.nextShort();
		int point = scanner.nextInt();
		long money = scanner.nextLong();
		float cm= scanner.nextFloat();
		double kg = scanner.nextDouble();

		
		String output = "=======회원정보======\n" +
				"|\t회원정보 :"+name+ "\t|\n"+
				"|\t   상태 :"+bool+" \t|\n"+
				"|\t회원번호 :"+no+"   \t|\n"+
				"|\t   성별 :"+sex+"    \t|\n"+
				"|\t   나이 :"+age+"  \t|\n"+
				"|\t 포인트 :"+point+" \t|\n"+
				"|\t 예금액 :"+money+" \t|\n"+
				"|\t    키 :"+cm+"  \t|\n"+
				"|\t 몸무게 :"+kg+"  \t|\n" +
				"===================";

		System.out.println( output );

		/* ----------- */
	}
}
/* 
	[문제조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.
		2. 기본 자료형8개 + 문자열클래스 변수 1개 를 이용한 9개변수를 입력 받습니다.
		3. 입력받은 9개 변수를 그림과 같이 출력합니다.
		4. 기존에 미리 작성된 변수를 최대한 활용합니다.
		
*/
