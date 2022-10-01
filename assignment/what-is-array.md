## 自作クラスを要素に持つ配列

今まで`int`型配列や`String`型配列を使ってきましたが，自作クラス（`Book`や`Person`）も配列にすることができます。
`Book`クラスの配列は以下のように宣言します。（`Main.java`に書きます）
```
Book[] books = new Book[5];
```

>この書き方は`int`型や`String`型でも同じようにできます（今までは`{"hoge", "fuga"}`みたいなので書いていましたね。これはリテラルという書き方です）
>```
>int[] scores = new int[5];
>String[] members = new String[10];
>```

この`new`は配列を作る`new`であってまだ`Book`インスタンスは`new`されていません。
この時点で`books`はまだ中身の入っていない空の箱が5つ繋がったようなものができただけです。
（GODIVAみたいなチョコレートの箱を思い浮かべてください。）
ここへ，`Book`インスタンスを入れていきます。
```
books[0] = new Book("きっちりJava", "松本きのこ", 1000);
books[1] = new Book("きっちりPython", "はむかず", 1300);
books[2] = new Book("きっちりRuby", "まつもとゆきひろ", 1800);
books[3] = new Book("すごいJava", "松本きのこ", 1200);
books[4] = new Book("やっぱりJava", "松本きのこ", 900);
```
クラスとコンストラクタが宣言されているおかげで，ひとつひとつの要素（`Book`インスタンス）に簡単に別々のデータを入れることができますね。
また，これは配列ですから，for文などで一気に処理することができます。
すべての本を100円値引きするようなことも簡単にできます。


`Main.java`
```
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
```

写経して実行してみてください。