// 12S22035 - Brain Wonderson
// 12S22044 - Jufourlisa Sirait
import java.util.*;
import java.lang.Math;

public class X02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] asrama = new String[4];
        int i;
        
        i = 0;
        int j;
        
        j = 0;
        while (j < 4) {
            asrama[i] = proses2();
            if (asrama[i].equals("---")) {
                j = 5;
            } else {
                i = i + 1;
                j = j + 1;
            }
        }
        proses(asrama, i);
    }
    
    public static void proses(String[] asrama, int i) {
        int k;
        
        for (k = 0; k <= i - 1; k++) {
            System.out.println(asrama[k]);
        }
    }
    
    public static String proses2() {
        String asrama;
        
        asrama = input.nextLine();
        
        return asrama;
    }
}
