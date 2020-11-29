package about_printf;

import java.util.Date;

public class AboutPrintf {

    public static void main(String[] args) {
//        // ① 整数の変数に10000を代入
//        int num = 10000;
//        // ② 文字列の変数に "円" を代入
//        String str = "円";
//
//        // ③第1引数の「%d」は %は指定子の開始, dは整数の指定子。「%s」は文字列の指定子の意味。
//        // 第2,第3引数に それぞれの変数を記述
//        System.out.printf("%d%s", num, str);

//        // 整数型変数に値を格納
//        int num1 = 100;
//        int num2 = 1000;
//        int num3 = 10000;
//        int num4 = 100000;
//        // 文字列型変数に値を格納
//        String str = "¥";
//        // 「%s」は文字列型の変数。
//        // 「%,6b」は、「%6」をベースに、カンマ区切りと、最大桁数6という意味合いをもたせています。
//        // 「%n」は 改行を意味しています。
//        System.out.printf("%s%,6dです。%n", str, num1);
//        System.out.printf("%s%,6dです。%n", str, num2);
//        System.out.printf("%s%,6dです。%n", str, num3);
//        System.out.printf("%s%,6dです。%n", str, num4);
//        // カンマを入れない場合の出力結果も比較してください。
//        System.out.printf("%s%6dです。", str, num4);
        // 拡張for文を用いて 1 ~ 12 の数を 二桁表記で出力する
//        for (int i = 0; i <= 10; i++) {
//            if (i == 0) {
//                continue;
//            }
//            // "%0"は「前に0を詰める」"2"は「最大桁数」"d"は「整数」の書式指定子です。
//            System.out.printf("%03d,", i);
//        }
        // 取得した日付をインスタンス化する。
        Date date = new Date();
        //日付を出力する
        System.out.printf("%tY年%<tB月%<te日(%<ta)%<tp%<tI時%<tM分", date);
    }

}
