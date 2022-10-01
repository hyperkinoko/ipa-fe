## 課題8
1. int型の配列の引数`array`で与えられた配列内の数字で最大のものをint型で返す関数`arrayMax`を定義しましょう。
2. 以下の3つの配列を作成し、それぞれを`arrayMax`の引数にして呼び出しましょう。
3. 呼び出した結果を表示しましょう。

※ ただし，引数で与えられた配列の長さが`0`のときは，`0`を返すようにしてください。
```
int[] array1 = {87, 96, 72, 88, 79};
int[] array2 = {58, 91, 98, 96, 83, 65, 70};
int[] array3 = {};
```

出力例
```
array1の最大値は96です
array2の最大値は98です
array3の最大値は0です
```

---

## 回答
すみません、この中でfor文を拡張for文にするとうまくいかなくなってしまうのですが、その理由を調べてもわからなかったので教えていただけますと幸いです…！
```
import java.util.*;

public class Main {
public static void main(String[] args){

    int[] array1 = {87, 96, 72, 88, 79};
    int[] array2 = {58, 91, 98, 96, 83, 65, 70};
    int[] array3 = {};

    System.out.println( "array1の最大値は" +  arrayMax(array1) + "です");
    System.out.println( "array2の最大値は" +  arrayMax(array2) + "です");
    System.out.println( "array3の最大値は" +  arrayMax(array3) + "です");
    }

static int arrayMax(int[] array) {
int arrayMax = 0;

    if(array.length == 0){
       return 0;
     }
    else {
        for(int i = 0; i < array.length; i++){
            if(arrayMax < array[i]){
                arrayMax = array[i];
            }
        }
    }
    return arrayMax;
       }
    }

array1の最大値は96です
array2の最大値は98です
array3の最大値は0です
```
---

拡張for文
```
import java.util.*;

public class Main {
public static void main(String[] args){

    int[] array1 = {87, 96, 72, 88, 79};
    int[] array2 = {58, 91, 98, 96, 83, 65, 70};
    int[] array3 = {};

    System.out.println( "array1の最大値は" +  arrayMax(array1) + "です");
    System.out.println( "array2の最大値は" +  arrayMax(array2) + "です");
    System.out.println( "array3の最大値は" +  arrayMax(array3) + "です");
    }

static int arrayMax(int[] array) {
int arrayMax = 0;

    if(array.length == 0){
       return 0;
     }
    else {
        for( int i : array ){
            if(arrayMax < array[i]){
                arrayMax = array[i];
            }
        }
    }
    
    return arrayMax;
       }
    }
```
エラー文
>Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 87 out of bounds for length 5
at Main.arrayMax(Main.java:23)
at Main.main(Main.java:10)
---

## review

「拡張for文」と「早期return」について，課題7へのコメントでだいたい解説したので，まずはそちらを見てください。

次に，エラー文の解説をします。
`ArrayIndexOutOfBoundsException`とは，配列のインデックスが配列の要素数の範囲内にないときに投げられる（throwされる）例外（`Exception`）です。  
例えば，
`int[] array = {87, 96, 72, 88, 79};`
のような要素が5つしかない配列の`array[-1]`や`array[5]`を参照しようとするとこの例外がthrowされます。
```
java.lang.ArrayIndexOutOfBoundsException: Index 87 out of bounds for length 5
at Main.arrayMax(Main.java:23)
at Main.main(Main.java:10)
```
このエラー出力は，
>5つしか要素がない（length 5）配列の87番目（Index 87）を参照しようとしていますよ！

という意味です。  
そして，
>その場所は，Main.javaの23行目，arrayMax関数です。
それを呼び出したのはMain.javaの10行目，main関数です。

というふうに，どの場所でエラーが起きたか（正確には，どの場所で例外がthrowされたか）を書いてくれています。  
これをstacktraceといいます。（stacktraceについてはスレッドの続きに解説しておきます）

さて，23行目で何をしたかというと，`array[i]`を参照しています。
`i`には，`array`から各要素を順に取り出しますので，1回目のループでiに入る値は`array`の`0`番目の要素である`87`です。
ですから，`array[i]`は`array[87]`となり，arrayの87番目の要素を参照しようとして例外が発生しています。
拡張for文はインデックスではなく，要素そのものが変数に入ってきます。
ですから，拡張for文はインデックスを意味する`i`を**使わず**に，値を意味する`value`とか，配列をなにかの複数形で表したときにはその単数形（例えば配列の変数名が`animals`なら`animal`）を使います。

この解説で，どこをどのように直せばいいかわかったでしょうか？
拡張for文で書いて再提出してください。

---

<stacktraceについて>

基本情報の知識で，stackという言葉を習いましたか？
まだ理解していない場合は，「スタック キュー 違い」などでググってみましょう。

関数の呼び出しは，PCの内部で「スタック」を使って行われます。main関数からxx関数を呼び出して，その中でa関数を呼び出して・・・というのを
main → xx → a の順にスタックに積み，スタックの上から（つまりa関数から）処理していきます。
stacktraceは，そのスタックの取り出し順をトレース（追跡）してくれています。