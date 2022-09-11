package Functions;

import java.util.Scanner;

public class OrderMenu {
    Scanner input = new Scanner(System.in);
    public void order(){
        PrintList printList = new PrintList();

        System.out.println("[안내] 고객님! 메뉴 주문을 진행하겠습니다!");
        System.out.println("[안내] 주문자 이름을 알려주세요!");
        System.out.print(">>>");
        checkUserNameSlot();
        Database.userName[Database.cntUser] = input.nextLine();
        while(true){
            printList.printListToUser();
            System.out.println("[안내] 주문할 음식점을 고르세요");
            System.out.print(">>>");
            Database.userSelectNum[Database.cntUser] = input.nextInt();
            input.nextLine(); // nextLine 에러 방지
            if(Database.userSelectNum[Database.cntUser] <= 0 || Database.userSelectNum[Database.cntUser] > 3) {
                System.out.println("[시스템] 잘못된 입력입니다. 다시 입력하여 주십시오.");
            }
            else break;
        }
        System.out.printf("[안내] %s님!\n", Database.userName[Database.cntUser]);
        System.out.printf("%s 매장에 %s 주문이 완료되었습니다", Database.storeName[Database.cntUser], Database.menuName[Database.cntUser]);
        Database.cntUser = 0; // 혹시 몰라서 초기화. 다음을 위해
    }
    private void checkUserNameSlot(){
        Database.cntUser = 0;
        for (int i = 0; i< Database.userName.length; i++) {
            if(!Database.userName[i].equals("")) Database.cntUser++;
        }
        if(Database.cntUser == 3){
            Database.userName[2] = Database.userName[1];
            Database.userName[1] = Database.userName[0];
            Database.userName[0] = "";
            Database.userSelectNum[2] = Database.userSelectNum[1];
            Database.userSelectNum[1] = Database.userSelectNum[0];
            Database.userSelectNum[0] = 0;
            Database.starPoints[2] = Database.starPoints[1];
            Database.starPoints[1] = Database.starPoints[0];
            Database.starPoints[0] = "";
        }
        /* 메소드 결과
        -userName 슬롯에서 빈 공간을 검색 및 제공
        -userName 슬롯이 꽉 찼다면, 저장 슬롯을 한 칸씩 이동시키고 첫 번째 슬롯 비움.
         */
    }
}
