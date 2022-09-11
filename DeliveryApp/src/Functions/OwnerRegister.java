package Functions;

import java.util.Scanner;

public class OwnerRegister {
    Database database = new Database();
    Scanner input = new Scanner(System.in);

    public void inputOwnerStoreInfo() {
        String inputName = "";
        int inputPrice = 0;
        int checker = -1;
        for (int i = 0; i < database.cntArr.length; i++) {
            if (database.cntArr[i] == 0) {
                checker = i;
                break;
            }
        }
        if (checker == -1) {
            System.out.println("[시스템] 등록 가능한 공간이 없습니다. 공간을 비워 주세요.");
            return;
        }
        System.out.println("[안내] 반갑습니다. 가맹주님!");
        System.out.println("[안내] 음식점 상호는 무엇인가요?");
        System.out.print(">>>");
        inputName = input.nextLine();
        database.setStoreName(checker, inputName);
        System.out.println("[안내] 대표 메뉴 이름은 무엇인가요?");
        System.out.print(">>>");
        inputName = input.nextLine();
        database.setMenuName(checker, inputName);
        System.out.println("[안내] 해당 메뉴 가격은 얼마인가요?");
        System.out.print(">>>");
        inputPrice = input.nextInt();
        if (inputPrice <= 0) errorPrice();
        database.setPrice(checker, inputPrice);
        System.out.printf("[안내]%s에 음식(%s, %d) 추가되었습니다.", database.getStoreName(checker), database.getMenuName(checker), database.getPrice(checker));
        System.out.println("[시스템] 가게 등록이 정상 처리되었습니다.");
        database.cntArr[checker] = 1;
    }

    private int errorPrice() {
        int inputPrice = 0;
        System.out.println("[안내] 0이하의 가격을 불가능합니다. 가격을 다시 입력해 주세요.");
        System.out.print(">>> ");
        inputPrice = input.nextInt();
        if (inputPrice <= 0) errorPrice();
        return inputPrice;
    }
}
