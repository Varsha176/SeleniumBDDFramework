#Author: Varsha Rajput
@Test
Feature: Feature to test Whether Information

  @test1
  Scenario Outline: Successfully Store whether info from UI.
   Given Launch Application
   When User Navigate to whether section
   And Pin a city
   And validate the temprature 
   When Click on any Other City
   And Save the whether details
   When Launch Whether Api for "<City>"
   And Fetch Temp data for "<City>" 
   When Convert temp from kelvin to celcius
   And Check variance in temprature
   Examples:
   |City|
   |Ajmer|
   |Patna|
   
   
  
   
   
   