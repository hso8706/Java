package Functions;

import java.util.Scanner;

public class Owner {
    Scanner input = new Scanner(System.in);
    private String storeName = "";
    private String menuName = "";
    private  int price = 0;

    public void ownerStore() {
        System.out.println("[안내] 반갑습니다. 가맹주님!");
        System.out.println("[안내] 음식점 상호는 무엇인가요?");
        System.out.print(">>>");
        storeName = input.next();
        System.out.println("[안내] 대표 메뉴 이름은 무엇인가요?");
        System.out.print(">>>");
        menuName = input.next();
        System.out.println("[안내] 해당 메뉴 가격은 얼마인가요?");
        System.out.print(">>>");
        price = input.nextInt();
        System.out.println("[시스템] 가게 등록이 정상 처리되었습니다.");
    }

    public String getStoreName() {
        return storeName;
    }

    public String getMenuName() {
        return menuName;
    }

    public int getPrice() {
        return price;
    }
}
