package day22;

public class Applicant <T>{
    //<T> : 제네릭타입
    public T kind;
    //2.메소드
    public Applicant(T kind){
        this.kind=kind;
    }
}
