## 課題②
`String`型の`name`を引数にとり、「〇〇さんこんにちは」と出力する関数`sayHelloTo`を宣言し、`main`関数から呼び出しましょう。

出力例：
```
キノコさんこんにちは
```

---

## 回答
```
import java.util.*;

public class Main {
public static void main(String[] args){
String str = sayHello("キノコ");
System.out.println(str);
}

static String sayHello (String name){
return name + "さんこんにちは";
}
}

キノコさんこんにちは
```
---

## review

課題①と同じく，返す関数ではなく，出力する関数です。  
`sayHelloTo`関数内で`System.out.println`を使いましょう。  
こちらも，`main`関数内で`System.out.println(sayHelloTo("キノコ");`と書いたほうがスマートですね。
（とはいえ，文字列を返す関数としてはよくできていますよ）  
引数の使い方はこれでOKです！

---

## 再提出分

```
import java.util.*;

public class Main {
public static void main(String[] args){
sayHello("キノコ");
}

static void sayHello(String name) {
System.out.println(name + "さんこんにちは");
}
}

キノコさんこんにちは
```
---