package day20;

public class Step3 {
    public static void main(String[] args) {
        //1. 구현객체
        InterfaceClmpl impl=new InterfaceClmpl();

        //2. 구현객체가 자식과 부모 인터페이스에 모두 대입 가능
        InterfaceA ia= impl;
        ia.methodA();
        //ia.methodB();
        //ia.methodC();

        InterfaceB ib= impl;
        //ib.methodA();
        ib.methodB();
        //ib.methodC();

        InterfaceC ic= impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();


    }
}
