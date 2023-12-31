//Scannerクラス
//キーボードから入力された値を取得する(Scanner.next,Scanner.nextLine)

class Sample1_1{
  public static void main(String[] args){

    //標準入力を使うScannerクラスのインスタンスを作成する
    /*
    デフォルトでは標準入力はキーボードに設定されています
    (標準出力はディスプレイに設定されています)。

    利用者にキーボードを使って入力してもらった内容を受け取り、
    プログラムの中で利用するには、標準入力を入力元とする
    Scannerクラスのインスタンス(スキャナ)を作成します。
    次のコンストラクタを使用します。

    public Scanner(InputStream source)

    パラメータ:
      source - スキャン対象の入力ストリーム

      //「入出力ストリーム（stream:「流れ」という意味）」とは、
      //ファイルなどからデータを読み取ったり書き込んだりする際の
      //データの流れのことです。
      //java.ioパッケージでは、下図のような大元になる4つの抽象クラス
      //（InputStream, OutputStream, Reader, Writer）が用意されています。

    1番目の引数には入力ストリームを指定します。
    標準入力を指定する場合はSystem.inと指定してください。

    実際には次のように記述します。

    Scanner scanner = new Scanner(System.in);

    これで標準入力であるキーボードからの入力を受け取る
    Scannerクラスのインスタンス(スキャナと呼びます)が作成されました。

    読み込まれた値は、使用している環境のデフォルト文字セットを使って
    文字に変換されます。

    */
  }
}

//実行結果
/*


*/
