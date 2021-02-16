package ru.job4j.tracker;

 public class StartUI {

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item =new Item("name1");
        tracker.add(item);
        Item rsl =tracker.findById(1);
        System.out.println(rsl);
        }
    }

