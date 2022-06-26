Feature: Hotel Booking In Adactin Application

Scenario: user Login In The Web Application

Given user Launch The Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button And it Navigate To Search Hotel Page

When user Select The Location In Location Field
And user Select The Hotel In Hotels Field
And user Select The Room Type In Room Type Field
And user Select The Rooms In Number of Rooms Field
And user Choose The In Date In Check In Date Field
And user Choose The Out Date In Check Out Date Field
And user Select Adult Room In Adult Per Room Field
And user Select Child Room In Child Per Room Field
Then user Click The Search Button And it Navigate To Select Hotel Page

When user Select The Preferrable Hotel In Select Field
Then user Click The Continue Button And it Navigate To Book A Hotel Page

When user Enter the First Name In The First Name Field
And user Enter the Last Name In The Last Name Field
And user Fill the Address In The Billing Address Field
And user Enter the Card Number In the Credit Card No Field
And user Choose the Card Type In the Credit Card Type Field
And user Select Month and Year In the Expiry Date Field
And user Enter the CVV Number In the CVV Number Field
Then user Click The Book Now Button And it Navigate To Booking Confirmation Page

Then user Click Logout Button In The Logout Box
