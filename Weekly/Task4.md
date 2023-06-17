### Tehtävä 4-1 / Task 4-1

**Kuinka testata (2 pistettä)**

Saat tehtäväksesi testata paikallisen pizzerian verkkosivut. Sivustolla on mahdollisuus käydä läpi tavallinen menu, rakentaa omavalintainen pizza ja ostaa pizzoja. Maksu onnistuu kaikenlaisilla verkkomaksuilla (ml. mobiilimaksut). Sivustolle tuotetaan myös videoblogia ja käyttäjä voi jättää pizzoihin kommentteja rekisteröidyttyään sivustolle. Joskus tarjolla on myös kilpailuja, joihin asiakkaat voivat osallistua. Asiakkaat voivat myös ehdottaa ja äänestää uusia pizzoja.

Sinulla ei ole pääsyä verkkosivuja pyörittävälle pavelimelle, eikä sinulla ole admin-tunnuksia verkkopalveluun.

Mitä testaisit? Miten dokumentoisit testauprosessin ja testitapaukset? Mihin keskittyisit testaamisessa? Sinulla on tasan yksi viikko aikaa suorittaa tarvittavat tehtävät. Riittäkö se? Miksi/miksi ei? Mitä ongelmia tässä kokonaisuudessa on?

Arvostelu 0, 1 tai 2 pistettä vastauksen oikeellisuuden pohjalta.


**How to test (2 points)**

You got a task to test the local pizzeria website. The site has an option to go through the menu, build a custom pizzas and buy them. Payment is carried out with mobile paying methods (i.e. with phone). There is also a video blog on the site and you can leave your comments on pizzas after you have registered to the site. Occasionally some contests are released on the page and customers can participate on them. They can also vote for new pizzas.


You have no access to the server running the software and you don’t have any admin rights to the web site.

What would you test? How would you document the testing process and test cases? Where would you focus on your testing? You have one a week time slot to do all the necessary tasks. Is that enough? Why/why not? What problems the setting has?

Grading 0, 1 or 2 based on the excellence of the answer.


What would you test?  
**Functionality test:**
```
verify if there is no invalid pages or redirects. (including unvalidated Redirects and Forwards)
 
check all the validations on each field if there is any user input. (including user inputs from registration and payment)

verify the workflow of the system (searching menu, ordering and paying, participating event and so on).
```
**Non-functionality test:**

```
1. Usability testing - To verify how the application is easy to use with.

  - Test the navigation and controls.
  - Check the content (including typos, ingredients and prices)
      -- Main page
      -- search product, nearest pizza restaurant 
      -- product page 
      -- payment interface (to mobile pay)
  
2. Compatibility testing- Compatibility testing is performed based on the context of the application.
  - Browser compatibility
  - Operating system compatibility
  - Compatible to various devices like notebook, mobile, tablets etc.

3. Performance testing - verify the server response time
  - Load testing : measure loading time (under various network connection) 

4. Database testing - detail of account (name, address, phone number) and history of ordering and participating events, favorate manu
```

How would you document the testing process and test cases?   
  - I will use some documentation tool (like jira) 
  - create a report which contains full list of test cases, 
  - each test case has id, date-time of conduct, tester, title and result (expected and actual)

Where would you focus on your testing?  
  - functionality test and usability test
  
You have one a week time slot to do all the necessary tasks. Is that enough? Why/why not? What problems the setting has?  
  - considering the size of application(small and simple), the functionality test can be done with one week time window, but the non-functionality like performance test (stress, load testing) or security test will depend on number of testers(skilled or non-skilled) and/or devices working on it.  



### Tehtävä 4-2 / Task 4-2

**Yksikkötestit (2 pistettä)**

Liitteenä on painoindeksilaskuriohjelma. Ohjelmassa on BMICalc-luokka, joka kykenee palauttamaan numeerisen painoindeksin ja sanallisen kuvauksen painoindeksistä. Kirjoita ohjelmaan lisää testejä. Huomaa, että ohjelmassa voi olla myös ongelmakohtia, jotka saadaan kiinni hyvillä testeillä.

1 piste: tee ainakin 5 hyvää* testiä

2 pistettä: tee ainakin 7 hyvää* testiä ja korjaa BMICalc-luokan ongelmia

+ Hyväksi testiksi ei lasketa vain pientä variaatiota edellisestä testistä (esim. syötteenä 15 ja 16).


**Unit testing (2 points)**

Take the BMI calculator (as attachment here) and improve testing to cover more test cases and possible issues with the design.


1 point: create at least 5 good* new tests

2 points: create at least 7 good* new tests cases and fix the issues with the BMICalc class

+ It is not considered good if same test is run with slight modifications (such as input “AA” an “AB”)

Return your solution as an exported zip-file.


BMI-Calculator.zip BMI-Calculator.zip 26. syyskuuta 2022, 18:36

### Tehtävä 4-3 / Task 4-3

**Testivetoinen kehitys (1 piste)**

Kirjoita testejä seuraavalle ongelmakuvaukselle.

On olemassa lääkäri ja potilas luokat. Lääkäri pystyy tutkimaan potilaita ja antamaan heille lääkärintarkastusraportin. Raportti voi olla muotoa "Rouva, painoideksisi on 24, mikä tarkoittaa, että olet täysin normaali."

Raportin saa seuraavalla rivillä koodia:

doctor.getPhysicalReport(patient);

Tehtävänäsi ei siis ole koodata lääkäri- ja potilasluokkia, vaan ainoastaan testejä. Voit keksiä itse metodeja lisää.

Mikäli painoindeksi ei ole tuttu, löydät siitä lisää tietoa Wikipediasta:   https://fi.wikipedia.org/wiki/Painoindeksi

Palauta ratkaisusi zip-tiedostossa.


**Test-driven development (1 point)**

Create additional test cases for the following description:

There are doctor and patient classes and doctors are able to examine patients and then give them “full physical report” meaning they give a textual message such as “Dear madam, your BMI is 24, which means you are normal.”

You could get the final result with the following line of code

doctor.getPhysicalReport(patient);

Once again you are not required to develop the code, but only tests. 

More information on BMI one can found from Wikipedia:   https://en.wikipedia.org/wiki/Body_mass_index

Return your solution as an exported zip-file.


