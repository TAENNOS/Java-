package week02.Operator;

public class w15_반복문 {
    public static void main(String[] args) {
        // for문
        for (int i=0; i < 4 ; i++) {
            System.out.println(i + "번째 출력!");
        }

        System.out.println("---------");

        // 향상된 for문
        // 기존 for문 : 안에 3개의 표현이 들어감 -> (초가값 ; 조건문 ; 증가연산)
        // 향상된 for문 : 2개로 줄여줌
        int[] numbers = {3, 6, 9, 12, 15};
        for (int number: numbers) {
            System.out.print(number + " ");
        }

        System.out.println("---------");

        int[] numbers2 = {3, 6, 9, 12, 15};
        for (int i=0; i < 5; i++) {
            System.out.print(numbers2[i] + " ");
        }
    }
}
