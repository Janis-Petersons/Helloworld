package lekcijaPieci.labDarbs;

public class Main {
    public static void main(String[] args) {
        Cat muris = new Cat();
        Dog reksis = new Dog();
        Cow govs = new Cow();
        Fish zivs= new Fish();

        muris.age=2;
        muris.canClimbTress = true;
        reksis.age=6;
        reksis.canClimbTress = false;
        muris.breathe();
        reksis.breathe();

muris.makesound();
reksis.makesound();
govs.makesound();
zivs.makesound();

muris.eat();
reksis.eat();

muris.sharpenClaws();
reksis.growl();

muris.printClimbing();

    }
}
