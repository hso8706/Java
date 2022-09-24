package Functions;

import java.util.Scanner;

public class CancelOwnerRegister {
    Scanner input = new Scanner(System.in);
    public void cancelRegister(){
        String inputName = "";
        if(checkSlot() == -1) return;
        while(true){
            System.out.println("[안내] 등록을 취소할 상호명을 입력하여 주세요.");
            System.out.print(">>> ");
            inputName = input.nextLine();
            for (int i = 0; i < Database.cntArr.length; i++) {
                if(inputName.equals(Database.storeName[i])){
                    Database.storeName[i] = "[Blank]";
                    Database.menuName[i] = "[Blank]";
                    Database.price[i] = 0;
                    Database.cntArr[i] = -1;
                    System.out.println("[안내] 해당 가게 등록 정보를 제거하였습니다.");
                    return;
                }
            }
            System.out.println("[안내] 잘못된 입력입니다. 다시 입력해 주시길 바랍니다.");
        }
    }
    private int checkSlot(){
        int checker = -1;
        for (int i = 0; i < Database.cntArr.length; i++) {
            if(Database.cntArr[i] != -1){
                checker = i;
                return checker;
            }
        }
        System.out.println("[시스템] 취소 가능한 슬롯이 없습니다. 등록을 먼저 해주세요.");
        return checker;
    }
}
