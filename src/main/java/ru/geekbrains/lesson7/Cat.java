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
        if(p.GetFood() >= appetite) {
            p.decreaseFood(appetite);
            satiety = true;
        }
        else {
            System.out.println("meeaaaaaaw");
        }
    }

    public void SatietyStatus() {
        System.out.println("Satiety: " + satiety);
    }
}
