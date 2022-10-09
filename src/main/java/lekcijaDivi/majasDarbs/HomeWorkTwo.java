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
    }

}