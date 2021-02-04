package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student ivan = new Student();
        ivan.setFullName("Иван Иванович Иванов");
        ivan.setGroup("147в");
        ivan.setDataStart("15.09.2000");

        System.out.println(ivan.getFullName() +" "+ ivan.getGroup() +" " +"Дата поступления : " + ivan.getDataStart());
    }
}
