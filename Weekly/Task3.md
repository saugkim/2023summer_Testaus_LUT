### Tehtävä 3-1 / Task 3-1


**Testauksen lähestymistavat (1 piste)**

Miksi lasilaatikkotestaus ei ole soveltuvat tapa hyväksymistestaukseen?

Arvostelut 0 tai 1 pistettä vastauksen oikeellisuuteen pohjautuen.


**Testing approaches (1 points)**

Why is whitebox testing not a suitable approach for acceptance testing?

Grading 0 or 1 based on the excellence of the answer

-->
White box testing is a testing method that a tester has full knowledge of the software being tested, including access to source code and design documents. This testing is performed at low-level phase (unit or module testing) and usually coding skills are required.
On the other hand, acceptance testing is the last phase of the software testing process and is performed by customer(who does not need to understand the source code) to make decision about product. Therefore white-box testing is not suitable for the acceptance testing.


### Tehtävä 3-2 / Task 3-2

Palautettava viimeistään: maanantai, 31. heinäkuuta 2023, 23:59

**Testauksen lähestymistavat (1 piste)**

Miksi ei-funktionaalisten testien automatisointi on vaikeampaa kuin funktionaalisten testien?

Arovostelu 0 tai 1 piste pohjautuen vastauksen oikeellisuuteen.


**Testing approaches (1 point)**

Why are non-functional tests harder to automate than functional ones?

Grading 0 or 1 based on the excellence of the answer

-->
Some part of non-functionality might be tested automatically (availability? 24h, performace), but features related with subjective matters like usability, user experience, might not or cannot be tested automatically.


### Tehtävä 3-3 / Task 3-3

Palautettava viimeistään: maanantai, 31. heinäkuuta 2023, 23:59

**Yksikkötestit (2 pistettä)**

Kirjoita yksikkötestit liitteenä olevalle ohjelmalle.

Huomaa ohjelman määrittely: "Täytyy kehittää ohjelma, joka osaa käsitellä eläimiä: kissoja, koiria ja siilejä. Ei enempää, eikä vähempää. Eläinten tulee palauttaa luokkansa nimi ja hudella pyydettäessä ja niillä tulisi aina olla sekä nimi että ikä ja tapa saada ja muokata niitä haluttaessa.

Älä muokkaa itse ohjelmaa! Luo vain testit kattamaan määrittely. Epäonnistuvatko jotkin testit? Miksi/miksi eivät?

1 piste: luo vähintään 8 hyvää* testiä

2 pistettä: luo vähintään 12 hyvää* testiä

+ Hyviksi testeiksi ei lasketa testejä, jotka ottavat sisäänsä vain hieman erilaisen syötteen, kuten "AA" ja "AB".

Palauta ratkaisusi zip-tiedostona.


**Unit testing (2 points)**

Write unit tests for the program in attachment.

Note the specification of the program: “One needs to develop a program that can handle animals: cats, doges and hedgehogs. Nothing more or less. Animals should return their class name and shout when asked and they should always have name and age and a way to get and modify them when needed”

Do not modify the program itself, but write tests to cover the specification. Do some tests fail? Why/why not?


1 point: create at least 8 good* tests

2 points: create at least 12 good* tests


+ It is not considered good if same test is run with slight modifications (such as input “AA” an “AB”)

Return your solution as an exported zip-file.

### Tehtävä 3-4 / Task 3-4

**Testivetoinen kehitys (1 piste)**

Kirjoita yksikkötestit seuraavan ongelmakuvauksen pohjalta. Sinun ei tarvitse kirjoittaa itse ohjelmaa(Starship), vaan ainoastaan testit (StarshipTest).

"Kirjoita luokkaa Starship. Sen tulee sisältää käytössä oleva määrä nestemäistä happea ja nestemäistä metaania (maksimiarvot hapelle 800 000 kg ja metaanille 400 000 kg), tilaa hyötykuormalle ja lukumäärä kyydissä oleville astronauteille. Tämän lisäksi aluksen tulee kyetä liitämään ilmassa, irtautua kantoraketista ja käynnistää laskeutuminen moottoreilla, mikäli vähintään 10% polttoaineesta on vielä jäljellä. Kaikki määritellyt attribuutit tulee olla saavutettavissa julkisten rajapintojen kautta. Metodit palauttavat 0, mikäli tehtävä onnistuu ja virhekoodin (0-32000), mikäli virheitä sattuu."

Palauta ratkaisusi zip-tiedostona, jossa on koko projekti.


**Test-driven development (1 point)**

Write unit tests for the following description. You don’t need to write the actual program, but to exercise test-driven development.

“Build a class called Starship. It should include the available amount of liquid oxygen (LOX) and methane (max values being 800 000 kg for LOX and 400 000 kg for methane), a place for various cargo packets, number of humans aboard, way to do skydiving, detaching from booster rocket and start landing burn if there is still more than 10% of fuel left. All the specified variables should be accessible through public interface. And methods return 0, when they have been carried out their task or error code (1-32000) if not.”

Return your solution as an exported zip-file.
