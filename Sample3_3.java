//Scannerクラス
//ファイルからの入力を行うスキャナを作成する

class Sample3_3{
  public static void main(String[] args){

    //ファイルから行単位で値を取得する
    /*
     スキャナから値を読み込む場合で区切り文字までの値を順に取得する代わりに行単位で値を取得する場合も試しておきます。行単位で値を取得する場合は next メソッドの代わりに nextLine メソッドを使用します。 nextLine メソッドの詳細な使い方は「区切り文字を無視して次の行までの値を受け取る」を参照されてください。

次のサンプルを見てください。

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

class JSample4_3{
  public static void main(String[] args){
    try{
      File file = new File("sample2.txt");
      Scanner scanner = new Scanner(file, "UTF-8");

      while (scanner.hasNextLine()){
        String dat = scanner.nextLine();
        System.out.println(dat);
      }
    }catch(FileNotFoundException e){
      System.out.println(e);
    }
  }
}

プログラムと同じディレクトリに次のような値が記述された sample2.txt ファイルを作成して設置しています。文字セットとして UTF-8 を使用しています。

Hello.
It's nice weather today, is not it.
Goodbye. See you again.

プログラムを実行すると、区切り文字までではなく行単位で値を取得し画面に表示しました。

ファイルから行単位で値を取得する(1)

-- --

Scanner クラスの利用方法として作成済みのファイルから値を受け取りプログラムの中で利用する方法について解説しました。 
    */
  }
}

//実行結果
/*


*/
