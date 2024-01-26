package day18.controller;

import day18.model.dao.BoardDao;
import day18.model.dto.BoardDto;

public class BoardController {
    private BoardController(){};
    private static BoardController boardController=new BoardController();
    public static BoardController getInstance(){return boardController;}

    public boolean write(BoardDto boardDto){
        boolean result=false;
        result=BoardDao.getInstance().write(boardDto);
        return result;
    }
}
