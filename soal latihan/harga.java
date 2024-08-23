import java.util.Scanner;

public class harga {
 
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan Harga Awal");
    double hargaBarang = input.nextDouble();
    System.out.println("Masukkan Jumlah Barang");
    double jumlahBarang = input.nextDouble();
    System.out.println("Masukkan Diskon");
    double diskon = input.nextDouble();

    double totalHarga;
    totalHarga = (hargaBarang-(diskon/100*hargaBarang))*jumlahBarang;
    System.out.println("Total Harga adalah "+totalHarga);


    input.close();
}
    
}