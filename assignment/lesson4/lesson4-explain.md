## 事前解説

### 関数

関数を宣言するときは，Mainクラスの`{}`の中に，次のように書きます。
```
static 戻り値の型 関数名(引数の型 引数名, 引数の型 引数名・・・) {
関数の処理
}
```
呼び出すときは，`関数名(引数)`で呼び出します。

- 戻り値がない場合，戻り値の型の部分には`void`と書きます。
- 引数がない場合でも`()`を省略することはできません。宣言するときも，呼び出すときもです。
- 前についている`static`は，現時点では，おまじないでOKです。

例：
```
public class Main {
public static void main(String[] args){
// hogeFunctionはString型を返すので，String型の変数で結果（この場合"hello"という文字列）を受け取ることができる
//引数に与えるものは個数（順番）と型が合っていれば何でもOK
String str = hogeFunction(2, 3.5);
}

//int型の値とdouble型の値をこの順で受け取って，String型の値を返す関数hogeFunction
static String hogeFunction(int a, double b) {
なにかの処理
return "hello"; //文字列を返すので戻り値の型はString
}
}
```