package ru.geekbrains.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void increaseFood(int n) {
        food += n;
    }
    public void decreaseFood(int  n) {
        food -= n;
        if (food <= 0) {
            food = 0;
        }
    }
    public void info() {
        System.out.println("Food: " + food);
    }

    public int GetFood() {
        return food;
    }
}
