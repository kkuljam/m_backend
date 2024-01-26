package day18.controller;

import day18.model.dao.BoardDao;
import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;

import java.util.ArrayList;

public class BoardController {
    private BoardController(){};
    private static BoardController boardController=new BoardController();
    public static BoardController getInstance(){return boardController;}

    public boolean write(BoardDto boardDto){//  글쓰기 함수
        boolean result=false;
        result=BoardDao.getInstance().write(boardDto);
        return result;
    }

    public ArrayList<CategoryDto> categoryPrint(CategoryDto categoryDto){//카테고리 출력 함수
        ArrayList<CategoryDto>cDtos=BoardDao.getInstance().categoryPrint(categoryDto);
        return cDtos;
    }

    public ArrayList<BoardDto>boardPrint(BoardDto boardDto){// 게시글 출력 함수
        ArrayList<BoardDto>bDtos=BoardDao.getInstance().boardPrint(boardDto);
        return bDtos;
    }

    public String findMid(int mno){
        String result=null;
        result=BoardDao.getInstance().findMid(mno);
        return result;
    }

    public String findCName(int cno){
        String result=null;
        result=BoardDao.getInstance().findCName(cno);
        return result;
    }

}
