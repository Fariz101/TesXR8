public class BukuTester {
    public static void main(String[] args) {
        Buku lautBercerita = new Buku(143505, "LautBercerita", "Leila S. Chudori", 2017);
        Buku melangkah = new Buku(523316, "Melangkah", "J.S. Khairen", 2020);
        Buku homeSweetLoan = new Buku(658049, "Home Sweet Loan", "Almira Bastari", 2022);
        Buku senjaDiAlaska = new Buku(5953380, "Senja di Alaska", "ABELLSTR25", 2023);
        Buku lofarsa = new Buku(5266312, "Lofarsa", "Rofenaa", 2023);

        System.out.println(lautBercerita.id+" "+lautBercerita.judul+" "+ lautBercerita.pengarang+" "+ lautBercerita.tahunTerbit);
        System.out.println(melangkah.id+" "+melangkah.judul+" "+ melangkah.pengarang+" "+ melangkah.tahunTerbit);
        System.out.println(homeSweetLoan.id+" "+homeSweetLoan.judul+" "+ homeSweetLoan.pengarang+" "+ homeSweetLoan.tahunTerbit);
        System.out.println(senjaDiAlaska.id+" "+senjaDiAlaska.judul+" "+ senjaDiAlaska.pengarang+" "+ senjaDiAlaska.tahunTerbit);
        System.out.println(lofarsa.id+" "+lofarsa.judul+" "+ lofarsa.pengarang+" "+ lofarsa.tahunTerbit);
    }
}
