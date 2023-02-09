package Homework17;
/* 6) Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
      Instance variables are being initialized
      Both Constructors are being executed*/
public class BookTester {
    public static void main(String[] args) {
        Book book1=new Book("Rowling","Harry Potter",394);
        book1.printInf();
        Book book2= new Book("J.K.Rowling","Harry Potter2",354);
        book2.printInfo();



    }
    
}
