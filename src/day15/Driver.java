package day15;

import java.util.function.BooleanSupplier;

public class Driver {//운전자 (사람)
    //메소드 (객체의 행위) 매개변수로 운전할 매개체(버스/택시)
        //버스와 택시를 모두 매개변수로 받ㄱ 싶을 때 상위클래스
    public void drive(Vehicle vehicle){
        //-자식타입으로 다시 변환 (강제타입 =캐스팅)
        //변수명 instranceof  타입;

        vehicle.run();
        System.out.println(vehicle instanceof Bus ? "버스입니다.":"");

        Bus bus2=new Bus();
        //System.out.println(bus2 instanceof object);
    }
}
