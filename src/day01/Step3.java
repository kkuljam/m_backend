package day01;

public class Step3 {//c s

    public static void main(String[] args) { // main ()함수 실행시 필수!

        //[41] 진수 표현하는 방법
        int var1=0b1011; //2진수 : 데이터 앞에 0b  1011[2] -> 11[10]
            System.out.println("vat1:"+var1); //"문자열"+변수명
        int var2 = 0206; //8진수 : 데이터 앞에 0   206[8] --> 134[10]
            System.out.println("var2:"+var2);
        int var3 = 365; //10진수 : 365[10] --> 365[10]
            System.out.println("var3:"+var3);
        int var4 = 0xB3; //16진수 : 데이터 앞에 0x   B3[16] --> 179[10]
            System.out.println("var4:"+var4);

        //[42] byte 타입 [-128~127]
        byte b1 = -128;
        System.out.println("b1: "+b1);
        byte b2 = 127;
        System.out.println("b2: "+b2);
//        byte b3 = 200;    System.out.println("b3: "+b3); // 허용범위 벗어남

        //short타입 [-32000~32767]
        short s1 = 32000;
        System.out.println("s1: "+s1);
        // 대충 여기서 부터 강사님 코드 복붙 해야함
        /*short s2 = -50000; // 허용범위 벗어남
        System.out.println("s2: "+s2); */

        //int 타입[+-21억정도 ] : 4바이트: !!!; 리터럴
        int i1 = 200000000;  System.out.println("i1: "+i1);
        int i2 = 300000000;  System.out.println("i2: "+i2);

        //long 타입[=21 억 이상] 9바이트 :!!! 정수타입 리터럴 뒤에 l/L

        System.out.println("i1 : "+i1);

        //[43] char [0~65535] : 2바이트 : !! : ''작은따옴표, 65536개 문자 표현가능, 부호[signed]/부호없음[unsigned]
        char c1 = 'A';       System.out.println("c1: "+c1);
        char c2 = '가';       System.out.println("c2: "+c2);

//        ========
        //[49] String : "" 큰따옴표, 참조자료형/클래스

        String str1 = "안녕하세요";      System.out.println("str1: "+str1);
        String str2 = "나는\"자바\"를 배웁니다";     System.out.println("str2: "+str2);
        String str3 = "번호\t이름\t직업";         System.out.println("str3: "+str3);
        //java/jdk 13 이후 가능한 문법// }

        //[45]float[7자리 유효] : 4바이트
        float f1 = 0.123456788f;       System.out.println("f1 "+f1);

        //double [16자리 유효] : 8바이트
        double d1=0.1234566778;          System.out.println("d1: "+d1);

        //[48]boolean [true 또는 false] : 1바이트
        boolean bool1 = true;
//        boolean bool2 = 0;    1[int] 이므로 boolean에 저장할 수 없다. [정수 가장 최소단위 바이트]





    }
}