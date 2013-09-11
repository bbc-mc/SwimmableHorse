MOD name     : SwimmableHorse
Author       : bbc_mc (bbc-mc on github)
publish date : 2013/09/11
last update  : 2013/09/11
-----------------------------------------------------------
■機能 / function

  * "泳げる馬" を追加します。
  * Add creature "SwimmableHorse"

■環境 / environment

  * MC 1.6.2 + Forge 9.10.0.804

■導入 / install

  1. Forge 導入 / Install forge 804+
  2. zip ファイルごと mods フォルダへ投入 / Put this mod's zip file to "mods" folder

■利用方法 / How to use

  * 本 mod は、プレイヤーが騎乗している時も "泳げる馬" を追加します。
    - 泳げる能力以外は、通常の馬と同様です。
    - 通常の馬と同様に、平地に Spawn します。
  * Spawn 率や Spawn 数は、setSpawnRateLow の設定に応じて変化します。
    - false : 通常の馬と同等
    - true  : エンダーマンと同等

■設定変更 / Config

  * idEntitySwimmableHorse
    - EntityのIDです。

  * enabled
    - Spawn するかどうか [default=true]

  * setSpawnRateLow;
    - Spawn 率を下げるかどうか [defalut=true]

  * jumpUpPower
    - 水上での跳ね上がりの強さ

  * jumpUpFrequency;
    - 水上での跳ね上がりの頻度

■仕様 / Specification

  * 交配した場合、泳ぐ能力は遺伝しません。（生まれるのは 100% 通常の馬）
  * 騎乗時、馬が一定以上沈むと、騎乗が解除されます。（通常の馬の場合と同様）

  * Even if you have mated with a normal horse, the ability to swim is NOT inherited. (born 100% normal child)
  * Riding is canceled when Horse sink into water beyond a certain level (as same as riding on normal horse).

■免責事項 / Disclaimer

  * ご利用は自己責任でお願いします
    - 事前にバックアップを！

■公開先 / Publshing Place

  * Minecraft 日本非公式ユーザーフォーラム
    - http://forum.minecraftuser.jp/viewtopic.php?f=21&t=278&p=58047#p58028
  * github (ソースコード)
    - https://github.com/bbc-mc/SwimmableHorse
    - ソースコードのライセンスは、MIT License と GPLv3 の Dual License とします.

■更新 / Recent Updates

  - 2013/09/10
    - 初版 / First version

----------
Copyright &copy; 2013 bbc_mc (bbc-mc on github)  
Dual licensed under the [MIT license][MIT] and [GPL license][GPL].  
[MIT]: http://www.opensource.org/licenses/mit-license.php  
[GPL]: http://www.gnu.org/licenses/gpl.html
