package lekcijaDivi.majasDarbs;

public class printBusinessCardTwo {

    public static void main(String[] args) {
        vizitkarte2("Jonas","Joninas","+371000000", "2002");
        vizitkarte2("Monas","Lonas","+371000001", "2012");
    }

    public static void vizitkarte2(String vards, String uzvards, String telefons, String gads) {
        System.out.println("Vizītkarte");
        System.out.println("# # # # # #");
        System.out.println("Vārds: "+vards);
        System.out.println("Uzvārds: "+uzvards);
        System.out.println("Mob.telefons:"+telefons);
        System.out.println("Dzimšanas gads: "+gads);
    }
}
