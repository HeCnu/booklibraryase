package ru.ase;

import ru.ase.domain.Book;
import ru.ase.domain.Library;

import java.util.List;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Library library = new Library();
        Scanner in = new Scanner(System.in);
        library.createLibrary();
        System.out.println("Добро пожаловать в библиотеку имени Дамира");
        library.showAll();
        while (true) {
            System.out.println(
                    "Введите цифру, соответствующую действию:" + "\n" +
                            "1. Вывести книги по произвольному запросу" + "\n" +
                            "2. Редактировать/удалить книгу" + "\n" +
                            "3. Добавить книгу" + "\n" +
                            "4. Загрузка/сохранение картотеки в файл" + "\n"
            );
            int action = in.nextInt();
            switch (action) {
                case 1:
                    findBook(library);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }
    }

    static void findBook(Library library) {
        Scanner in = new Scanner(System.in);
        System.out.println(
                "Введите цифру, соответствующую действию:" + "\n" +
                        "1. Вывести книги по автору" + "\n" +
                        "2. Вывести книги по разделу" + "\n" +
                        "3. Вывести книги по наличию" + "\n"
        );
        int action = in.nextInt();
        switch (action) {
            case 1: {
                Scanner in1 = new Scanner(System.in);
                System.out.println("Введите имя автора...");
                String nameAuthor = in1.nextLine();
                System.out.println(library.findBookByAuthor(nameAuthor));
                break;
            }
            case 2: {
                System.out.println("Введите название раздела...");
                String nameSection = in.nextLine();
                System.out.println(library.findBookBySection(nameSection));
                break;
            }
            case 3: {
                System.out.println(library.findBookByExisting());
                break;
            }
            default: break;
        }
    }
}