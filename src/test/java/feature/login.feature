Feature: Login functionality

Scenario: Default login

Given User is on landing page

When user need to enter uername "praad" and password "1234"

And click on login buclick on login buttontton

Then The user successfully login into application "true"


Scenario: Negative login

Given User is on landing page

When user need to enter uername "babu" and password "4321"

And click on login buclick on login buttontton

Then The user successfully  login into application "false"


Scenario: Signup Functionality

Given User is signup page

When need to enter all the required details for 
| jenny  | abcd | prasadbabu457@gmail.com | Australia | 342543|

Then home page is populated

Scenario Outline:Home page default login
Given user is on the netbanking landing page
When user login in to application<Username> and <Password>
Then Home page is displayed

Examples:
|Username|Password|
|un1pra |pw122|
|un2cra |pw233|
|un3dra |pw322|
|un4tra |pw433|

