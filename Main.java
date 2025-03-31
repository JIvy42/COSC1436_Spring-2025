public class Main {
    public static void main(String[] args) {
        Author author = new Author("Jane Doe", "jane.doe@example.com", "American");
        Book book = new Book("The Mystery Novel", 19.99, author);
        System.out.println(book.toString());
    }
}
