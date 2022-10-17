package lekcijaCetri.labDarbs;

public class Main {
    public static void main(String[] args) {
       String vards="Juris";
        House majaViens= new House();
        majaViens.adrese="Brivibas iela 123";
        majaViens.durvjuSkaits=4;
        majaViens.griestuAugstums=3.2;
        majaViens.kadastralaVertiba=440500;
        majaViens.stavuDaudzums=3;
        majaViens.loguSkaits=10;
        majaViens.vaiPrivatipasums=true;
     System.out.println(majaViens.printHouse());

        House majaDivi= new House();

        majaDivi.adrese="Merķeļa 50";
        majaDivi.durvjuSkaits=10;
        majaDivi.griestuAugstums=10.2;
        majaDivi.kadastralaVertiba=88000;
        majaDivi.stavuDaudzums=6;
        majaDivi.loguSkaits=20;
        majaDivi.vaiPrivatipasums=false;
     System.out.println(majaDivi.printHouse());

        System.out.println(majaViens.adrese);

//esmu ievadījis info RINKIS cilnē tagad šeit lieku veikt darbības

rinkis rinkisViens = new rinkis ();
rinkisViens.r=5;
        System.out.println(rinkisViens.rekinatLaukumu());
        System.out.println(rinkisViens.rekinatLinijasGarumu());

    }

}
