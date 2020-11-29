# about_printf
【Java】printf()関数の学習用
<!-- タイトル -->
# 【タイトル】printf()メソッド
「 *任意のフォーマットで コンソールやログに文字を出力するためのメソッド* 」

<!-- 説明 「〜〜とはなど」-->
## 【説明】printf()メソッド とは
この [メソッド] は簡単にいうと 「 *`指定子`を呼ばれる記号を使い、文字の好きな部分を装飾する[メソッド]* 」です。
`printf()メソッド` の 「f」は、フォーマット(書式)を意味しています。

<!-- 特徴・メリット -->
## printfメソッドとprintメソッドの違い

System.out.println(), System.out.print() は「*文字列をそのまま表示することしかできない*」[メソッド]なのに対し、`printf()メソッド`は「*出力する文字などに 様々な装飾 を施すことが可能* 」なのが大きな違いで、その分非常に自由度が高いといえます。

## 【使用場面】
`printf()メソッド` は文字列や数値などを 指定した書式で画面に出力することができるため、以下のようなことが可能です。

- 「10,000」のように、値をカンマ区切りで整形する
- 数字の後ろに単位を付けて出力する

### 【書き方】
`printf()メソッド`の記述の仕方は以下です。

- 第一[引数]には出力する文字の書式
- 第2[引数]以降に使用する変数を記入

`printf()メソッド`は以下の形式で記述します。

```
System.out.printf(書式, 引数1, 引数2, ・・・);
```

## 書式指定子チートシート (値の形式を変更する記号)

「*`printfメソッド`で 出力する変数を編集する* 」には、`書式指定子`という記号を使用します。`書式指定子`は、編集したい内容によって色々な書き方や種類があります。
以下がその一覧表です。

### 【型を指定する書式指定子】

| 指定子 |型     |説明             |記述例        | 出力例       | 
| ----- |----- | -------------- | ------------ | ------------ | 
| %    |なし    |書式指定子の開始   |なし              |なし       | 
| d    |整数   | 10進整数表記になる |printf("%d", 123)|123       | 
| o    |整数   | 	8進整数表記になる |printf("%o", 123)|173        | 
| x    |整数   | 	16進整数表記になる|	printf("%x", 123)|7b         | 
| e    |小数   | 	指数で出力       |printf("%e", 123.4f)|1.23E+02   | 
| f    |小数   | 	小数点数出力     |	printf("%f", 123.4f)|	123.4  | 
| s    |文字列 |文字列を出力        |	printf("%s", “abc”)| abc   | 
| c    |文字   |文字を出力        |	printf("%c", ‘a’)   |a         | 
| b    |真偽値  | 真偽値を出力     |printf("%b", true)|true       | 


### 【日付の書式指定子】

指定子|	説明   |記述例	                       |	出力例|
-----| -------|	----------------------------| ----- |
tY   |	年(4桁)|	printf("%tY", new Date());|	2020  |
ty   |	年(2桁)|	printf("%ty", new Date());|	20    |
tm   |	月(2桁)|	printf("%tm", new Date());|	11    |
td   |	日(2桁)|	printf("%td", new Date());|	30    |
te   |	日(1~2桁)|	printf("%te", new Date());|	1    |
tH   |	時(2桁)24時間制|	printf("%tH", new Date());|	21|
tl   |	時(1~2桁)12時間制|	printf("%tl", new Date());|	9|
tM   |	分(2桁)	|printf("%tM", new Date());v|	59    |
tS   |	秒(2桁)	|printf("%tS", new Date());v|	30    |
tF   |	日付	|printf("%tF", new Date());|	2020-11-30|
tT   |	時刻	|printf("%tT", new Date());|	21:04:05|

### 【その他の書式指定子】

| 指定子 | 指定子を付与することで得られる効果 | 
| ------ | ---------------------------------- | 
| -      | 左寄せで出力される(幅指定必須)     | 
| +      | 符号を出力する                     | 
| 0      | 前に0を詰める                      | 



<!-- ここから サンプルコード ★☆★☆★☆★☆★ -->
<!-- サンプルコードタイトル -->
## 【サンプルコード】 変数の値を表示する

第2引数以降には、整数や文字列などの変数を入れることができます。
、以下のプログラムは、「整数型の変数と、文字列の変数を編集して出力」したものです。
内容に関してはコード内のコメントを参照してください。

