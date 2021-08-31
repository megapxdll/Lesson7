package ru.geekbrains.lesson7;

public class MainApp {
    public static void main(String[] args) {
        Cat[] cat = new Cat[6];
        cat[0] = new Cat("Barsik", 10);
        cat[1] = new Cat("Pupsik", 20);
        cat[2] = new Cat("Volk", 20);
        cat[3] = new Cat("Marusya", 10);
        cat[4] = new Cat("Obzhora", 30);
        cat[5] = new Cat("Felix", 12);
        Plate plate = new Plate(100);
        for (int i = 0; i < cat.length; i++) {
            cat[i].GetName();
            cat[i].eat(plate);
            cat[i].SatietyStatus();
            plate.info();
            System.out.println();
        }
        Human master = new Human();
        master.AddFood(plate, 100);
    }
}
