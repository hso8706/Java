package Functions;

public class LookUpReview {
    public void printInfo(){
        int cnt = 0;
        for (int i = 0; i < Database.userName.length; i++) {
            if(!Database.starPoints[i].equals("")){
                cnt++;
                System.out.println("-----------------------------");
                System.out.printf("고객명 : %s\n", Database.userName[i]);
                if(Database.storeName[i].equals("[Blank]")){
                    System.out.println("주문 매장이 망했습니다.ㅠㅠ");
                    System.out.println("-----------------------------");
                }
                else{
                    System.out.printf("주문 매장 : %s\n", Database.storeName[Database.userSelectNum[i]]);
                    System.out.printf("주문 메뉴 : %s\n", Database.menuName[Database.userSelectNum[i]]);
                    System.out.printf("별점 : %s\n", Database.starPoints[i]);
                    System.out.println("-----------------------------");
                }
            }
        }
        if(cnt == 0) System.out.println("[시스템] 등록된 후기가 없습니다.");
    }
}
