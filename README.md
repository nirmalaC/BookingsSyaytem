Framework Design Approach
=================
I have used selenium-cucumber-Maven with PageFactory Design Pattern.

Selenium-cucumber is a behavior driven development (BDD) approach to write automation test script to test Web.
Page Factory is an inbuilt Page Object Model concept for Selenium WebDriver but it is very optimized.Here we follow the concept of separation of Page Object Repository and Test Methods. Additionally, with the help of PageFactory class, we use annotations @FindBy to find WebElement. We use initElements method to initialize web elements.

Tools And Environment :
-----------------------
1. IntelliJ IDEA 2016
2. Java-8
3. Maven-3.5.3
4. Enable cucumber-java plugin in IntelliJ
5. Git
6. Required driver versions (Chrome-v2.38 & Gecko-v0.20.1)
7. Required browsers (Chrome-v66.0 & Firefox-v60.0)
8. Windows 64bit

Configure JAVA_HOME and MAVEN_HOM in the Environmental Variables : Follow the setup instructions specified in here https://www.mkyong.com/maven/how-to-install-maven-in-windows/  

Note :
------
Download this project into the c drive to run the tests.

Test Architecture :
-----------------
	HotelBookingSystem
		|src/main/
		|src/test/java
		|	|pageobjects
		|	|	|BookingHomePage
		|	|	|Helpers
		|       |stepDefinitions
		|	|   |    |Hooks
        |	|	|	|StepDefinitions
        |	|	|	|ApiStepDefinitions
        |   |ApiTestRunner
        |   |TestRunner
		|src/test/resources
		|	|Features
		|	|	|hotelBooking.feature
		|	|Config.Properties

- HotelBookingSystem/Drivers - All the required drivers to run the tests are specified here.

- src/test/java/resources/features** - all the cucumber features files (files .feature ext) goes here.
- src/test/java/resources/Config.properties - All the required configuration properties are defined here (e.g : website url, browsers).

-src/test/javapageobjects/BookingHomePage - This is the PageFactory all the webelemnets are initialized here.
-src/test/javapageobjects/helper - All the required helpers like webdriver wait are defined here.

- src/test/java/stepDefinitions/StepDefinitions - All the step definitions are implemented here.
- src/test/java/stepDefinitions/Hooks - All the step definitions are implemented here.
- src/test/java/stepDefinitions/TestRunner - This is the cucumber test runner file used to run tests.

Writing a test :
----------------
The cucumber features goes in the `Features` library and should have the ".feature" extension. The

Running test :
--------------
You can run the test by using test runner file:
- Go to TestRunner file and click run button

OR 

Run using maven commands through terminal:
- "mvn test" This will run tests on default browser which is set to chrome.
- "mvn test -Dbrowser=browserName" This will run tests on either Chrome or Firefox based on the given browserName.

Cucumber Reports :
------------------

Once the tests are executed the reports are generated in HTML format inside target/cucumber-reports.
Right click on the index.html file and select open in browser, we can view the cucumber reports in web browser.

Note : 
-----
You need to have all the specified environment setup to run the tests.