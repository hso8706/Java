package kioskProgram_start;

import kioskProgram_contents.*;

public class Main_kioskProgram {
    public static void main(String[] args) {
        //기능
        //1. 메뉴 선택(사용자 입력)
        //1.1. 메뉴
        //1.1.1. 배열[4]: (1)아메리카노, (2)카페라테, (3)아이스초코, (4)물
        //1.1.2. 메뉴 별 가격 설정
        //2. 수량 입력(사용자 입력)
        //2.1. 최대 주문 가능 수량 제한 설정: 99까지 가능, 100이상 에러
        //3. 결제 요청 금액 출력
        //3.1. 결제 금액 = 선택한 메뉴 가격 * 수량
        //추가: 리스트에 없는 잘못된 입력 시, 에러 출력 및 재실행
        System.out.println("=============================================");
        System.out.println("[안내]안녕하세요. 카페스테이츠에 오신 것을 환영합니다.");
        System.out.println("=============================================");
        System.out.println();
        System.out.println("[안내]==============================메뉴 리스트==============================");
        System.out.println("[안내](1)아메리카노: 3500원 (2)카페라테: 4000원 (3)아이스초코: 3800원 (4)물: 2000원");
        System.out.println("[안내]=====================================================================");
        System.out.println();

        Input_kioskProgram input = new Input_kioskProgram();
        Output_kioskProgram output = new Output_kioskProgram();
        int userMenu = 0;   //유저 메뉴 선택 저장 변수
        int userQuan = 0;   //유저 수량 선택 저장 변수
        System.out.print("[안내]원하시는 메뉴의 번호를 입력하여 주세요. : ");
        userMenu = input.inputNum();
        System.out.print("[안내]선택하신 메뉴의 수량을 입력하여 주세요. (최대 주문 가능 수량: 99) : ");
        userQuan = input.inputQuantity();
        output.printResult(userMenu, userQuan);
        System.out.println("[안내]이용해 주셔서 감사합니다.");
    }
}


