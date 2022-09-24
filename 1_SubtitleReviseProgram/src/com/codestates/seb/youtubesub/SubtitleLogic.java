package com.codestates.seb.youtubesub;

import java.util.Scanner;

public class SubtitleLogic {
    Scanner input = new Scanner(System.in);
    String[] banSubList = new String[]{"킹", "시발", "꺼져", "미친"};
    String[] reviseSubList = new String[]{"왕", "사랑", "용기", "평화"};
    String[] userSub;
    String[] charSub;
    String inputSub = "";

    String inputSub(){
        System.out.println("[안내] 유튜브 영상의 자막을 생성해 주세요.");
        inputSub = input.nextLine();
        userSub = inputSub.split(" ");
        charSub = inputSub.split("");
        System.out.println("========================================");
        System.out.println("[알림] 프로그램의 금칙어 리스트입니다.");
        System.out.println("[킹, 시발, 꺼저, 미친]");
        System.out.println("========================================");
        System.out.println();
        reviseSub();
        System.out.println("[알림] 자막 순화 프로그램 결과입니다.");
        System.out.print(">>> ");
        return inputSub;
    }
    void reviseSub(){
        for (int i = 0; i < charSub.length; i++) {
            if(charSub[i].equals(banSubList[0])) charSub[i] = charSub[i].replace(charSub[i], reviseSubList[0]);
        }
        inputSub = String.join(" ", charSub);
        for (int i = 0; i < userSub.length; i++) {
            //switch 문으로도 해결하는게 더 깔끔할 듯. ->banSubList 가 필요없어질듯.
            for (int j = 0; j < banSubList.length; j++) {
                if (userSub[i].equals(banSubList[1])){
                    userSub[i] = userSub[i].replace(userSub[i], reviseSubList[1]);
                }
                else if (userSub[i].equals(banSubList[2])) {
                    userSub[i] = userSub[i].replace(userSub[i], reviseSubList[2]);
                }
                else if (userSub[i].equals(banSubList[3])) {
                    userSub[i] = userSub[i].replace(userSub[i], reviseSubList[3]);
                }
            }
        }
        inputSub = String.join(" ", userSub);
    }
}
