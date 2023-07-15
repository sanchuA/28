//Scannerクラス
//ファイルからの入力を行うスキャナを作成する

class Sample3_1{
  public static void main(String[] args){

    //ファイルからの入力を行うScannerクラスのインスタンスを作成する
    /*
    ここまでは標準入力から値を受けとるスキャナを利用してきましたが、スキャナの入力ストリームとしてファイルを指定することができます。既に作成済みのファイルを指定すると、ファイルの内容を読み込んで取得します。ファイルからの入力を行う Scanner クラスのインスタンスを作成するには次のコンストラクタを使用します。

public Scanner(File source) throws FileNotFoundException

パラメータ:
source - スキャン対象のファイル

例外:
FileNotFoundException - ソースが見つからない場合

1 番目の引数に既存のファイルを表す File クラスのインスタンスを指定します。

ファイルから読み取った値は、基になるプラットフォームのデフォルト文字セットを使用して文字に変換されます。例えば Windows 環境であれば Shift_JIS で記述されたものとして扱われます。

次のサンプルを見てください。

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

class JSample4_1{
  public static void main(String[] args){
    try{
      File file = new File("sample.txt");
      Scanner scanner = new Scanner(file);

      while (scanner.hasNext()){
        String dat = scanner.next();
        System.out.println(dat);
      }
    }catch(FileNotFoundException e){
      System.out.println(e);
    }
  }
}

プログラムと同じディレクトリに次のような値が記述された sample.txt ファイルを作成して設置しています。

リンゴ オレンジ レモン

プログラムを実行すると、ファイルから区切り文字までの値を取得し、画面に表示します。これを値を取得できなくなるまで繰り返します。

ファイルからの入力を行うScannerクラスのインスタンスを作成する(1)

作成した sample.txt ファイルの文字セットは Shift_JIS にしてあります。 Windows 環境の場合のデフォルトの文字セットは Shift_JIS なので問題なくファイルの値を読み込むことができます。

sample.txt ファイルの文字セットが UTF-8 などのように環境毎に決められているデフォルトの文字セットと異なる場合、次のように文字化けが起こります。

ファイルからの入力を行うScannerクラスのインスタンスを作成する(2)

環境毎のデフォルトの文字セットとは異なる文字セットで保存されたファイルを読み込みたい場合や、明示的に文字セットを指定したい場合はこのあとで解説するコンストラクタを使用してください。

    */
  }
}

//実行結果
/*


*/
