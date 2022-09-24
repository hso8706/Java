package Functions;

import java.util.Scanner;

public class OrderMenu {
    Scanner input = new Scanner(System.in);
    public String inputName = "";
    public void order(){
        if(checkStoreSlot()==0) {
            System.out.println("[시스템] 죄송합니다. 등록된 업체가 없습니다.");
            return;
        }
        PrintList printList = new PrintList();
        changeUserNameSlot();
        System.out.println("[안내] 고객님! 메뉴 주문을 진행하겠습니다!");
        System.out.println("[안내] 주문자 이름을 알려주세요!");
        System.out.print(">>>");
        Database.userName[0] = input.nextLine();
        while(true){
            printList.printListToUser();
            System.out.println("[안내] 주문할 음식점을 고르세요");
            System.out.print("번호 입력>>>");
            int tempNum = input.nextInt();
            input.nextLine(); // nextLine 에러 방지
            if(tempNum <= 0 || tempNum > 3) {
                System.out.println("[시스템] 잘못된 입력입니다. 다시 입력하여 주십시오.");
            }
            else if(Database.cntArr[tempNum-1] == 0) System.out.println("[시스템] 잘못된 입력입니다. 다시 입력하여 주십시오.");
            else {
                Database.userSelectNum[0] = tempNum-1;
                break;
            }
        }
        System.out.printf("[안내] %s님!\n", Database.userName[0]);
        System.out.printf("%s 매장에 %s 주문이 완료되었습니다\n", Database.storeName[Database.userSelectNum[0]], Database.menuName[Database.userSelectNum[0]]);
    }
    private void changeUserNameSlot(){
        Database.userName[2] = Database.userName[1];
        Database.userName[1] = Database.userName[0];
        Database.userName[0] = "";
        Database.userSelectNum[2] = Database.userSelectNum[1];
        Database.userSelectNum[1] = Database.userSelectNum[0];
        Database.userSelectNum[0] = -1;
        Database.starPoints[2] = Database.starPoints[1];
        Database.starPoints[1] = Database.starPoints[0];
        Database.starPoints[0] = "";
        /* 메소드 결과
        -userName 슬롯에서 빈 공간을 검색 및 제공
        -userName 슬롯이 꽉 찼다면, 저장 슬롯을 한 칸씩 이동시키고 첫 번째 슬롯 비움.
         */
    }
    private int checkStoreSlot(){
        int cnt = 0;
        for (int i = 0; i < Database.cntArr.length; i++) {
            if (Database.cntArr[i]==1) return i+1;
        }
        return cnt;
    }
}
