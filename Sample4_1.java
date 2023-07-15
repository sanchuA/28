//Scannerクラス
//文字列からの入力を行うスキャナを作成する

class Sample4_1{
  public static void main(String[] args){

    //文字列からの入力を行うScannerクラスのインスタンスを作成する
    /*
     スキャナの値の受け取り元として文字列を指定することができます。文字列からの入力を行う Scanner クラスのインスタンスを作成するには次のコンストラクタを使用します。

public Scanner(String source)

パラメータ:
source - スキャンする文字列

1 番目の引数にスキャンを行う対象の文字列を指定します。

次のサンプルを見てください。

import java.util.Scanner;

class JSample5_1{
  public static void main(String[] args){
    Scanner scanner = new Scanner("120 78 92 46");

    while (scanner.hasNextInt()){
      int num = scanner.nextInt();
      System.out.println(num);
    }
  }
}

スキャナを作成するときのコンストラクタの引数として指定した文字列から、区切り文字までの値を数値として取得し画面に表示しています。

文字列からの入力を行うScannerクラスのインスタンスを作成する(1)

-- --

Scanner クラスの利用方法として文字列から値を受け取りプログラムの中で利用する方法について解説しました。 
    */
  }
}

//実行結果
/*


*/
