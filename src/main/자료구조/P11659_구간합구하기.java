package main.자료구조;

import main.Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기 implements Solution {
    @Override
    public void solve() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.valueOf(stringTokenizer.nextToken());
        int quizNo = Integer.valueOf(stringTokenizer.nextToken());
        long[] S = new long[suNo + 1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i < suNo + 1; i++) {
            S[i] = S[i - 1] + Integer.valueOf(stringTokenizer.nextToken());
        }
        for (int q = 0; q < quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.valueOf(stringTokenizer.nextToken());
            int j = Integer.valueOf(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i - 1]);
        }
    }
}
