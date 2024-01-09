package day06;

import java.util.Scanner;

public class Step6 {//c s
    public static void main(String[] args) {//m s
        Scanner scanner = new Scanner(System.in);
        String 전화번호부 = "";
        System.out.println("==============전화번호부===========");
        System.out.printf("%s %s %s\n","순번" , "이름", "전화번호");

        while (true) {



            System.out.println("1. 등록\n2. 삭제 :");
            int ch = scanner.nextInt();
            if (ch == 1) {
                System.out.println("이름 입력 : ");
                전화번호부 += scanner.next()+",";
                System.out.println("전화번호 입력 : ");
                전화번호부 += scanner.next()+"/";


            } else if (ch==2) {
                ch=scanner.nextInt();
                for(int i=0; i<전화번호부.split("/").length;i++){
                    if(ch==i) {

                         String str=전화번호부.substring(0, i-1);
                        System.out.println(str);
//                                 +전화번호부.substring(i);

                    }
                }
            }
            System.out.println("==============전화번호부===========");
            System.out.printf("%s %s %s\n","순번" , "이름", "전화번호");
            String[] tokens = 전화번호부.split("/");
            int j=0;
            for (int i=0; i<tokens.length;i++) {
                System.out.printf("%d %s %s\n", ++j, tokens[i].split(",")[0], tokens[i].split(",")[1]);
            }



        }
    }//m e
}//c e
