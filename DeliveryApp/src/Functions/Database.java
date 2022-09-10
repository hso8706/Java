package Functions;

public class Database {
    private String[] storeName = new String[]{"[Blank]", "[Blank]", "[Blank]", "[Blank]", "[Blank]"}; // 업주 상호명 저장 배열(5), private-getter,setter 생성.
    private String[] menuName = new String[]{"[Blank]", "[Blank]", "[Blank]", "[Blank]", "[Blank]"}; // 업주 대표 메뉴명 저장 배열(5), private-getter,setter 생성.
    private int[] price = new int[]{0, 0, 0, 0, 0};   // 업주 대표 메뉴 가격 저장 배열(5), private-getter,setter 생성.

    int[] cntArr = new int[]{0, 0, 0, 0, 0};    // 배열 빈 공간 검색을 위한 변수.
    public String getStoreName(int cnt) {
        return storeName[cnt];
    }
    public String getMenuName(int cnt) {
        return menuName[cnt];
    }
    public int getPrice(int cnt) {
        return price[cnt];
    }
    public void setStoreName(int cnt, String storeName) {
        this.storeName[cnt] = storeName;
    }
    public void setMenuName(int cnt, String menuName) {
        this.menuName[cnt] = menuName;
    }
    public void setPrice(int cnt, int price) {
        this.price[cnt] = price;
    }
}
