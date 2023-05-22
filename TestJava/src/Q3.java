
/*
 * 3. 5*5 이차원 배열을 선언하고
   1을 입력하면 한칸 오른쪽으로
     -1를 입력하면 한칸 왼쪽으로
     2를 입력하면 한칸 위로
     -2를 입력하면 한칸 아래로
    0을 입력하면 종료하도록 하시오
     

3번 문제는 무한 루프로 만드시오
 */

import java.util.Scanner;

public class Q3 {
    
    // 5x5 이차원 배열 초기화 메소드
    public static int[][] initializeArray() {
        int[][] arr = new int[5][5];
        arr[0][0] = 1;  // 시작 위치 (0, 0)에 1 저장
        return arr;
    }

    // 배열 출력 메소드
    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // 사용자 입력 메소드
    public static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이동 방향을 선택하세요 (1: 오른쪽, -1: 왼쪽, 2: 위로, -2: 아래로, 0: 종료): ");
        int choice = scanner.nextInt();
        return choice;
    }

    // 오른쪽 이동 메소드
    public static void moveRight(int[][] arr) {
        int row = 0;
        int col = 0;

        // 현재 위치 찾기
        outerLoop:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    row = i;
                    col = j;
                    break outerLoop;
                }
            }
        }

        // 이동
        if (col < arr[row].length - 1) {
            arr[row][col] = 0;
            arr[row][col + 1] = 1;
        }
    }

    // 왼쪽 이동 메소드
    public static void moveLeft(int[][] arr) {
        int row = 0;
        int col = 0;

        // 현재 위치 찾기
        outerLoop:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] ==1) {
                    row = i;
                    col = j;
                    break outerLoop;
                }
            }
        }

        // 이동
        if (col > 0) {
            arr[row][col] = 0;
            arr[row][col - 1] = 1;
        }
    }

    // 위로 이동 메소드
    public static void moveUp(int[][] arr) {
        int row = 0;
        int col = 0;

        // 현재 위치 찾기
        outerLoop:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    row = i;
                    col = j;
                    break outerLoop;
                }
            }
        }

        // 이동
        if (row > 0) {
            arr[row][col] = 0;
            arr[row - 1][col] = 1;
        }
    }

    // 아래로 이동 메소드
    public static void moveDown(int[][] arr) {
        int row = 0;
        int col = 0;

        // 현재 위치 찾기
        outerLoop:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    row = i;
                    col = j;
                    break outerLoop;
                }
            }
        }

        // 이동
        if (row < arr.length - 1) {
            arr[row][col] = 0;
            arr[row + 1][col] = 1;
        }
    }

    public static void main(String[] args) {
        int[][] arr = initializeArray();  // 이차원 배열 초기화

        while (true) {
            printArray(arr);  // 배열 출력

            int choice = getUserChoice();  // 사용자 입력

            if (choice == 1) {
                moveRight(arr);  // 오른쪽으로 이동
            } else if (choice == -1) {
                moveLeft(arr);  // 왼쪽으로 이동
            } else if (choice == 2) {
                moveUp(arr);  // 위로 이동
            } else if (choice == -2) {
                moveDown(arr);  // 아래로 이동
            } else if (choice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("유효한 입력이 아닙니다. 다시 입력해주세요.");
            }
        }
    }
}

