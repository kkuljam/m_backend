package day12.model;

import java.util.ArrayList;

public class MemberDao {

    //싱글톤
    private MemberDao(){}
    private static MemberDao memberDao=new MemberDao();
    public static MemberDao getInstance(){return memberDao;}
    ArrayList<MemberDto> memberDtos =new ArrayList<>();

    //DB 대신에 배열
    //회원가입 메소드
    public boolean signup(MemberDto memberDto){
        //DB대신 배열사용
            //배열 사용시 불편한점: 고정길이
            // 고정길이 배열을 가변길이 배열로 구현 => 제공하는 라이브러리/컬렉션(수집) 프레임워크(라이브러리집합)
            // 컬렉션 프레임워크 : ArrayList 가변길이 배열을 지원하는 클래스
        //ArrayList<여러개저장할객체의타입>
        //MemberDto[] memberDtos = new MemberDto[100];

        // 제공하는 함수 + 강사님 코드 같이 복붙
            // 저장 : .add(저장할 객체)]                         js [.push(저장할 데이터)] vs
            // 개수 : .size()]
            // 호출 : .get(인덱스)

        //회원가입 메소드
        System.out.println("[3]MemberDao.signup");


        /*
        for (int i=0; i<memberDtos.length; i++){
            if(memberDtos[i]==null){
                memberDtos[i]=memberDto;
                return true; //회원가입 성공
            }
        }

         */
        boolean result = idP(memberDto);
        if(result){
            memberDtos.add(memberDto);
            return true; //회원가입 성공

        }else {
            return false;
        }
    }

    //+아이디 중복 검사
    private boolean idP(MemberDto memberDto){
        System.out.println("MemberDao.idP");
        for(int i=0; i<memberDtos.size();i++){
            //i는 0부터 리스트내 요소 개수까지 1씩 증가
            if(memberDtos.get(i).getId().equals(memberDto.getId())){
                //리스트내 i번째 객체의 아이디와 입력받은 아이디(매개변수) 같으면
                return false;
            }
        }
        return true;
    }


    //2. 로그인 메소드
    public boolean login(MemberDto memberDto){
        System.out.println("[3]MemberDao.login");

        //로그인 처리 : 전체(배열) 회원객체 중에 입력받은 동일한 값이 있는지 확인
        for(int i=0; i<memberDtos.size();i++){
            //i는 0부터 리스트내 요소 개수까지 1씩 증가
            if(memberDtos.get(i).getId().equals(memberDto.getId())){
                //리스트내 i번째 객체의 아이디와 입력받은 아이디(매개변수) 같으면
                if(memberDtos.get(i).getPw().equals(memberDto.getPw())){
                    //리스트내 i번째 객체의 비밀번호와 입력받은 비밀번호(매개변수) 같으면
                    return true;// 성공
                }
            }
        }
        return false; //실패
    }

    //3. 아이디 찾기
    public String idFind(MemberDto memberDto){
        System.out.println("[3]MemberDao.idFind");
        for(int i=0; i<memberDtos.size();i++){
            //i는 0부터 리스트내 요소 개수까지 1씩 증가
            if(memberDtos.get(i).getName().equals(memberDto.getName())){
                //리스트내 i번째 객체의 아이디와 입력받은 아이디(매개변수) 같으면
                if(memberDtos.get(i).getPhone().equals(memberDto.getPhone())){
                    //리스트내 i번째 객체의 비밀번호와 입력받은 비밀번호(매개변수) 같으면
                    return memberDtos.get(i).getId();// 성공
                }
            }
        }
        return null;
    }

    public String pwFind(MemberDto memberDto){
        System.out.println("[3]MemberDao.idFind");
        String result="";
        for(int i=0; i<=5; i++){
            result+= String.valueOf((int)(Math.random()*10)+1);
        }
        for(int i=0; i<memberDtos.size();i++){
            //i는 0부터 리스트내 요소 개수까지 1씩 증가
            if(memberDtos.get(i).getId().equals(memberDto.getId())){
                //리스트내 i번째 객체의 아이디와 입력받은 아이디(매개변수) 같으면
                if(memberDtos.get(i).getPhone().equals(memberDto.getPhone())){
                    //리스트내 i번째 객체의 비밀번호와 입력받은 비밀번호(매개변수) 같으면
                        memberDtos.get(i).setPw(result);
                    return result;// 성공
                }
            }
        }
        return null;
    }


}
