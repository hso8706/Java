package Functions;

import java.util.Scanner;

public class RegisterReview {
    Scanner input = new Scanner(System.in);
    private String userName = "";    // 1
    private String storeName = "";   // 2
    private String menuName = "";    // 3
    private String userStars = "";   // 4
    private int feedbackStar = 0;   // 5
    /*
    1 ~ 4 변수 : 다른 패키지에도 사용될 변수. (public)
    5 변수 : 내부에서만 사용될 변수. 문자열을 고르기위한 전달 변수. (private)
     */
    public String getUserName() {
        return userName;
    }
    public String getUserStars() {
        return userStars;
    }
    public String getMenuName() {
        return menuName;
    }
    public String getStoreName() {
        return storeName;
    }
    public void feedbackInputInfo(){
        System.out.println("[안내] 고객님! 별점 등록을 진행합니다.");
        System.out.println("[안내] 주문자 이름은 무엇인가요?");
        System.out.print(">>>");
        userName = input.next();    // 조회하기: 고객명[]에 저장
        System.out.println("[안내] 음식점 상호는 무엇인가요?");
        System.out.print(">>>");
        storeName = input.next();   // 조회하기: 상호명[]에 저장
        System.out.println("[안내] 주문하신 음식 이름은 무엇인가요?");
        System.out.print(">>>");
        menuName = input.next();    // 조회하기: 메뉴명[]에 저장
        System.out.println("[안내] 음식맛은 어떠셨나요? (1점 ~ 5점)");
        System.out.print(">>>");
        feedbackStar = input.nextInt(); // 사용자 점수(숫자) -> 사용자 별점(문자열)
        // 오입력 처리 반복문
        while(feedbackStar<1 || feedbackStar >5){
            System.out.println("[안내] 잘못된 입력입니다. 1점 ~ 5점 사이의 숫자를 입력해 주세요.");
            System.out.print(">>>");
            feedbackStar = input.nextInt();
        }
        starPointList(feedbackStar);    // 조회하기: 별점[]에 저장
        System.out.println("[안내] 리뷰 등록이 완료되었습니다.");
    }
    public String starPointList(int num){
        switch (num) {
            case 1:
                userStars = "★";
                break;
            case 2:
                userStars = "★★";
                break;
            case 3:
                userStars = "★★★";
                break;
            case 4:
                userStars = "★★★★";
                break;
            case 5:
                userStars = "★★★★★";
                break;
        }
        return userStars;
    }
}
