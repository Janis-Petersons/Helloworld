package lekcijaCetri.majasDarbs.classHomework;

import lekcijaCetri.labDarbs.House;

public class Main {
    public static void main(String[] args) {
        trijsturis trijsturisViens= new trijsturis();
        System.out.println("Trijstūra pusperimetrs ir: "+trijsturisViens.pusperimetrs());
        System.out.println("Trijstūra laukums ir:"+trijsturisViens.trijsturalaukums());


        trijsturis trijsturisDivi= new trijsturis(); //šis ir konstruktors ar definētām vērtībām
        trijsturisDivi.malaA=4;
        trijsturisDivi.malaB=6;
        trijsturisDivi.malaC=8;
        trijsturisDivi.printetlaukumu();

    }

}
