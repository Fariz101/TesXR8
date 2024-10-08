import java.util.Scanner;

public class Pilihan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pilihan(Berupa Nomor) :\n1. Student\n2. Teacher");
        int pilihan = in.nextInt();
        if (pilihan == 1) {
            System.out.println("\nName : ");
            String name = in.next();
            in.nextLine();
            System.out.println("Age : ");
            int age = in.nextInt();
            System.out.println("Student Number : ");
            int studentNumber = in.nextInt();
            System.out.println("Score : ");
            int score = in.nextInt();
            System.out.println("Major : ");
            String major = in.next();
            in.nextLine();
            Student student1 = new Student(name, age, studentNumber, score, major);
            student1.print();
        } else if (pilihan == 2) {
            System.out.println("\nPilihan(Berupa Nomor) :\n1. FullTime\n2. PartTime");
            int pilihanWaktu = in.nextInt();
            switch (pilihanWaktu) {
                case 1:
                    System.out.println("\nName : ");
                    String name = in.next();
                    in.nextLine();
                    System.out.println("Age : ");
                    int age = in.nextInt();
                    System.out.println("Subject : ");
                    String subject = in.next();
                    in.nextLine();
                    System.out.println("Anual Salary : ");
                    int anualSalary = in.nextInt();
                    System.out.println("Unit : ");
                    String unit = in.next();
                    FullTime fullTime1 = new FullTime(name, age, subject, anualSalary, unit);
                    fullTime1.print();
                    break;
                case 2:
                    System.out.println("\nName : ");
                    name = in.next();
                    in.nextLine();
                    System.out.println("Age : ");
                    age = in.nextInt();
                    System.out.println("Subject : ");
                    subject = in.next();
                    in.nextLine();
                    System.out.println("Hours : ");
                    int hoursworked = in.nextInt();
                    PartTime partTime1 = new PartTime(name, age, subject, hoursworked);
                    partTime1.print();

                default:

                    break;
            }

        } else {
            System.out.println("Input Salah");
        }

        in.close();
    }
}