<!-- サンプルコード -->
```java
        // 整数型変数に値を格納
        int num1 = 100;
        int num2 = 1000;
        int num3 = 10000;
        int num4 = 100000;
        // 文字列型変数に値を格納
        String str = "¥";
        // 「%s」は文字列型の変数。
        // 「%,6b」は、「%6」をベースに、カンマ区切りと、最大桁数6という意味合いをもたせています。
        // 「%n」は 改行を意味しています。
        System.out.printf("%s%,6dです。%n", str, num1);
        System.out.printf("%s%,6dです。%n", str, num2);
        System.out.printf("%s%,6dです。%n", str, num3);
        System.out.printf("%s%,6dです。%n", str, num4);
        // カンマを入れない場合の出力結果も比較してください。
        System.out.printf("%s%6dです。", str, num4);
```
<!-- 実行結果 -->
#### 【実行結果】

```
¥   100です。
¥ 1,000です。
¥10,000です。
¥100,000です。
¥100000です。
```

<!-- ここまで サンプルコード ★☆★☆★☆★☆★ -->


<!-- ここから サンプルコード ★☆★☆★☆★☆★ -->
<!-- サンプルコードタイトル -->
### 【サンプルコード】 先頭に「0」をつけて、01,02,03,,,10,11,12と出力する

<!-- サンプルコード概要 -->

<!-- サンプルコード -->
```java
        //拡張for文を用いて 1 ~ 10 の数を 二桁表記で出力する
        for (int i = 0; i <= 10; i++) {
            if (i == 0) {
                continue;
            }
            //"%0"は「前に0を詰める」"2"は「最大桁数」"d"は「整数」の書式指定子です。
            System.out.printf("%02d,", i);
        }
```
<!-- 実行結果 -->
#### 【実行結果】

```
01,02,03,04,05,06,07,08,09,10
```
ちなみに、最大桁数３に指定した場合は以下のようになります。

```java
System.out.printf("%03d,", i);
```

出力結果

```
001,002,003,004,005,006,007,008,009,010,
```
"%03"は第二[引数]を3文字で出力するため、3文字に満たない場合は不足分を0詰めされて上記のような結果となります。

<!-- サンプルコード説明があればここに記述 -->

<!-- ここまで サンプルコード ★☆★☆★☆★☆★ -->


<!-- ここから 各キャプチャー△▽△▽△▽△▽△▽△▽△▽△▽△ -->

<!-- ここから キャプチャー -+-+-+-+-+-+-+ -->
<!-- キャプチャータイトル -->
## System.out.printf()による日時の出力


<!-- 説明 「〜〜とはなど」-->
### 【説明】
指定子を用いることで、取得した現在時刻を日本人に馴染みあるフォーマットへ変換するといったことも簡単に行えます。

<!-- ここから サンプルコード ★☆★☆★☆★☆★ -->
<!-- サンプルコードタイトル -->
### 【サンプルコード】 取得した現在時刻の形式を任意に変換

<!-- サンプルコード -->

まず、現在時刻を取得します。

```java
import java.util.Date;

public class AboutPrintf {

    public static void main(String[] args) {
        // 取得した日付をインスタンス化する。
        Date date = new Date();
        //日付を出力する
        System.out.println(date);
    }

}
```
<!-- 実行結果 -->
#### 【実行結果】

```
Mon Nov 30 03:33:04 JST 2020
```

取得した現在時刻の形式をに変換します。
「 年月日(曜日)午前or午後〇〇時〇〇分 」
```java
System.out.printf("%tY年%<tB月%<te日(%<ta)%<tp%<tI時%<tM分", date);
```
<!-- 実行結果 -->
#### 【実行結果】

```
2020年11月月30日(月)午前03時36分
```

変換完了しました。

<!-- サンプルコード説明があればここに記述 -->

<!-- ここまで サンプルコード ★☆★☆★☆★☆★ -->

<!-- ここまで  キャプチャー -+-+-+-+-+-+-+ -->

<!-- ここまで 各キャプチャー△▽△▽△▽△▽△▽△▽△▽△▽△ -->

<!-- まとめ -->
## 【まとめ】

記事を書きながら色々な使い方ができる便利な[メソッド]だとおもいました。
組み合わせによって非常に幅広い表現が可能になるので、数をこなして習得していこうと思います。

<!-- 参考にした資料のリンクを貼る -->
## 参考文献・記事

