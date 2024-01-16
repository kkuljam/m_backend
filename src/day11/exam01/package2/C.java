package day11.exam01.package2;
import day11.exam01.package1.B;
//클래스 (default/public)
//
public class C {
   // A a; // 오류발생ㅇ : default 클래스는 다른 패키지에서 사용불가
    B b; // public 클래스는 다른 패키지에서 사용 가능
}
