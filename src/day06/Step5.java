package day06;

import java.util.Scanner;

public class Step5 {//c s
    public static void main(String[] args) {//m s
        Scanner scanner = new Scanner(System.in);
        System.out.print("시간(hhmmss형식) :");
        String time = scanner.nextLine();
        System.out.print("시간(숫자) :");
        String second = scanner.nextLine();

        String result="";

        /*int ss = Integer.parseInt(time.substring(4,6));
        ss+=Integer.parseInt(second);
        int mm = Integer.parseInt(time.substring(2,4));
        mm+=(ss/60); //초->분
        int hh = Integer.parseInt(time.substring(0,2));
        hh+=(mm/60); // 분->시
*/
        //입력받은  time에서 second 만큼 지난 시간을 hhmmss형식으로 출력


        int timeH = Integer.parseInt(time.substring(0,2));
        int timeM = Integer.parseInt(time.substring(2,4))*60;
        int timeS = Integer.parseInt(time.substring(4)); //4부터 마지막 인덱스 추출
        int total=timeM+timeS+Integer.parseInt(second);
        if(total/3600>=1){
            timeH+=total/3600;
            total=total-3600;
            if(timeH>=24){
                timeH=timeH-24;
            }
        }
        result=timeH+":"+total/60+":"+total%60;
        System.out.println(timeH+":"+total/60+":"+total%60);

        System.out.println("result="+result);

        /*
        예]
            time = 145930
            second = 70
                result = 15:00:40
         */
    }//m e
}//c e
