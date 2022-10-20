package lekcijaDivi.majasDarbs;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        //ievietojam skaneri
        Scanner scannerInt = new Scanner(System.in);

        // Pirmais uzdevums
        System.out.println("1. uzdevums");
        //a
        int x = 33;
        System.out.println(x > 0);
        //b
        int y = -33;
        System.out.println(y > 0);
        //c
        int z = 7;
        System.out.println(z > 5 && z <= 10);
        //d
        int p = 7;
        //loģiskais nē ar "!" priekša visam
        System.out.println(!(p <= 5) && p < 10);
        //e
        int m = 14;
        System.out.println(m == 0 || m == 10);
        //f
        int q = 10;
        System.out.println(q * q > 10);

        //Otrais uzdevums
        System.out.println("2.uzdevums");

        System.out.println("Lūdzu ievadi kalendārā mēneša numuru:");
        int menesacipars = scannerInt.nextInt();
        switch (menesacipars) {
            case 1:
                System.out.println("Ar ciparu " + menesacipars + "  ir Janvāris");
                break;
            case 2:
                System.out.println("Ar ciparu " + menesacipars + "  ir Februāris");
                break;
            case 3:
                System.out.println("Ar ciparu " + menesacipars + "  ir Marts");
                break;
            case 4:
                System.out.println("Ar ciparu " + menesacipars + "  ir Aprīlis");
                break;
            case 5:
                System.out.println("Ar ciparu " + menesacipars + "  ir Maijs");
                break;
            case 6:
                System.out.println("Ar ciparu " + menesacipars + "  ir Jūnijs");
                break;
            case 7:
                System.out.println("Ar ciparu " + menesacipars + "  ir Jūlijs");
                break;
            case 8:
                System.out.println("Ar ciparu " + menesacipars + "  ir Augusts");
                break;
            case 9:
                System.out.println("Ar ciparu " + menesacipars + "  ir Septembris");
                break;
            case 10:
                System.out.println("Ar ciparu " + menesacipars + "  ir Oktoris");
                break;
            case 11:
                System.out.println("Ar ciparu " + menesacipars + "  ir Novembris");
                break;
            case 12:
                System.out.println("Ar ciparu " + menesacipars + "  ir Decembris");
                break;
            default:
                System.out.println("Ievadīts neatbilstošs cipars");

        }
        //Trešais uzdevums
        System.out.println("Trešais uzdevums");

        System.out.println("Lūdzu ievadi pirmo skaitli");
        int a = scannerInt.nextInt();
        System.out.println("Lūdzu ievadi otro skaitli");
        int b = scannerInt.nextInt();
        System.out.println("Lūdzu ievadi trešo skaitli");
        int c = scannerInt.nextInt();

        if (a > b && a > c) {
            System.out.println("Skaitlis " + a + " ir lielākais skaitlis!");
        } else if (b > a && b > c) {
            System.out.println("Skaitlis " + b + " ir lielākais");
        } else if (c > a && c > b) {
            System.out.println("Skaitlis " + c + " ir lielākais");
        }
        //Ceturtais uzdevums

        System.out.println("Ceturtais uzdevums");
        String luksofors  = "sarkana";
        System.out.println("Lūdzu uzraksti vienu no luksafora krāsām - sarkana, dzeltena vai zaļa!");
        Scanner scanner = new Scanner (System.in);
        luksofors = scanner.nextLine();
        if (luksofors.equals("sarkana")) {
            System.out.println("Sarkana - lūdzu stāvi!");
        } else if (luksofors.equals("dzeltena")) {
            System.out.println("Dzeltena - lūdzu pabeidz kustību ja esi uz gājēju pārējas, citādi stāvi.");
        } else if (luksofors.equals("zaļa")) {
                    System.out.println("Ej pāri gājēju pārējai!");
        } else {
                            System.out.println("Ja nedeg neviena no krāsām tad salabo luksoforu!");
                        }
     //Piektais uzdevums






    }
}