package main.자료구조;

import main.Solution;

import java.util.Scanner;

public class P11720_숫자의합 implements Solution {
    @Override
    public void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += cNum[i] - '0';
        }
        System.out.println(sum);
    }
}
