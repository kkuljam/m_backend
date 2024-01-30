package day21;

import java.awt.*;

public class Step5 {
    public static void main(String[] args) {
        //1. [우리가 만든]버튼 객체 생성
        Button button = new Button();
        //2. [우리가 만든]버튼 추상메소드 정의
        button.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("OK 버튼을 클릭했습니다.");
            }
        });
        //--------- 만일 익명구현 객체가 없을 때

        //button.setClickListener();
    }
}
