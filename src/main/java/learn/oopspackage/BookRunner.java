package learn.oopspackage;

public class BookRunner {
    public static void main(String[] args) {
        Book LOH = new Book("Life of Happiness", 190, "Sabarinathan", 2);
        LOH.printBook();
        Book TLM = new Book("Think Like Mong", 18, "Nolan", 3);
        TLM.printBook();
        Book FOS = new Book("Fly On Sky", 100, "Robert", 4);
        FOS.printBook();

        System.out.println("Book Name : " + LOH.getName());
        System.out.println("Number of Pages : " + LOH.getNumberOfPages());
        System.out.println("Author : " + LOH.getAuthor());
    }

}

