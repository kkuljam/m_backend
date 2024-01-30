package day21;

public class Step1 {
    public static void main(String[] args) {
        try {
            findClass();
        }catch (ClassNotFoundException e){
            System.out.println("e = " + e);
        }
    }
    public static void findClass()throws ClassNotFoundException{
        //예외발생
            //1. try{}catch(){}     : 해당 코드 직접 예외처리
            //2. throws             : 예외 떠넘기기
        try {
            Class.forName("java.lang.String");
        }catch (ClassNotFoundException e){}
        
        //2.
        Class.forName("java.lang.String2");
    }
}
