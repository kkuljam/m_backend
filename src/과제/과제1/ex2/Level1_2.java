package 과제.과제1.ex2;

import java.time.LocalDateTime;

public class Level1_2 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_2 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		System.out.printf("%-10s   %15s   %30s\n" , "type" , "value" , "range" );
		System.out.println("-------------------------------------------------------------");
		/* 문제풀이 위치 */
		String type;	String value;	String range;
        type = "boolean"; value = "true"; range = "true or false";
		System.out.printf("%-10s   %15s   %30s\n" , type , value , range );

		type = "byte"; value = "100"; range = "-128~127";
		System.out.printf("%-10s   %15s   %30s\n" , type , value , range );

		type = "char"; value = "A"; range = "0~65535[character 1]";
		System.out.printf("%-10s   %15s   %30s\n" , type , value , range );

		type = "short"; value = "30000"; range = "-32768 ~ 32767";
		System.out.printf("%-10s   %15s   %30s\n" , type , value , range );

		type = "int"; value = "2000000000"; range = "-+2000 million";
		System.out.printf("%-10s   %15s   %30s\n" , type , value , range );

		type = "long"; value = "40000000000L"; range = "-+2000 million Excess";
		System.out.printf("%-10s   %15s   %30s\n" , type , value , range );

		type = "float"; value = "3.123"; range = "8 decimal places";
		System.out.printf("%-10s   %15s   %30s\n" , type , value , range );

		type = "double"; value = "3.12312312"; range = "17 decimal places";
		System.out.printf("%-10s   %15s   %30s\n" , type , value , range );
    }
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개 선언하고 임의값을 대입하여 출력하시오.
	[조건] 
		1. 모든 기본자료형 8개 사용
		2. printf() 메소드 사용
*/
