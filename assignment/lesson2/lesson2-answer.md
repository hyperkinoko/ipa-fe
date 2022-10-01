## 1)
```
import java.util.*;

public class Main {
public static void main(String[] args){

        int count = 0;
       
        while(count < 100){
           
            count = count + 1;
        }
        System.out.println(count);
    }
}

出力:
100
```
---

## 2)
```
import java.util.*;

public class Main {

public static void main(String[] args){

int count = 0;


        for(int i = 0;i < 100;i++){
           
            count = count + 1;
        }
        System.out.println(count);
    }
}

出力:
100

```
---

## 3)
```
import java.util.*;

public class Main {
public static void main(String[] args){
int num = 4;


        if(num % 2 == 0){

            System.out.println("偶数です");

        }
        else{

            System.out.println("奇数です");

        }     
    }
}

出力:
偶数です
```
---

## 4)
```
import java.util.*;

public class Main {
public static void main(String[] args){
Random rand = new Random();

       int num = rand.nextInt(99);
     
       
        if(num % 2 == 0){

            System.out.println(num + "は偶数です");

        }
        else{

            System.out.println(num + "は奇数です");

        }
       
    }
}

出力:
5は奇数です
```
---

## 5)
```
import java.util.*;

public class Main {
public static void main(String[] args){
Random rand = new Random();

      for(int i = 0;i < 2;i++){
     
       int dice = rand.nextInt(5);
     
       dice = dice + 1;
       
       
        if(dice % 2 == 0){

            System.out.println(dice + "は偶数です");

        }
        else{

            System.out.println(dice + "は奇数です");

        }
      }
    }
}

出力:
1は奇数です
2は偶数です

1は奇数です
1は奇数です

3は奇数です
2は偶数です

```
---

## 6)
```
import java.util.*;

public class Main {
public static void main(String[] args){
Random rand = new Random();

       int yourDice = rand.nextInt(5);
     
       int enemysDice = rand.nextInt(5);
     
       yourDice = yourDice + 1;
      
       enemysDice = enemysDice + 1;
       
       
        if(yourDice < enemysDice){

            System.out.println( "あなたの目:" + yourDice);

            System.out.println("敵の目:" + enemysDice);

            System.out.println("あなたの負け");
        }
        else if(yourDice > enemysDice){

            System.out.println( "あなたの目:" + yourDice);

            System.out.println("敵の目:" + enemysDice);

            System.out.println("あなたの勝ち");

}
else if(yourDice == enemysDice){

System.out.println( "あなたの目:" + yourDice);

            System.out.println("敵の目:" + enemysDice);

            System.out.println("引き分け");

        }
      }
    }

出力:
あなたの目:3
敵の目:1
あなたの勝ち

あなたの目:4
敵の目:5
あなたの負け
```
---

## 7)
```
import java.util.*;

public class Main {
public static void main(String[] args){

        int num = 0;
       
        for(int i = 0;i < 100;i++){
           
            num += 1;
       
         if(num % 3 == 0 && num % 5 == 0){

            System.out.println( "FissBuzz");

        }
       
        else if(num % 3 == 0){

            System.out.println( "Fizz");

            }
           
        else if(num % 5 == 0){

            System.out.println( "Buzz");

        }
       
        else{

            System.out.println(num);

        }
      }
    }
}

出力:
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FissBuzz
16
17
Fizz
19
Buzz
Fizz
22
23
Fizz
Buzz
26
Fizz
28
29
FissBuzz
31
32
Fizz
34
Buzz
Fizz
37
38
Fizz
Buzz
41
Fizz
43
44
FissBuzz
46
47
Fizz
49
Buzz
Fizz
52
53
Fizz
Buzz
56
Fizz
58
59
FissBuzz
61
62
Fizz
64
Buzz
Fizz
67
68
Fizz
Buzz
71
Fizz
73
74
FissBuzz
76
77
Fizz
79
Buzz
Fizz
82
83
Fizz
Buzz
86
Fizz
88
89
FissBuzz
91
92
Fizz
94
Buzz
Fizz
97
98
Fizz
Buzz

```
---


# second answer

## 1)
```
import java.util.*;

public class Main {
public static void main(String[] args){

        int count = 0;
       
        while(count < 100){
            count++;
           System.out.println(count);
        }
      }
    }

1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
98
99
100
```

---

## 2)
```
import java.util.*;

public class Main {
public static void main(String[] args){

        int count = 0;
       
        for(int i = 0;i < 100;i++){
            count++;
           System.out.println(count);
        }
      }
    }

1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
51
52
53
54
55
56
57
58
59
60
61
62
63
64
65
66
67
68
69
70
71
72
73
74
75
76
77
78
79
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
98
99
100
```

---

## 4)
```
import java.util.*;

public class Main {
public static void main(String[] args){
Random rand = new Random();

        int num = rand.nextInt(100);
       
        if(num % 2 == 0){
           System.out.println(num + "は偶数です");
        }
       
        else{
           System.out.println(num + "は奇数です");
          }
        }
      }

66は偶数です
```

---
## 5)
```
import java.util.*;

public class Main {
public static void main(String[] args){
Random rand = new Random();

      for(int i = 0;i < 2;i++){
       int dice = rand.nextInt(6);
       dice = dice + 1;
       
       
        if(dice % 2 == 0){
            System.out.println(dice + "は偶数です");
        }
        else{
            System.out.println(dice + "は奇数です");
        }
      }
    }
}

2は偶数です
1は奇数です
```

---

## 6)
```
import java.util.*;

public class Main {
public static void main(String[] args){
Random rand = new Random();

       int yourDice = rand.nextInt(6);
     
       int enemysDice = rand.nextInt(6);
     
       yourDice = yourDice + 1;
      
       enemysDice = enemysDice + 1;
       
      System.out.println( "あなたの目:" + yourDice);
      System.out.println("敵の目:" + enemysDice);
   
       
        if(yourDice < enemysDice){
            System.out.println("あなたの負け");
        }
        else if(yourDice > enemysDice){
            System.out.println("あなたの勝ち");
        }
        else{
            System.out.println("引き分け");
        }
      }
    }

あなたの目:5
敵の目:5
引き分け
```
---

## 7)
実は一度指示通りに書いて間違えました…
先頭に「３でも5でも割り切れる」条件を持ってくるのは、そうでないと先に3で割れるという条件で処理されてしまうから、と考えています…
```
import java.util.*;

public class Main {
public static void main(String[] args){

        for(int i = 0;i <= 100;i++){

        if(i % 3 == 0 && i % 5 == 0){
            System.out.println( "FissBuzz");
        }
       
        else if(i % 3 == 0){
            System.out.println( "Fizz");
            }
           
        else if(i % 5 == 0){
             System.out.println( "Buzz");
        }
       
        else{
            System.out.println(i);
        }
      }
    }
}

1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FissBuzz
16
17
Fizz
19
Buzz
Fizz
22
23
Fizz
Buzz
26
Fizz
28
29
FissBuzz
31
32
Fizz
34
Buzz
Fizz
37
38
Fizz
Buzz
41
Fizz
43
44
FissBuzz
46
47
Fizz
49
Buzz
Fizz
52
53
Fizz
Buzz
56
Fizz
58
59
FissBuzz
61
62
Fizz
64
Buzz
Fizz
67
68
Fizz
Buzz
71
Fizz
73
74
FissBuzz
76
77
Fizz
79
Buzz
Fizz
82
83
Fizz
Buzz
86
Fizz
88
89
FissBuzz
91
92
Fizz
94
Buzz
Fizz
97
98
Fizz
Buzz
```
---
