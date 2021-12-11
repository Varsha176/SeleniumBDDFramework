#Author: Varsha Rajput
@Test
Feature: Feature to test Login Functionality

  @Login
  Scenario: Validate Login in the application.
   Given Open Application
   When User Click on Sign in
   Then Login page opens
   When User enter username as "TestUser@gmail.com"
   And Enter password as "TestUser"
   And User Click on Sign in button
   Then User gets warning
