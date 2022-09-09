package Functions;

import java.util.Scanner;

public class Order {
    Scanner input = new Scanner(System.in);
    private String userName = "";
    private String storeName = "";
    private String menuName = "";
    public void orderMenu(){
        System.out.println("[안내] 고객님! 메뉴 주문을 진행하겠습니다!");
        System.out.println("[안내] 주문자 이름을 알려주세요!");
        System.out.print(">>>");
        userName = input.next();
        System.out.println("[안내] 주문할 음식점 상호는 무엇인가요?");
        System.out.print(">>>");
        storeName = input.next();
        System.out.println("[안내] 주문할 메뉴 이름을 알려주세요!");
        System.out.print(">>>");
        menuName = input.next();

        System.out.printf("[안내] %s님!\n", userName);
        System.out.printf("%s 매장에 %s 주문이 완료되었습니다", storeName, menuName);
    }
    public String getUserName() {
        return userName;
    }
    public String getStoreName() {
        return storeName;
    }
    public String getMenuName() {
        return menuName;
    }
}
