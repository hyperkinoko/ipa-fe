public class Book {
  String title;
  String author;
  int price;

  // コンストラクタ①
  public Book(String title, String author, int price) {
    this.title = title;
    this.author = author;
    this.price = price;
  }

  // コンストラクタ②
  public Book(String title, String author) {
    this.title = title;
    this.author = author;
    this.price = 500;
  }

  // コンストラクタ③
  public Book() {
    this.title = "タイトル未定";
    this.author = "名無しの権兵衛";
    this.price = 500;
  }

  public void printBookInfo() {
    System.out.println("--------------------------");
    System.out.println("タイトル： " + this.title);
    System.out.println("著者： " + this.author);
    System.out.println("価格： " + this.price + "円");
    System.out.println("--------------------------");

  }
  public void discount(int discountValue) {
    this.price -= discountValue;
  }
}
