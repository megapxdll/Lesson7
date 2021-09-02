package ru.geekbrains.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void GetName() {
        System.out.println(name);
    }

    public void eat(Plate p) {
        if(appetite > p.GetFood()) {
            System.out.println("meeaaaaaaw");
            satiety = false;
        }
        else {
            p.decreaseFood(appetite);
            satiety = true;
        }
    }

    public void SatietyStatus() {
        System.out.println("Satiety: " + satiety);
    }
}
