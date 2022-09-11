package Functions;

public class Database {
    public static int[] cntArr = new int[]{-1, -1, -1};    // 업체명, 메뉴명, 메뉴가격 컨트롤러
    public static String[] storeName = new String[]{"[Blank]", "[Blank]", "[Blank]"}; // 업주 상호명 저장 배열(3)
    public static String[] menuName = new String[]{"[Blank]", "[Blank]", "[Blank]"}; // 업주 대표 메뉴명 저장 배열(3)
    public static int[] price = new int[]{0, 0, 0};   // 업주 대표 메뉴 가격 저장 배열(3)
    public static int cntUser = 0;  // 등록 유저 인원 확인 변수, userName 과 userSelectNum 을 동시에 컨트롤 할 것.
    public static String[] userName = new String[]{"","",""}; // 사용 유저 저장 배열(3)
    public static int[] userSelectNum = new int[] {-1, -1, -1}; // 각 유저가 주문한 가게 번호
    public static String[] starPoints = new String[]{"","",""};  // 각 유저가 매긴 별점
}

