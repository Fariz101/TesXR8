import java.util.Scanner;

public class gaji {
    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Jam Kerja");
        double jamKerja = input.nextDouble();
        System.out.println("Masukkan Tarif Per Jam dari Pengguna");
        double tarifPerJam = input.nextDouble();

        double gajiBruto;
        gajiBruto = jamKerja*tarifPerJam;
        System.out.println("Gaji Bruto adalah "+gajiBruto);

        double pajak=0.1;
        double gajiBersih;
        gajiBersih = gajiBruto-(gajiBruto*pajak);
        System.out.println("Gaji Bersih Karyawan adalah "+gajiBersih );

input.close();
    }
}
