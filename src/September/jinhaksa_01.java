package September;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class jinhaksa_01 {
    public static Scanner scanner = new Scanner(System.in);
    // 피타고라스의 수
    // a<=b<=c<=500,000 b값이 매개변수
    // c를 리턴
    public static int solution(int b) {
        for(int a = 1; a<=500000; a++)
        {
            for(int c = 1; c<=500000; c++)
            {
                if(a*a + b*b == c*c)
                {
                    if(a > b) { return -1; }
                    return c;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}
