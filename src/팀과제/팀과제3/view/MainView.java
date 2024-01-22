package 팀과제.팀과제3.view;

import day12.view.MemberView;

import java.util.Scanner;

public class MainView {

    public static void main(String[] args) {
        while (true){
           Scanner scanner=new Scanner(System.in);
            System.out.println("========== 업무 선택 ==========");
            System.out.println("1. 계좌생성 | 2. 예금 | 3. 출금 ");
            System.out.print("선택:");
            int ch = scanner.nextInt();

            if( ch == 1 ){  // 1. 계좌생성
                View.계좌생성();
            }
            else if( ch == 2 ){ // 2. 예금
                View.예금();
            }
            else if(ch == 3) {// 3.출금
                View.출금();
            }

        }
    }
}
