package org.oopspackage;

public class Book {
    public String name;
    public int numberOfPages;
    public String author;
    private int noOfCopies;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNoOfCopies(int value) {
        if (value > 0) {
            this.noOfCopies = value;
        }
    }

    public int getNoOfCopies() {
        return this.noOfCopies;
    }

    public void increseCopies(int value) {
        setNoOfCopies(value);
    }

    public void decreaseCopies(int value) {
        setNoOfCopies(this.noOfCopies - value);
    }

    Book(String name, int numberOfPages, String author, int noOfCopies) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.noOfCopies = noOfCopies;
    }

    public void printBook() {
        System.out.println("Book Name : " + this.name);
        System.out.println("Number of Pages in " + this.name + " : " + this.numberOfPages);
        System.out.println(this.name + " Author : " + this.author);
        System.out.println(this.name + " Number of Copies : " + this.noOfCopies);
    }
}

