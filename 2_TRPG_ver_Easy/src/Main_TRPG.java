import java.util.Scanner;

public class Main_TRPG {
    public static void main(String[] args) {
        //1.유저에게 유닛 정보를 입력받음.
        //1.1. 플레이어 유닛 정보, 적 유닛 정보 두 개를 입력 받음. >적 랜덤으로 수정 >>정해진 유닛을 고르고 유닛마다 고유 스탯 이용.
        //1.2. 유닛 정보 : 유닛 명, 유닛 공격력, 유닛 방어력, 유닛 체력
        //1.3. 플레이어 유닛 정보, 적 유닛 정보 출력 >적 랜덤으로 수정
        //2.턴제 배틀 게임 시작
        //2.1. player 입력으로 시작.
        //2.1.1. player 턴: 1.공격 과 2.방어 를 선택
        //2.1.2. 선택한 선택지의 능력치로 적과 배틀
        //2.1.2. 적의 턴: 1.공격 과 2.방어 를 랜덤 선택

        //수정 필요
        //1. 생성 클래스를 따로 설정해야 할 듯 : 그렇지 않으면 턴제 배틀 계산을 Main에서 하게됨.
        Scanner input = new Scanner(System.in);

        String info = "[안내]";
        String system = "[시스템]";

        System.out.printf("%s TRPG 리그오브레전드를 시작합니다.\n", info);
        System.out.printf("%s 플레이어 유닛의 정보를 입력해 주세요.\n", info);
        System.out.printf("%s 유닛의 [이름] 을 입력해 주세요 : ", system);
        String inputUserName = input.next();
        System.out.printf("%s 유닛의 [공격력] 을 입력해 주세요 : ", system);
        String inputUserOffence = input.next();
        System.out.printf("%s 유닛의 [방어력] 을 입력해 주세요 : ", system);
        String inputUserDefence = input.next();
        System.out.printf("%s 유닛의 [체력] 을 입력해 주세요 : ", system);
        String inputUserHP = input.next();
        UnitsInformation_TRPG player = new UnitsInformation_TRPG(inputUserName, inputUserOffence, inputUserDefence, inputUserHP);
        System.out.printf("\n%s 생성된 유닛 정보는 다음과 같습니다.\n", info);
        System.out.printf("%s 플레이어가 게임에 참여하였습니다..\n", info);
        player.printUnitsInformation();

        System.out.printf("%s 적 유닛의 정보를 입력해 주세요.\n", info);
        System.out.printf("%s 유닛의 [이름] 을 입력해 주세요 : ", system);
        String inputEnemyName = input.next();
        System.out.printf("%s 유닛의 [공격력] 을 입력해 주세요 : ", system);
        String inputEnemyOffence = input.next();
        System.out.printf("%s 유닛의 [방어력] 을 입력해 주세요 : ", system);
        String inputEnemyDefence = input.next();
        System.out.printf("%s 유닛의 [체력] 을 입력해 주세요 : ", system);
        String inputEnemyHP = input.next();
        UnitsInformation_TRPG enemy = new UnitsInformation_TRPG(inputEnemyName, inputEnemyOffence, inputEnemyDefence, inputEnemyHP);
        System.out.printf("\n%s 생성된 유닛 정보는 다음과 같습니다.\n", info);
        System.out.printf("%s 적이 게임에 참여하였습니다..\n", info);
        enemy.printUnitsInformation();

        System.out.printf("\n%s 게임 시작.\n", info);
        while(player.unitHealthPoint > 0 && enemy.unitHealthPoint > 0){
            System.out.printf("%s 유닛에게 명령을 내리십시오.\n", info);
            System.out.printf("%s 1.공격 2.방어 : ", info);
            int playerMotion = input.nextInt();
            int enemyMotion = (int)(Math.random()*3+1);
            System.out.println("========================================\n");
            if(playerMotion == 1){
                if(enemyMotion==1) {
                    System.out.printf("%s [플레이어] 이(가) [공격] 을(를) 합니다.\n", system);
                    System.out.printf("%s [적] 이(가) [공격] 을(를) 합니다.\n", system);
                    player.unitHealthPoint -= enemy.unitOffencePoint;
                    enemy.unitHealthPoint -= player.unitOffencePoint;
                    System.out.printf("%s [플레이어] 의 남은 [체력] : %d\n", system, player.unitHealthPoint);
                    System.out.printf("%s [적] 의 남은 [체력] : %d\n", system, enemy.unitHealthPoint);
                }
                else{
                    System.out.printf("%s [플레이어] 이(가) [공격] 을(를) 합니다.\n", system);
                    System.out.printf("%s [적] 이(가) [방어] 을(를) 합니다.\n", system);
                    enemy.unitHealthPoint = (enemy.unitDefencePoint - player.unitOffencePoint)>0 ? enemy.unitHealthPoint : enemy.unitHealthPoint-(player.unitOffencePoint - enemy.unitDefencePoint);
                    System.out.printf("%s [플레이어] 의 남은 [체력] : %d\n", system, player.unitHealthPoint);
                    System.out.printf("%s [적] 의 남은 [체력] : %d\n", system, enemy.unitHealthPoint);
                }
            }
            else if(playerMotion == 2){
                if(enemyMotion==1) {
                    System.out.printf("%s [플레이어] 이(가) [방어] 을(를) 합니다.\n", system);
                    System.out.printf("%s [적] 이(가) [공격] 을(를) 합니다.\n", system);
                    player.unitHealthPoint = (player.unitDefencePoint - enemy.unitOffencePoint)>0 ? player.unitHealthPoint : player.unitHealthPoint-(enemy.unitOffencePoint - player.unitDefencePoint);
                    System.out.printf("%s [플레이어] 의 남은 [체력] : %d\n", system, player.unitHealthPoint);
                    System.out.printf("%s [적] 의 남은 [체력] : %d\n", system, enemy.unitHealthPoint);
                }
                else{
                    System.out.printf("%s [플레이어] 이(가) [방어] 을(를) 합니다.\n", system);
                    System.out.printf("%s [적] 이(가) [방어] 을(를) 합니다.\n", system);
                    System.out.printf("%s [플레이어] 의 남은 [체력] : %d\n", system, player.unitHealthPoint);
                    System.out.printf("%s [적] 의 남은 [체력] : %d\n", system, enemy.unitHealthPoint);
                }
            }
            if (player.unitHealthPoint <= 0 ) System.out.printf("%s [플레이어] 이(가) [패배] 했습니다.\n", info);
            else if(enemy.unitHealthPoint <= 0) System.out.printf("%s [플레이어] 이(가) [승리] 했습니다.\n", info);
        }
    }
}
