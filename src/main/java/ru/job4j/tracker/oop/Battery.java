package ru.job4j.tracker.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another){
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery one = new Battery(85);
        Battery two = new Battery(15);
        System.out.println("Battery one : " + one.load + ". Battery two : " + two.load);
        one.exchange(two);
        System.out.println("Battery one : " + one.load + ". Battery two : " + two.load);
    }
}
