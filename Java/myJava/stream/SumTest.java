package myJava.stream;

import java.util.Arrays;

public class SumTest {
    public static void main(String[] args) {
        int n = 1234; // 각 자리수를 더하는 문제

        // 각 자리수가 필요한 경우 문자열로 변환해서 split()하세요
        // String[]를 생성

        String[] split = String.valueOf(n).split("");
        // {"1", "2", "3", "4"}

        // tmxmfladmfhaksemfrh --> map처리(하나씩 int로 변경)
        long sum = Arrays.stream(split).mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}
