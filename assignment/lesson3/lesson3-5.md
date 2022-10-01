## 課題⑤
課題④と同じことを，拡張for文 https://www.javadrive.jp/start/for/index8.html を使って書きましょう。
ただし，インデックスは必要ありません。
出力例
```
バナナです
りんごです
みかんです
オレンジです
ぶどうです
```

---

## 回答
```

import java.util.*;

public class Main {
public static void main(String[] args){
String[] array = {"バナナ" ,"りんご" ,"みかん","オレンジ","ぶどう"};

    for(String fruits : array){
      System.out.println(fruits + "です");
       }
     }
}

バナナです
りんごです
みかんです
オレンジです
ぶどうです

```
---

## review

これも完璧です  
ひとつだけ直すとすれば，fruitsは複数形なので，arrayから1つずつ要素を取り出すという意味合いから，fruitにしたほうが良いでしょうか。まぁ，些細なことです。