package September;

import java.util.Arrays;

public class jinhaksa_02 {

    public static int solution(int[][] matrix) {
        int answer = 0;
        int len = matrix.length;
        int center = (int) Math.floor(len/2);
        int[] list = new int[len];
        int[] list2 = new int[len];

        for(int i=0; i<len; i++){
            int[] arr = new int[len];
            int[] arr2 = new int[len];

            for(int j=0; j<len; j++) {
                arr[j] =+ matrix[i][j];
                arr2[j] =+ matrix[j][i];
            }
            Arrays.sort(arr);
            Arrays.sort(arr2);
            list[i] =+ arr[center];
            list2[i] =+ arr2[center];
        }
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(list[i] == list2[j]) { answer++; }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,19,20,8,25},
                {21,4,3,17,24},
                {12,5,6,16,15},
                {11,18,10,9,23},
                {7,13,14,22,2}
        };
        System.out.println(solution(matrix));
    }
}
