//Scannerクラス
//スキャナの入力ストリームにまだ値が残っているか確認する(Scanner.hasNext)

class Sample5_3{
  public static void main(String[] args){

    //次の値が指定した文字列またはパターンとマッチするか確認する
    /*
     スキャナの入力ストリームに取得できる値がまだある場合に、その値が指定した文字列や正規表現パターンとマッチするかどうかを調べることができます。指定した文字列と一致するか調べるには、引数に文字列を指定する Scanner クラスの hasNext メソッドを使用します。

public boolean hasNext(String pattern)

パラメータ:
pattern - スキャンするパターンを指定する文字列

戻り値:
このスキャナが指定されたパターンに一致する別のトークンを保持する場合にのみtrue

例外:
IllegalStateException - このスキャナがクローズしている場合

スキャナの入力ストリームから取得できる値が、 1 番目の引数に指定した文字列と一致する場合に true が戻り値として返されます。

次のサンプルを見てください。

import java.util.Scanner;

class JSample6_4{
  public static void main(String[] args){
    Scanner scanner = new Scanner("AB AB BC AB");

    while (scanner.hasNext("AB")){
      System.out.println(scanner.next());
    }
  }
}

入力ストリームから取得できる値が "AB" と一致している間、値を取得します。

次の値が指定したデータ型の値として取得できるか確認する(1)

同じように取得できる次の値が指定した正規表現パターンとマッチするか調べるには、引数に Pattern オブジェクトを指定する Scanner クラスの hasNext メソッドを使用します。

public boolean hasNext(Pattern pattern)

パラメータ:
pattern - スキャンするパターン

戻り値:
このスキャナが指定されたパターンに一致する別のトークンを保持する場合にのみtrue

例外:
IllegalStateException - このスキャナがクローズしている場合

スキャナの入力ストリームから取得できる値が、 1 番目の引数に指定した Pattern オブジェクトとマッチする場合に true が戻り値として返されます。 Pattern オブジェクトの作成については「PatternオブジェクトとMatcherオブジェクトを作成する」を参照されてください。

次のサンプルを見てください。

import java.util.Scanner;
import java.util.regex.Pattern;

class JSample6_5{
  public static void main(String[] args){
    String regex = "[A-Z0-9]{2}";
    var p = Pattern.compile(regex);

    Scanner scanner = new Scanner("AB 7B DEB A5");

    while (scanner.hasNext(p)){
      System.out.println(scanner.next());
    }
  }
}

正規表現パターンとして A から Z または 0 から 9 までの文字が 2 つ続く文字列とマッチするものを作成しました。入力ストリームから取得できる値がこのパターンとマッチしている間、値を取得して画面に表示します。

次の値が指定したデータ型の値として取得できるか確認する(1)

このように次に取得できる値が指定した文字列と一致するか、または指定した正規表現パターンとマッチするかを調べることができます。 
    */
  }
}

//実行結果
/*


*/
