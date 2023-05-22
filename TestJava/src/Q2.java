/*
 * 2. 10길이의 배열을 선언하고
   1 0 0 0 0 0 0 0 0 0 으로 초기화 한뒤 출력하고
   1을 입력하면 한칸 오른쪽으로
   -1를 입력하면 한칸 왼쪽으로 이동하도록 하시오.

   
 */

 import java.util.Arrays;
 import java.util.Scanner;
 
 public class Q2 {
     
     // 배열 초기화 메소드
     public static int[] initializeArray() {
         int[] arr = new int[10];
         Arrays.fill(arr, 0);  // 모든 원소를 0으로 초기화
         arr[0] = 1;  // 첫 번째 원소를 1로 설정
         return arr;
     }
 
     // 사용자 입력 메소드
     public static int getUserChoice() {
         Scanner scanner = new Scanner(System.in);
         System.out.print("1을 입력하면 한 칸 오른쪽으로, -1을 입력하면 한 칸 왼쪽으로 이동합니다: ");
         int choice = scanner.nextInt();
         return choice;
     }
 
     // 오른쪽 이동 메소드
     public static void moveRight(int[] arr) {
         int temp = arr[arr.length - 1];
         for (int i = arr.length - 1; i > 0; i--) {
             arr[i] = arr[i - 1];
         }
         arr[0] = temp;
     }
 
     // 왼쪽 이동 메소드
     public static void moveLeft(int[] arr) {
         int temp = arr[0];
         for (int i = 0; i < arr.length - 1; i++) {
             arr[i] = arr[i + 1];
         }
         arr[arr.length - 1] = temp;
     }

     public static void main(String[] args) {
        int[] arr = initializeArray();  // 배열 초기화

        while (true) {
            System.out.println(Arrays.toString(arr));  // 배열 출력

            int choice = getUserChoice();

            if (choice == 1) {
                moveRight(arr);  // 한 칸 오른쪽으로 이동
            } else if (choice == -1) {
                moveLeft(arr);  // 한 칸 왼쪽으로 이동
            } else {
                System.out.println("유효한 입력이 아닙니다. 프로그램을 종료합니다.");
                break;
            }
        }
    }

 }