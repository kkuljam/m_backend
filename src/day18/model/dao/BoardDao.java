package day18.model.dao;

import day18.model.dto.BoardDto;

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
}
