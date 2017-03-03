package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by tpusers on 2017/2/19.
 */
public class WordBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        String[] strings = scanner.next().split(",");
        List<String> dict = Arrays.asList(strings);
        System.out.println(wordBreak(s, dict));
    }
    public static Boolean wordBreak(String s, List<String> dict) {
        boolean[] f = new boolean[s.length() + 1];
        f[0] = true;
        for (int i = 1; i <= s.length(); i ++)
            for (int j = 0; j < i; j ++)
                if (f[j] && dict.contains(s.substring(j, i))){
                    f[i] = true;
                    break;
                }
        return f[s.length()];
    }
}
