## 漢字書けな～い。Java 版

![macOS での実行](/screenshot.jpg)

「漢字書けな～い。」は大きく表示する事で、漢字を見やすくするツールです。\
Java 版は Java を用いて動作する各種環境（主にパソコン）に対応します。\
「漢字書けな～い！」シリーズは Windows・Mac OS 8/9 を原作に、様々なアプリで公開されています。

「漢字書けな～い。」は 中仙道 太郎 氏製作「漢字書けな〜い！」シリーズ作品です。\
原作者 中仙道 太郎 氏より許可をいただいています。

- [**漢字書けな～い。** https://kanji-kakenai.jimdo.com/](https://kanji-kakenai.jimdo.com/)
- **原作 漢字書けな～い！** [iSoftware](http://nakasendo.com/isoft.html) | [最愛のiMacを創る会](http://nakasendo.com/) 

## 実行方法

Java をインストールしている場合 **kanji.jar** をクリックして起動できます。

ソースから簡単に実行する方法は次のとおりです。\
**-Dfile.encoding=UTF-8** を忘れないで下さい。

```
javac -J-Dfile.encoding=UTF-8 kanji.java
java -Dfile.encoding=utf-8 kanji
```

## ライセンス

[MIT License](/LICENSE) で公開しています。
