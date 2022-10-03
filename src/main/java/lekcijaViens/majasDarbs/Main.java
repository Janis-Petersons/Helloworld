package lekcijaViens.majasDarbs;

import com.sun.jdi.CharValue;

public class Main {
    public static void main(String[] args) {
//pašā sākumā uzraksta "psvm"
System.out.println("Java mājasdarbs Nr 1");

String valstsnosaukums = "Tunisija";
int iedzivotajuskaits = 1010200;
int platiba = 163610;
String galvaspilseta = " Tunisa";
String oficialavaloda = "Arābu";
Boolean isES = false;
Boolean isAFR = true;

String valuuta = "Tunisijas dinārs";
//vienam simbolam izmanto šo
char valutassaisinajums= 'T';
//īsais noaukums printēšanas rakstīšanai "sout"
System.out.println("Valsts: "+valstsnosaukums);
        System.out.println("Iedzīvotāju skaits: "+iedzivotajuskaits);
        System.out.println("Platība: "+platiba);
        System.out.println("Galvaspilsēta"+galvaspilseta);
        System.out.println("Oficiālā valoda: "+oficialavaloda);
        System.out.println(isES);
        System.out.println(isAFR);
        System.out.println(valuuta);
        System.out.println((valutassaisinajums));
        System.out.println("Vai Tunisija ir Eiropas savienībā ? " + isES);
        System.out.println("Vai Tunisija ir Ziemeļāfrikas valsts ? "+ isAFR);
//nemāku garu tekstu salauzt (wrap)
        System.out.println(valstsnosaukums+ " ir valsts Vidussjūras piekrastē. Tās platība ir " +platiba+ " km2 ar kopējo iedzīvotāju skaitu " + iedzivotajuskaits + ".");
        System.out.println("Galvaspilsēta nosaukums ir " +galvaspilseta+" un galvenā valoda ir " +oficialavaloda+". Tāpat vieteja valūta ir "+ valuuta+".");

//aritmētiskie operatori
        int a=5;
        int b=10;
        byte c=-2;
        int d=-13;
        int saskaitam;
        int minusojam;
        int dalam;
        int reizinam;
        int procenti;
        saskaitam = a + b + c + d ;
        minusojam = a - b - c - d ;
        dalam = b / a;
        reizinam = a * b;
        System.out.println(saskaitam);
        System.out.println(minusojam);
        System.out.println(dalam);
        System.out.println(reizinam);
        System.out.println(saskaitam - dalam);
        System.out.println(20+b+a+minusojam);

    }
}