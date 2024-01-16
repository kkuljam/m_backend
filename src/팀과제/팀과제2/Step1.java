package 팀과제.팀과제2;

import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MemberInfo []memberInfo=new MemberInfo[0];
        Sravice[] sravices=new Sravice[0];
        int count=0;
        int sin=0;
        //students = new int[Integer.parseInt(count)]; 배열 용량 늘리기
        boolean run=true;
        while (run) {
            System.out.println("=======================");
            System.out.println("1.회원가입 | 2.로그인 ");
            System.out.println("=======================");

            int ch=scanner.nextInt();
            if (ch==1){// 회워가입
                count++;
                MemberInfo [] tem=new MemberInfo[1];
                for(int i=0; i<memberInfo.length; i++){
                    tem[i]=memberInfo[i];
                }
                memberInfo=new MemberInfo[count];
                for(int i=0; i<tem.length; i++){
                    memberInfo[i]=tem[i];
                }
                System.out.print("이름 : ");
                String name = scanner.next();
                System.out.print("전화번호 : ");
                String num = scanner.next();
                System.out.print("생년월일 : ");
                String birth = scanner.next();
                System.out.print("아이디 : ");
                String id = scanner.next();
                System.out.print("패스워드 : ");
                String pw = scanner.next();

                sravices=new Sravice[count];
                MemberInfo memberlist = new MemberInfo(count,name,id,pw,num,birth);
                for( int i = 0 ; i<memberInfo.length ; i++ ){
                    if(memberInfo[i]==null) {
                        memberInfo[i] = memberlist;
                        System.out.println(memberInfo[0].id);
                        System.out.println(memberInfo.length);

                        break;
                    }
                }

            }//회원가입 끝

            if (ch == 2) {//로그인 시작
                System.out.print("아이디 : ");
                String id = scanner.next();
                System.out.print("패스워드 : ");
                String pw = scanner.next();

                for (int i = 0; i < memberInfo.length; i++) {

                    if (memberInfo[i] != null) {
                        if ( id.equals(memberInfo[i].id) && pw.equals(memberInfo[i].pw)) {
                            System.out.println("로그인 성공");
                            sin=memberInfo[i].no;
                            run=false;
                            break;
                        }else {
                            System.out.println("정보가 틀렸습니다.");
                        }
                    }
                }

            }//로그인 끝
        }
        while (!run){//로그인 넘어가면 실행창
            System.out.println("=======================");
            System.out.println("1.구독신청 | 2.사용현황 | 3.종료 ");
            System.out.println("=======================");
            int ch=scanner.nextInt();

            if(ch==1){
                Sravice 베이직=new Sravice("베이직",9000,"2.5G");
                Sravice 스텐다드=new Sravice("스텐다드",18000,"15G");
                Sravice 프리미엄=new Sravice("프리미엄",30000,"1T");

                System.out.println("=======================");
                System.out.println("1.베이직 | 2.스텐다드 | 3.프리미엄 ");
                System.out.println("=======================");
                ch=scanner.nextInt();
                if(ch==1){
                    System.out.println("구독 인원을 입력해주세요");
                    ch=scanner.nextInt();
                    System.out.println("구독 개월을 입력해주세요");
                    int month=scanner.nextInt();
                    Sravice subInfo=new Sravice(sin,베이직._class,베이직.tB,ch,month);
                    int pri=베이직.price*month;
                    System.out.println("총 요금은 : "+pri+"원 입니다.");
                    for( int i = 0 ; i<sravices.length ; i++ ){
                        if( sravices[i] == null ){
                            sravices[i] = subInfo;
                            break;
                        }
                    }
                } else if (ch==2) {
                    System.out.println("구독 인원을 입력해주세요");
                    ch=scanner.nextInt();
                    System.out.println("구독 개월을 입력해주세요");
                    int month=scanner.nextInt();
                   Sravice subInfo=new Sravice(sin,스텐다드._class,스텐다드.tB,ch,month);
                    int pri=스텐다드.price*month;
                    System.out.println("총 요금은 : "+pri+"원 입니다.");
                    for( int i = 0 ; i<sravices.length ; i++ ){
                        if( sravices[i] == null ){
                            sravices[i] = subInfo;
                            break;
                        }
                    }
                } else if (ch==3) {
                    System.out.println("구독 인원을 입력해주세요");
                    ch=scanner.nextInt();
                    System.out.println("구독 개월을 입력해주세요");
                    int month=scanner.nextInt();
                    Sravice subInfo=new Sravice(sin,프리미엄._class,프리미엄.tB,ch,month);
                    int pri=프리미엄.price*month;
                    System.out.println("총 요금은 : "+pri+"원 입니다.");
                    for( int i = 0 ; i<sravices.length ; i++ ){
                        if( sravices[i] == null ){
                            sravices[i] = subInfo;
                            break;
                        }
                    }
                }
            } else if (ch==2) {
                for(int i=0; i< sravices.length;i++){
                    Sravice sub=sravices[i];
                    if(sub.no==sin){
                        System.out.println("등급 : "+sub._class+"\n용량 : "+sub.tB+"\n개월 : "+sub.month+"월\n사용인원 : "+sub.nOfP);
                    }
                    if(sub==null){
                        System.out.println("구독하지 않았습니다.");
                        break;
                    }
                }
            } else if (ch==3) {
                System.out.println("종료되었습니다.");
                break;
            }
        }


















    }
}
