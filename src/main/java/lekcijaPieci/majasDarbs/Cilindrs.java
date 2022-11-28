package lekcijaPieci.majasDarbs;

public class Cilindrs {
    //mainīgie
    private int radiuss;
    private int augstums;

    //geteri un seteri
    public int getRadiuss() {
        return radiuss;
    }
    public void setRadiuss(int radiuss) {
        this.radiuss = radiuss;
    }


    public int getAugstums() {
        return augstums;
    }

    public void setAugstums(int augstums) {
        this.augstums = augstums;
    }
//metodes tilpuma un virsmas laukuma aprēķinam
    public double getAprTilpumu (){
        return Math.PI*radiuss*radiuss*augstums;
    }
    public double getAprVirsmLaukumu (){
        return 2*Math.PI*radiuss*augstums;
    }
    //konstruktors
    public Cilindrs() {
    }
    public Cilindrs(int augstums, int radiuss){
        this.augstums=augstums;
        this.radiuss=radiuss;
    }

    public void printcilindrs(){
        System.out.println("Cilindra2 rādiuss ir "+radiuss);
        System.out.println("Cilindra2 augstums ir "+augstums);
    }

}