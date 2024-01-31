package day22;

public class Product<K,M>{
    //class 클래스명<제네릭 타입1, 제네릭타입2>
    // 제네릭타입: 임의로 가능하지만 주로 대문자 A~Z 사용된다

    //1. 필드
    public K kind;
    public M model;
    //2. 생성자
    //3. 메소드
        //getter/setter
    public K getKind() {
        return kind;
    }
    public void setKind(K kind) {
        this.kind = kind;
    }
    public M getModel() {
        return model;
    }
    public void setModel(M model) {
        this.model = model;
    }
}
