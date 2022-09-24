package kioskProgram_contents;

import java.util.Scanner;

public class Input_kioskProgram {
    Scanner input = new Scanner(System.in);
    public int inputNum(){
        int selectNum = input.nextInt();
        while (selectNum < 1 || selectNum > 4) {
            System.out.print("[안내]해당 번호의 메뉴는 없습니다. 번호를 다시 입력하여 주세요 : ");
            selectNum = input.nextInt();
        }
        return selectNum;
    }
    public int inputQuantity(){
        int selectQuantity = input.nextInt();
        while (selectQuantity < 1 || selectQuantity > 99) {
            System.out.printf("[안내]%d 개는 입력 하실 수 없습니다. 최대 수량을 확인해주세요 : ", selectQuantity);
            selectQuantity = input.nextInt();
        }
        return selectQuantity;
    }
}
