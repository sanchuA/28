//Scannerクラス
//スキャナの入力ストリームにまだ値が残っているか確認する(Scanner.hasNext)

class Sample5_2{
  public static void main(String[] args){

    //次の値が指定したデータ型の値として取得できるか確認する
    /*
     なお next メソッドと似たメソッドとして nextInt などのような取得する値のデータ型を指定するメソッドが複数用意されていますが、 hasNext メソッドについても同じように指定したデータ型の値が入力ストリームの次の値として取得できるか確認するために hasNextInt などのようなメソッドが用意されています。

public boolean hasNextBoolean()
public boolean hasNextByte()
public boolean hasNextByte(int radix)
public boolean hasNextShort()
public boolean hasNextShort(int radix)
public boolean hasNextInt()
public boolean hasNextInt(int radix)
public boolean hasNextLong()
public boolean hasNextLong(int radix)
public boolean hasNextFloat()
public boolean hasNextDouble()
public boolean hasNextBigInteger()
public boolean hasNextBigInteger(int radix)
public boolean hasNextBigDecimal()

また行単位で値を取得する nextLine メソッドに対応するメソッドとして hasNextLine メソッドも用意されています。

public boolean hasNextLine()

例えば入力ストリームに値が残っている場合でも、次の値が整数の値として識別できない値だった場合は hasNextInt メソッドは false を返します。

次のサンプルを見てください。

import java.util.Scanner;

class JSample6_3{
  public static void main(String[] args){
    Scanner scanner = new Scanner("16 42 RY 24");

    while (scanner.hasNextInt()){
      System.out.println(scanner.nextInt());
    }
  }
}

スキャナの入力ストリームに設定している文字列には、区切り文字で区切られた値が 4 つありますが、 3 つの目の値は hasNext メソッドであれば true を返しますが、 hasNextInt メソッドでは整数に変換できない値は false となるため、今回のサンプルでは 2 つの値を読み込んだあとで終了します。

次の値が指定したデータ型の値として取得できるか確認する(1)

なお 4 つ目の値は hasNextInt メソッドで true となる値ですが、 hasNextInt などのメソッドは取得できる値が残りの値のどこかにあるかどうかではなく、次の値が取得できるかどうかで反対するため、残りのインプットすトーラムにまだ取得できる値があったとしても次の値が取得できなければ false となります。 
    */
  }
}

//実行結果
/*


*/
