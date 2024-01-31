package day22;

public class CarAgency implements Rentable<Car2>{
    //클래스 : implements하면 구현클래스라고 한다.
    @Override
    public Car2 rent() {
        return new Car2();
    }
}
