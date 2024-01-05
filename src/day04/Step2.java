package day04;

public class Step2 {//c s
    public static void main(String[] args) {//m s

        //124
        //1. 1~10까지 출력하는 코드
        System.out.print(1+" ");
        System.out.print(2+" ");
        System.out.print(3+" ");
        System.out.print(4+" ");
        System.out.print(5+" ");
        System.out.print(6+" ");
        System.out.print(7+" ");
        System.out.print(8+" ");
        System.out.print(9+" ");
        System.out.print(10+" ");
        //-for 변환
        for(int i=1; i<=10;i++){//for s
            System.out.print(i + " ");
        }//for e

        //2. 1~100까지 합
        int sum = 0; // 누적합계 구하려고, for 안에서도 쓰고 밖에서도 쓰고
        int i = 1;
        for( i = 1 ;i<=100; i++){//for s
            sum += i; // vs sum = sum + i;
        }//for e
        System.out.println("1~"+(i-1)+"합: "+ sum); //soutv

        //3. 구구단 : 중첩 for문: for2개 중 (행, 열)
        for(int 단 = 2; 단<=9; 단++){
            for(int 곱=1; 곱<=9; 곱++){
//                System.out.print(단+"x"+곱 +"="+(단*곱));
                System.out.printf("%3d x %3d = %3d", 단, 곱, (단*곱));
            }
            System.out.println();
        }

        //4, for -> while 1~10까지
        int j =1;
        while (j<-10){//w s
            System.out.print(j+" ");
        }//w e

        //5. for -> while 1~100 누적 합계
        int sum2 =0;
        int m = 1;
        while (m<=100){
            sum2+=m;
            m++;
        }
        System.out.println("1~"+(m-1)+"합: "+ sum2);

    }//m e
}//c e
