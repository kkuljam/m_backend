package day11;

public class Step2 {
    public static void main(String[] args) {
        //1. 객체 생성
        Car mycar=new Car();

        //speed 필드가 private 이므로 외부에서 접근 불가능
        //mycar.speed=-50;

        //메소드를 이용한 speed필드에 접근
        mycar.setSpeed(-50);// 유효성검사
        System.out.println("mycar="+mycar.getSpeed());

        mycar.setSpeed(60);
        System.out.println("mycar="+mycar.getSpeed());

        //만약에 car객체의 stop 필드가 false이면
        if(!mycar.isStop()){
            mycar.setStop(true); //멈춤
        }
        System.out.println("mycar.getSpeed() =" +mycar.getSpeed());



    }
}
