// 12S22035 - Brain Wonderson
// 12S22044 - Jufourlisa Sirait
import java.util.*;
import java.lang.Math;

public class T05 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double[] totalprice = new double[5];
        double totalpriceoutput;
        
        totalpriceoutput = 0;
        pROSES(totalprice, totalpriceoutput);
        oUTPUT(totalprice, totalpriceoutput);
    }
    
    public static double oUTPUT(double[] totalprice, double totalpriceoutput) {
        totalpriceoutput = totalprice[0] + totalprice[1] + totalprice[2];
        System.out.println(toFixed(totalpriceoutput,2));
        
        return totalpriceoutput;
    }
    
    public static void pROSES(double[] totalprice, double totaloutprice) {
        String[] isbn = new String[5];
        double[] price = new double[5];
        
        price[0] = 0;
        price[1] = 0;
        price[2] = 0;
        price[3] = 0;
        price[4] = 0;
        int[] jumlahofeksempar = new int[5];
        
        jumlahofeksempar[0] = 0;
        jumlahofeksempar[1] = 0;
        jumlahofeksempar[2] = 0;
        jumlahofeksempar[3] = 0;
        jumlahofeksempar[4] = 0;
        totalprice[0] = 0;
        totalprice[1] = 0;
        totalprice[2] = 0;
        totalprice[3] = 0;
        totalprice[4] = 0;
        int[] jumlaheksempar = new int[4];
        int n;
        
        n = 0;
        int jumlaheksempar0, jumlaheksempar1, jumlaheksempar2;
        
        jumlaheksempar0 = 0;
        jumlaheksempar1 = 0;
        jumlaheksempar2 = 0;
        String buku0, buku1, buku2;
        
        buku0 = "buku";
        buku1 = "buku";
        buku2 = "buku";
        int a, b, c;
        
        a = 0;
        b = 1;
        c = 2;
        while (n < 3) {
            isbn[n] = input.nextLine();
            if (isbn[n].equals("---")) {
                n = 3;
            } else {
                if (isbn[n].equals(isbn[0])) {
                    if (a == 0) {
                        buku0 = isbn[n];
                    }
                    if (isbn[0].equals(buku0)) {
                        n = 0;
                        price[n] = Double.parseDouble(input.nextLine());
                        jumlahofeksempar[n] = Integer.parseInt(input.nextLine());
                        jumlaheksempar0 = jumlaheksempar0 + jumlahofeksempar[n];
                        a = 3;
                        n = n + 1;
                    } else {
                        if (a == 1) {
                            buku1 = isbn[n];
                        }
                        if (isbn[0].equals(buku1)) {
                            n = 1;
                            price[n] = Double.parseDouble(input.nextLine());
                            jumlahofeksempar[n] = Integer.parseInt(input.nextLine());
                            jumlaheksempar1 = jumlaheksempar1 + jumlahofeksempar[n];
                            a = 3;
                            n = n + 1;
                        } else {
                            n = 2;
                            price[n] = Double.parseDouble(input.nextLine());
                            jumlahofeksempar[n] = Integer.parseInt(input.nextLine());
                            jumlaheksempar2 = jumlaheksempar2 + jumlahofeksempar[n];
                            a = 3;
                            n = 0;
                        }
                    }
                } else {
                    if (isbn[n].equals(isbn[1])) {
                        if (b == 1) {
                            buku1 = isbn[n];
                        }
                        if (isbn[1].equals(buku1)) {
                            n = 1;
                            price[n] = Double.parseDouble(input.nextLine());
                            jumlahofeksempar[n] = Integer.parseInt(input.nextLine());
                            jumlaheksempar1 = jumlaheksempar1 + jumlahofeksempar[n];
                            b = 3;
                            n = n + 1;
                        } else {
                            n = 2;
                            price[n] = Double.parseDouble(input.nextLine());
                            jumlahofeksempar[n] = Integer.parseInt(input.nextLine());
                            jumlaheksempar2 = jumlaheksempar2 + jumlahofeksempar[n];
                            b = 3;
                            n = 0;
                        }
                    } else {
                        if (isbn[n].equals(isbn[2])) {
                            if (c == 2) {
                                buku2 = isbn[n];
                            }
                            if (isbn[2].equals(buku2)) {
                                n = 2;
                                price[n] = Double.parseDouble(input.nextLine());
                                jumlahofeksempar[n] = Integer.parseInt(input.nextLine());
                                jumlaheksempar2 = jumlaheksempar2 + jumlahofeksempar[n];
                                c = 3;
                                n = 0;
                            }
                        }
                    }
                }
            }
        }
        if (jumlaheksempar0 >= 20) {
            price[0] = price[0] - price[0] * 12 / 100;
        } else {
            if (jumlaheksempar0 >= 10) {
                price[0] = price[0] - price[0] * 5 / 100;
            } else {
                if (jumlaheksempar0 >= 5) {
                    price[0] = price[0] - price[0] * 2 / 100;
                }
            }
        }
        totalprice[0] = price[0] * jumlaheksempar0;
        if (jumlaheksempar1 >= 20) {
            price[1] = price[1] - price[1] * 12 / 100;
        } else {
            if (jumlaheksempar1 >= 10) {
                price[1] = price[1] - price[1] * 5 / 100;
            } else {
                if (jumlaheksempar1 >= 5) {
                    price[1] = price[1] - price[1] * 2 / 100;
                }
            }
        }
        totalprice[1] = price[1] * jumlaheksempar1;
        if (jumlaheksempar2 >= 20) {
            price[2] = price[2] - price[2] * 12 / 100;
        } else {
            if (jumlaheksempar2 >= 10) {
                price[2] = price[2] - price[2] * 5 / 100;
            } else {
                if (jumlaheksempar2 >= 5) {
                    price[2] = price[2] - price[2] * 2 / 100;
                }
            }
        }
        totalprice[2] = price[2] * jumlaheksempar2;
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}


