/*
 * 1. 10길이의 배열을 선언하고
     1 0 0 0 0 0 0 0 0 0 으로 초기화 한뒤 출력하고
     숫자를 입력하여 입력한 숫자에 해당하는 번호로 1을 이동하게 만드시오 (처음 숫자는 1부터 시작합니다.)
	ex) 4입력시 -> 0 0 0 1 0 0 0 0 0 0

    + 메소드 이용하기! 메소드를 아직도 어려워하니 영진아 ..
    + 주석 다는 것 습관 기르기
    
    제한 시간 30분으로 시작
    ㄴ> 쌉성공
 */

import java.util.Scanner;

public class Q1 {
    int moveTo;
    int[] backGround = { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 }; // 인스턴스 변수1
    Boolean keepPlay = true; // 인스턴스 변수4

    public void printBackground() { // 메소드
        for(int i = 0; i < 10; i++) {
            System.out.print(backGround[i]);
            
        }
        for (int j = 0; j < 10; j++) { // 처음 출력한 뒤 배열의 모든 수를 0으로 초기화
            backGround[j] = 0;
        }
    }

    public void exitGmae() {
        
        if (moveTo == -1) {
            System.out.println("프로그램을 종료합니다. ");
            keepPlay = false;
        }
    }


    public void playQ1() {
        Scanner sc = new Scanner(System.in);
        
        while(keepPlay) {
            printBackground();
            System.out.println();
            System.out.println("몇 번째로 이동하시겠습니까? : (1 ~ 10)");
            moveTo = sc.nextInt() - 1; // 배열은 0에서부터 9까지 선언되어 있음.
            backGround[moveTo] = 1;
        }
        sc.close();
    }

    public static void main(String[] args) {
        Q1 setUp = new Q1();
        setUp.playQ1();
    }
}
