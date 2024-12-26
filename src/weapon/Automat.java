package weapon;

public class Automat extends Weapon{
    @Override
    public void shot() {
        System.out.println("очередь из автомата");
        System.out.println("бах, бах, бах, бах");
    }
}
