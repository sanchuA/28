//Scannerクラス
//キーボードから入力された値を取得する(Scanner.next,Scanner.nextLine)
import java.util.Scanner;
import java.text.BreakIterator;

class Sample1_5{
  public static void main(String[] args){

    //区切り文字を無視して次の行までの値を受け取る
    /*
    区切り文字ではなく次の行までの値を取得するには
    ScannerクラスのnextLineメソッドを使います。
    書式は次のとおりです。

    public String nextLine()

    戻り値: スキップされた行

    例外:
      NoSuchElementException - 行が見つからなかった場合
      IllegalStateException - このスキャナがクローズしている場合

    nextLineメソッドは入力を受け取る位置を次の行の先頭まで進めると同時に、
    現在位置から次の行の先頭までの間のスキップした部分の文字列を
    戻り値として返します。

    結果として次の行までの値をすべて受け取ることになります。*/

    Scanner scanner = new Scanner(System.in);

    System.out.println("趣味を入力してください。");

    //サンプルを実行するとnextLineメソッドを実行した時点で
    //キーボードからの入力待ちとなります。
    //次のように "読書 映画 スポーツ" とキーボードから入力したあと
    //最後に Enter キーを入力します。

    //next メソッドの場合は区切り文字までの値が戻り値として返りましたが、
    //nextLine メソッドの場合は改行までの値がすべて戻り値として返るため、
    //変数hobbyには "読書 映画 スポーツ" がそのまま格納されます。
    String hobby = scanner.nextLine();

    System.out.println("趣味は" + hobby + "です");

  }

}

    /*nextメソッドの場合は区切り文字までの値が戻り値として返りましたが、
    nextLineメソッドの場合は改行までの値がすべて戻り値として返るため、

    変数hobbyには "読書 映画 スポーツ" がそのまま格納されます。

    変数に格納された値は、そのあとで画面に出力されます。


    このようにnextLineメソッドを使用することで区切り文字に関係なく
    改行までの入力した値をまとめて取得することができました。*/

//実行結果
/*


*/
