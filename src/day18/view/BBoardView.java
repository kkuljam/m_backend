package day18.view;

import day18.controller.BoardController;
import day18.controller.MemberController;
import day18.model.dto.BoardDto;

import java.util.Scanner;

public class BBoardView {
    private BBoardView(){};
    private static BBoardView bBoardView=new BBoardView();
    public static BBoardView getInstance(){return bBoardView;}

    Scanner scanner = new Scanner(System.in);

    public void write(){
        System.out.println("카테고리 선택");
        System.out.println("1.JAVA 2.C언어");
        System.out.print("선택>");
        int cno=scanner.nextInt();

        scanner.nextLine();

        System.out.println("게시글 제목 입력");
        String btilte= scanner.nextLine();
        System.out.println("게시글 내용 입력");
        String bcontent=scanner.nextLine();
        int mno=MemberController.getInstance().loginMno;
        System.out.println(mno);
        BoardDto boardDto=new BoardDto(mno,cno,btilte,bcontent);
        boolean result= BoardController.getInstance().write(boardDto);

        if(result){
            System.out.println("게시글 등록 성공");
        }else {
            System.out.println("게시글 등록 실패");
        }


    }
}
