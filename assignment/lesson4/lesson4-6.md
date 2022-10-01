## 課題⑥
1. 課題3の関数diceの定義をコピーして貼り付けます。
2. diceを使ってn回サイコロを振り、n回の目の平均値を出す関数diceAverageを定義しましょう。
3. diceAverage(10)とdiceAverage(1000000)を呼び出してみましょう。

出力例：
```
10回サイコロを投げたときの目の平均は2.9です
1000000回サイコロを投げたときの目の平均は3.502044です
```

ヒント：  
1. 関数の中で関数を呼び出してもいいです。diceAverageの中でdiceを呼び出しましょう。
2. 1000000回もconsole出力すると処理速度が落ちてしまう（出力は時間のかかる処理）ので、diceAverageは平均のみ出力するようにします。

補足：  
試行回数（diceAverage(n)のnの部分）が増えるほど、平均値はサイコロの目の期待値である3.5に近い数字が安定して出るようになります。

---

## 回答
```

import java.util.*;

public class Main {
public static void main(String[] args){
int n = 10;
System.out.println( n + "回サイコロを投げた時の目の平均は" +  diceaverage(n) + "です" );

    int m = tel:1000000;
    System.out.println( m + "回サイコロを投げた時の目の平均は" +  diceaverage(m) + "です" );

    }

static double diceaverage(int n) {
double sum = 0;
double diceaverage = 0;

    for( int i = 1 ; i <= n ; i++) {
    double d = dice();
    sum = sum + d;
    }
    diceaverage = sum / n;
    return diceaverage;
    }

static int dice () {
Random rand = new Random();
int dice = rand.nextInt(6);
dice++;
return dice;
}
}

10回サイコロを投げた時の目の平均は3.9です
tel:1000000回サイコロを投げた時の目の平均は3.500778です

```
---

## review

しっかり要件を満たしていて素晴らしいです！
少しずつ複雑になってきましたね。
複雑であるほど，できるだけ無駄を省いていく，というのが大切になります。

以下のように書くと，変数を減らすことができますね。
```
public class Main {
public static void main(String[] args){
int n = 10;
System.out.println( n + "回サイコロを投げた時の目の平均は" +  diceaverage(n) + "です" );

    // ↓を n = 1000000;としてもOKです。
    // ただ，最近は再代入を減らすのが良いコードとされているので，別の値だから違う名前，という考え方からすると，あんずちゃんの書いた↓のコードのほうが優秀といえます。
    int m = 1000000;
    System.out.println( m + "回サイコロを投げた時の目の平均は" +  diceaverage(m) + "です" );
}

static double diceaverage(int n) {
double sum = 0;

    for( int i = 1 ; i <= n ; i++) {
      double d = dice();
      sum = sum + d;
    }
    // averageは最後に計算して返すだけなので，このように書いてあげることで変数を1つ減らせます。
    return sum / n;
}

static int dice () {
Random rand = new Random();
int dice = rand.nextInt(6);
dice++;
return dice;
}
}
```
