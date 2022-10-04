package lekcijaDivi.labDarbs;

import java.util.Scanner;

public class laboratorijasDarbsDivi {
    public static void main(String[] args) {
        //salīdzināšanas izteiksmes

        int x = 3;
        int y = 2;
        System.out.println(x > y);
// šeit būs true
        y = 3;
// šeit būs false
        System.out.println(x > y);
//mazāks
        x = 5;
        y = 3;
        System.out.println(x < y);
        y = 10;
        System.out.println(x < y);
        //vienāds
        System.out.println(x == y);
        System.out.println((5 == 5));
        //salīdzina strings
        String luksaforaKrasa = "green";
        System.out.println(luksaforaKrasa.equals("green"));
        System.out.println(luksaforaKrasa.equals("red"));

        //vienāds
        System.out.println(x != y);
        //ka nav vienāds liekam priekša ! zīmi
        System.out.println(!luksaforaKrasa.equals("red"));

        x = 5;
        y = 5;
        int z = 8;
        System.out.println(x <= y);

        int vecums = 18;
        System.out.println("Vai cilvēks var balsot (kļudains)?" + (vecums > 18));
        System.out.println("Vai cilvēks var balsot (pareizi)" + (vecums >= 18));

        System.out.println(x < 6 && z > y);

        int age = 18;
        boolean hasVoted= false;
        System.out.println("1.Paskaties cilvēka pasē?");
        if (age >= 18 && hasVoted == false) {
            System.out.println("Drīkst balsot");
        } else {
            System.out.println("Nedrīkst balsot.");
        }
        // pārbaudīt vai skaitlis ir negatīvs, ja ir tad izvedīt tekstu NEGATĪVS
        int skaitlis = -5;
        if (skaitlis < 0) {
            System.out.println("Negatīvs");
        }

        if(skaitlis>8){
            System.out.println("Skaitlis pozitīvs");
        } else {
            System.out.println("Skaitlis pozitīvs vai nulle");
        }

        String luksaforaKrasa2 = "green";
if(luksaforaKrasa2.equals("green")){
    System.out.println(("Ej"));
} else {
    System.out.println("Stāvi");
}
    System.out.println("Ievadīsim skaitli i");
    int i=20;
    if (i==10) {
        System.out.println("Skaitlis ir 10");
    } else if (i==15) {
        System.out.println("Skaitlis ir 15");
    } else if (i == 20) {
        System.out.println( "Skaitlis ir 20");
    } else {
        System.out.println("Skaitlis nav neviens no vajadzīgajiem");
    }
int monthnumber = 5;
    switch(monthnumber){
        case 1: System.out.println("Janvāris");
        break;
        case 2: System.out.println("Februāris");
        break;
        case 3: System.out.println("Marts");
        break;
        case 4: System.out.println("Aprīlis");
        break;
        default:
            System.out.println("Šāds mēnesis neeksistē");
    }



        }

}

//        //vinš ņems info ievadītā info
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Hello Lekcija 2");
//        //šeit nenodefinēju vecumu
//
//        System.out.println("Kā tevi sauc?");
//        String name =scanner.nextLine();
//        System.out.println("Labdien "+name+ " Esi sveicināts/a manā programmā");
//System.out.println("Ievadi lūdzu savu vecumu...");
//        int vecums;
//vecums=scanner.nextInt();
//if (vecums>=18){
//    System.out.println("Cilvēks drīkst balsot!");
//}
//System.out.println("Programmas turpinājums...");
//
//        System.out.println("Ievadi saitli a");
//int a = scanner.nextInt();
//        System.out.println("Ievadi skaitli b");
//        int b = scanner.nextInt();
//        int summa = a+b;
//        System.out.println("Skaitlis "+a+" un skaitļa "+b+ " summa ir "+summa);
//
//



