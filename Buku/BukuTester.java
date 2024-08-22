import java.util.Scanner;
public class BukuTester {
    public static void main(String[] args) {
        // Buku lautBercerita = new Buku(143505, "LautBercerita", "Leila S. Chudori", 2017);
        // Buku melangkah = new Buku(523316, "Melangkah", "J.S. Khairen", 2020);
        // Buku homeSweetLoan = new Buku(658049, "Home Sweet Loan", "Almira Bastari", 2022);
        // Buku senjaDiAlaska = new Buku(5953380, "Senja di Alaska", "ABELLSTR25", 2023);
        // Buku lofarsa = new Buku(5266312, "Lofarsa", "Rofenaa", 2023);

        Scanner in= new Scanner(System.in);
        System.out.println("Masukkan Judul Buku: ");
        String judul=in.nextLine();
        System.out.println("Masukkan Pengarang Buku: ");
        String pengarang = in.nextLine();
        System.out.println("Masukkan Id Buku: ");
        int id=in.nextInt();
        System.out.println("Masukkan Tahun Terbit Buku: ");
        int tahunTerbit=in.nextInt();

        Buku buku1=new Buku(id, judul, pengarang, tahunTerbit);
        System.out.println("=======================================================");
        System.out.println("Judul: "+buku1.judul+"\nId Buku: "+buku1.id+"\nPengarang Buku: "+buku1.pengarang+"\nTahun Terbit: "+buku1.tahunTerbit);
        System.out.println("=======================================================");







        // System.out.println("Pilih Buku yang ingin dicari\"berupa nomor\"\n1. Laut Bercerita\n2. Melangkah\n3. Home Sweet Loan\n4. Senja Di ALaska\n5. Lofarsa");
        // int pilihan = in.nextInt();
        // if (pilihan==1) {
        //     System.out.println(lautBercerita.judul+"\n"+lautBercerita.id+" "+ lautBercerita.pengarang+" "+ lautBercerita.tahunTerbit);
        // } if (pilihan==2) {
        //         System.out.println(melangkah.judul+" "+melangkah.id+" "+ melangkah.pengarang+" "+ melangkah.tahunTerbit);
        //     } if (pilihan==3) {
        //         System.out.println(homeSweetLoan.judul+" "+homeSweetLoan.id+" "+ homeSweetLoan.pengarang+" "+ homeSweetLoan.tahunTerbit);
        //     } if (pilihan==4) {
        //         System.out.println(senjaDiAlaska.judul+" "+senjaDiAlaska.id+" "+ senjaDiAlaska.pengarang+" "+ senjaDiAlaska.tahunTerbit);
        //     }if (pilihan==5) {
        //         System.out.println(lofarsa.judul+" "+lofarsa.id+" "+ lofarsa.pengarang+" "+ lofarsa.tahunTerbit);
        //     }if (pilihan<1 && pilihan>5) {
        //         System.out.println("Pilihan anda tidak anda");
        //     }

            in.close();
        }



        

        
        
        
       
        
    }

