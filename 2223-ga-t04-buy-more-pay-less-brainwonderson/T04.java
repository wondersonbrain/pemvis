// 12S22003 - Yohana Siahaan
// 12S22035 - Brain Wonderson

import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int nrElement;
        
        nrElement = 3;
        String[] arrIsbn = new String[3];
        double[] arrPrice = new double[3];
        int[] arrQuantity = new int[3];
        int c;
        
        for (c = 0; c <= nrElement - 1; c++) {
            arrIsbn[c] = "";
            arrPrice[c] = 0.0;
            arrQuantity[c] = 0;
        }
        double total;
        boolean var_continue;
        
        total = 0;
        var_continue = true;
        while (var_continue == true) {
            String isbn;
            double price;
            int quantity;
            
            isbn = input.nextLine();
            if (isbn.equals("---")) {
                var_continue = false;
            } else {
                price = Double.parseDouble(input.nextLine());
                quantity = Integer.parseInt(input.nextLine());
                boolean exist;
                
                exist = false;
                c = 0;
                do {
                    
                    // 
                    if (arrIsbn[c].equals(isbn)) {
                        arrQuantity[c] = arrQuantity[c] + quantity;
                        exist = true;
                    } else {
                        c = c + 1;
                    }
                } while (!exist && c < nrElement);
                if (!exist) {
                    boolean indexFound;
                    
                    indexFound = false;
                    int index;
                    
                    index = 0;
                    do {
                        if (arrQuantity[index] == 0) {
                            indexFound = true;
                        } else {
                            index = index + 1;
                        }
                    } while (!indexFound && index < nrElement);
                    arrIsbn[index] = isbn;
                    arrPrice[index] = price;
                    arrQuantity[index] = quantity;
                    index = index + 1;
                }
            }
        }
        for (c = 0; c <= nrElement - 1; c++) {
            double pprice;
            
            pprice = arrPrice[c];
            if (arrQuantity[c] >= 20) {
                pprice = arrPrice[c] - (double) 12 / 100 * arrPrice[c];
            } else {
                if (arrQuantity[c] >= 10) {
                    pprice = arrPrice[c] - (double) 5 / 100 * arrPrice[c];
                } else {
                    if (arrQuantity[c] >= 5) {
                        pprice = arrPrice[c] - (double) 2 / 100 * arrPrice[c];
                    }
                }
            }
            total = total + pprice * arrQuantity[c];
        }
        System.out.println(toFixed(total,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
