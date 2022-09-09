package Functions;

public class LookUpReview {
    //배열로 저장

    private String[] userNameArr;
    private String[] storeNameArr;
    private String[] menuNameArr;
    private String[] starPointArr;
    //ArrayList 로 변경하기.
    private RegisterReview[] registerReview;

    public LookUpReview(RegisterReview[] registerReview) {
        this.registerReview = registerReview;
        reviewList(registerReview);
    }

    public void reviewList(RegisterReview[] reviewObject){
//        for (int i = 0; i < reviewObject.length; i++) {
//            userNameArr = Arrays.copyOf(userNameArr, userNameArr.length +1);
//            storeNameArr = Arrays.copyOf(storeNameArr, storeNameArr.length +1);
//            menuNameArr = Arrays.copyOf(menuNameArr, menuNameArr.length +1);
//            starPointArr = Arrays.copyOf(starPointArr, starPointArr.length +1);
//        }
        userNameArr = new String[reviewObject.length];
        storeNameArr = new String[reviewObject.length];
        menuNameArr = new String[reviewObject.length];
        starPointArr = new String[reviewObject.length];

        for (int i = 0; i < reviewObject.length; i++) {
            userNameArr[i] = reviewObject[i].getUserName();
            storeNameArr[i] = reviewObject[i].getStoreName();
            menuNameArr[i] = reviewObject[i].getMenuName();
            starPointArr[i] = reviewObject[i].getUserStars();
        }
    }

    public void printInfo(){
        for (int i = 0; i < userNameArr.length; i++) {
            System.out.printf("%s [고객님]\n", userNameArr[i]);
            System.out.println("-----------------------------");
            System.out.printf("주문 매장 : %s\n", storeNameArr[i]);
            System.out.printf("주문 메뉴 : %s\n", menuNameArr[i]);
            System.out.printf("별점 : %s\n", starPointArr[i]);
            System.out.println("-----------------------------");
        }

    }
}
