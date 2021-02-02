package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {
    private int id;
    private String name;
    LocalDateTime created;

    public Item() {
    }

    public Item(int id){
        this.id = id;
    }

    public Item(String name){
        this.name = name;
    }

    public Item(LocalDateTime created){
        this.created = created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDateAndTime() {
        return created;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class StartUI {

    public static void main(String[] args) {
        Item item = new Item(LocalDateTime.now());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String currentDateTimeFormat = item.created.format(formatter);
        System.out.println("После форматирования:  " + currentDateTimeFormat);
    }
}

