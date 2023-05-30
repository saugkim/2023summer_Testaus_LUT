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
|-|:-|
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

