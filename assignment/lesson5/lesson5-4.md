## 課題4
※ 今までに作ったBookクラスに追記します。

1. 自分自身のタイトルと著者，価格を出力するprintBookInfoメソッドを作ってみましょう。
   a. 戻り値，引数はともにありません。
2. 引数で値引き額を受け取り，その分だけ価格から値引きするdiscountメソッドを作ってみましょう。
   a. 戻り値はありません。
   b. int型のdiscountValueを引数にとります。

以下のMainクラス（mainメソッド）を写経して，実行してみましょう。  

Main.java
~~~
public class Main {
public static void main(String[] args) {
Book book1 = new Book("きっちりJava", "松本きのこ", 1000);

    System.out.println("値引き前：");
    book1.printBookInfo();

    book1.discount(100);
    
    System.out.println("値引き後：");
    book1.printBookInfo();
}
}
~~~

実行例
~~~
値引き前：
--------------------------
タイトル： きっちりJava
著者： 松本きのこ
価格： 1000円
--------------------------
値引き後：
--------------------------
タイトル： きっちりJava
著者： 松本きのこ
価格： 900円
--------------------------
~~~

※ Book.javaと出力結果を提出してください