package day13;

public class Step3 {
    public static void main(String[] args) {
        //297~
            //1. 자식객체를 만들면 부모객체 같이 만들어진다.
        SupersonicAirplane sa=new SupersonicAirplane();

            //2. 자식객체는 부모객체 멤버를 사용할 수 있다.
        sa.takeOff();
        //단 자식객체가   부모객체 메소드를 재정의(오버라이딩) 했을 때, 본인객체가 메소드 우선
        sa.fly();
            //3. 외부클래스에서 상수 호출시 객체가 필요 없음. 클래스명.static필드
        sa.flyMode=SupersonicAirplane.SUPERSONIC;
        sa.fly();
            //4.
        sa.flyMode=SupersonicAirplane.NORMAL;
        sa.fly();
            //5.
        sa.land();
    }
}
