## 課題④
以下のように配列を宣言し、for文を使ってすべての要素を順にコンソールに表示してください。
```
String[] array = {"バナナ", "りんご", "みかん", "オレンジ", "ぶどう"};
```
出力例
```
0番目の要素はバナナです
1番目の要素はりんごです
2番目の要素はみかんです
3番目の要素はオレンジです
4番目の要素はぶどうです
```

---

## 回答
```
import java.util.*;

public class Main {
public static void main(String[] args){
String[] array = {"バナナ" ,"りんご" ,"みかん","オレンジ","ぶどう"};

    for(int i = 0;i < array.length;i++){
      System.out.println(i + "番目の要素は" + array[i] + "です");
       }
     }
}

0番目の要素はバナナです
1番目の要素はりんごです
2番目の要素はみかんです
3番目の要素はオレンジです
4番目の要素はぶどうです
```
---

## review

完璧です  
array.lengthを上手に使えていますね。  
課題③でお話した通り，ココを`i<5`とか`i<=4`とか書いてしまうのは悪手です。
`i<=4`なんて，`4`がどこから出てきたのかもよくわからないですね。  
このfor文は今後何度も書くので，体が覚えていくことでしょう。