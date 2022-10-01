## 課題3
今まで学習したことを使って，以下のような`Person`クラスを作成しましょう。

- フィールドは以下の2つ
    - `String`型 `name`
    - `int`型 `age`
- コンストラクタは以下の2つ
    - 引数なしのコンストラクタ
        - `name`フィールドを`"名無しの権兵衛"`で初期化する
        - `age`フィールドを`10`で初期化する
    - `name`と`age`の2つの引数をとるコンストラクタ
        - `String`型の引数nameを受け取り，その値で`name`フィールドを初期化する
        - `int`型の引数`age`を受け取り，その値で`age`フィールドを初期化する

以下の`Main2`クラス（`main`メソッド）を写経して，実行してみましょう。


`Main2.java`
```
public class Main2 {
public static void main(String[] args) {
Person person1 = new Person();
Person person2 = new Person("キノコ", 42);

    System.out.println(person1.name + "さんは" + person1.age + "歳です");
    System.out.println(person2.name + "さんは" + person2.age + "歳です");
}
}
```

実行例
```
名無しの権兵衛さんは10歳です
キノコさんは42歳です
```

**※ `Person.java`と実行例を提出してください。**