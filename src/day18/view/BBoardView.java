package day18.view;

import day18.controller.BoardController;
import day18.controller.MemberController;
import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BBoardView {
    private BBoardView(){};
    private static BBoardView bBoardView=new BBoardView();
    public static BBoardView getInstance(){return bBoardView;}

    Scanner scanner = new Scanner(System.in);

    public void write(){
        System.out.println("카테고리 선택");
        ArrayList<CategoryDto>categoryDtos=BoardController.getInstance().categoryPrint(new CategoryDto());
        for(int i=0; i<categoryDtos.size();i++){
            System.out.print("\t"+categoryDtos.get(i).getCno()+"."+categoryDtos.get(i).getCname());
        }
        System.out.print("\n선택>");
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

    public void boardlist(){
        System.out.println("=================EZEN 게시물================");
        System.out.print("게시물번호\t카테고리\t작성자\t\t\t작성일\t\t조회수\t\t제목\n");
        ArrayList<BoardDto>boardDtos=BoardController.getInstance().boardPrint(new BoardDto());
        for (int i=0;i<boardDtos.size();i++){
            String mid=BoardController.getInstance().findMid(boardDtos.get(i).getMno());
            String cname=BoardController.getInstance().findCName(boardDtos.get(i).getCno());
            System.out.printf(
                    "%5d %7s %6s %6s %6d %10s\n",
                    boardDtos.get(i).getBno(),
                    cname,
                    mid,
                    boardDtos.get(i).getBdate(),
                    boardDtos.get(i).getBview(),
                    boardDtos.get(i).getBtitle()
            );

        }

    }
}
