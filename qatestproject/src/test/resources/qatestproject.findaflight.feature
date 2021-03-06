Feature: Sign-on and Flight Search Test

Scenario: Sign-on with Valid Credentials

Given User is on http://newtours.demoaut.com/mercuryreservation.php
When user selects Round Trip
When user selects 2 Passengers
When user selects Paris as the departing city
When user selects the date of December 24
When user selects Seattle as the departure city
When user selects returning date of December 30
When user selects Business Class for Service Class
When user selects United Airlines for airline
Then user clicks on Continue Button