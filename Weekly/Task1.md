**Tehtävä 1-1 / Task 1-1**

Kuvaa 5 eniten sinua häirinnyttä bugia, johon olet törmännyt. Ne voivat olla netissä vastaan tulleita, puhelimen bugailuja, pelien ongelmia, hissien toimimattomuuksia, autojen ongelmia... Kuvaile konkreettisia ongelmia, joihin olet törmännyt, älä vain yleisellä tasolla.

Describe 5 most annoying bugs you have encountered. Those can be in the web environment, in mobile phones, in games, elevators, cars... Describe in detail, not just in general level.


**Tehtävä 1-2 / Task 1-2**

Kuvitellaan, että jokin yliopisto lanseeraisi opiskelijaportaalin opiskelijoille nyt – kutsutaan sitä vaikka https://elut.lut.fi/:ksi. Mitä testaisit ennen palvelun tuomista tuotantoon?

Kirjoita lista testejä, jotka suorittaisit. Esimerkiksi 

"Testi 1: kirjautuminen tulee onnistua Android-puhelimella, 
 Testi 2: palvelu tulee olla saavutettavissa ruudunlukijalla".

Kirjoita 10 hyvää testiä ja saat 1 pisteen.

Kirjoita 20 hyvää testiä ja saat 2 pistettä.

Hyvällä tarkoitetaan, että testit ovat järkeviä ja ne eroavat toisistaan



Let’s assume some university would launch a web portal to students now – let’s call it https://elut.lut.fi/. What would you test there before it is brought to production?


Write a list of tests that you would conduct. For example “Test 1: login should work with an Android phone; Test 2: accessibility should be possible with screen reader”

Write at least 10 good tests and you get 1 point.

Write at least 20 good tests and you get 2 points.

By good it is meant that the tests are different and make sense.


```
**Functional testing**

Test1: unit tests: any-all implemented feature (click or touch event listener) 
Test2: integration tests: moodle-mail-account 

**Non-functional testing**

Test3: testing compatibility on different Operating system and device - windows, mac, linux, android...
Test4: testing on various screen size - desktop monitors, phone, tablet
Test5: testing compatibility on different web browsers and versinos - should work major web-browsers like chrome, safari, firefox, edge 
Test6. testing loading speed - wired, wi-fi, 5G?
Test7. testing web security - regulation web data security & privacy policies
Test8. testing usability - user experience, ui elements are well visible?
Test9. testing availability - 24/7 
Test10: testing scalability - how many users can connect to server at the same time?
```


**Tehtävä 1-3 / Task 1-3**

Kuinka monta bugia pystyt löytämään liitteenä olevasta yksinkertaisesta Java-ohjelmasta? Voit ajaa ohjelman esim. VS Codella tai Netbeanssilla. Huomaa, että sinulla täytyy olla 

```
Kuvaa löytämäsi bugit. 

Bugin nimi:

Kuinka se saadaan aikaan:

Millä ympäristöllä (käyttis, Javan versio) se syntyi?:

Pisteen saavuttamiseen täytyy raportoida ainakin 5 (mitä tahansa) bugia.
```

T1-3.zip avaantuu NetBeanssillä ja testaus-1-3.zip on myötämielisempi VS Codelle.

How many bugs can you find from the program provided here? The attached zip is a simple java program – you can import it to e.g. VS Code or Netbeans and run.


Describe all the bugs you found. 
```
Name of the bug:

How it is produced:

With what environment (OS, Java version) it was produced:
```

To get the point at least 5 problems (of any kind!!!) have to be found.


```
Name of the bug: unhandling invalid user input - out of range

How it is produced: when user write the number which is out of the grade (4-10)
Those numbers are invalid inputs and should be excluded when calculate the average


Name of the bug: unexpected ending 

How it is produced: when user write integer number 10, the program ends the loop.
10 is valid number but because condition of while loop is wrong -string input "10" contains "0"-, the condition should be input string is equal to "0" not containing "0" in it.


Name of the bug: program termiation with input 0

How it is produced: when user wants to terminate the program, input is 0.
The while loop condition does not check user input before loop starts, the program reads user input inside while-loop, so first input always pass through the while loop. 
User input 0 should terminate the program immediately, but it add 0 to the grade list.


Name of the bug: wrong average from wrong divisor 

How it is produced: when user write valid number several times, but to terminate user should input "0", 0 is included into the list, total sum remains as same(adding 0) but size of the grades list is wrong, 0 should be not there. 


Name of the bug: unhandling empty list, ending program when there is no input 

How it is produced: In case first user-input is "0", it should be empty list, so proper message should be printed out. Currently average value is 0.
System.out.println(c.divider(c.sum(vec), vec.size())) 


All tests are done on Windows 11. Java 19.0.2 2023-01-17 using visual studio code.
All issues are reproducible.
```



 

