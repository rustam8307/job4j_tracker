package ru.job4j.tracker;

import java.time.LocalDateTime;

public class Item {
    private int id;
    private String name;
    private LocalDateTime created;

    public Item() {
    }

    public Item(int id) {
        this.id = id;
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(LocalDateTime created) {
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


