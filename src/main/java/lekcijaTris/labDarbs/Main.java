package lekcijaTris.labDarbs;

public class Main {
    public static void main(String[] args) {

        System.out.println("sākās programma");
        printcard2("Pēteris","Kalninš","Ventspils",35 );
// šis no 7 rindas pārlec uz 10 rindu kur aprakstīts kas ir printcard
        printcard();
        printNewline();
        printcard();
        System.out.println("beidzās programma");
        int laukums = aprTaisnsturalaukumu(3, 10);
        System.out.println("Taisnstūra laukums ir " + laukums);
        //masīva ievades veidi

        int[] menesaterini = {100,40,23,44,55,200};

        }


        String[] produktusaraksts = {"Piens","Maize","Olas"};
        System.out.println(produktusaraksts[0]); //piens
        System.out.println(produktusaraksts[1]); //maize
        System.out.println(produktusaraksts[2]); //olas


        produktusaraksts[2]="desa";
        System.out.println(produktusaraksts[2]); //desa

String[] cars = {"Volvo","Mazda","Nissan","Mercedes"};
        System.out.println("Masīva garums ir: "+cars.length);
cars[1]="Audi"; // mainam vienu no masīviem
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);

        int[] menesiGada = new int[12];
        menesiGada[0]=1;



    }

    public static void whileCikls() {
        int x=5;
        while(x>0){
            System.out.println("X nav nulle,X= "+x);
            x=x-1;
        }
        // uztaisa ciklu kad sākot no 0 - pirmās mašīnas un tad katru reizi pieliek +1 klāt attiecīgi darbosies līdz kamēr z<4
        String[] cars = {"Volvo","Mazda","Nissan","Mercedes"};
        System.out.println("kods sākās");
        int z=0;
        while(z<4){
            System.out.println(cars[z]);
            z= z + 1;
        }
        System.out.println("kods turpinās");
    }



    public static int aprTaisnsturalaukumu(int platums, int garums) {
        return platums * garums;
    }

    public static void printNewline() {
        System.out.println("\n");
    }

    public static void printcard() {
        System.out.println("@@@@@@@@");
        System.out.println("J.P");
        System.out.println("Riga");
        System.out.println("Vecums" + 50);
        System.out.println("%%%%%%");
    }

    public static void printcard2(String vards, String uzvards, String pilseta, int vecums) {
        System.out.println("@@@@@@@@");
        System.out.println(vards + "" + uzvards);
        System.out.println(pilseta);
        System.out.println("Vecums" + vecums);
        System.out.println("%%%%%%");
    }


}
