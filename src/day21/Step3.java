package day21;

public class Step3 {
    public static void main(String[] args) {
        Car car = new Car();

        //*매개변수에 익명자식객체 대입
        car.run3(new Tire(){
            @Override
            public void roll() {
                System.out.println("기아타이어가 굴러갑니다.");
            }
        });

        //-
        Tire tire = new Tire(){
            //========== Tire  클래스로부터 자동 상속 받은 객체 정의
                //!!!!: 자식객체
            // 필드 생성 가능
            int a=10;
            //생성자 x
            //메소드 생성 가능
            public void method1(){
                System.out.println("abc");
            }
            @Override
            public void roll() {
                System.out.println("기아타이어2");
            }
        };

    }
}
