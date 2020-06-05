package ru.ase.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

    List<Book> books = new ArrayList<>();

    public void createLibrary() {
        books.add(new Book(1, "Престиж", "Кристофер Прист", "Новая Книга", "Зарубежная литература", 5.0, true));
        books.add(new Book(2, "Богач, бедняк", "Ирвин Шоу", "Новая Книга", "Зарубежная литература", 4.5, true));
        books.add(new Book(3, "Нищий, вор", "Ирвин Шоу", "Новая Книга", "Зарубежная литература", 5.0, false));
        books.add(new Book(3, "Финансист", "Теодор Драйзер", "Новая Книга", "Зарубежная литература", 4.7, true));
        books.add(new Book(3, "Три товарища", "Эрих Мария Ремарк", "Просвящение", "Зарубежная литература", 5.0, true));
        books.add(new Book(3, "Детство", "Лев Толстой", "Просвящение", "Русская литература", 5.0, false));
    }

    public List<Book> getBooks() {
        return books;
    }

    public void showAll() {
        for (Book book: books) {
            System.out.println(book);
        }
    }

    public void addBookInLibrary(Book tempBook) {
        books.add(tempBook);
    }

    public List<Book> findBookByAuthor(String author) {
        return books.stream().filter(x-> x.getAuthor().equals(author)).collect(Collectors.toList());
    }

    public List<Book> findBookBySection(String section) {
        return books.stream().filter(x-> x.getSection().equals(section)).collect(Collectors.toList());
    }

    public List<Book> findBookByExisting() {
        return books.stream().filter(x-> x.getExist().equals(true)).collect(Collectors.toList());
    }

}
