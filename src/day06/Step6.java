package day06;

import java.util.Scanner;

public class Step6 {//c s
    public static void main(String[] args) {//m s
        Scanner scanner = new Scanner(System.in);
        String 전화번호부 = "";

        while (true) {
            System.out.println("==============전화번호부===========");
            System.out.printf("%s %s %s\n","순번" , "이름", "전화번호");
            String[] 명단 = 전화번호부.split("/");
            int li = 명단.length;

            for (int i=0; i<li;i++) {
                if(명단[0]==""){break;}
                String[] 명단정보 = 명단[i].split(",");
                System.out.printf("%d %s %s\n", i+1, 명단정보[0], 명단정보[1]);
            }

            System.out.println("1. 등록\n2. 삭제");
            int ch = scanner.nextInt();
            if (ch == 1) {
                System.out.println("이름 입력 : ");
                전화번호부 += 전화번호부==""? scanner.next(): "/"+scanner.next();
                System.out.println("전화번호 입력 : ");
                전화번호부 += ","+scanner.next();
                System.out.println(전화번호부);

            } else if (ch==2) {
                System.out.print("삭제할 번호 : ");
                ch=scanner.nextInt();
                전화번호부 = "";
                for(int i=0; i<li;i++){
                   if(ch-1!=i) {
                        전화번호부 += i == li-1 ? 명단[i] :명단[i]+"/";

                    }
                }
            }

        }
    }//m e
}//c e
