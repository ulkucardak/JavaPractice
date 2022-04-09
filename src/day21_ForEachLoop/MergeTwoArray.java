package day21_ForEachLoop;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {

        char[] ch1 = {'A', 'B', 'C'};
        char[] ch2 = {'D', 'E', 'F', 'G', 'H'};

        char[] ch = new char[ch1.length + ch2.length];


        int i = 0;
        for (char c : ch1) {
            ch[i] = c;
            i++;
        }
        for (char c : ch2) {
            ch[i] = c;
            i++;

        }

        System.out.println(Arrays.toString(ch));
    }
}
