![Grasscutter](https://socialify.git.ci/Grasscutters/Grasscutter/image?description=1&forks=1&issues=1&language=1&logo=https%3A%2F%2Fs2.loli.net%2F2022%2F04%2F25%2FxOiJn7lCdcT5Mw1.png&name=1&owner=1&pulls=1&stargazers=1&theme=Light)
<div align="center"><img alt="Documentation" src="https://img.shields.io/badge/Wiki-Grasscutter-blue?style=for-the-badge&link=https://github.com/Grasscutters/Grasscutter/wiki&link=https://github.com/Grasscutters/Grasscutter/wiki"> <img alt="GitHub release (latest by date)" src="https://img.shields.io/github/v/release/Grasscutters/Grasscutter?logo=java&style=for-the-badge"> <img alt="GitHub" src="https://img.shields.io/github/license/Grasscutters/Grasscutter?style=for-the-badge"> <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/Grasscutters/Grasscutter?style=for-the-badge"> <img alt="GitHub Workflow Status" src="https://img.shields.io/github/actions/workflow/status/Grasscutters/Grasscutter/build.yml?branch=development&logo=github&style=for-the-badge"></div>

<div align="center"><a href="https://discord.gg/T5vZU6UyeG"><img alt="Discord - Grasscutter" src="https://img.shields.io/discord/965284035985305680?label=Discord&logo=discord&style=for-the-badge"></a></div>

[EN](README.md) | [简中](docs/README_zh-CN.md) | [繁中](docs/README_zh-TW.md) | [FR](docs/README_fr-FR.md) | [ES](docs/README_es-ES.md) | [HE](docs/README_HE.md) | [RU](docs/README_ru-RU.md) | [PL](docs/README_pl-PL.md) | [ID](docs/README_id-ID.md) | [KR](docs/README_ko-KR.md) | [FIL/PH](docs/README_fil-PH.md) | [NL](docs/README_NL.md) | [JP](docs/README_ja-JP.md) | [IT](docs/README_it-IT.md) | [VI](docs/README_vi-VN.md)


**Attention:** 私たちはプロジェクトへのコントリビュータをいつでも歓迎します。コントリビュートする前に、私たちの [行動規範](https://github.com/Grasscutters/Grasscutter/blob/stable/CONTRIBUTING.md)をよくお読みください。

## 現在実装されている機能

* ログイン
* 戦闘
* フレンドリスト
* テレポート
* 祈願 (ガチャ)
* マルチプレイ (一部)
* コンソールを通したモンスターのスポーン 
* インベントリ機能 (アイテム/キャラクターの受け取り､アイテム/キャラクターのアップグレードなど)

## かんたんセットアップガイド

**Note:** サポートが必要な場合はGrasscutterの[Discordサーバー](https://discord.gg/T5vZU6UyeG)に参加してください。

### パパっとスタートアップ

- [Java (バージョン17以降)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) を用意する
- [MongoDB Community Server](https://www.mongodb.com/try/download/community) を用意する
- ゲームバージョンがREL4.5.0のものを用意する (4.5.0のクライアントを持っていない場合は右のリンクからダウンロード): 

| Download link | Package size | MD5 checksum |
| :---: | :---: | :---: |
| [GenshinImpact_4.5.0.zip.001](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240301203033_RZSIny3hwJ5nq959/GenshinImpact_4.5.0.zip.001) | 10.0 GB | f90ff656a5c84c299a9a0359e67d6133 |
| [GenshinImpact_4.5.0.zip.002](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240301203033_RZSIny3hwJ5nq959/GenshinImpact_4.5.0.zip.002) | 10.0 GB | 8503c15c090ec71d699591d4782ac9ac |
| [GenshinImpact_4.5.0.zip.003](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240301203033_RZSIny3hwJ5nq959/GenshinImpact_4.5.0.zip.003) | 10.0 GB | f57a42ced76275035216984ef3edb1b0 |
| [GenshinImpact_4.5.0.zip.004](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240301203033_RZSIny3hwJ5nq959/GenshinImpact_4.5.0.zip.004) | 10.0 GB | 47b905fb1a6a3a3e8518002957ef543d |
| [GenshinImpact_4.5.0.zip.005](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240301203033_RZSIny3hwJ5nq959/GenshinImpact_4.5.0.zip.005) | 10.0 GB | 9e2200dd6334f27ece3afd3008c83ee4 |
| [GenshinImpact_4.5.0.zip.006](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240301203033_RZSIny3hwJ5nq959/GenshinImpact_4.5.0.zip.006) | 10.0 GB | 1944ef5e7b24adb38157b5920d2662be |
| [GenshinImpact_4.5.0.zip.007](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240301203033_RZSIny3hwJ5nq959/GenshinImpact_4.5.0.zip.007) | 10.0 GB | 815eeee0c40f125c8ac355551893e4cc |
| [GenshinImpact_4.5.0.zip.008](https://autopatchhk.yuanshen.com/client_app/download/pc_zip/20240301203033_RZSIny3hwJ5nq959/GenshinImpact_4.5.0.zip.008) | 0.17 GB | 95be2c4d704b1e2a8dad719344e66e63 |


- [最新の Cultivation](https://github.com/Grasscutters/Cultivation/releases/latest)をダウンロードする。`.msi`インストーラを使ってください。
- 管理者権限を付与して Cultivation を実行した後、右上端にあるダウンロードアイコンのボタンを押す。 
- `Download All-in-One` をクリックする
- 右上端にある歯車アイコンのボタンをクリックする。
- `Game Install Path` にゲームファイルのパスを指定する。
- `Custom Java Path` に、自分が用意したJavaのパスを指定する。 (例: `C:\Program Files\Java\jdk-17\bin\java.exe`)
- その他の設定には手を付けず次の段階に進む。

- Launch の隣にある小さいボタンを押す。
- Launchボタンを押す
- 好きなユーザ名でログインする。パスワードは特段気にすることはない。


### ビルド

Grasscutterは依存関係とビルドの処理にGradleを使用しています。

**必要要件:**

- [Java SE Development Kit 17以降](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Git](https://git-scm.com/downloads)
- [NodeJS](https://nodejs.org/en/download) (任意、ハンドブックの生成に必要)

##### Clone
```shell
git clone --recurse-submodules https://github.com/Grasscutters/Grasscutter.git
cd Grasscutter
```

##### Compile

**Note:** 環境によってはハンドブックの生成が失敗する場合があります。ハンドブックの生成をさせない場合は `gradlew jar` コマンドに `-PskipHandbook=1` を付け加えてください。

Windows:

```shell
git clone https://github.com/Grasscutters/Grasscutter.git
cd Grasscutter
.\gradlew.bat # コンパイル環境の構築
.\gradlew jar # コンパイル
```

Linux:

```bash
git clone https://github.com/Grasscutters/Grasscutter.git
cd Grasscutter
chmod +x gradlew
./gradlew jar # コンパイル
```

生成されたjarファイルはプロジェクトフォルダのルートにあります。

### トラブルシューティング

よく散見されるトラブルとそれに対する解決策のまとめリストや、質問し誰かの助けを得たい場合は、Grasscutterの[Discordサーバー](https://discord.gg/T5vZU6UyeG)に参加し、サポートチャンネルを参照してください。
