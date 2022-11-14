package lekcijaCetri.labDarbs;

public class Main {
    public static void main(String[] args) {
       String vards="Juris";
        House majaViens= new House(); //jauns objekts no klases daļas
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

        House [] majas = {majaViens, majaDivi}; //masīvs no "mājām"
        for (House mainigais: majas ) { //mainīgais var būt jebkurš vārds
            System.out.println(mainigais.adrese);
            System.out.println(mainigais.stavuDaudzums);

        }
        Velosipeds2 mansVelo = new Velosipeds2(); //piešķiru jaunu vērtību
        System.out.println(mansVelo.atrums); //izsaucu jau definēto vērtību
        mansVelo.printAtrums();

        Velosipeds2 ritenbraucejsViens= new Velosipeds2();
        Velosipeds2 ritenbraucejsDivi= new Velosipeds2();

        ritenbraucejsViens.atrums=40; //šseit es piešķiru jaunu vertibu kaut ari class jau ir 0 vertiba.
        ritenbraucejsDivi.atrums=30;

        ritenbraucejsViens.printAtrums();
        ritenbraucejsDivi.printAtrums();

        Velosipeds2 ritenbraucejsTris= new Velosipeds2();
        ritenbraucejsTris.printAtrums();
        ritenbraucejsTris.paatrinajums();
        ritenbraucejsTris.paatrinajums();
        ritenbraucejsTris.paatrinajums();
        ritenbraucejsTris.printAtrums();



    }

}
