package Functions;

import java.util.Scanner;

public class RegisterReview {
    Scanner input = new Scanner(System.in);

    public void feedbackInputInfo(){
        int feedbackStar = 0;
        System.out.println("[안내] 고객님! 별점 등록을 진행합니다.");
        checkUserNameLogic();
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
        Database.cntUser = 0;
    }
    private void checkUserNameLogic(){
        Database.cntUser = 0;
        while(true){
            System.out.println("[안내] 주문자 이름은 무엇인가요?");
            System.out.print(">>>");
            String checkUserName = input.nextLine();
            for (int i = 0; i < Database.userName.length; i++) {
                if(checkUserName.equals(Database.userName[i])) Database.cntUser = i;
                return;
            }
            System.out.println("주문자 목록에 없는 이름입니다. 다시 입력하여 주세요.");
        }
    }
    private void starPointList(int num){
        switch (num) {
            case 1:
                Database.starPoints[Database.cntUser] = "★";
                break;
            case 2:
                Database.starPoints[Database.cntUser] = "★★";
                break;
            case 3:
                Database.starPoints[Database.cntUser] = "★★★";
                break;
            case 4:
                Database.starPoints[Database.cntUser] = "★★★★";
                break;
            case 5:
                Database.starPoints[Database.cntUser] = "★★★★★";
                break;
        }
    }
}
