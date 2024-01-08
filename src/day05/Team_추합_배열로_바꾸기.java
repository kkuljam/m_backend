package day05;

import java.util.Scanner;

public class Team_추합_배열로_바꾸기 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* String 좌석1 = "빈좌석";      String 좌석2= "빈좌석";       String 좌석3="빈좌석";
        String 좌석1시 = "0";      String 좌석2시 = "0";      String 좌석3시 = "0";
        String 좌석1분 = "0";      String 좌석2분 = "0";      String 좌석3분 = "0";*/
        String[] 좌석 = new String[3];
        String[] 시 = new String[3];
        String[] 분 = new String[3];

        for (int i=0; i<=좌석.length-1; i++){
            좌석[i]="빈좌석";
            시[i]="0";
            분[i]="0";
        }

        int sumTime = 0;

        while (true){

            // 현재 좌석 상태 출력
            System.out.println("\n------------------- 현재 좌석을 표시합니다. -------------------");
            System.out.printf("%13s\t %13s %13s\n","좌석1","좌석2","좌석3");
            System.out.printf("%13s\t %13s %13s\n",좌석[0],좌석[1],좌석[2]);
            System.out.printf("%12s시\t %12s시\t %12s시\n",시[0],시[1],시[2]);
            System.out.printf("%12s분\t %12s분\t %12s분\n",분[0],분[1],분[2]);
            System.out.println("------------------------------------------------------------");

            // 입실/퇴실/계산 선택
            System.out.print("입실/퇴실/계산 중에 선택해 주세요. : ");
            String ch = scanner.nextLine();
            if(ch.equals("입실")){
                System.out.print("좌석을 선택해 주세요. : ");
                String 좌석선택 = scanner.nextLine();
                System.out.print("전화번호를 선택해 주세요. : ");
                String 번호 = scanner.nextLine();
                if(좌석선택.equals("좌석1")){
                    if(좌석[0].equals("빈좌석")){
                        System.out.print("입실시간 시를 선택해 주세요. : ");
                        String hour = scanner.nextLine();
                        System.out.print("입실시간 분을 선택해 주세요. : ");
                        String minute = scanner.nextLine();
                        좌석[0] = 번호;
                        시[0] = hour;
                        분[0] = minute;
                    } else {
                        System.out.println("입실불가\n");
                    }
                } else if (좌석선택.equals("좌석2")) {
                    if(좌석[1].equals("빈좌석")){
                        System.out.print("입실시간 시를 선택해 주세요. : ");
                        String hour = scanner.nextLine();
                        System.out.print("입실시간 분을 선택해 주세요. : ");
                        String minute = scanner.nextLine();
                        좌석[1] = 번호;
                        시[1] = hour;
                        분[1] = minute;
                    } else {
                        System.out.println("입실불가\n");
                    }

                } else if (좌석선택.equals("좌석3")) {
                    if(좌석[2].equals("빈좌석")){
                        System.out.print("입실시간 시를 선택해 주세요. : ");
                        String hour = scanner.nextLine();
                        System.out.print("입실시간 분을 선택해 주세요. : ");
                        String minute = scanner.nextLine();
                        좌석[2] = 번호;
                        시[2] = hour;
                        분[2] = minute;
                    } else {
                        System.out.println("입실불가\n");
                    }

                } else {
                    System.out.println("입실불가\n");
                }
            } else if(ch.equals("퇴실")){
                System.out.print("좌석을 선택해 주세요. : ");
                String 좌석선택 = scanner.nextLine();
                if(좌석선택.equals("좌석1")){
                    if(좌석[0].equals("빈좌석")){
                        System.out.println("입실이 없습니다.\n");
                    } else {
                        System.out.print("전화번호를 입력해 주세요. : ");
                        String 전화번호 = scanner.nextLine();
                        if(좌석[0].equals(전화번호)){
                            System.out.print("퇴실시간 시를 선택해 주세요. : ");
                            String hour = scanner.nextLine();
                            System.out.print("퇴실시간 분을 선택해 주세요. : ");
                            String minute = scanner.nextLine();

                            int 입실시 = Integer.parseInt(시[0]);
                            int 입실분 = Integer.parseInt(분[0]);
                            int 퇴실시 = Integer.parseInt(hour);
                            int 퇴실분 = Integer.parseInt(minute);
                            int 시간 =(퇴실시*60 + 퇴실분) - (입실시*60 + 입실분);
                            if(시간 > 0){
                                좌석[0] = "빈좌석";
                                시[0] = "0";
                                분[0] = "0";
                                sumTime += 시간;
                                System.out.printf("퇴실완료[ 좌석을 이용한 시간(분) : %3d분 ]\n", 시간);
                            } else {
                                System.out.println("퇴실시간 오류");
                            }
                        } else {
                            System.out.println("번호가 다릅니다.");
                        }
                    }
                } else if (좌석선택.equals("좌석2")) {
                    if(좌석[1].equals("빈좌석")){
                        System.out.println("입실이 없습니다.\n");
                    } else {
                        System.out.print("전화번호를 입력해 주세요. : ");
                        String 전화번호 = scanner.nextLine();
                        if(좌석[1].equals(전화번호)){
                            System.out.print("퇴실시간 시를 선택해 주세요. : ");
                            String hour = scanner.nextLine();
                            System.out.print("퇴실시간 분을 선택해 주세요. : ");
                            String minute = scanner.nextLine();

                            int 입실시 = Integer.parseInt(시[1]);
                            int 입실분 = Integer.parseInt(분[1]);
                            int 퇴실시 = Integer.parseInt(hour);
                            int 퇴실분 = Integer.parseInt(minute);
                            int 시간 =(퇴실시*60 + 퇴실분) - (입실시*60 + 입실분);
                            if(시간 > 0){
                                좌석[1] = "빈좌석";
                                시[1] = "0";
                                분[1] = "0";
                                sumTime += 시간;
                                System.out.printf("퇴실완료[ 좌석을 이용한 시간(분) : %3d분 ]\n", 시간);
                            } else {
                                System.out.println("퇴실시간 오류");
                            }
                        } else {
                            System.out.println("번호가 다릅니다.");
                        }
                    }
                } else if (좌석선택.equals("좌석3")) {
                    if(좌석[2].equals("빈좌석")){
                        System.out.println("입실이 없습니다.\n");
                    } else {
                        System.out.print("전화번호를 입력해 주세요. : ");
                        String 전화번호 = scanner.nextLine();
                        if(좌석[2].equals(전화번호)){
                            System.out.print("퇴실시간 시를 선택해 주세요. : ");
                            String hour = scanner.nextLine();
                            System.out.print("퇴실시간 분을 선택해 주세요. : ");
                            String minute = scanner.nextLine();

                            int 입실시 = Integer.parseInt(시[2]);
                            int 입실분 = Integer.parseInt(분[2]);
                            int 퇴실시 = Integer.parseInt(hour);
                            int 퇴실분 = Integer.parseInt(minute);
                            int 시간 =(퇴실시*60 + 퇴실분) - (입실시*60 + 입실분);
                            if(시간 > 0){
                                좌석[2] = "빈좌석";
                                시[2] = "0";
                                분[2] = "0";
                                sumTime += 시간;
                                System.out.printf("퇴실완료[ 좌석을 이용한 시간(분) : %3d분 ]\n", 시간);
                            } else {
                                System.out.println("퇴실시간 오류");
                            }
                        } else {
                            System.out.println("번호가 다릅니다.");
                        }
                    }
                } else {
                    System.out.println("입실이 없습니다.\n");
                }
            } else if(ch.equals("계산")){
                System.out.println("총 사용 시간 : " + sumTime+"분");
                break;
            }
        }


    }
}
