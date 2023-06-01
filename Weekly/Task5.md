### Tehtävä 5-1 / Task 5-1

Palautettava viimeistään: maanantai, 31. heinäkuuta 2023, 23:59

**Testausautomaatio (2 pistettä)**

Pomosi kysyy mielipidettäsi tulisiko yhtiön panostaa testausautomaatioon. Sinut on palkattu puoli vuotta sitten yrityksen 15. työntekijänä. Tittelisi on teknologiajohtaja. Yrityksessä on töissä 6 ohjelmoijaa, 1 testaaja, 3 suunnittelijaa ja loput ovat enemmän tai vähemmen tekemisissä myynnin kanssa.

Olet huomannut, että kehitystiimin pääarkkitehti on todellinen guru. Häneltä todellakin sujuu softan kehittäminen. Muut kehittäjät eivät ole yhtä kovia tekijöitä ja vasta-aloittaneilla kehittäjillä tuntuu olevan välillä ongelmia yksinkertaistenkin asioiden kanssa.

Yritys tuottaa ohjelmistoja useille asaikkaille. Yleensä ohjelmiston kehityskaari on kolmesta yhdeksään kuukautta. Testaaja on rakentanut omat työkalunsa ja skriptinsä, mutta et ole aivan varma mitä hän saavuttaa niillä. Tähän mennessä asiakkaat ovat olleet tyytyväisiä ohjelmistojen laatuun – joskin oli yksi tapaus, jossa dataa pääsi vuotamaan verkkoon.

Mitä vastaisit esihenkilöllesi? Mitä tekisit seuraavaksi testausautomaation saralla? Mitä et tekisi?

Arvostelu 0, 1 tai 2 pistettä pohjautuen vastauksen hyvyyteen.



**Test automation (2 points)**

Your boss asks your opinion whether the company should invest in test automation. You were hired 6 months ago as the 15th employee for the company. Your title is CTO. There are 6 programmers, one tester, 3 designers and others are more or less working with sales.

You have noted how the main architect of the development team seems to be a guru who really knows everything he is doing. Other developers are not that professional and the junior ones have problems with even the basic processes.

Now the company builds software for various customers. Usually projects take 3 to 9 months to complete. Tester has been building her own tools and scripts, but you are not quite sure what she has achieved with those. So far customers have been happy with the quality of the software – although there was one incident where private data was leaked.

What would you answer to your superior? What would you do next with software automation in mind? What would you not do?

Grading 0, 1 or 2 based on the excellence of the answer.


### Tehtävä 5-2 / Task 5-2

Palautettava viimeistään: maanantai, 31. heinäkuuta 2023, 23:59

**Integraatiotestaus (2 pistettä)**

Rakenna integraatiotestejä testataksesi liitteenä olevaa ohjelmaa. Ohjelmassa on kolme luokkaa: SpaceStation, Spacecraft ja Astronaut. Avaruusalus voi telakoiutua ja irrottautua avaruusasemasta, mutta se voi tehdä niin ainoastaan astronautin lentäessä alusta. Aluksen ollessa telakoituneena astronautit voivat liikkua avaruusaluksen ja -aseman välillä. Avaruusasema pysyy toimintakunnossa myös ilman astronautteja.

Toteuta testit, joilla voit verifioida tämän toiminnan. Onko testin kanssa ongelmia vai menevätkö kaikki testit läpi? Keskity integraatiotestien tekemiseen, mutta älä unohda yksikkötestejä.

1 piste: luo vähintään 4 hyvää* uutta integraatiotestiä ja 2 yksikkötestiä

2 pistettä: luo vähintään 6 hyvää* uutta integraatiotestiä ja 4 yksikkötestiä

+ Hyväksi ei lasketa saman testin ajamista vain pienillä muutoksilla (esim. syötteen muutos "AA" -> "BB")

Palauta ratkaisusi zip-tiedostona.


**Integration testing (2 points)**

Create an integration tests to test program provided as an attachment. There are three classes: SpaceStation, Spacecraft and Astronaut. Spacecraft can dock and undock from the space station, but it can be done only if there is an astronaut piloting the Spacecraft. While the spacecraft is docked the astronaut can move from the spacecraft to the space station. Space station can live without an astronaut.

Create tests to verify this behavior. Are there problems within the tests or are all the tests passing? Concentrate on building integration tests, but do not forget unit tests.


1 point: create at least 4 good* new integration tests and 2 unit tests

2 points: create at least 6 good* new integration tests and 4 unit tests


+ It is not considered good if same test is run with slight modifications (such as input “AA” an “AB”)

Return your solution as an exported zip-file.


Docking.zip Docking.zip 4. lokakuuta 2022, 16:01


### Tehtävä 5-3 / Task 5-3

Palautettava viimeistään: maanantai, 31. heinäkuuta 2023, 23:59

**Integraatiotestejä (1 piste)**

Tee lisätestejä seuraavan kuvauksen pohjalta.

Avaruusaluksella on mahdollisuus laskeutua takaisin Maahan ja sen jälkeen taas lentää raketilla takaisin avaruuteen. Rakettia ei voida laukaista ilman avaruusalusta ja avaruusaluksella täytyy olla lentäjä. Raketti laskeutuu takaisin maahan ja on sitten valmiina uudelle lennolle. Lentäjä täytyy vaihtaa, kun avaruusalus on takaisin Maassa.

Sinun ei tarvitse kehittää Earth- ja Rocket-luokkia, vaan ainoastaan integraatiotestejä 6 kappaletta.

Palauta ratkaisusi zip-tiedostona.


**Integration tests (1 point)**

Create additional test cases for the following description:

Spacecraft has an option to land back to Earth and then ride with a rocket back to the space station. Rocket cannot be launched without the spacecraft and the spacecraft itself needs to have a pilot of course. Rocket lands back to Earth and is then ready for another launch. The pilot needs to be changed when the spacecraft is on Earth.

Once again you are not required to develop the code, but only tests. 

Create at least 6 test cases.

Return your solution as an zip-file.