- [Javaのprintf関数の使い方について現役エンジニアが解説【初心者向け】](https://techacademy.jp/magazine/36673)
- [【Java入門】printfメソッドで書式を指定して文字列を表示する方法
](https://www.sejuku.net/blog/43246)



<!-- 以下リンク -->

[日時の文字列操作]:https://qiita.com/takahirocook/items/aa857c8f2153193095e4
[SimpleDateFormat]:https://qiita.com/takahirocook/items/aa857c8f2153193095e4
[Time]:https://qiita.com/takahirocook/items/9caef0bb2409caedba55
[Calendar]:https://qiita.com/takahirocook/items/204dd7331db777eb6f3b
[日付操作]:https://qiita.com/takahirocook/items/9caef0bb2409caedba55
[Progate]:https://prog-8.com/
[ドットインストール]:https://dotinstall.com/
[インスタンス]:https://qiita.com/takahirocook/items/ec01cdcbb440cf0d1cc4
[インスタンス化]:https://qiita.com/takahirocook/items/ec01cdcbb440cf0d1cc4
[アクセス修飾子]:https://qiita.com/takahirocook/items/e51b0b9d37d95ad587fe
[フィールド]:https://qiita.com/takahirocook/items/28df75a133049a74ece1
[フィールド変数]:https://qiita.com/takahirocook/items/28df75a133049a74ece1
[new演算子]:https://qiita.com/takahirocook/items/00f9f97592bf50831d39
[new]:https://qiita.com/takahirocook/items/00f9f97592bf50831d39
[カプセル化]:https://qiita.com/takahirocook/items/e469a7c0539a0012868e
[クラス]:https://qiita.com/takahirocook/items/50cbbdca8e21539170e9
[メソッド]:https://qiita.com/takahirocook/items/5bfe43576d87a2a4006c
[mainメソッド]:https://qiita.com/takahirocook/items/f4635915337303de338c
[メソッドの呼び出し]:https://qiita.com/takahirocook/items/f4635915337303de338c
[コンストラクタ]:https://qiita.com/takahirocook/items/fa1822f2f22c3786593e
[引数]:https://qiita.com/takahirocook/items/5e5b0ba79e869f4a592e
[戻り値]:https://qiita.com/takahirocook/items/3b6fa670a1d6dd4a9386
[this]:https://qiita.com/takahirocook/items/d251ec4693c68f6b9538
[getter・setter]:https://qiita.com/takahirocook/items/27828bc8477735612021
[setter]:https://qiita.com/takahirocook/items/27828bc8477735612021
[getter]:https://qiita.com/takahirocook/items/27828bc8477735612021
[オブジェクト指向]:https://qiita.com/takahirocook/items/041ba7a096b71ab8ffd4
[継承]:https://qiita.com/takahirocook/items/6c84ea66a6e2ad536a37
[オーバーライド]:https://qiita.com/takahirocook/items/09dd8e5f56d6617ce45a
[オーバーロード]:https://qiita.com/takahirocook/items/b937c3c07126fe7e02a4
[this]:https://qiita.com/takahirocook/items/d251ec4693c68f6b9538
[super]:https://qiita.com/takahirocook/items/75a07131e7e791c8442c
[スーパークラス]:https://qiita.com/takahirocook/items/75a07131e7e791c8442c
[final]:https://qiita.com/takahirocook/items/5e0916d9bf28bcf68d0c
[final修飾子]:https://qiita.com/takahirocook/items/5e0916d9bf28bcf68d0c
[定数]:https://qiita.com/takahirocook/items/5e0916d9bf28bcf68d0c
[static修飾子]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[static]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[インスタンスフィールド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735


[インスタンス変数]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[動的メソッド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[インスタンス変数]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[静的メソッド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[クラスメソッド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[静的メソッド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[クラスフィールド]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[クラス変数]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[静的変数]:https://qiita.com/takahirocook/items/cf527f85d17a5af86735
[インターフェイス]:https://qiita.com/takahirocook/items/ca84be8dfef664b19194
[インターフェース]:https://qiita.com/takahirocook/items/ca84be8dfef664b19194
[パッケージ]:https://qiita.com/takahirocook/items/39b58d17abcb159ef5c1
[インポート]:https://qiita.com/takahirocook/items/59a8a09cab6a98d3bca2
[import]:https://qiita.com/takahirocook/items/59a8a09cab6a98d3bca2
[配列]:https://qiita.com/takahirocook/items/16a123fb73b30869053b
[配列操作]:https://qiita.com/takahirocook/items/16a123fb73b30869053b
[List]:https://qiita.com/takahirocook/items/4d622fc6f271569783b5
[list]:https://qiita.com/takahirocook/items/4d622fc6f271569783b5
[Map]:https://qiita.com/takahirocook/items/49f46151ecb5e332db32
[map]:https://qiita.com/takahirocook/items/49f46151ecb5e332db32
[set]:https://qiita.com/takahirocook/items/d498329cd26e1500f476
[Set]:https://qiita.com/takahirocook/items/d498329cd26e1500f476
[Date]:https://qiita.com/takahirocook/items/a760e20ef2d9aa5c08fc
[拡張for文]:https://qiita.com/takahirocook/items/470b2858de1a4f99b334
