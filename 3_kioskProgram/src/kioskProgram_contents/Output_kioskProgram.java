package kioskProgram_contents;

public class Output_kioskProgram extends MenuList_kioskProgram{

    public void printResult(int selectNum, int selectQuantity){
        switch (selectNum) {
            case 1:
                System.out.printf("주문하신 메뉴의 총 금액은 %d 원 입니다.\n", (getAmericanoPrice()*selectQuantity));
                break;
            case 2:
                System.out.printf("주문하신 메뉴의 총 금액은 %d 원 입니다.\n", (getCafeLattePrice()*selectQuantity));
                break;
            case 3:
                System.out.printf("주문하신 메뉴의 총 금액은 %d 원 입니다.\n", (getIceChocoPrice()*selectQuantity));
                break;
            case 4:
                System.out.printf("주문하신 메뉴의 총 금액은 %d 원 입니다.\n", (getWaterPrice()*selectQuantity));
                break;
        }
    }
}
