# SeleniumBDDFramework

selenium-cucumber-java-maven
selenium-cucumber : Automation Testing Using Java

selenium-cucumber is a behavior driven development (BDD) approach to write automation test script to test Web. It enables you to write and execute automated acceptance/unit tests. It is cross-platform, open source and free. Automate your test cases with minimal coding.


# Pre-requisites
Java
Maven
Eclipse
Eclipse Plugins
Cucumber

# Setting up selenium-cucumber-java
Install Java and set path.
Install Maven and set path.
Install testng in Eclispe.
Convert Project into cucumber project.

# Running features
Goto project directory.

Use "mvn test" command to run features.

browser_name can be one of following but make sure that browser’s driver file are present and specified in system variable. -- ff -- chrome -- ie -- safari

Use mvn test -Dcucumber.options="classpath:features/my_first.feature" to run specific feature if you have multiple feature files.


