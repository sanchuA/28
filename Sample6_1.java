//Scannerクラス
//区切り文字を別の値に設定する(Scanner.useDelimiter)


class Sample6_1{
  public static void main(String[] args){

    //区切り文字として文字列を設定する
    /*
     デフォルトでは区切り文字として空白文字が設定されています。別の文字列を設定するには Scanner クラスで用意されている useDelimiter メソッドを使用します。書式は次のとおりです。

public Scanner useDelimiter(String pattern)

パラメータ:
pattern - 区切り文字パターンを指定する文字列

戻り値:
現在のスキャナ

1 番目の引数に区切り文字として使用する文字列を指定します。

次のサンプルを見てください。

import java.util.Scanner;

class JSample3_1{
  public static void main(String[] args){
    Scanner scanner = new Scanner("Apple,Orange,Lemon");
    scanner.useDelimiter(",");

    while (scanner.hasNext()){
      String fruit = scanner.next();
      System.out.println(fruit);
    }
  }
}

入力ストリームとして文字列を指定してスキャナを作成しています。そのあと区切り文字をコンマ(,)に変更しました。そして区切り文字までの文字列を順番に取得して画面に表示しました。

区切り文字として文字列を設定する(1)

このように区切り文字をデフォルトの空白文字から任意の文字列に変更することができます。

    */

  }
}

//実行結果
/*


*/
