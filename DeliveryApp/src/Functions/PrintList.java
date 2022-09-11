package Functions;

public class PrintList {
    public void printListToUser(){
        System.out.println("=============등록 현황=============");
        for (int i = 0; i < Database.cntArr.length; i++) {
            if(Database.cntArr[i] == 0) continue;
            System.out.printf("%d. %s\n 메뉴 : %s(%d원)\n", i+1, Database.storeName[i], Database.menuName[i], Database.price[i]);
            System.out.println("===============================");
            return;
        }
        System.out.println("[시스템] 등록된 매장이 없습니다.");
        System.out.println("===============================");
    }
}
