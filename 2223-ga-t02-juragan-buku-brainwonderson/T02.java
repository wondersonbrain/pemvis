// 12S22035 - Brain Wonderson
import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn, judul, penulis, tahunterbit, penerbit, formatbukuelektronik, kategori;
        double hargapembelian, minimummargin, rating;
        int stok;
        
        kategori = " ";
        isbn = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunterbit = input.nextLine();
        penerbit = input.nextLine();
        if (penerbit.equals("---")) {
            penerbit = "---";
        } else {
            penerbit = penerbit;
        }
        formatbukuelektronik = input.nextLine();
        hargapembelian = input.nextDouble();
        minimummargin = input.nextDouble();
        stok = input.nextInt();
        rating = input.nextDouble();
        if (rating >= 4.7) {
            kategori = "Best Pick";
        } else {
            if (rating >= 4.5) {
                kategori = "Must Read";
            } else {
                if (rating >= 4.0) {
                    kategori = "Recommended";
                } else {
                    if (rating >= 3.0) {
                        kategori = "Average";
                    } else {
                        if (rating < 3.0) {
                            kategori = "Low";
                        }
                    }
                }
            }
        }
        System.out.println(isbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatbukuelektronik + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + rating + "|" + kategori);
    }
}



