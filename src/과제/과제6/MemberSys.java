package 과제.과제6;
import day12.view.MainView;

import java.util.Scanner;

public class MemberSys { // class s
	static Member[] members = new Member[100];
	//1. 회원가입 함수
	static boolean sign(){
		boolean result=true;
		Scanner scanner=new Scanner(System.in);
		System.out.print("아이디 :");
		String id = scanner.next();
		System.out.print("비밀번호 :");
		String pw =scanner.next();
		System.out.print("이름 :");
		String name = scanner.next();
		System.out.print("전화번호 :");
		String phone =scanner.next();
		System.out.print("나이 :");
		String age = scanner.next();

		for(int i=0; i<members.length;i++){//아이디 중복검사
			if(members[i]!=null) {
				if (members[i].getId().equals(id)) {
					result= false;
				}
			}
		}
		Member member=new Member(id,pw,name,phone,age);
		if(result) {//아이디 중복 통과하면 배열에 저장
			for (int i = 0; i < members.length; i++) {
				if (members[i] == null) {
					members[i] = member;
					break;
				}
			}
		}
		return result;
	}//-----------------------------------
	//2. 로그인 함수
	public static boolean login(){
		Scanner scanner=new Scanner(System.in);
		System.out.print("아이디 :");
		String id = scanner.next();
		System.out.print("비밀번호 :");
		String pw =scanner.next();

		for(int i=0; i<members.length;i++){
			if (members[i] != null) {
				if (members[i].getId().equals(id) && members[i].getPw().equals(pw)) {
					return true;
				}
			}
		}
		return false;
	}//----------------------------------
	//3. 아이디 찾기
	public static String idFind(){
		Scanner scanner=new Scanner(System.in);
		System.out.print("이름 :");
		String name = scanner.next();
		System.out.print("전화번호 :");
		String phone =scanner.next();

		for(int i=0; i<members.length;i++){
			if (members[i] != null) {
				if(members[i].getName().equals(name)&&members[i].getPhone().equals(phone)){
					return members[i].getId();
				}
			}

		}
		return null;
	}//----------------------------------
	//4. 비번 찾기
	public static String pwFind(){
		Scanner scanner=new Scanner(System.in);
		System.out.print("아이디 :");
		String id = scanner.next();
		System.out.print("전화번호 :");
		String phone =scanner.next();

		for(int i=0; i<members.length;i++){
			if (members[i] != null) {
				if (members[i].getId().equals(id) && members[i].getPhone().equals(phone)) {
					return members[i].getPw();
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {

			System.out.println("\n\n--------- 회원 시스템 ---------");
			System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기   선택> ");
			int ch = sc.nextInt();
			boolean result1;
			String result2;
			if( ch == 1 ) {

				result1=sign();
				if(result1) {
					System.out.println("회원가입 성공");
				}else {
					System.out.println("중복된 아이디입니다.");
				}
			}
			else if( ch == 2 ) {
				result1=login();
				if(result1) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패");
				}
			}
			else if( ch == 3 ) {

				result2=idFind();
				if(result2!=null) {
					System.out.println("아이디 : "+result2);
				}else {
					System.out.println("정보를 찾을 수 없습니다.");
				}
			}
			else if( ch == 4 ) {
				result2=pwFind();
				if(result2!=null) {
					System.out.println("비밀번호 : "+result2);
				}else {
					System.out.println("정보를 찾을 수 없습니다.");
				}
			}

		} // w e
	} // m e 
} // class e 
/*
	주제 : 회원제 시스템 part2
	 	- Member , MemberSys 클래스를 이용하여 아래 조건에 따라. 코드를 완성하시오.
 		- Member , MemberSys 클래스 외 새로운 클래스를 생성 하지 마시오.
 		- main() 메소드 외 기능별 함수를 4개 생성하시오.

		[ Member 클래스 ]
 		0. 아래 필드를 가지는 클래스를 설계 하시오.
 			필드 : 아이디 , 비밀번호 , 이름 , 전화번호 , 나이
		1. 생성자 사용하시오.
		2. getter , setter 메소드를 사용하시오.

		[ MemberSys 클래스 ]
		0. 배열
			Member[] 객체배열 = new Member[100];

		1. 초기 메뉴
			1. 회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
			
		2. 조건 기능 
			1. 회원가입 메소드 
				1. 아이디 , 비밀번호 , 이름 , 전화번호 , 나이  각 입력받아 저장 
				2. Member 객체화
				3. 객체를 배열 저장 
				 
			2. 로그인 메소드
				1. 아이디 , 비밀번호 입력받아 저장 
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 로그인 성공 
					- 아니면 실패
					 
			3. 아이디찾기 메소드
				1. 이름 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 아이디 출력 
					- 아니면 없다.
					 
			4. 비밀번호찾기 메소드 
				1. 아이디 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 비밀번호 출력
					- 아니면 없다.

			
*/














