package class18;

public class Book {
    String name;
    String author;
    int page;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    Book(String name, String author, int page) {
        this(name,author);
        this.page = page;
    }
    void print(){
        System.out.println("Book name is "+name+" Author is "+author+" number page "+page);
    }

    public static void main(String[] args) {
        Book book1=new Book("Harry Potter","J.K.Rowling");
        book1.print();
        Book book2=new Book("Harry Potter2","J.K.Rowling",323);
        book2.print();

    }
}

