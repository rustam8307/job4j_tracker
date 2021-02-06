package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 120);
        Book book2 = new Book("Java", 340);
        Book book3 = new Book("Algorithms", 460);
        Book book4 = new Book("C# ", 400);
        Book[] programming = new Book[4];
        programming[0] = book1;
        programming[1] = book2;
        programming[2] = book3;
        programming[3] = book4;
        for (int i = 0; i < programming.length; i++) {
            Book pr = programming[i];
            System.out.println(pr.getTitle() + " - " + pr.getPages());
        }
        System.out.println("Перестановка индексов массива");
        Book tmp = programming[0];
        programming[0] = programming[3];
        programming[3] = tmp;
        for (int i = 0; i < programming.length; i++) {
            Book pr = programming[i];
            System.out.println(pr.getTitle() + " - " + pr.getPages());
        }
        System.out.println("Вывод на консоль книг с именем 'Clean code'");
        for (int i = 0; i < programming.length; i++) {
            Book pr = programming[i];
            if (pr.getTitle().equals("Clean code")) {
                System.out.println(pr.getTitle() + " - " + pr.getPages());
            }
        }
    }
}
