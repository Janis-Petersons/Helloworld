package lekcijaTris.majasDarbs;
import java.util.Scanner;
public class LoopHomeWork {
    public static void main(String[] args) {
        System.out.println("1.UZDEVUMS");
        Uzdevums1();

        System.out.println("2.UZDEVUMS");
        Uzdevums2();

        System.out.println("3.UZDEVUMS");
        Uzdevums3();
        Uzdevums4();
    }

    public static void Uzdevums1() {
        Scanner ievade = new Scanner(System.in);
        int kopsumma = 0;
        while (kopsumma <= 100) {
            System.out.println("Lūdzu ievadi skaitli...");
            int cipars = ievade.nextInt();
            kopsumma = kopsumma + cipars; //lai cikls turpinās (True)
        }
        System.out.println("Gatavs");
    }

    public static void Uzdevums2() {
        //definēju masīvus
        int[] skaitli = {5, 4, 3, 2};
        String[] vardi = {"ābols", "bumbieris", "plūme", "avene"};
        char[] simboli = {'$', '#', '@', '&' }; //simbolus liek nevis " bet '
        System.out.println("###while");
        //while cikls
        int x = 0;  //definēju ciklu, nav piesaistīts masīvs
        while (x < skaitli.length) { // pieliekot klaat.length tad tiks izmantoti Visi no masīva
            System.out.println(skaitli[x]); //šeit piekabinu klāt masīvu
            x = x + 1;
        }
        //while cikls
        int y = 0;  //definēju ciklu, nav piesaistīts masīvs
        while (y < vardi.length) {
            System.out.println(vardi[y]); //šeit piekabinu klāt masīvu
            y = y + 1;
        }
        //while cikls
        int z = 0;  //definēju ciklu, nav piesaistīts masīvs
        while (z < simboli.length) {
            System.out.println(simboli[z]); //šeit piekabinu klāt masīvu
            z++;  //tas Z++ ir tas pats kas z=z+1
        }
        System.out.println("##dowhile");
//do while
        int x1 = 0;
        do {
            int skaitlusaraksts = skaitli[x1];
            System.out.println(skaitlusaraksts);
            x1 = x1 + 1;
        } while (x1 < skaitli.length);

        int y1 = 0;
        do {
            String vardusaraksts = vardi[y1];
            System.out.println(vardusaraksts);
            y1 = y1 + 1;
        } while (y1 < vardi.length);

        int z1 = 0;
        do {
            char simbolusaraksts = simboli[z1];
            System.out.println(simbolusaraksts);
            z1 = z1 + 1;
        } while (z1 < simboli.length);

        System.out.println("###FORLOOP");
        //for loop

        for (int i = 0; i < skaitli.length; i++) {
            System.out.println(skaitli[i]);

        }
        for (int k = 0; k < vardi.length; k++) {
            System.out.println(vardi[k]);
        }
        for (int j = 0; j < simboli.length; j++) {
            System.out.println(simboli[j]);
        }
        System.out.println("###FOREACH");
        //foreach - visvieglākais iziet cauri visiem
        for (int jebkadsvards : skaitli) {
            System.out.println(jebkadsvards);
        }
        for (String jebkadsvards1 : vardi) {
            System.out.println(jebkadsvards1);
        }
        for (char jebkadsvards2 : simboli) {
            System.out.println(jebkadsvards2);
        }

    }

    public static void Uzdevums3() {
        //izvadu skaitļus pa vienam katrā rindā
        for (int i = 2; i <100 ; i+=2) { //atradu internetā ka var modificēt uz "i+=2"
            System.out.println(i);
        }
//        //šeit nesanāk izvadīt visus skaitļus vienā rindā
//        for (int i = 2; i <100 ; i+=2) { //atradu internetā ka var modificēt uz "i+=2"
//            for ( int rindaa: i ) {
//                System.out.println(rindaa);
//            }
        }


    public static void Uzdevums4() {
        System.out.println("Diemžēl nemācēju līdz galam izpildīt 4. uzdevumu.");
        Scanner ievade = new Scanner(System.in);
        System.out.println("Lūdzu ievadi veselu skaitli...");

        }
    }
