package player;

import weapon.*;

public class Player {
    // Указываем тип данных Weapon, который будет храниться в "слотах игрока"
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        // TODO заполнить слоты оружием
        // new BigGun(),
        // new WaterPistol()
        // в конструкторе прописать создание оружия

        weaponSlots = new Weapon[]{new Gun(), new Automat(), new Rpg(), new Rogatka(), new WaterGun()};

    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // TODO проверить на выход за границы
        // если значение slot некорректно, то
        // выйти из метода написав об этом в консоль
        if (slot > getSlotsCount()) {
            System.out.println("вышли за пределы слота");

        } else {
            Weapon weapon = weaponSlots[slot];
            // Огонь!
            weapon.shot();
        }

        // по индексу
// по номеру оруж из массива вызываем метод shot кокретн оружия
// вызывапть у вепона
        // Получаем оружие из выбранного слота
//        Weapon weapon = weaponSlots[slot];
//        // Огонь!
//        weapon.shot();
    }


}
