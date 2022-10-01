## 課題②
以下のように配列を宣言し、3番目の要素をコンソールに表示してください。
~~~
String[] array = {"バナナ", "りんご", "みかん", "オレンジ", "ぶどう"};
~~~
出力例
~~~
3番目の要素はオレンジです
~~~

---

## 回答

~~~
import java.util.*;

public class Main {
public static void main(String[] args){
int num = 3;

      String[] array = {"バナナ" ,"りんご" ,"みかん","オレンジ","ぶどう"};

System.out.println(num + "番目の要素は" + array[num] + "です");
}
}

3番目の要素はオレンジです
~~~
---

## review

正解です  
よくできていますね。  
Java（や他の殆どの言語）では配列のインデックス（n番目のn）は0から始まります。  
3番目がみかんでないことをよく理解しておきましょう。