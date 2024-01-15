package day09;

public class Account {
    //클래스 멤버
    //1. 필드: 정적 vs 인스턴스
    String number; //객체마다 필요하니까
    String name;
    int money;

    //2. 생성자
        //1. 기본생성자
    Account(){};
        //2. 모든 필드를 받는 생성자
    Account(String number,String name,int money){
        this.number=number;
        this.name=name;
        this.money=money;
    }
    //3. 메소드
        //*내 계좌의 입금액 반환
    int get입금액(){
        return this.money;
    }
}
