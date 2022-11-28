package lekcijaPieci.majasDarbs;

public class Main {
    public static void main(String[] args) {

        Cilindrs cilindrs1= new Cilindrs();
        System.out.println("Cilindrs nr. 1");
        cilindrs1.setAugstums(40);
        cilindrs1.setRadiuss(10);

        System.out.println("Cilindrs1 radiuss ir "+cilindrs1.getRadiuss());
        System.out.println("Cilindrs1 augstums ir "+cilindrs1.getAugstums());

        Cilindrs cilindrs2 = new Cilindrs(45,15);
        System.out.println("Cilindrs nr. 2");
        cilindrs2.printcilindrs();

        System.out.println("Cilindra 1 tilpums ir "+cilindrs1.getAprTilpumu());
        System.out.println("Cilindra 2 virsmaslaukums ir "+cilindrs1.getAprVirsmLaukumu());
        System.out.println("Cilindra 1 tilpums ir "+cilindrs2.getAprTilpumu());
        System.out.println("Cilindra 2 virsmaslaukums ir "+cilindrs2.getAprVirsmLaukumu());
    }
}
