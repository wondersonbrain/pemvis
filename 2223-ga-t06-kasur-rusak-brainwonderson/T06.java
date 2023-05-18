// 12S22035 - Brain Wonderson
// 12S22044 - Jufourlisa
import java.util.*;
import java.lang.Math;

public class T06 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i, k, tot;
        String sentence;
        
        sentence = input.nextLine();
        tot = sentence.length();
        String[] data = new String[tot];
        
        sentence(tot, sentence, data);
        k = 0;
        i = tot - 1;
        boolean answer;
        
        answer = true;
        while (tot >= 1 && answer == true) {
            if (data[k].equals(data[i])) {
                answer = true;
                i = i - 1;
                k = k + 1;
                tot = tot - 2;
            } else {
                answer = false;
            }
        }
        if (answer) {
            answer2();
        } else {
            answer1();
        }
    }
    
    public static void answer1() {
        System.out.println("NO");
    }
    
    public static void answer2() {
        System.out.println("YES");
    }
    
    public static void sentence(int tot, String sentence, String[] data) {
        int i, k;
        
        tot = sentence.length();
        for (i = 0; i <= tot - 1; i++) {
            data[i] = String.valueOf(sentence.charAt(i));
        }
    }
}
