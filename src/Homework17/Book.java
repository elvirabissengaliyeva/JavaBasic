package Homework17;
/* 6) Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
      Instance variables are being initialized
      Both Constructors are being executed*/
public class Book {

    String authorName;
    String bookName;
    int page;

    Book(String bookAuthorName, String BookName, int bookPage) {
        authorName = bookAuthorName;
        bookName = BookName;
        page = bookPage;

    }
    void printInf(){
        System.out.println(authorName+" "+bookName+" "+ page);
        }
    void printInfo(){
        System.out.println(authorName+" "+bookName);
    }
}
