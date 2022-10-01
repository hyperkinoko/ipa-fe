## 課題9
1. String型配列の第1引数arrayで与えられた配列内にString型の第2引数targetで与えられた要素と一致するものあるかを調べる関数findを定義しましょう。
2. 戻り値は"あります"か"ありません"の文字列のどちらかを返すようにしましょう。
3. 以下の2つの配列を作成し、それぞれをfindの第1引数にして呼び出しましょう。第2引数は出力例に合わせてください。
4. 呼び出した結果を表示しましょう。
```
String[] array = {"バナナ", "りんご", "みかん", "オレンジ", "ぶどう"};
```
出力例
```
arrayにみかんはあります
arrayにももはありません
```
ヒント：  
returnが実行されると、その関数はそこで処理をやめて、値を返します。
一つでも一致するものが見つかったら、その時点でreturnするといいですね。

---

## 回答
```
import java.util.*;

public class Main {
public static void main(String[] args){

    String[] array = {"バナナ", "りんご", "みかん", "オレンジ", "ぶどう"};

System.out.println( "arrayにみかんは" + find(array,"みかん"));
System.out.println( "arrayにももは" + find(array,"もも"));
}

static String find(String[] array, String target){

           if(Arrays.asList(array).contains(target)){
             return "あります";

            }
          else {
            return  "ありません";
          }
      }
}

arrayにみかんはあります
arrayにももはありません
```
---

## review
find関数を，containsを使わずにfor文または拡張for文を使って実装できますか？

ちなみに，String型（文字列）の値が等しいかどうかを調べるときは，==ではなくequalsメソッド（関数）を使います。
これについては，「オブジェクトの同値」について話すときに詳しく解説します。
```
String strA = "hoge";
String strB = "fuga";
String strC = new String("hoge");

System.out.println(strA.equals(strB)); // false
System.out.println(strA.equals(strC)); // true

// 以下のように比べてはいけません
if(strA == strC) {
// 実行されません
System.out.println("strA == strC");
}
```