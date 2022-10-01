package OrderProcessingProgram;

import java.util.Scanner;

public class Cancel_RegistrationOfProduct {
    public void cancelRegistration(){

        outer: for (int i = 0; i < Database.getListOfProduct().length; i++) {
            if (Database.cntArr[i] == 1) {
                Scanner input = new Scanner(System.in);
                String cancel = "";
                while(true){
                    System.out.print("[System] 등록 취소를 원하는 제품명을 입력하세요 : ");
                    cancel = input.nextLine();
                    for (int j = 0; j < Database.getListOfProduct().length; j++) {
                        if (Database.getOneOfList(j).equals(cancel)) {
                            Database.setOneOfList(j, "등록 가능");
                            System.out.println("[System] 취소가 완료됐습니다.");
                            break outer;
                        }
                    }
                    System.out.println("[System] 올바른 입력이 아닙니다. 제품 목록을 다시 확인하여 주십시오.");
                }
            }
        }
        System.out.println("[System] 취소 가능한 제품 목록이 없습니다. 제품을 먼저 등록 해주세요.");
    }
}
