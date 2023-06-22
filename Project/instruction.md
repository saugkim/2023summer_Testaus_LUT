## Harjoitustyö

Kurssilla on käsitelty yksikkö- ja integraatiotestausta. Harjoitustyössä on tarkoitus tehdä pääsääntöisesti järjestelmätason testausta, mutta myös ykskkö- ja integraatiotestaus on mahdollista, mikäli ryhmä kokee sen sopivaksi harjoitustyöaiheelleen.

Tehdessäsi harjoitustyötä muista kaksi kurssilla opetettua oleellista testaukseen liittyvää asiaa: systemaattisuus ja dokumentaatio. Mikäli testaus on suoritettu “vasemmalla kädellä”, ei harjoitustyöstä tule täysiä pisteitä.

Missiona harjoitustyössä on näyttää, että olet ymmärtänyt mitä testaaminen on, ja että osaat testata ohjelmistoprojektia. Näytä kuinka hyvä testaaja olet!

Templaatti HT-dokumentaation löytyy täältä: https://docs.google.com/document/d/1zH0yhPzUeacuvSD_1XKAXDtXxY0Qwfs29wAWjtL1CNk/edit?usp=sharing 

Tämä on kuitenkin vain templaatti ja sitä saa muokata paremmaksi. Harjoitustyön voi tehdä luonnollisesti täysin suomeksi.

Tehtävänäsi on testata sopiva avoimen lähdekoodin projekti. Kun ryhmä on testannut projektin ja kirjoittanut siitä raportin on seuraavana tehtävänä testata (/ tarkistaa / vertaisarvioida) toisen ryhmän raportti. 

Harjoitustyö tehdään (2-)3 henkilön ryhmissä. Dokumentin palautusmuotona on PDF.

**Pisteytyksestä**

Maksimispisteet harjoitustyöstä on 30 (25 itse työstä, 5 vertaisarvioinnista), mutta pisteitä voi kasata erilaisin tavoin. Huomaa, että vaikka “hyvin kirjoitettu raportti” antaa maksimissaan 10 pistettä, voidaan tätä pistemäärää laskea, mikäli raportin ulkoasu on aivan pielessä, tai sisältö ei vastaa kurssin aiheita. Ryhmällä on mahdollisuus varmistaa maksimipisteiden saaminen tekemällä varmuudeksi hieman enemmän pisteitä kasaan, esimerkiksi palauttamalla 40 pisteen työ ei haittaa, jos jostain osioista hieman menettää pisteitä.

Seuraavan taulukon pisteytys on vain osviittaa antava. Voitte ryhmässä laittaa myös muita pisteytysehdotuksia.

|Ominaisuus|Maksimipisteet|
|-|-:|
|Hyvin kirjoitettu raportti|10|
|Ei raporttia|-100|
|Hyvin kirjoitettu raportti toisen ryhmän raportin testauksesta (vertaisarviointi on siis tehty huolella)|5|
|Ei vertaisarvioraporttia|-100|
|||
|Ohjelmiston asennus on käyty läpi yhtenä testitapauksena|2|
|Ohjelmiston asennus on suoritettu ainakin kolmeen erilaiseen laitteeseen (esim. Ubuntu, MacOS, Windows, Android, iOS… kolmea eri Windows-konetta ei lasketa eri laitteiksi)|1|
|Ohjelmisto on testattu useammalla erilaisella ympäristöllä (vähintään 4), jotta nähdää pitävätkö minimi järjestelmävaatimukset paikkansa. Tässä hyväksytään esim. testaus laitteella, jossa ohjelmiston vaatima muistimäärä, alle vaaditun ja yli vaaditun ja jokin neljäs laite. Luonnollisesti komentoriviohjelmiston testaamisessa tällaista ei voida käyttää, joten siinä testaamisen voi tehdä neljällä eri kokoisella ikkunalla, jolloin nähdään toimiiko ohjelma oikein vaikka ruudun koko vaihtelisi.|2|
|Ohjelmisto on testattu usealla erilaisella laitteella, jotta nähdään, että esimerkiksi käyttöliittymä skaalautuu hyvin erikokoisilla näytöille (6 laitetta vähintään, konsoliohjelmilla ei voitane saavuttaa näitä pisteitä )|3|
|Ohjelmisto on testattu saavutettavuuden näkökulmasta; voiko sitä käyttää pelkästään näppäimistöllä? Ääniohjattuna? Osaako ruudunlukija lukea ohjelmiston käyttöliittymää?|3|
|||
|Suunnittele 10 funktionaalista testitapausta (esim. “Käyttäjän tulee kyetä tallentamaan tiedosto”) ja testaa ne|4|
|Suunnittele 10 ei-funktionaalista testitapausta (esim. “Ohjelmiston tulee toimia nopeasti”, miten määrittelet “nopeasti”?) ja testaa ne|4|
|Koodin tarkastus on suoritettu osalle lähdekoodia (vähintään 200 riviä koodia)|2|
|Projektin olemassa olevat (yksikkö)testit on ajettu, jotta ohjelman (ja testien) tila on saatu varmistettua|3|
|||
|Ohjelmasta on löydetty virhe ja se on raportoitu kehittäjille|4|
|Ohjelmasta on löydetty virhe, siihen on kehitetty korjaus ja se on toimitettu kehittäjille|5 (edellisen lisäksi)|
|Pull request uusille (yksikkö)testeille (yksi riittää)|4|
|Automatisoi jotain testitapauksia projektissa esimerkiksiksi https://www.cypress.io/ :lla (vähintään 5 tapausta täytyy rakentaa)|5|
|Dokumentaation tarkistus: Onko se ajantasainen? Puuttuuko jotain?|2|
|||
|Epäasiallinen sisältö, kuten vihapuhe, rasistiset meemit tai vastaava|-100|
|||
|<Oma ominaisuus: kuvaile, miksi juuri tämä ominaisuus ja sen pisteytys tulisi hyväksyä>|n|

