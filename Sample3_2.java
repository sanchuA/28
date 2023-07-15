//Scannerクラス
//ファイルからの入力を行うスキャナを作成する

class Sample3_2{
  public static void main(String[] args){

    //ファイルからデータを読み込むときの文字セットを指定する
    /* 例えば Windows 環境で文字セットとして UTF-8 を使用して保存されたファイルからスキャナを作成したい場合など、使用する文字セットを指定する場合には次のコンストラクタを使用します。

public Scanner(File source, String charsetName) throws FileNotFoundException

パラメータ:
source - スキャン対象のファイル
charsetName - ファイルから取得したバイトをスキャン対象の文字に変換する際に使用するエンコーディング型

例外:
FileNotFoundException - ソースが見つからない場合
IllegalArgumentException - 指定されたエンコーディングが見つからない場合

1 番目の引数に既存のファイルを表す File クラスのインスタンスを指定し、 2 番目の引数に使用する文字セットを表す文字列を指定します。

次のサンプルを見てください。

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

class JSample4_2{
  public static void main(String[] args){
    try{
      File file = new File("sample.txt");
      Scanner scanner = new Scanner(file, "UTF-8");

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

ファイルからデータを読み込むときの文字セットを指定する(1)

今回 sample.txt ファイルは文字セットとして UTF-8 を使って保存しています。作成したスキャナは 2 番目の引数で使用する文字セットとして UTF-8 を指定しているので、文字化けすることなくファイルの値を取得することができました。 *

    */
  }
}

//実行結果
/*


*/
