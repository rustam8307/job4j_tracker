package ru.job4j.tracker.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare zayts = new Hare();
        Wolf volk = new Wolf();
        Fox lisa = new Fox();
        kolobok.death(lisa);
        zayts.tryEat(kolobok);
        volk.tryEat(kolobok);
        lisa.tryEat(kolobok);
    }
}
