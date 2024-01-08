package day05;

import java.util.Scanner;

public class Step3_방문록_배열버전 {//c s
    public static void main(String[] args) {// m s
        //*입력객체
        Scanner scanner = new Scanner( System.in );
        //5-1 저장할 변수 선언
        String[] 내용배열 = new String[3];
        String[] 작성자배열 = new String[3];
        int[] 비밀번호배열 = new int[3];


        //1. 무한루프
        while(true){//w s
            //2. 출력
            System.out.println("========== 방문록 ==========");
            for(int index=0; index<내용배열.length; index++) {

                //타입은 클래스이지만 null 비교시에는 비교연산자 사용.
                if (내용배열[index] != null) {
                    System.out.printf("%2d \t %-5s \t %-20s \n", index + 1, 작성자배열[index], 내용배열[index]);
                }
            }
            System.out.println(" 1.방문록 작성 2.방문록 삭제 3.종료 ");
            //3. 입력
            System.out.print("선택 : ");    int ch = scanner.nextInt();

            //4. 입력된 경우의 수 판단
            if(ch==1){
                System.out.print("방문록 작성 위치 : 1. 2. 3. : ");
                int no = scanner.nextInt()-1;
                //6-2 입력 : 내용, 작성자, 비밀번호 각각 입력받기
                scanner.nextLine();
                System.out.print("내용 : ");      String content = scanner.nextLine();
                System.out.print("작성자 : ");    String writer = scanner.next();
                System.out.print("비밀번호 : ");  int password = scanner.nextInt();
                //6-3 배열에 각각 대입하기
                내용배열[no]=content;
                작성자배열[no]=writer;
                비밀번호배열[no]=password;
            } else if (ch==2){
                // 8-1 입력 : 삭제할 방문록의 위치(인덱스) 입력
                System.out.print("방문록 삭제 위치 : 1. 2. 3. : ");
                int no = scanner.nextInt()-1;
                //8-2입력: 유효성 비밀번호 입력
                System.out.print("방문록 비밀번호 : ");
                int password = scanner.nextInt();
                //8-3 초기화: 만약에 인덱스가 없는 번호를 선택했을 때
                if(no<0 || no>내용배열.length){
                    System.out.println("[경고] 알수없는 위치");
                }else if (비밀번호배열[no]==password){
                    내용배열[no]=null;
                    작성자배열[no]=null;
                    비밀번호배열[no]=0;
                }else {
                    System.out.println("[경고] 패스워드가 다릅니다.");
                }
            } else if (ch==3){
                break;
            }else{ System.out.println("[경고] 알 수 없는 입력입니다.");}
        }//w e
    }//m e
}// c e
