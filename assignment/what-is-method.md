## メソッドについて
Javaではクラス内にデータ（フィールド）だけでなく処理（メソッド）を宣言することができます。
メソッドの宣言はクラス宣言内に次のように書きます。
```
public 返り値の型 メソッド名(引数) {
処理
}
```

返り値がないときは`void`，引数がないときは`()`だけ書きます。  
今まで`Main.java`内に書いてきた`arrayMax`関数などは，実は`Main`クラスのメソッドだったということですね。
クラスのメソッドでは，自分自身（`this`）のフィールドの値を使って何かすることが多いです。  
例えば，上述の`Person`クラスにおいて，自分の名前と年齢を出力する`introduce`メソッドは次のようになるでしょう。

`Person.java`
```
public class Person {
String name;
int age;

// コンストラクタ略

public void introduce() {
System.out.println("私は" + this.name + "です。" + this.age + "歳です。");
}
}
```

`Main2.java`
```
public class Main2 {
public static void main(String[] args) {
Person person1 = new Person();
Person person2 = new Person("キノコ", 42);

    person1.introduce();
    person2.introduce();
}
}
```

実行例
```
私は名無しの権兵衛です。10歳です。
私はキノコです。42歳です。
```

