package 과제.과제5;


public class Member {
/*[ Member 클래스 ]
            0. 아래 필드를 가지는 클래스를 설계 하시오.
    필드 : 아이디 , 비밀번호 , 이름 , 전화번호 , 나이*/
    int age;
    String id;
    String pw;
    String name;
    int number;

    Member(String id,String pw,String name,int number,int age){
        this.age=age;
        this.id=id;
        this.pw=pw;
        this.name=name;
        this.number=number;
    }
}
