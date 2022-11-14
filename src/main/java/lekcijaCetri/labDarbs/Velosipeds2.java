package lekcijaCetri.labDarbs;

public class Velosipeds2 {
    String zimols;
    int ramjaizmers;
    int atrums = 0;

    public void printAtrums() {
        System.out.println(atrums);
    }
    public void paatrinajums() { // klasee jau ieliekam metodes
        System.out.println("Velo paatrinas");
        atrums=atrums+5;
    }
    public void bremzesana() {
        System.out.println("Velo bremze");
        atrums=atrums-5;
    }

}
