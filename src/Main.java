public class Main {

    public static void printSeparator() {
        System.out.println("-------------------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("Домашнее задание. Урок 1.9 Объекты и классы");
        printSeparator();

        Author author1 = new Author("Михаил", "Лермонтов");
        Book book1 = new Book("Родина", author1, 1841);
        System.out.println(book1.bookInfo());
        printSeparator();

        Author author2 = new Author("Александр", "Пушкин");
        Book book2 = new Book("Борис Годунов", author2, 1825);
        System.out.println(book2.bookInfo());
        printSeparator();

        book2.setYearPublication(2022);
        System.out.println(book2.bookInfo());
        printSeparator();

    }
}