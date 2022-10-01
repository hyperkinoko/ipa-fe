## 課題③
- サイコロの目(1〜6)をランダムに返す関数diceを宣言しましょう。引数はありません。
- 呼び出してサイコロの目を表示しましょう。
- consoleへの出力は呼び出し側でします。dice内ではしません。

出力例：
~~~
サイコロの目は3です
~~~

---

## 回答
~~~
import java.util.*;

public class Main {
public static void main(String[] args){
System.out.println("サイコロの目は" + dice( ) + "です");
}

static int dice ( ){
Random rand = new Random();
int dice = rand.nextInt(6);
dice++;
return dice;
}
}

サイコロの目は1です
~~~
---

## review

完璧です！
何も言うことナシです！！

空白のあけ方は特にエラーになるわけではないですが，一般的に以下のような空白のあけ方をします。
~~~
public class Main {
public static void main(String[] args){
System.out.println("サイコロの目は" + dice() + "です");
}

static int dice() {
Random rand = new Random();
int dice = rand.nextInt(6);
dice++;
return dice;
}
}
~~~

- 引数のない関数では(と)の間に空白を入れない
- メソッド名と()の間には空白を入れない
- 宣言部の(引数)と{の間には1つ空白を入れる