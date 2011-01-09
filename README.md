Maven Archetypes
===========

[/cynipe/maven-examle](https://github.com/cynipe/maven-examples)から作ったArchetype一覧

Installation
------------

    $ git clone git://github.com/cynipe/slim3-archetype-profiled-quickstart.git
    $ cd <archetype-dir>
    $ mvn install

Usage
------------

### プロジェクトの生成 ###

インストールした後に以下のコマンドをプロジェクトを作成したいディレクトリ上で実行

    $ mvn archetype:generate -DarcheTypeCatalog=file://$HOME/.m2

History
------------

2011/01/09: cuke4duke-quickstart-archetype:0.0.1をリリース
