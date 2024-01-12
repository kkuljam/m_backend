package day09;

import java.util.Scanner;

public class BankApplication {//c s

    public static void main(String[] args) {//m s
        Account[] bankAccount = new Account[100];

        Scanner scanner=new Scanner(System.in);

        while (true){
            //출력부분
            System.out.println("------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택>");
            int ch=scanner.nextInt();
            System.out.println("---------");

            if(ch==1){//생성
                System.out.println("계좌생성\n---------");
                scanner.nextLine();//의미없음
                System.out.print("계좌번호 : ");
                String number=scanner.nextLine();
                System.out.print("계좌주 : ");
                String name=scanner.nextLine();
                System.out.print("초기금액 : ");
                int money=scanner.nextInt();
                System.out.println("결과: 계좌가 생성되었습니다.");
                Account account = new Account(number,name,money);

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
            }//if 5번 끝

        }

    }//m e
}//c e
