package Functions;

import java.util.Scanner;

public class OwnerRegister {
    Scanner input = new Scanner(System.in);
    static int checker;
    public void inputOwnerStoreInfo() {
        checkSlot();
        if(checker == -1) return;
        System.out.println("[안내] 반갑습니다. 가맹주님!");
        System.out.println("[안내] 음식점 상호는 무엇인가요?");
        System.out.print(">>>");
        Database.storeName[checker] = input.nextLine();
        System.out.println("[안내] 대표 메뉴 이름은 무엇인가요?");
        System.out.print(">>>");
        Database.menuName[checker] = input.nextLine();
        System.out.println("[안내] 해당 메뉴 가격은 얼마인가요?");
        System.out.print(">>>");
        Database.price[checker] = input.nextInt();
        input.nextLine(); // nextLine error 방지, 버퍼 제거
        if (Database.price[checker] <= 0) errorPrice();
        System.out.println("[시스템] 가게 등록이 정상 처리되었습니다.");
        Database.cntArr[checker] = 1;
//        System.out.println(Arrays.toString(Database.cntArr));
    }

    private void errorPrice() {
        System.out.println("[안내] 0이하의 가격을 불가능합니다. 가격을 다시 입력해 주세요.");
        System.out.print(">>> ");
        Database.price[checker] = input.nextInt();
        if (Database.price[checker]<0) errorPrice();
    }
    private void checkSlot(){
        checker = -1;
        for (int i = 0; i < Database.cntArr.length; i++) {
            if (Database.cntArr[i] == -1) {
                checker = i;
                return;
            }
        }
        System.out.println("[시스템] 등록 가능한 공간이 없습니다. 먼저 공간을 비워 주세요.");
    }
}
