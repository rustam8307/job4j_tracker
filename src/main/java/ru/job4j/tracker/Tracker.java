package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }
    public Item[] findAll() {
        Item[] namesWithoutNull = new Item[items.length];
        int size = 0;
        for (int i = 0; i < items.length ; i++) {
            Item name = items[i];
            if (items[i] != null) {
                namesWithoutNull[size] = name;
                size++;
            }
        }
        return Arrays.copyOf(namesWithoutNull, size);
    }

    public Item[] findByName(String key) {
        int kuk = 0;
        Item[] neededName = new Item[size];
        for (int i = 0; i < size; i++) {
            Item name = items[i];
            if(key.equals(name.getName())){
                neededName[kuk] = name;
                kuk++;
            }
        }
        return Arrays.copyOf(neededName, kuk);

    }


    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}