<br>

**Lista avoimen lähdekoodin projekteista**

Alla on lista avoimen lähdekoodin projekteista, jotka voivat olla hyviä testattavaksi. Jokaisen ryhmän on tarkoitus testata eri projektia. Mikäli mikään listan projekteista ei tunnu sopivalta, heittäkää luennoitsijalle mailia ja ehdottakaa omaa. Aiheiden varauksessa on käytössä nopeammat syövät hitaat periaate.

|Projekti|Tyyppi|Käytetyt ohjelmointikielet|Lisenssi|URL|
|-|-|-|-|:-|
|0 A.D.|Game|C++, JS|GPL2, CC-BY-SA|https://play0ad.com/|
|Android-Jigsaw-Puzzle|Game|Java|Apache 2.0|https://github.com/julesbond007/android-jigsaw-puzzle|
|Atom|Code editor|JS|MIT|https://atom.io/|
|Audacity|Audio editor|C|GPL 2+|https://www.audacityteam.org/|
|Blender|3D modeller|C, C++, Python|GPL 2+|https://www.blender.org/|
|Django|Web framework|Python|BSD|https://www.djangoproject.com/|
|DOSBox|Emulator|C++|GPL 2+|https://www.dosbox.com/|
|Drupal|Content management system|PHP, JS|GPL2|https://www.drupal.org/|
|excel-diff-checker|Excel diff checker(!)|Java|Apache 2.0|https://github.com/abhisheksarkar30/excel-diff-checker|
|Faker|Fake data generator|PHP|MIT|https://github.com/fzaninotto/Faker|
|FileZilla|FTP client|C++|GPL 2+|https://filezilla-project.org/|
|FreeCAD|CAD tool|C++|LGPL 2+|https://www.freecad.org/|
|Freeciv|Game|C|GPL 2+|http://www.freeciv.org/|
|Firefox|Browser|C++ / Rust|MPL 2.0|https://www.mozilla.org/en-US/firefox/new/|
|Gallery3|Image gallery|PHP|GPL2|https://github.com/bwdutton/gallery3|
|Gif for cli|Funny tool|Python|Apache 2.0|https://github.com/google/gif-for-cli|
|GIMP|Image edit|C|GPL v3.0|https://www.gimp.org/|
|Godot|Game engine|C++|MIT|https://github.com/godotengine/godot|
|Hexo|Blog framework|JS|“Free”|https://hexo.io/|
|hget|Terminal tool|Go|MIT|https://github.com/huydx/hget|
|Inkscape|Vector graphics|C++|GPLv3+|https://inkscape.org/|
|Java-Cli-Table-Builder|Command line tool|Java|MIT|https://github.com/dmkyr20/Java-Cli-Table-Builder|
|Kdenlive|Video editor|C++|GPLv.3+|https://kdenlive.org/en/|
|Krita|Drawing tool|C++|GPLv.3+|https://krita.org/en/|
|Laravel|PHP framework|PHP|MIT|https://laravel.com/|
|Leaflet|Map framework|JS|BSD-2-Clause license|https://github.com/Leaflet/Leaflet|
|libGDX|Game development framework|Java|Apache 2.0|https://libgdx.badlogicgames.com/|
|LimeSurvey|Survey framework|PHP|GPL|http://limesurvey.org/|
|Links|Browser|C|GPL 2+|http://links.twibright.com/|
|MultiCraft|Game|Java|LGPLv3, CC-BY-SA 4.0|https://github.com/MultiCraft/MultiCraft|
|Netbeans|IDE|Java|Apache 2.0|https://github.com/apache/netbeans|
|Nginx|Web server|C|BSD-2-clause|https://nginx.org/|
|Node.js|JS backend|C++, JS||https://github.com/nodejs/node|
|OpenTTD|Game|C, C++|GPL2|https://www.openttd.org/|
|Photon|Crawler|Python|GPL v3.0|https://github.com/s0md3v/Photon|
|plotly|Interactive graphics|JS|MIT|https://plotly.com/|
|Return to the Roots|Game|C++|GPL v3.0|https://www.siedler25.org/|
|scikit-learn|Python module|Python|BSD|https://scikit-learn.org/|
|Scribus|Publishing|C++|PD|https://www.scribus.net/|
|Superset|Business intelligence|Python|Apache 2.0|https://github.com/apache/incubator-superset|
|SuperTuxKart|Game|C++|GPL|https://supertuxkart.net/|
|termui|Terminal dashboard|Go|MIT|https://github.com/gizak/termui|
|The Fuck|Terminal tool|Python|MIT|https://github.com/nvbn/thefuck|
|Vaadin|Web framewokr|Java| | http://vaadin.com/|
|Visual studio code|Code/text editor|JS|MIT|https://code.visualstudio.com/|
|Vue.js|JS framework|JS|MIT|https://github.com/vuejs/core|
|wget|FTP/HTTP client|C|GPL 3+ |https://www.gnu.org/software/wget/|
|Widelands|Game|C(++)|GPL|https://www.widelands.org/|
|youtube-dl|Terminal tool|Python|Unlicense|https://github.com/ytdl-org/youtube-dl|
|Yii2|PHP Framework|PHP|BSD|https://www.yiiframework.com/|
|Zotero|Reference manager|JS|AGPL|https://www.zotero.org/|
|Zulip|Chat application|Python|Apache 2.0|https://zulipchat.com/|




