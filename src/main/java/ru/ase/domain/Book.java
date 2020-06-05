package ru.ase.domain;

public class Book {

    private final Integer id;
    private final String title;
    private final String author;
    private final String creator;
    private final String section;
    private final Double rate;
    private Boolean isExist;

    public Book(Integer id, String title, String author, String creator, String section, Double rate, Boolean isExist) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.creator = creator;
        this.section = section;
        this.rate = rate;
        this.isExist = isExist;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCreator() {
        return creator;
    }

    public String getSection() {
        return section;
    }

    public Double getRate() {
        return rate;
    }

    public Boolean getExist() {
        return isExist;
    }

    public void setExist(Boolean exist) {
        this.isExist = exist;
    }

    @Override
    public String toString() {
        return "------------------" + '\n' +
                "ID - '" + id + "'\n" +
                "Название - '" + title + "'\n" +
                "Автор - '" + author + "'\n" +
                "Издание - '" + creator + "'\n" +
                "Раздел - '" + section + "'\n" +
                "Рейтинг - " + rate + '\n' +
                "Наличие - " + (isExist == true ? "Есть в наличии" : "Нет в наличии") + '\n' +
                "------------------" + "\n";
    }
}
