## 課題③
以下のように配列を宣言し、ランダムな要素をインデックスとともにコンソールに表示してください。
```
String[] array = {"バナナ", "りんご", "みかん", "オレンジ", "ぶどう"};
```
出力例
```
2番目の要素はみかんです
```

---

## 回答
```

import java.util.*;

public class Main {
public static void main(String[] args){
Random rand = new Random();

      int index = rand.nextInt(5);

      String[] array = {"バナナ" ,"りんご" ,"みかん","オレンジ","ぶどう"};

System.out.println(index + "番目の要素は" + array[index] + "です");
}
}

1番目の要素はりんごです
```
---

## review

7行目の
```
int index = rand.nextInt(5);
```
の`5`ってどこから出てきましたか？  
おそらく，「`array`は`0`番目から`4`番目まであるから`5`にしよう」と思ったはずです。
これ，初心者が事故ってしまう原因ナンバーワンです。   
`array`に`"メロン"`を追加した時，`5`を`6`に書き換え忘れませんか？
人間は忘れる生き物です。間違えそうなところは，コンピュータにおまかせしましょう。
配列の要素数は
```
array.length
```
で取得することができます。
ということは，`array`を先に宣言して，
```
String[] array = {"バナナ" ,"りんご" ,"みかん","オレンジ","ぶどう"};
int index = rand.nextInt(array.length);
```
とすれば，`array`の要素が増えようが減ろうが，`nextIntの()`の中を手書きで調整しなくても良くなりますね。

上記を意識して書き直し，再提出してください。

---

## 再提出分
```
import java.util.*;

public class Main {
public static void main(String[] args){
Random rand = new Random();

      String[] array = {"バナナ" ,"りんご" ,"みかん","オレンジ","ぶどう"};

      int index = rand.nextInt(array.length);

System.out.println(index + "番目の要素は" + array[index] + "です");
}
}

0番目の要素はバナナです
```
---