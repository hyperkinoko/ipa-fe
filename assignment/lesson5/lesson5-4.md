## 課題4
※ 今までに作ったBookクラスに追記します。

1. 自分自身のタイトルと著者，価格を出力する`printBookInfo`メソッドを作ってみましょう。
   a. 戻り値，引数はともにありません。
2. 引数で値引き額を受け取り，その分だけ価格から値引きする`discount`メソッドを作ってみましょう。
   a. 戻り値はありません。
   b. `int`型の`discountValue`を引数にとります。

以下の`Main`クラス（`main`メソッド）を写経して，実行してみましょう。  

`Main.java`
```
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
```

実行例
```
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
```

**※ `Book.java`と出力結果を提出してください**