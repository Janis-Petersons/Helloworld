package lekcijaCetri.labDarbs;

public class House {
    int stavuDaudzums;
    int loguSkaits;
    int durvjuSkaits;
    String adrese;
    double griestuAugstums;
    long kadastralaVertiba;
    boolean vaiPrivatipasums;

    public String printHouse() {
        return "House{" +
                "stavuDaudzums=" + stavuDaudzums +
                ", loguSkaits=" + loguSkaits +
                ", durvjuSkaits=" + durvjuSkaits +
                ", adrese='" + adrese + '\'' +
                ", griestuAugstums=" + griestuAugstums +
                ", kadastralaVertiba=" + kadastralaVertiba +
                ", vaiPrivatipasums=" + vaiPrivatipasums +
                '}';
    }
}
