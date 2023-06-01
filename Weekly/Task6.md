### Tehtävä 6-1 / Task 6-1

Palautettava viimeistään: maanantai, 31. heinäkuuta 2023, 23:59

**Järjestelmätestaus (2 pistettä)**

Tehtävänäsi on testata selaimella toimivaa peliä: https://gpiste.org/asmi/sailtd/

Tämä on mustalaatikkotestausta, joten älä tongi lähdekoodia, vaan testaa peli mahdollisimman järjestelmällisesti. Luo taulukko testitapauksistasi ja ongelmista, joita löydät.

Peli itsessään on yksinkertainen tornipuoluspeli, jossa tarkoitus on rakentaa torneja, jotka ampuvat kartan läpi kelluvia vihollisia. Vihollisten tuhoaminen tuo rahaa, jolla ostaa uusia torneja. Torneja voi myös vahvistaa tai myydä. Pelin voittaa, mikäli viholliset saa tuhottua ja häviää, jos yksikin pääsee läpi.

1 piste: Luo 10 hyvää* testitapausta ja löydä ainakin 3 bugia

2 pistettä: Luo ainakin 20 hyvää* testitatapausta löydä ainakin 5 bugia (huomaa, että bugin määritelmä on hyvin laaja tämän pelin tapauksessa)

+ Hyvällä tarkoitettaan jälleen erilaisia testitapauksia. Pelkkä "klikkasin hiirellä vihreälle alueelle vasemmassa reunassa, klikkasin hiirellä vihreälle alueelle oikeassa reunassa" ei siis riitä.

Alempana on esimerkki testi- ja bugiraportista.


**System testing (2 points)**

Your task is to test a game located here: https://gpiste.org/asmi/sailtd/

This is black-box system testing, so do not check the code, but test the game as systematically as you can. Create a table of test cases and faults you can find.


The game is a basic tower defense game where the aim is to build towers that shoot enemies walking through the map. Killing enemies gives the player money to buy more towers. Towers can also be sold and upgraded. The game is won when all the enemies are killed and lost if at least one enemy gets through.


**Test report**

|Test ID|Input|Outcome|Notes|Browser (version) used in testing|
|:-|:-|:-|:-|:-|
|T1|||||


**Bug report**

|Date and time||
|:-|:-|
|Description||
|Test case ID||
|Test steps||
|Input||
|Expected result||
|Achieved result||
|Other notes||
|Bug severity||


1 point: create at least 10 good* test cases and find at least 3 bugs

2 points: create at least 20 good* test cases and find at least 5 bugs (note that there is no real definition of what is bug in this game)


### Tehtävä 6-2 / Task 6-2

Palautettava viimeistään: maanantai, 31. heinäkuuta 2023, 23:59

**Testitynkien rakentaminen (2 pistettä)**

Tehtävänäsi on luoda test stubeja (testitynkiä, feikkimetodeja), jotta liiteenä olevan ohjelman testiajot saadaan suoritettua. Eli muokkaa DatabaseStub-luokkaa niin, että testiajot menevät läpi.

1 piste: luo puuttuvat tyngät

2 points: luo myös 2 uutta testitapausta per metodi

Palauta koodisi zip-pakettina



**Creating a test stubs (2 points)**

Create test stubs to test program provided as an attachment. As of now the test cases cannot be run as there is no working Database class. Your job is to create test stubs for the DatabaseStub class so that the tests will pass.


1 point: create the missing test stubs

2 points: create also 2 more test cases per method

Grading 0, 1 or 2 based on the excellence of the answer.

Return your solution as an exported zip-file.


Task-6-2.zip Task-6-2.zip 15. lokakuuta 2020, 12:43


### Tehtävä 6-3 / Task 6-3

Palautettava viimeistään: maanantai, 31. heinäkuuta 2023, 23:59

**Testauksen lopettaminen (1 piste)**

Tutki seuraavaa skenaariota,

Yrityksesi on kehittänyt verkkokauppaa puuleluja myyvälle asiakkeelle. Asiakas tarvitsee uuden kaupan, sillä heidän käyttämänsä nykyinen ratkaisu on jo osin rikki, eikä sisällä mahdollisuutta mobiilimaksamiseen. Projektisi on nyt kaksi kuukautta myöhässä, mutta asiakas on sanonut, että he olisivat jo valmiita hyväksymään tuotteen tuotantokäyttöön ja loppujen ongelmien korjaamisen vasta tuotannon aikana. Olet nähnyt testiraportit ja tiedät, että kaikki kriittiset ongelmat on jo ratkottu, mutta muita bugeja on vielä jäljellä. Käyttäjät eivät esimerkiksi voi päivittää sähköpostiosoitettaan profiiliinsa ja mikäli jotain tuotetta ostetaan enemmän kuin yksi kappale, näkyy se ostoskorissa moneen kertaan, eikä vain kerran lukumääränumerolla varustettuna. Migraatioskriptit on tuotettu sekä testattu ja tuotantoon vienti korvaamaan vanha järjestelmä voidaan suorittaa heti, kun vihreää valoa on näytetty.

Mitä sanoisit asiakkaalle? Onko järjestelmä valmis tuotantoon? Suosittelisitko käyttöönottoa?



**Ending the testing (1 point)**

Consider the following scenario.

Your company has been building a web store for a customer selling wooden toys. The customer needs a replacement for their old store that is broken here and there and does not accept mobile payment. Now your project is two months late, but the customer has been saying they are accepting the system already to production and the rest of the problems can be fixed later. You have been seeing the test reports and all the critical issues have already been sorted out, but there are still bugs left (such as users cannot update their email address in their profile and when they are ordering more than one instance of the product they are made visible as many times as they are ordered instead that there would be product name and counter to tell how many copies are ordered). Migration scripts have been tested and the process to replace the old system can be done whenever green light is shown.

What would you say to the customer? Is the system ready to be in production? Would you advise it?

