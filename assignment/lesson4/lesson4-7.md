## 課題7
1. int型の配列の引数arrayで与えられた配列内の数字の平均をdouble型で返す関数arrayAverageを定義しましょう。
2. 以下の3つの配列を作成し、それぞれをarrayAverageの引数にして呼び出しましょう。
3. 呼び出した結果を表示しましょう。

※ ただし，引数で与えられた配列の長さが0のときは，0を返すようにしてください。

入力（引数に与えるもの）
~~~
int[] array1 = {87, 96, 72, 88, 79};
int[] array2 = {58, 91, 98, 96, 83, 65, 70};
int[] array3 = {};
~~~

出力例
~~~
array1の平均値は84.4です
array2の平均値は80.14285714285714です
array3の平均値は0.0です
~~~

---

## 回答

今週は心身の調子が悪く進みが悪いです
~~~
import java.util.*;

public class Main {
public static void main(String[] args){

    int[] array1 = {87, 96, 72, 88, 79};
    int[] array2 = {58, 91, 98, 96, 83, 65, 70};
    int[] array3 = {};

    System.out.println( "array1の平均値は" +  arrayAverage(array1) + "です");
    System.out.println( "array2の平均値は" +  arrayAverage(array2) + "です");
    System.out.println( "array3の平均値は" +  arrayAverage(array3) + "です");
    }

static double arrayAverage(int[] array) {

    if(array.length == 0){
        return 0;
    }
    else {
    double sum = 0;
    for(int i = 0; i < array.length; i++){
    sum += array[i];
    }
    
    return sum / array.length;
    }
    }
}

array1の平均値は84.4です
array2の平均値は80.14285714285714です
array3の平均値は0.0です
~~~

---

## review

よいですね
ここのfor文を拡張for文で書いてみましょうか？

拡張for文は以下のような仕組みです。
~~~
for(要素の型 value : 配列など) {
valueには繰り返す度に配列の各要素が順に入る
}
~~~
例えば，String型の配列からひとつずつ要素を取り出して出力する場合は
~~~
String[] array = {"りんご", "バナナ", "みかん"};
for(String value : array) {
System.out.println(value);
}
~~~
で，
~~~
りんご
バナナ
みかん
~~~
と出力されます。

~~~
if(hogehoge) {
return文; // ①
} else {
なんか色々やる; // ②
return文;
}
~~~
のような構造になっている場合，
~~~
if(hogehoge) {
return文; // ①
}

なんか色々やる;  // ②
return文;
~~~

のほうがきれいです。  
ifの中でreturnすると，条件に当てはまる場合にその後ろには行かないため，elseがなくても，当てはまらないときにしか後半（②の部分）は実行されません。  
if〜else構文は，読むときに，elseまで進んだところで条件部分を思い出さないといけない（何のelseだったか）ので。読みやすさが下がってしまいます。
そのため，ifの中でreturnするような場合は，早くretrunできるもの（主にイレギュラーな処理など）を前の方に持ってきて，後半に本番（？）の処理を持ってきます。
このような構造を「早期return」といい，可読性の高いコードを書くためによく使われます。

というわけで，より美しい模範解答（arrayAverage部分）は以下のようになります。
ご自身のコードと見比べてみてください。
~~~
static double arrayAverage(int[] array) {

if(array.length == 0){
return 0;
}
double sum = 0;
for(int score : array){
sum += score;
}
return sum / array.length;
}
~~~