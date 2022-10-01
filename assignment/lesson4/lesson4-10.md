## 課題10
<課題9>のfindは文字列を返しましたが、このように何かを判定するような関数はbooleanつまりtrueやfalseを返したほうが一般的です。  
find関数を「見つけたらtrue、見つからなかったらfalseを返す」ように変更しましょう。  
呼び出す側で三項演算子を使い、「あります」か「ありません」を表示するようにしましょう。
~~~
String[] array = {"バナナ", "りんご", "みかん", "オレンジ", "ぶどう"};
~~~
出力例
arrayにみかんはあります
arrayにももはありません

ヒント：  
三項演算子は，ちょっとした条件で出力を切り替えたいときなどによく使われます。
~~~
条件部 ? 条件部がtrueのときの値 : 条件部がfalseのときの値
~~~
特に，文字列の出力を切り替えたいときに便利です。

例えばなにかの勝負の勝敗結果を表示したいとき，三項演算子を使わないでif文で場合分けするとき
~~~
System.out.print("あなたの");
if(game(player, enemy)) {
System.out.print("勝ち");
} else {
System.out.print("負け");
}
System.out.println("です");
~~~
もしくは，
~~~
String result = "負け";  // はじめに"負け"という文字列を設定しておき
if(game(player, enemy)) {
result = "勝ち";  // 勝ったときだけ"勝ち"に書き換える
}
System.out.println("あなたの" + result + "です");
~~~
のように書かなければいけません。

これを，三項演算子で書くと
~~~
System.out.println("あなたの" + (game(player, enemy) ? "勝ち" : "負け") + "です");
~~~
のように簡素に書くことができます。
使い所を間違うと嫌われがちな三項演算子ですが，きちんと使うととても可読性（読みやすさ）の高い良いコードになります。

詳しくは「三項演算子 Java」でググってみてください。

---

## 回答

~~~
import java.util.*;

public class Main {
public static void main(String[] args){

    String[] array = {"バナナ", "りんご", "みかん", "オレンジ", "ぶどう"};

System.out.println( "arrayにみかんは" + ( find(array,"みかん") ? "あります" : "ありません") );
System.out.println( "arrayにももは" + ( find(array,"もも") ? "あります" : "ありません") );
}

static boolean find(String[] array, String target){
if(Arrays.asList(array).contains(target)){
return true;
}
else {
return false;      
}
}
}

arrayにみかんはあります
arrayにももはありません
~~~
---

## review

これも，for文や拡張for文を使って実直にやってみましょう。  
前から順に要素を見ていって，targetと同値であればtrueを返す，というような処理をすればいいですね。

三項演算子の使い方は完璧です