//Scannerクラス
//区切り文字を別の値に設定する(Scanner.useDelimiter)


class Sample6_1{
  public static void main(String[] args){

    //区切り文字として正規表現パターンを設定する
    /*
     変更する区切り文字として文字列ではなく正規表現パターンを指定することもできます。先ほどとは引数が異なる Scanner クラスで用意されている useDelimiter メソッドを使用します。書式は次のとおりです。

public Scanner useDelimiter(Pattern pattern)

パラメータ:
pattern - 区切り文字パターン

戻り値:
現在のスキャナ

1 番目の引数に、区切り文字として使用する Pattern オブジェクトを指定します。 Pattern オブジェクトの作成については「PatternオブジェクトとMatcherオブジェクトを作成する」を参照されてください。

次のサンプルを見てください。

import java.util.Scanner;
import java.util.regex.Pattern;

class JSample3_2{
  public static void main(String[] args){
    String regex = ":|;";
    var p = Pattern.compile(regex);

    Scanner scanner = new Scanner("Melon:Peach;Grapes:Orange");
    scanner.useDelimiter(p);

    while (scanner.hasNext()){
      String fruit = scanner.next();
      System.out.println(fruit);
    }
  }
}

入力ストリームとして文字列を指定してスキャナを作成しています。そのあと区切り文字を正規表現パターンを使って ":|;" に変更しました。これはコロン(:)またはセミコロン(;)のどちらかにマッチするパターンです。そして区切り文字までの文字列を順番に取得して画面に表示しました。

区切り文字として正規表現パターンを設定する(1)

このように区切り文字をデフォルトの空白文字から正規表現パターンを使ったものに変更することができます。 
    */

  }
}

//実行結果
/*


*/
