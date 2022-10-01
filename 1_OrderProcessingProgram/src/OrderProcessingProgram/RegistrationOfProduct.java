package OrderProcessingProgram;

import java.util.Scanner;

public class RegistrationOfProduct {
    public void registration(){
        int checkSlot = 0;
        for (int i = 0; i <Database.cntArr.length; i++) {
            if(Database.cntArr[i] == 1) checkSlot++;
        }
        if(checkSlot == 5) {
            System.out.println("[System] 등록 가능한 목록 공간이 없습니다. 공간을 비워주세요.");
            return;
        }
        for (int i = 0; i < Database.cntArr.length; i++) {
            if(Database.cntArr[i] == 0){
                Scanner input = new Scanner(System.in);
                System.out.print("[System] 제품 등록을 원하는 제품명을 입력하세요 : ");
                Database.setOneOfList(i, input.nextLine());
                Database.cntArr[i] = 1;
                System.out.println(i);
                System.out.println("[System] 등록이 완료됐습니다.");
                break;
            }
        }
    }
}
