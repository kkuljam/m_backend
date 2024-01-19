package day14;

public class Car {

    //1. 한국타이어 객체 + 하위객체
    //HankookTire hankookTire;
    //2. 금호타이어 객체 + 하위객체
    //KumhoTire kumhoTire;
    //3. 타이어 객체 + 하위객체(한국타이어, 금호 타이어)
    Tire tire;
    //4. 객체+ 자바의 모든 객체
    //Object object;

    public void run(){
        tire.roll();
    }

}
