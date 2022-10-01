## コンストラクタについて
インスタンスを作成するとき，`new`演算子を用いました。
`new`演算子は，クラスに宣言されたコンストラクタを用いてインスタンスを作成します。
コンストラクタはクラス宣言内に，以下のように書きます。
```
public クラス名(引数) {
インスタンス作成時にやりたいこと（初期化など）
}
```
引数は，ないときもあれば複数あるときもあります。

ところで，先の`Book`クラスには，コンストラクタを記述していませんでした。
この場合は，デフォルトコンストラクタという暗黙のコンストラクタが作られ，それが呼ばれています。デフォルトコンストラクタはインスタンスを作成するのみで，他には何もしません。
つまり，以下のコンストラクタを書いたのと同じことになります。
```
public Book() {
// 何もしない
}
```

コンストラクタは，引数の型と数が違えば同じクラス内にいくつでも書けます。
例えば，インスタンス作成時にタイトルと著者と価格のすべてを設定するようなコンストラクタは以下のように書きます。
```
public Book(String title, String author, int price) {
this.title = title;
this.author = author;
this.price = price;
}
```
ここで，`this`とは自分自身のインスタンスを指します。
クラス（設計図）の時点ではインスタンスはありませんから`book1`のような特定の名前を使わず，「自分自身の`title`フィールドに引数で受け取った`title`を代入する」という意味で`this`を使います。
コンストラクタでは，引数名とフィールド名が同じことが多いので，引数のtitleには何も付けず，フィールドにはthisを付けて区別します。

また，価格を受け取らず，とりあえずすべて500円で初期化するようなコンストラクタは以下です。
```
public Book(String title, String author) {
this.title = title;
this.author = author;
this.price = 500;
}
```
上記の2つのコンストラクタは，引数の数が違うので同じクラス内に一緒に宣言できます。
```
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
}
```

インスタンスを作成する側では，`new`演算子を次のように呼び出します。
```
public class `main` {
public static void `main`(String[] args) {
// ①のコンストラクタを用いてインスタンスを作成
Book book1 = new Book("きっちりJava", "松本きのこ", 1000);

    // ②のコンストラクタを用いてインスタンスを作成
    Book book2 = new Book("のこのこ生活", "kinoko");

    System.out.println("--------book1--------");
    System.out.println("タイトル： " + book1.title);
    System.out.println("著者： " + book1.author);
    System.out.println("価格： " + book1.price + "円");
    
    System.out.println("--------book2--------");
    System.out.println("タイトル： " + book2.title);
    System.out.println("著者： " + book2.author);
    System.out.println("価格： " + book2.price + "円");
}
}
```

実行例
```
--------book1--------
タイトル： きっちりJava
著者： 松本きのこ
価格： 1000円
--------book2--------
タイトル： のこのこ生活
著者： kinoko
価格： 500円
```
ここで気をつけてほしいのは，さっきまで使えていた引数なしのコンストラクタが使えなくなることです。`new Book()`はエラーになります。  
これは，「デフォルトコンストラクタはクラス内にひとつもコンストラクタが記述されていない場合のみ自動で補完される」からです。  
つまり，ひとつでもコンストラクタを書いた時点で，デフォルトコンストラクタはなくなります。もちろん，以下のように敢えて書いてあげれば，`new Book()`することは可能です。  
よくあるのは，引数なしの場合にはクラス側で初期値を決めておくというパターンです。
```
public Book() {
this.title = "タイトル未定";
this.author = "名無しの権兵衛";
this.price = 500;
}
```

ここまで学習したことをまとめると，以下のようなコードができます。
写経して実行してみましょう。

`Book.java`
```
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
}
```

``main`.java`
```
import java.util.*;

public class `main` {
public static void `main`(String[] args) {
// ①のコンストラクタを用いてインスタンスを作成
Book book1 = new Book("きっちりJava", "松本きのこ", 1000);

    // ②のコンストラクタを用いてインスタンスを作成
    Book book2 = new Book("のこのこ生活", "kinoko");

    // ③のコンストラクタを用いてインスタンスを作成
    Book book3 = new Book();

    System.out.println("--------book1--------");
    System.out.println("タイトル： " + book1.title);
    System.out.println("著者： " + book1.author);
    System.out.println("価格： " + book1.price + "円");

    System.out.println("--------book2--------");
    System.out.println("タイトル： " + book2.title);
    System.out.println("著者： " + book2.author);
    System.out.println("価格： " + book2.price + "円");

    System.out.println("--------book3--------");
    System.out.println("タイトル： " + book3.title);
    System.out.println("著者： " + book3.author);
    System.out.println("価格： " + book3.price + "円");
}
}
```

``main``メソッド実行例
```
--------book1--------
タイトル： きっちりJava
著者： 松本きのこ
価格： 1000円
--------book2--------
タイトル： のこのこ生活
著者： kinoko
価格： 500円
--------book3--------
タイトル： タイトル未定
著者： 名無しの権兵衛
価格： 500円
```

Javaのプログラムを実行すると，自動で（クラス名に依らず）`main`メソッドを探して実行します。同じプロジェクト内に複数の`main`メソッドがある場合は，どちらの`main`メソッドを実行するか指定する方法があります。  
mainメソッドはどのクラスに記述しても良い（`Book`クラスでもOK）のですが，読みやすさのため，`main`メソッドは`main`クラスや`App`クラスに記述されることが多いです。今までは`main`クラスに記述していましたね。