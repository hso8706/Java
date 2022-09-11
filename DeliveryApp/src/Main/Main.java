package Main;

import Functions.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userSelect = 0;
        int cnt = 0;
        OwnerRegister ownerRegister = new OwnerRegister();
        CancelOwnerRegister cancelOwnerRegister = new CancelOwnerRegister();
        LookUpReview lookUpReview = new LookUpReview();
        OrderMenu orderMenu = new OrderMenu();
        RegisterReview registerReview = new RegisterReview();
        PrintList printList = new PrintList();

        outer: while(true){

            System.out.println("[치킨의 민족 프로그램 V1]");
            printFunctions();
            userSelect = input.nextInt();

            while (userSelect < 1 || userSelect > 6) {
                System.out.println("잘못된 입력입니다. 1 ~ 6번 사이로 입력하여 주세요.");
                printFunctions();
                userSelect = input.nextInt();
            }

            switch (userSelect) {
                case 1:
                    ownerRegister.inputOwnerStoreInfo();
                    break;
                case 2:
                    cancelOwnerRegister.cancelRegister();
                    break;
                case 3:
                    orderMenu.order();
                    break;
                case 4:
                    registerReview.feedbackInputInfo();
                    break;
                case 5:
                    printList.printListToUser();
                    break;
                case 6:
                    lookUpReview.printInfo();
                case 7: break outer;
            }
        }
    }
    private static void printFunctions(){
        System.out.println("-------------------------");
        System.out.println("1) [사장님용] 음식점 등록하기");
        System.out.println("2) [사장님용] 음식점 등록 취소하기");
        System.out.println("3) [고객님용] 음식 주문하기");
        System.out.println("4) [고객님용] 별점 등록하기");
        System.out.println("5) [공용] 음식점 목록 확인하기");
        System.out.println("6) [공용] 음식점 별점 조회하기");
        System.out.println("7) 프로그램 종료하기");
        System.out.println("-------------------------");
        System.out.println("[시스템] 무엇을 도와드릴까요? ");
        System.out.print(">>>");
    }
}
