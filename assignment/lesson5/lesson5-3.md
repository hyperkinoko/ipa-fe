## 課題3
今まで学習したことを使って，以下のようなPersonクラスを作成しましょう。

- フィールドは以下の2つ
    - String型 name
    - int型 age
- コンストラクタは以下の2つ
    - 引数なしのコンストラクタ
        - nameフィールドを"名無しの権兵衛"で初期化する
        - ageフィールドを10で初期化する
    - nameとageの2つの引数をとるコンストラクタ
        - String型の引数nameを受け取り，その値でnameフィールドを初期化する
        - int型の引数ageを受け取り，その値でageフィールドを初期化する

以下のMain2クラス（mainメソッド）を写経して，実行してみましょう。


Main2.java
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

※ Person.javaと実行例を提出してください。