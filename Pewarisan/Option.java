import java.util.Scanner;

public class Option {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Pilihan:\n1. CD\n2. DVD");
        int pilihan = in.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Name : ");
                String name = in.next();
                in.nextLine();
                System.out.println("Number : ");
                int number = in.nextInt();
                System.out.println("Quantity : ");
                int quantity = in.nextInt();
                System.out.println("Price : ");
                double price = in.nextDouble();             
                System.out.println("Artist : ");
                String artist = in.next();
                in.nextLine();
                System.out.println("Total Song : ");
                int numSong = in.nextInt();
                System.out.println("Label : ");
                String label = in.next();
                in.nextLine();
            
                CD cd1 = new CD(artist, numSong, label, name, number, quantity, price);
                cd1.print();              
                
                break;
            case 2:
            System.out.println("Name : ");
            name = in.next();
            in.nextLine();
            System.out.println("Number : ");
            number = in.nextInt();
            System.out.println("Quantity : ");
            quantity = in.nextInt();
            System.out.println("Price : ");
            price = in.nextDouble();             
            System.out.println("Length : ");
            int length = in.nextInt();
            System.out.println("Ratig : ");
            String rating = in.next();
            in.nextLine();
            System.out.println("Studio : ");
            String studio = in.next();
            in.nextLine();
                DVD dvd1 = new DVD(length, rating, studio, name, number, quantity, price);
                dvd1.print();
                break;
        
            default:
                System.out.println("Input Salah");
                break;
        }

        in.close();
    }
}