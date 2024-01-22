package day15;

public class Step1 {//c s
    public static void main(String[] args) {//m s
        //1. 객체 생성
        Driver driver1=new Driver();
          //  Driver driver2=new Driver();

        //2. 객체 생성
        Bus bus=new Bus();
        driver1.drive(bus);

        //3. 객체 생성
        Taxi taxi=new Taxi();
        driver1.drive(taxi);

    }//m
}//c e
