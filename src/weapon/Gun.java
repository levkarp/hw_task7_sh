package weapon;

public class Gun extends Weapon {
    @Override
    public void shot() {
        System.out.println("выстрел из пистолета");
        System.out.println("бах");
    }
}
