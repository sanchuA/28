//Scannerクラス
//スキャナの入力ストリームにまだ値が残っているか確認する(Scanner.hasNext)

class Sample5_1{
  public static void main(String[] args){

    //入力ストリームに取得できる値が残っているか確認する
    /*
     まず次のサンプルを見てください。

import java.util.Scanner;

class JSample6_1{
  public static void main(String[] args){
    Scanner scanner = new Scanner("AB BC CA");

    System.out.println(scanner.next());
    System.out.println(scanner.next());
    System.out.println(scanner.next());
    System.out.println(scanner.next());
  }
}

入力ストリームとして文字列を指定したスキャナを作成したあと、 next メソッドを使って区切り文字までの値を取得し画面に表示しています。対象の文字列には取得できる値が 3 つ存在しますが、 next メソッドを 4 回実行しているため 4 回目の next メソッドを実行した時点で例外が発生します。

入力ストリームに取得できる値が残っているか確認する(1)

読み込む値の数が決まっている場合はいいのですが、読み込める値がいくつあるのか分からない場合、まだ読み込める値がある場合だけ読み込むようにする必要があります。このようなときに使用できるのが Scanner クラスの hasNext メソッドです。書式は次のとおりです。

public boolean hasNext()

戻り値:
このスキャナが別のトークンを保持する場合にのみtrue

例外:
IllegalStateException - このスキャナがクローズしている場合

このメソッドを実行するとスキャナの入力ストリームに読み込める値がある場合は true を返します。

次のサンプルを見てください。

import java.util.Scanner;

class JSample6_2{
  public static void main(String[] args){
    Scanner scanner = new Scanner("AB BC CA");

    while (scanner.hasNext()){
      System.out.println(scanner.next());
    }
  }
}

先ほどのサンプルを少し変更し、 hasNext メソッドを使って入力ストリームに値が残っている場合に値を取得して画面に表示するようにしました。

入力ストリームに取得できる値が残っているか確認する(2)

このように hasNext メソッドを使うことで、値が残っている間だけ繰り返し値を取得することができます。

    */
  }
}

//実行結果
/*


*/
