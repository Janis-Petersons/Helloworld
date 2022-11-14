package lekcijaSesi.labDarbs;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        String vards=faker.name().firstName();
        System.out.println("Manis sauc " + vards);

        String vardito=faker.address().country();
        System.out.println(vardito);
        String vardiito=faker.starTrek().villain();
        System.out.println(vardiito);
        System.out.println(faker.animal().name()+faker.avatar());
    }

}
