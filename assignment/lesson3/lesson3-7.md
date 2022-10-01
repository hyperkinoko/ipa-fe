## 課題⑦
以下のように配列を宣言し、配列内の数字の平均を求めた上で、平均以上の要素を出力しましょう。
```
int[] array = {87, 96, 72, 88, 79};
```
出力例
```
平均は84.4です
0番目の要素87は平均以上です
1番目の要素96は平均以上です
3番目の要素88は平均以上です
```
ヒント
計算した平均値を変数`average`に格納し、各要素と大小を比較してみましょう。

---

## 回答
```
import java.util.*;

public class Main {
public static void main(String[] args){

      double sum;
      double average;
      
      sum = 0;
      average = 0;

      int[] array = {87,96,72,88,79};
     
     for(int i : array){
         sum += i;
     }
     
     average = sum / array.length;
     
     System.out.println("平均は" + average + "です");

    for(int j = 0;j < array.length;j++){
        if(array[j] > average){
            System.out.println(j + "番目の要素" + array[j] + "は平均以上です");
         }
       }
     }
}

平均は84.4です
0番目の要素87は平均以上です
1番目の要素96は平均以上です
3番目の要素88は平均以上です
```
---

## review

とても良いです！
indexがいらない場合に短く書ける拡張for文，indexが必要な部分では普通のfor文と，うまく使い分けられている点が高評価です！

`i`はfor文のスコープに閉じ込められているので，別のfor文で`i`を使ってもOKです。
殆どの言語で「スコープ」という概念が存在しています。一度調べてみてください。
簡単に言うと，
- if文やfor文の`()`や`{}`の中で宣言された変数はそのブロックスコープの外からは見えない
- 別のスコープでは同じ名前で宣言できる
  という感じです。

スコープ初心者向け
https://qiita.com/morioheisei/items/c56ab32b68ce92d32206

こっちは上級者向け
https://nagise.hatenablog.jp/entry/20160425/1461589722

段落のまとめ方も上手くなってきましたね！
一応，私だったらこうする・・・というのを書いておきます。参考にしてみてください。（あくまでも一例ですので書き直しや再提出は不要です）
```
public class Main {
public static void main(String[] args){
double sum = 0;
double average = 0;
int[] array = {87,96,72,88,79};

    for(int i : array){
      sum += i;
    }
    average = sum / array.length;
    System.out.println("平均は" + average + "です");

    for(int i = 0; i < array.length; i++){
      if(array[i] > average){
        System.out.println(i + "番目の要素" + array[i] + "は平均以上です");
      }
    }
}
}
```