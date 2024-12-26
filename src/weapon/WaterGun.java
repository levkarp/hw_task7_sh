package weapon;

public class WaterGun extends Weapon{
    @Override
    public void shot() {
        System.out.println("выстрел из водного пистолета");
        System.out.println("а был выстрел? Ого, кто-то весь мокрый");
    }
}
