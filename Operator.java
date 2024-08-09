import java.util.Scanner;

public class Operator{
  public static final double Konstanta = 0.5;
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          System.out.println("Masukkan panjang sisi A: ");
          double sisiA=input.nextDouble();
          System.out.println("Masukkan panjang sisi B: ");
          double sisiB=input.nextDouble();
          System.out.println("Masukkan tinggi trapesium: ");
          double tinggi=input.nextDouble();
      
         
  
      
      double Hasil = (sisiA+sisiB)*tinggi*Konstanta;
      System.out.println("Luas Trapesium= "+Hasil);

        
    }
    
      
    }

