package Functions;

import java.util.Scanner;

public class CancelOwnerRegister {
    Database database = new Database();
    Scanner input = new Scanner(System.in);
    public void cancelRegister(){
        String inputName = "";
        int checker = -1;
        for (int i = 0; i < database.cntArr.length; i++) {
            if(database.cntArr[i] != 0){
                checker = i;
                break;
            }
        }
        if (checker == -1) {
            System.out.println("[시스템] 등록 취소 가능한 정보가 없습니다. 등록을 먼저 해주세요.");
            return;
        }
        outer: while(true){
            System.out.println("[안내] 등록을 취소할 상호명을 입력하여 주세요.");
            System.out.print(">>> ");
            inputName = input.nextLine();
            for (int i = 0; i < database.cntArr.length; i++) {
                if(inputName.equals(database.getStoreName(i))){
                    database.setStoreName(i, "[Blank}");
                    database.setMenuName(i, "[Blank]");
                    database.setPrice(i, 0);
                    database.cntArr[i] = -1;
                    System.out.println("[안내] 해당 가게 등록 정보를 제거하였습니다.");
                    return;
                }
            }
            System.out.println("[안내] 잘못된 입력입니다.");
        }
    }
}
