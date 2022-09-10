package Main;

import Functions.LookUpReview;
import Functions.Order;
import Functions.OwnerRegister;
import Functions.RegisterReview;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userSelect = 0;
        int cnt = 0;
        OwnerRegister ownerRegister = new OwnerRegister();
        LookUpReview lookUpReview;
        Order order;
        RegisterReview[] registerReview = new RegisterReview[0];

        outer: while(true){

            System.out.println("[치킨의 민족 프로그램 V1]");
            printFunctions();
            userSelect = input.nextInt();

            while (userSelect < 1 || userSelect > 5) {
                System.out.println("잘못된 입력입니다. 1 ~ 5번 사이로 입력하여 주세요.");
                printFunctions();
                userSelect = input.nextInt();
            }

            switch (userSelect) {
                case 1:
                    ownerRegister.inputOwnerStoreInfo();
                    break;
                case 2:
                    if(cnt==0){
                        System.out.println("[안내] 등록된 별점 후기가 존재하지 않습니다. 다른 기능을 먼저 이용해주세요.");
                        break;
                    };
                    lookUpReview = new LookUpReview(registerReview);
                    lookUpReview.printInfo();
                    break;
                case 3:
                    order = new Order();
                    order.orderMenu();
                    break;
                case 4:
                    cnt++;
                    registerReview = Arrays.copyOf(registerReview, registerReview.length + 1);
                    registerReview[cnt - 1] = new RegisterReview();
                    registerReview[cnt -1].feedbackInputInfo();
                    break;
                case 5: break outer;
            }
        }
    }
    private static void printFunctions(){
        System.out.println("-------------------------");
        System.out.println("1) [사장님용] 음식점 등록하기");
        System.out.println("1) [사장님용] 음식점 등록하기");
        System.out.println("2) [고객님과 사장님용] 음식점 별점 조회하기");
        System.out.println("3) [고객님용] 음식 주문하기");
        System.out.println("4) [고객님용] 별점 등록하기");
        System.out.println("5) 프로그램 종료하기");
        System.out.println("-------------------------");
        System.out.println("[시스템] 무엇을 도와드릴까요? ");
        System.out.print(">>>");
    }
}
