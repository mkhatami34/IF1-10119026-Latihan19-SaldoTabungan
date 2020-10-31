/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119026.latihan19.saldotabungan;

import java.util.Scanner;

/**
 *
 * @author Asus
 * NAMA     : Muhammad Khatami
 * KELAS    : PBO
 * NIM      : 10119026
 * Deskripsi Program : Program ini berisi program untuk menampilkan program
 *                      tabungan
 */
public class IF110119026Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldoAwal;
        double bunga;
        int lama;
        double hasil;
        double hasilBunga;
        int saldoBulan;
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Saldo awal: ");
        saldoAwal = scan.nextInt();
        System.out.print("Bunga/bulan: ");
        bunga = scan.nextDouble();
        System.out.print("Lama(bulan): ");
        lama = scan.nextInt();
        
        hasilBunga = (bunga/100 + 1);
        hasil = saldoAwal;
        for(int i = 1; i <= lama; i++){ 
            hasil *= hasilBunga;
            System.out.printf("Saldo di bulan ke " + i + " %,12.2f%n", hasil);
        }
        
        double f = hasil;
        
        
        
        
    }
    
}
