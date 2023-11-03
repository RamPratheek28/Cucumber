Feature: Hotel Booking In Adactin Application

@smokeTest
Scenario: User Login In The Web Application
Given user Launch The Url In Adactin Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login button and It Navigates To Search Hotel Page

@smokeTest
Scenario: User Search Hotel In The Web Application
When user Select The Locations In The Dropdown Field
And user Select The Hotels In The Dropdown Field
And user Select The Roomtype In The Dropdown Field
And user Select The Number of Rooms In the Dropdown Field
And user Enter The Date Check In Date Field
And user Enter The Date Check Out Date Field
And user Select The Adults Per Room In The Required Field
And user Select The Children Per Room In The Required Field
Then user Click The Search button and It Navigates To Select Hotel Page

@smokeTest
Scenario: User Select Hotel In The Web Application
When user Select The Hotel By Clicking Select button
Then user Click The Continue button and It Navigates To Hotel Booking Page

@smokeTest
Scenario: User Book Hotel In The Web Application
When user Enter The First Name In The Username Field
And user Enter The Last Name In The Lastname Field
And user Enter The Billing Address In The Required Field
And user Enter The Sixteen Digit Credit Card Number In The Required Field
And user Select The Credit Card Type In The Dropdown Field
And user Select The Expiry Date and Expiry Year In The Dropdown Field
And user Enter The CVV Number 
Then User Click The Booknow and It Navigates To The Booking Confirmation Page







