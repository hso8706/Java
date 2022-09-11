package Functions;

public class LookUpReview {
    public void printInfo(){
        for (int i = 0; i < Database.userName.length; i++) {
            System.out.println("-----------------------------");
            System.out.printf("%s [고객님]\n", Database.userName[i]);
            System.out.printf("주문 매장 : %s\n", Database.storeName[Database.userSelectNum[i]]);
            System.out.printf("주문 메뉴 : %s\n", Database.menuName[Database.userSelectNum[i]]);
            System.out.printf("별점 : %s\n", Database.starPoints[i]);
            System.out.println("-----------------------------");
        }

    }
}
