Feature: Application login

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "http://www.qaclickacademy.com/" site 
And Click on login link in homepage to land on secure sign in page
When User enters <username> and <password> and logsin

Examples:
|username          |password   |
|test55@gmail.com  |123456     |
|arpit.arjaria.com |639392     |
