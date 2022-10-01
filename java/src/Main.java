import java.util.*;

public class Main {
  public static void main(String[] args) {
    Book[] books = new Book[5];
    books[0] = new Book("きっちりJava", "松本きのこ", 1000);
    books[1] = new Book("きっちりPython", "はむかず", 1300);
    books[2] = new Book("きっちりRuby", "まつもとゆきひろ", 1800);
    books[3] = new Book("すごいJava", "松本きのこ", 1200);
    books[4] = new Book("やっぱりJava", "松本きのこ", 900);

    for(Book book: books) {
      System.out.println("値引き前：");
      book.printBookInfo();

      book.discount(100);

      System.out.println("値引き後：");
      book.printBookInfo();
    }
  }
}
