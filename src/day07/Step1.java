package day07;

import java.util.Arrays;

public class Step1 {//c s

    public static void main(String[] args) {//m s

        //202

        //210
        //클래스를 이용한 객체 생성
        //1. 인스턴스화 키워드 new
            //1. 힙영역에 설계도에 따른 메모리 할당
            //2. 할당된 메모리의 주소 리턴
        //new
        //2. 인스턴스화 활 생성자/클래스명()
        //new Student();
        //3. 변수 생성한다(생성된 객체의 주소를 담기 위해)
            //1. 타입(담을 객체 주소의 클래스와 동일) 2. 변수명(첫글자는 소문자 카멜)
        //Student student;
        //4. 객체 주소를 변수에 담기
        Student s1 =new Student();
        System.out.println("s1 변수가 Student 객체를 참조합니다."+s1);

        Student s2 = new Student();
        System.out.println("s2 변수가 Student 객체를 참조합니다."+s2);

    int []num={3,10,6,3,2};
    Arrays.sort(num);
        for (int i : num){
            System.out.print(i);
        }



    }//m e
}//c e
