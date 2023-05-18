// 12S22003 - Yohana Siahaan
// 12S22035 - Brain Wonderson
import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double hargabuku, total, terkecil, hargatotal;
        
        hargabuku = 0;
        total = 0;
        terkecil = 1000;
        do {
            hargabuku = Double.parseDouble(input.nextLine());
            if (hargabuku == 0) {
            } else {
                if (terkecil < hargabuku) {
                } else {
                    terkecil = hargabuku;
                }
                total = total + hargabuku;
            }
        } while (hargabuku != 0);
        if (total >= 100) {
            hargatotal = total - terkecil;
        } else {
            hargatotal = total;
        }
        System.out.println(toFixed(hargatotal,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
