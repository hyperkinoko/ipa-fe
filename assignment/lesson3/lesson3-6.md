## 課題⑥
以下のように配列を宣言し、配列内の数字の平均を求めましょう。
~~~
int[] array = {87, 96, 72, 88, 79};
~~~
出力例
~~~
平均は84.4です
~~~

ヒント
変数sumを用意し、各要素を順に足していくと、最終的にsumは全要素の合計になります。
sumをint型で定義すると失敗するので，double型で定義してください。ただし，一度わざと失敗して，理由を考えてみることをおすすめします。

---

## 回答
~~~
import java.util.*;

public class Main {
public static void main(String[] args){

      double sum;
      double ave;
      
      sum = 0;
      ave = 0;

      int[] array = {87,96,72,88,79};

    for(int i = 0;i < array.length;i++){
      sum += array[i];
    }
    
      ave = sum / array.length;
    
      System.out.println("平均は" + ave + "です");
     }
}

平均は84.4です
~~~
---

## review

良いですね！
強いて言えば，
~~~
double sum;
double ave;

sum = 0;
ave = 0;
~~~
は
~~~
double sum = 0;
double ave = 0;
~~~
と書いたほうがJava的かつ短いコードになるでしょうか。