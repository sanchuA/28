//Scannerクラス
//キーボードから入力された値を取得する(Scanner.next,Scanner.nextLine)

class Sample1_3{
  public static void main(String[] args){

    //デフォルトの区切り文字である空白文字について
    /*
    nextメソッドを実行するとデフォルトの区切り文字である空白文字までの値
    を取得するとここまで説明してきましたが、

    空白文字とは半角スペースだけではなくCharacter.isWhitespace()で
    trueと判定される文字です。

    具体的には次の文字がすべて空白文字として扱われます。

    Unicodeの空白文字(SPACE_SEPARATOR、LINE_SEPARATOR、PARAGRAPH_SEPARATOR)
    \u0009  水平タブ(\t)
    \u000A  改行(\n)
    \u000B  垂直タブ
    \u000C  改ページ(\f)
    \u000D  復帰(\r)
    \u001C
    \u001D
    \u001E
    \u001F
    \u0020  半角スペース

    Unicodeの空白文字というのはSPACE SEPARATOR(Unicode の空白文字) 、
    LINE SEPARATOR (Unicode の行区切り文字) 、
    PARAGRAPH SEPARATOR(Unicode の段落区切り文字)に含まれる文字が
    取り除かれます。

    そして全角スペース(\u3000)はSPACE SEPARATORに含まれるため、
    trimメソッドで取り除かれる文字に加えて全角スペースも
    取り除かれることになります。

    SPACE SEPARATOR:
    \u0020  半角スペース SPACE
    \u1680  OGHAM SPACE MARK
    \u2000 ～ \u200A  EN QUAD..HAIR SPACE
    \u205F  MEDIUM MATHEMATICAL SPACE
    \u3000  全角スペース IDEOGRAPHIC SPACE

    LINE SEPARATOR:
    \u2028

    PARAGRAPH SEPARATOR:
    \u2029

    ※ Unicode Character Database から抜粋しました。

    ※ SPACE SEPARATORには他にノーブレークスペースと呼ばれる
    \u00A0 \u2007 \u202F の3つがありますが、strip メソッドでは取り除かれません。

    簡単に言えば、半角スペースに加えてタブや改行、全角スペースなども
    すべて区切り文字の空白文字として扱われます。

    キーボードからの入力で、途中で空白などを挟まずにEnterキーを押して
    入力を完了した場合、入力した値の最後の改行文字の直前までが
    next メソッドの戻り値として返されます。

        */
  }
}

//実行結果
/*


*/
