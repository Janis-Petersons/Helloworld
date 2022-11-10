package lekcijaTris.labDarbs;
import java.util.Scanner;

public class MainOtrais { //metodes var ielikt starp tikai Class iekavām
    public static void main(String[] args) {
        //main metode ir galvenā un taja ir jāieraksta cita zemākas klase komandu.
        // Jaskatās lai tā ir ierakstīta starp iekavām.
        printcard2("Peteris", "Kakao", "Riga", 43);
        System.out.println("sākās");
        tests(); //ar šo mēs izsaucām to metodi kas ir minēta zemāk
        printNewLine();
        System.out.println("beidzās");
        int laukums = aprekinatTaisnsturalaukumu(2, 5);
        System.out.println("Taisnstura laukums" + laukums);

        int[] monthlyCosts = {100, 40, 23, 44, 55, 200};
        String[] produktuSaraksts = {"Piens","Maize","Olas"};
        produktuSaraksts[2] = "Desa";
        System.out.println(produktuSaraksts[2]); //prasu lai izvada no masiiva produktusarakst otro (treso)
        int[] menesiGada = new int[12];
        menesiGada[0]=1;

        String [] cars = {"volvo", "bmw", "Nissan"};
        System.out.println("Masīva garums ir"+cars.length);
        cars [1]= "Audi";
         whilecikls();



    }

    public static void whilecikls() {
        int x=5;
        while(x>0) {
            System.out.println("X nav nulle, X=" +x);
            x=x-1;
    }

    }

    public static int aprekinatTaisnsturalaukumu(int platums, int garums) {
        return platums * garums;
    }

    public static void printNewLine() {
        System.out.println("ZEBRA");
    }

    public static void tests() {
        System.out.println("Yellow");
        System.out.println("Brown");
        System.out.println("Green");
        printNewLine(); //šeit es šajā metodē izsaucu to metodi kas ir augstāk
    }

    public static void printcard2(String vards, String uzvards, String pilseta, int vecums) {
        System.out.println("Yellow");
        System.out.println(vards);
        System.out.println(vecums);
    }
}