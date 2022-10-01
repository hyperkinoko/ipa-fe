## 課題⑤
1. 課題③の関数`dice`の宣言をコピーして貼り付けます。
2. `dice`を使って5回サイコロを振り、5回の目の平均値を出しましょう。

出力例：
```
1回目の目は1です
2回目の目は5です
3回目の目は4です
4回目の目は5です
5回目の目は2です
5回サイコロを投げたときの目の平均は3.4です
```

---

## 回答
ゴリ押しでコードが綺麗でない、よくない解答になってしまっているように思うのですが、調べた上で現時点でここまでしか考えられませんでした…ご指導お願いします…

```
import java.util.*;

public class Main {
public static void main(String[] args){
double sum = 0;
double ave = 0;
int i = 1;

    for( ; i <= 5 ; i++){
    int d = dice();
    System.out.println( i + "回目のサイコロの目は" + d + "です" );
    sum = sum + d;
    }
    
    i--;
    ave = sum / i;
    System.out.println( i + "回サイコロを投げた時の目の平均は" + ave + "です");
    }

static int dice (){
Random rand = new Random();
int dice = rand.nextInt(6);
dice++;
return dice;
}
}

1回目のサイコロの目は3です
2回目のサイコロの目は6です
3回目のサイコロの目は2です
4回目のサイコロの目は2です
5回目のサイコロの目は1です
5回サイコロを投げた時の目の平均は2.8です
```
---

## review

投げる回数を
```
int times = 5;
のようにおき，
for(int i = 0; i < times; i++) {
・・・
}
```
としてみましょう。  
そうすると後で`i`を減らしたり，`i`をfor文の外で宣言したりというイレギュラーな対応をしなくて済みますね。

---

## 再提出分
```
import java.util.*;

public class Main {
public static void main(String[] args){
double sum = 0;
double ave = 0;
int times = 5;

    for( int i = 1 ; i <= times ; i++){
    int d = dice();
    System.out.println( i + "回目のサイコロの目は" + d + "です" );
    sum = sum + d;
    }
    
    ave = sum / times;
    System.out.println( times + "回サイコロを投げた時の目の平均は" + ave + "です");
    }

static int dice (){
Random rand = new Random();
int dice = rand.nextInt(6);
dice++;
return dice;
}
}

1回目のサイコロの目は5です
2回目のサイコロの目は5です
3回目のサイコロの目は4です
4回目のサイコロの目は2です
5回目のサイコロの目は5です
5回サイコロを投げた時の目の平均は4.2です
```
---

## review

いいですね！とても良いです！！
```
for( int i = 1 ; i <= times ; i++){
```
はい，ここはあんずちゃんが正しいです💯
こうすることで，`i`の値と`○`回目の数字が合いますね。