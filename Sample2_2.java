//Scannerクラス
//スキャナで取得した値を指定したデータ型の値として取得する(Scanner.nextInt,etc)

class Sample2_2{
  public static void main(String[] args){

    //基数を指定して数値を取得する
    /*
     Scanner クラスではデフォルトの基数が 10 となっているため、先ほど使用した nextInt メソッドでは入力された値が 10 進数の値として扱われます。その為、先ほどのサンプルで 2F などのように 16 進数の値を入力すると、数値として扱われずに例外が発生します。

基数を指定して数値を取得する(1)

10 進数以外の基数の数値を入力した場合でも数値として受け取る場合には、基数を引数に指定する nextInt メソッドを使用します。書式は次のとおりです。

public int nextInt(int radix)

パラメータ:
radix - トークンをint値として解釈するために使用する基数

戻り値:
入力からスキャンしたint

例外:
InputMismatchException - 次のトークンがInteger正規表現に一致しないか範囲外である場合
NoSuchElementException - スキャンする入力がなくなった場合
IllegalStateException - このスキャナがクローズしている場合
IllegalArgumentException - 基数が範囲外の場合

入力ストリームの現在の位置から次の区切り文字までの値を int 型の値として受けとります。このとき、値は 1 番目の引数で指定した基数に基づいた数値として扱われます。区切り文字はデフォルトでは空白文字です。

例えばキーボードから 16 進数の値を入力する場合には、基数として 16 を指定します。 2 進数であれば基数は 2 です。

次のサンプルを見てください。基数として 16 を指定しています。

import java.util.Scanner;
import java.util.InputMismatchException;

class JSample2_3{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    try{
      System.out.println("年齢を入力してください");
      int old = scanner.nextInt(16);

      System.out.println("年齢は" + old + "です");
    }catch (InputMismatchException e){
      System.out.println("数値を入力してください");
    }
  }
}

プログラムを実行し、キーボードから "2F" と入力すると 16 進数で記述された数値として nextInt メソッドの戻り値で返されます。

基数を指定して数値を取得する(2)

なお変数に格納された値を画面に出力すると 10 進数に変換されて出力されます。( 16 進数で 2F は 10 進数で 47 です)。 
    */
  }
}

//実行結果
/*


*/
