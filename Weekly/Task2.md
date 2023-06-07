
### Tehtävä 2-1 / Task 2-1
Palautettava viimeistään: maanantai, 31. heinäkuuta 2023, 23:59

**Suunnittele luokka**

Tehtävänäsi on suunnitella olio-ohjelmoinnin luokka (tai kaksi?), jonka tehtävä on hallita muutoksia Marsista Maahan tulevasta datasta ja päinvastoin.

Tehtävässä ei vaadita konkreettisen koodin kirjoittamista, vaan suunnitelmaa (luokkakaavio), mitä attribuutteja ja metodeja luokalla olisi. Onko mukana peritymistä tai vastaavaa kommunikaatiota luokkien välillä?

Ohjelma toimii osana avaruusalusta, joka matkustaa ja Maan ja Marsin välillä ja kommunikoi molempiin suuntiin.

Luokan tulee sisältää vähintään seuraavat ominaisuudet:
```
Muuntaa Marsin aika Maan aikaan ja päinvastoin
Antaa arvio, koska alus saapuu Marsiin/Maahan
Antaa arvio kuinka pitkän laskeumisen alus voi tehdä ennen polttoaineen loppumista 
(molemmilla planeetoilla, huomaa eri painovoima)
Etäisyys molempiin planeettoihin
Molempien planeettojen painovoima
Antaa arvio kuinka suurelle kosmiselle säteilylle astronautti altistuu matkan aikana
```
Mieti tarkkaan, millainen luokan tulisi olla kuinka haluat sen esittää.

0, 1, tai 2 pistettä perutuen vastauksen kattavuuteen.


**Design a class**

Your task is to design an object-oriented programming class (or two?), which handles modifications of Martian values to Earthling ones and other related things.

You do NOT need to write the actual code for such class, but to describe what methods and attributes the class should use, whether there should be inheritance, composition, etc.

This is part of a program running on starships travelling between Mars and Earth, it can communicate with both ends.


The class should handle at least the following tasks:

```
- Convert Martian time to Earth time and vice versa
- Give an estimate when the ship arrives to Mars/Earth
- Give an estimate on how long landing ship can make until it runs out fuel 
(on both planets)
- Distance from/to both planets
- Give the amount of gravity experienced from both planets
- Give an estimate on how much radiation dosage traveller has experienced 
 during the voyage
```
Think carefully what kind of presentation would be best to describe the outcome.

0, 1 or 2 points based on how sound is your solution.

<img src="https://github.com/saugkim/2023summer_Testaus_LUT/assets/25344978/905e792a-5c71-413f-8d39-570d8d60a2a1" width=250>


### Tehtävä 2-2 / Task 2-2

Palautettava viimeistään: maanantai, 31. heinäkuuta 2023, 23:59

**Tee testisuunnitelma luokalle**

Mieti ensimmäisessä tehtävässä luotua luokkaa. Millaisen testauksen suorittaisit sille, jotta näkisit toimiiko se, kuten oli tarkoitus? Kuka organisaatiossa/projektissa olisi paras suorittamaan testit? Missä ohjelmistokehityksen vaiheessa tämä testaus suoritetaan?

0, 1, tai 2 pistettä perutuen vastauksen kattavuuteen.


**Design a test plan for the class**

Think of the class designed in the first task. What kind of testing would you conduct to verify whether the class works as supposed to? Who would be the best tester to do the job? In which phase of the software development would the testing be conducted?

0, 1 or 2 points based on how sound is your testing solution

```
Convert Martian time to Earth time and vice versa
Give an estimate when the ship arrives to Mars/Earth
Give an estimate on how long landing ship can make until it runs out fuel (on both planets)
Distance from/to both planets
Give the amount of gravity experienced from both planets
Give an estimate on how much radiation dosage traveller has experienced during the voyage
```

```
-position
-velocity
-fuel
-planetFrom : Planet
-planetTo : Planet

+convertTimeEarthToMars(EarthTime)
+convertTimeMarsToEarth(MarsTime)
+getDistanceFromEarth(position)
+getDistanceFromMars(position)
+getGravityExperienced(position)
+getEstimatedArrivalTime(departureTime, planetTo)
+calculateMaxTravelDistance(currentFuel)
+getAmountOfRadiationExposure()
```

Unit-testing of all implemented methods in this class To ensure the coding itself does not have mistakes

Testing is done mainly by programmers/developers who writes the codes 

Unit-testing : lowest level of testing


### Tehtävä 2-3 / Task 2-3

**Kirjoita koodi luokan testaamiseen**

Kirjoita lyhyt Java ohjelma, jolla testaat esimmäisessä tehtävässä suunnitellun ohjelman (älä kirjoita itse ohjelmaa). Voit keksiä testausmetodit (vähintään 3) vapaasti.

0, tai 1 pistettä perutuen vastauksen kattavuuteen.


**Write the code to conduct the test cases**

Write a short Java program (actual code) to test the program (which you haven’t written yet!). You can implement testing methods (at least 3) by yourself.

0 or 1 point  based on how sound is your code

```
1. Test of time convert (earthtime) 
2. Estimated time to destination (current position) 
3. Calculate gravity (position)
```

