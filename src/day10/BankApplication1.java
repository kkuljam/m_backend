package day10;

import day09.Account;

import java.util.Scanner;

public class BankApplication1 {//c s 실행클래스
    //클래스멤버
    //1. 필드
    static Account1[] accounts = new Account1[100];
    //main()함수 아닌 main() 밖에 정적필드로 선언하는 이유: 여럿 함수에서 사용하려고.
    static Scanner scanner=new Scanner(System.in);

    //생성자
    //메소드
        //2.계좌생성
    static void 계좌생성(){
        System.out.println("BankApplication1.계좌생성");
        //Account1객체 만들어서 배열에 저장 목적
        //입력받기
        System.out.print("계좌번호 : ");
        String number=scanner.next();
        System.out.print("계좌주 : ");
        String name=scanner.next();
        System.out.print("초기금액 : ");
        int money=scanner.nextInt();

        //2 객체 생성
            //1. 풀생성자 사용했을 때
        Account1 account1=new Account1(number,name,money);
            //2. 빈생성자 사용했을 때 [권장하지 않음-> 생성자 또는 메소드를 통한 필드 사용]
       /* Account1 account1=new Account1();
        account1.number=number;
        account1.name=name;
        account1.money=money;*/

        //3. 객체를 배열에 넣는다.
            //정적메소드에서 인스턴스필드를 호출할 수 없다.
                //1. 인스턴스필드 static 한다.
                //2. 객체생성을 한다.
        for( int i = 0 ; i<accounts.length ; i++ ){
            if( accounts[i] == null ){
                accounts[i] = account1;
                break; // !!! : 빈공간을 찾아서 대입은 1번만! 대입했으면 반복종료.
            }
        }
    }
        //3.계좌목록
    static void 계좌목록(){
        //System.out.println("BankApplication1.계좌목록");
        //* 배녈내 반복문을 이용한 모든 계좌객체를 호출
        for( int i = 0 ; i<accounts.length ; i++ ){
            Account1 account1 = accounts[i];
            if( account1 != null ){
                System.out.printf( "%10s \t %5s \t %10d \n" ,
                        account1.number , account1.name, account1.money );
            }
        }
    }
    //3.예금
    static void 예금(){
        System.out.println("BankApplication1.계좌목록");
        //*입력받은 계좌번호가 계좌목록에 존재하면 입력한 예금액을 찾은 계좌객체에서 예금에 더한다.
        System.out.print("계좌번호 : ");
        String ckNumber=scanner.next();
        System.out.print("예금액 : ");
        int newMoney=scanner.nextInt();
        for (int i=0; i< accounts.length;i++){
            Account1 account1=accounts[i];
            if(account1==null)break;
            //만약 동일한 계좌번호의 객체가 있으면 해당 객체내 입금액을 더한다.
            if (account1.number.equals(ckNumber)) {
                account1.money += newMoney;
                break;
            }

        }
    }
    //3.출금
    static void 출금(){
        System.out.println("BankApplication1.계좌목록");
        //*입력받은 계좌번호가 계좌목록에 존재하면 입력한 출금액을 찾은 계좌객체에서 예금에 뺀다.
        System.out.print("계좌번호 : ");
        String ckNumber=scanner.next();
        System.out.print("출금액 : ");
        int newMoney=scanner.nextInt();
        for (int i=0; i< accounts.length;i++){
            Account1 account1=accounts[i];
            if(account1==null)break;
            //만약 동일한 계좌번호의 객체가 있으면 해당 객체내 출금액을 더한다.
            if (account1.number.equals(ckNumber)) {
                account1.money -= newMoney;
                break;
            }

        }
    }
        //1. 실행 시작점
    public static void main(String[] args) {//m s

        while (true){
            //출력부분
            System.out.println("------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택>");
            int ch=scanner.nextInt();
            System.out.println("---------");

            if(ch==1){
                계좌생성();
            } else if (ch==2) {
                계좌목록();
            } else if (ch==3) {
                예금();
            } else if (ch==4) {
                출금();
            } else if (ch==5) {
                System.out.println("프로그램 종료"); break;
            }

            /*if(ch==1){//생성
                System.out.println("계좌생성\n---------");
                scanner.nextLine();//의미없음
                System.out.print("계좌번호 : ");
                String number=scanner.nextLine();
                System.out.print("계좌주 : ");
                String name=scanner.nextLine();
                System.out.print("초기금액 : ");
                int money=scanner.nextInt();
                System.out.println("결과: 계좌가 생성되었습니다.");
                Account1 account = new Account1(number,name,money);

                for( int i = 0 ; i<bankAccount.length ; i++ ){
                    if( bankAccount[i] == null ){
                        bankAccount[i] = account;
                        break; // !!! : 빈공간을 찾아서 대입은 1번만! 대입했으면 반복종료.
                    }
                }
            }// if 1번
            if(ch==2){//출력
                System.out.println("계좌목록\n---------");
                for( int i = 0 ; i<bankAccount.length ; i++ ){
                    if( bankAccount[i] != null ){
                        System.out.printf( "%12s \t %5s \t %7d \n" ,
                                 bankAccount[i].number , bankAccount[i].name, bankAccount[i].money );
                    }
                }
            }//if 2번
            if(ch==3){// 예금
                System.out.println("예금\n---------");
                scanner.nextLine();
                System.out.print("계좌번호 : ");
                String ckNumber=scanner.nextLine();
                System.out.print("예금액 : ");
                int newMoney=scanner.nextInt();
                for (int i=0; i< bankAccount.length;i++){
                    if(bankAccount[i]!=null) {
                        if (ckNumber.equals(bankAccount[i].number)) {

                            bankAccount[i].money += newMoney;
                        }
                    }
                }
            }//if 3번 끝
            if(ch==4){//출금
                System.out.println("출금\n---------");
                scanner.nextLine();
                System.out.print("계좌번호 : ");
                String ckNumber=scanner.nextLine();
                System.out.print("출금액 : ");
                int newMoney=scanner.nextInt();
                for (int i=0; i< bankAccount.length;i++){
                    if(bankAccount[i]!=null) {
                        if (ckNumber.equals(bankAccount[i].number)) {

                            bankAccount[i].money -= newMoney;
                        }
                    }
                }
            }//if 4번 끝
            if(ch==5){//종료
                System.out.println("프로그램 종료");
                break;
            }//if 5번 끝*/

        }

    }//m e
}//c e
