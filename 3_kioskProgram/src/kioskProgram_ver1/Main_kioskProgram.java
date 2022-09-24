package kioskProgram_ver1;

import java.util.Scanner;

public class Main_kioskProgram {
    public static void main(String[] args) {
        System.out.println("===============키오스크 프로그램===============");
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
        System.out.println("[안내]안녕하세요. 카페스테이츠에 오신 것을 환영합니다.");
        System.out.println("=============================================");
        System.out.println("");
//        InputUserSelect inData = new InputUserSelect();
//        inData.input();

        Scanner input = new Scanner(System.in);
        System.out.println("[안내]==============================메뉴 리스트==============================");
        System.out.println("[안내](1)아메리카노: 3500원 (2)카페라테: 4000원 (3)아이스초코: 3800원 (4)물: 2000원");
        System.out.print("[안내]원하시는 메뉴의 번호를 입력하여 주세요. : ");
        int selectNum = input.nextInt();
        while (selectNum < 1 || selectNum > 5) {
            System.out.print("[안내]해당 번호의 메뉴는 없습니다. 번호를 다시 입력하여 주세요 : ");
            selectNum = input.nextInt();
        }

        System.out.print("[안내]선택하신 메뉴의 수량을 입력하여 주세요. (최대 주문 가능 수량: 99) : ");
        int selectQuantity = input.nextInt();
        while (selectQuantity < 1 || selectQuantity > 99) {
            System.out.printf("[안내]%d 개는 입력 하실 수 없습니다. 최대 수량을 확인해주세요 : ", selectQuantity);
            selectQuantity = input.nextInt();
        }

        switch (selectNum) {
            case 1:
                System.out.printf("주문하신 메뉴의 총 금액은 %d 원 입니다.\n", (InfoMenu.getAmericanoPrice()*selectQuantity));
                break;
            case 2:
                System.out.printf("주문하신 메뉴의 총 금액은 %d 원 입니다.\n", (InfoMenu.getCafeLattePrice()*selectQuantity));
                break;
            case 3:
                System.out.printf("주문하신 메뉴의 총 금액은 %d 원 입니다.\n", (InfoMenu.getIceChocoPrice()*selectQuantity));
                break;
            case 4:
                System.out.printf("주문하신 메뉴의 총 금액은 %d 원 입니다.\n", (InfoMenu.getWaterPrice()*selectQuantity));
                break;
        }
        System.out.println("[안내]이용해 주셔서 감사합니다.");
    }
}

class InfoMenu {
    private static int americanoPrice = 3500;
    private static int cafeLattePrice = 4000;
    private static int iceChocoPrice = 3800;
    private static int waterPrice = 2000;

    public static int getAmericanoPrice() {
        return americanoPrice;
    }
    public static int getCafeLattePrice() {
        return cafeLattePrice;
    }
    public static int getIceChocoPrice() {
        return iceChocoPrice;
    }
    public static int getWaterPrice() {
        return waterPrice;
    }
}
