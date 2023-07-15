//Scannerクラス
//キーボードから入力された値を取得する(Scanner.next,Scanner.nextLine)
import java.util.Scanner;

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

    /*
    next メソッドの場合は区切り文字までの値が戻り値として返りましたが、 nextLine メソッ   ドの場合は改行までの値がすべて戻り値として返るため、変数 hobby には "読書 映画 スポーツ" がそのまま格納されます。変数に格納された値は、そのあとで画面に出力されます。

    区切り文字を無視して次の行までの値を受け取る(3)

    このように nextLine メソッドを使用することで区切り文字に関係なく改行までの入力した    値をまとめて取得することができました。

    なお、まとめて取得した文字列を空白文字を区切り文字として分割するには String クラス    の split メソッドを使って次のように記述できます。



    import java.util.Scanner;

    class JSample1_4{
      public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("趣味を入力してください。");

        String hobby = scanner.nextLine();
        String[] tokens = hobby.split("\\s+");
        for (int i = 0 ; i < tokens.length; i++){
          System.out.println("[" + i + "]" + tokens[i]);
        }
      }
    }

    プログラムを実行し、先ほどと同じように "読書 映画 スポーツ" と入力すると、まとめて取    得した文字列を分割して画面に次のように表示します。

    区切り文字を無視して次の行までの値を受け取る(4)

    ※ String クラスの split メソッドについては「文字列を正規表現パターンを使って分割す    る(String.split)」を参照されてください。

    Scanner クラスには次の値を取得できるかどうかを確認する hasNext メソッドがあり、     next メソッドと組み合わせて入力された文字列を順に取得することもできるのですが、標準   入力を使用している場合は次の値が取得できなくなるとキーボードからの入力待ちとなり、    hasNext がメソッドが false にならずループが終わりません。終わらせるには Ctrl + z   を入力する必要があります。そこで、先ほどのように行単位でまとめて入力された値を取得し   たあと、 split メソッドを使って分割しています。     */


//実行結果
/*


*/
