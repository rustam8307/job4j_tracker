package ru.job4j.tracker.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return eng;
    }

    public static void main(String[] args) {
        DummyDic eng = new DummyDic();
        String say = eng.engToRus("unclear");
        System.out.println("Неизвестное слово. " + eng);
    }
}
