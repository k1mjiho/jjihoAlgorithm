package September;

import java.util.Arrays;
import java.util.Scanner;

// 200915
// K번째 수
public class BOJ_1300 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // 입력
        int size = scanner.nextInt();
        // size <= 10^5
        if(size > Math.pow(10, 5)) {
            size = scanner.nextInt();
        }
        int k = scanner.nextInt();
        if(k > Math.pow(size, 2)) {
            k = scanner.nextInt();
        }

        // size*size 크기만큼의 일차원 배열 선언
        int[] sortArray = new int[size*size];
        int index = 0; // 배열의 인덱스

        for(int i=1; i<=size; i++) {
            for(int j=1; j<=size; j++) {
                sortArray[index++] = i*j;
            }
        }
        Arrays.sort(sortArray); // 오름차순으로 정렬
        System.out.println(sortArray[k]);
    }
}
