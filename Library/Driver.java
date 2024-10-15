import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Title : ");
        String title = in.next();
        in.nextLine();
        System.out.println("Year : ");
        int year = in.nextInt();
        System.out.println("Price : ");
        double price = in.nextDouble();
        if (year>=2021) {
            price=price*1;
        } else if(year>=2011&&year<2021){
            price=price-(price*0.2);
        } else {
            price=price-(price*0.5);
        }
        System.out.println("\nBook Type(Number): \n1. TextBook\n2. Novel");
        int option1 = in.nextInt();
        switch (option1) {
            case 1:
                System.out.println("Subject : ");
                String subject = in.next();
                in.nextLine();
                System.out.println("Is it Biography Book ? (Yes/No)");
                String option2 = in.next();
                in.nextLine();
                if (option2.contentEquals("Yes")) {
                    System.out.println("About : ");
                    String about = in.nextLine();
                    in.nextLine();
                    Biography biography1 = new Biography(title, year, price, subject, about);
                    biography1.print();
                } else {
                    TextBook textBook1 = new TextBook(title, year, price, subject);
                    textBook1.print();
                }

                break;
            case 2:
                System.out.println("Genre : ");
                String genre = in.next();
                in.nextLine();
                Novel novel1 = new Novel(title, year, price, genre);
                novel1.print();
                break;

            default:
                Book book1 = new Book(title, year, price);
                book1.print();
                break;
        }

        in.close();
    }
}
