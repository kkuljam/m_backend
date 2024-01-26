package day18.model.dao;

import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;

import java.util.ArrayList;

public class BoardDao extends Dao{

    private BoardDao(){};
    private static BoardDao boardDao=new BoardDao();
    public static BoardDao getInstance(){return boardDao;}

    public boolean write(BoardDto boardDto){
        try {
            System.out.println(boardDto.getMno());
            String sql="insert into board(mno,cno, btitle, bcontent)values(?, ? , ?, ?)";
            ps= conn.prepareCall(sql);
            ps.setInt(1,boardDto.getMno());
            ps.setInt(2,boardDto.getCno());
            ps.setString(3,boardDto.getBtitle());
            ps.setString(4,boardDto.getBcontent());

            int count = ps.executeUpdate();
            if(count==1){
                return true;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return false;
    }

    // public BoardDto[] categoryPrint(BoardDto boardDto){
    public ArrayList<CategoryDto> categoryPrint(CategoryDto categoryDto){
        try {
            String sql ="select * from category order by cno";
            ps = conn.prepareStatement(sql);
            rs =ps.executeQuery();

            ArrayList<CategoryDto>categoryDtos = new ArrayList<>();

            while( rs.next() ){
               CategoryDto cDto=new CategoryDto(
                       rs.getInt("cno"),
                       rs.getString("cname")
               );
               categoryDtos.add( cDto );
            }
            return categoryDtos;
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public ArrayList<BoardDto>boardPrint(BoardDto boardDto){// 게시글 출력 함수
        try {
            String sql ="select * from board";
            ps = conn.prepareStatement(sql);
            rs =ps.executeQuery();

            ArrayList<BoardDto>boardDtos = new ArrayList<>();
            while (rs.next()){
                BoardDto bDto=new BoardDto(
                        rs.getInt("mno"),
                        rs.getInt("cno"),
                        rs.getInt("bno"),
                        rs.getString("btitle"),
                        rs.getString("bcontent"),
                        rs.getString("bdate"),
                        rs.getInt("bview")
                );
                boardDtos.add(bDto);
            }
            return boardDtos;
        }catch (Exception e){

        }
        return null;
    }

    public String findMid(int mno) {//회원번호로 아이디 찾기
        try {
            //1.SQL 작성한다
            String sql = "select mid from member where  mno=?";
            //2.SQL 기재한다
            ps= conn.prepareStatement(sql);
            ps.setInt(1,mno);
            //3.SQL 실행한다
            rs=ps.executeQuery();
            //4.SQL 결과처리
            if(rs.next()){
                //rs.next :다음 레코드 이동
                //rs.get타입(호출할 필드번호 or 필드이름) : 현재 레코드의 필드 값 호출
                return rs.getString("mid");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    public String findCName(int cno) {//카테고리번호로 카테고리이름 찾기
        try {
            //1.SQL 작성한다
            String sql = "select cname from category where  cno=?";
            //2.SQL 기재한다
            ps= conn.prepareStatement(sql);
            ps.setInt(1,cno);
            //3.SQL 실행한다
            rs=ps.executeQuery();
            //4.SQL 결과처리
            if(rs.next()){
                //rs.next :다음 레코드 이동
                //rs.get타입(호출할 필드번호 or 필드이름) : 현재 레코드의 필드 값 호출
                return rs.getString("cname");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
