//Scannerクラス
//キーボードから入力された値を取得する

class Sample2_1{
  public static void main(String[] args){

    //数値としてスキャナから値を取得する
    /*
     スキャナから取得する値を文字列ではなく数値として取得することができます。データ型毎に使用するメソッドが異なりますが、例として int 型の値として取得するには Scanner クラスで用意されている nextInt メソッドを使います。書式は次のとおりです。

public int nextInt()

戻り値:
入力からスキャンしたint

例外:
InputMismatchException - 次のトークンがInteger正規表現に一致しないか範囲外である場合
NoSuchElementException - スキャンする入力がなくなった場合
IllegalStateException - このスキャナがクローズしている場合

入力ストリームの現在の位置から次の区切り文字までの値を int 型の値として受けとります。区切り文字はデフォルトでは空白文字です。

例えばキーボードから 27 と入力した場合、 next メソッドの場合は文字列の "27" として返されますが、 nextInt メソッドの場合は整数の 27 として返されます。

※ 標準入力を利用したスキャナの基本的な使い方については「キーボードから入力された値を取得する(Scanner.next,Scanner.nextLine)」を参照されてください。

次のサンプルを見てください。

import java.util.Scanner;

class JSample2_1{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("年齢を入力してください");
    int old = scanner.nextInt();

    System.out.println("年齢は" + old + "です");
  }
}

標準入力から値を取得する Scanner クラスのインスタンスを作成し、そのあとで nextInt メソッドを使ってキーボードからの入力待ちとなります。

数値としてスキャナから値を取得する(1)

キーボードで値を入力し最後に Enter キーが押されるとキーボードからの入力が終わります。すると入力された値の中で区切り文字(デフォルトでは空白文字)までの値を受け取り、変数 old に格納します。今回は入力された値を int 型の値として受け取ります。

数値としてスキャナから値を取得する(2)

もし int 型の値に変換できない値を入力すると InputMismatchException 例外が発生します。

数値としてスキャナから値を取得する(3)

必要であれば次のように例外処理を記述してください。

import java.util.Scanner;
import java.util.InputMismatchException;

class JSample2_2{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    try{
      System.out.println("年齢を入力してください");
      int old = scanner.nextInt();

      System.out.println("年齢は" + old + "です");
    }catch (InputMismatchException e){
      System.out.println("数値を入力してください");
    }
  }
}

数値としてスキャナから値を取得する(4)

なお next メソッドで文字列として取得したあとで Integer クラスの parseInt メソッドを使って次のように int 型の値に変換することもできます。

Scanner scanner = new Scanner(System.in);

System.out.println("年齢を入力してください");
String old = scanner.next();
int numold = Integer.parseInt(old);

*/
  }
}

//実行結果
/*


*/
