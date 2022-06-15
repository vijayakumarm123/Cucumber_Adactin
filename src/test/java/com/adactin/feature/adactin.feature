Feature: Hotel Booking In Adactin Application

Scenario: User Login The Web Application
Given user Launch The Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button And It Navigate To Search Hotel Page

Scenario: User Search Hotel In The Web Application 
When user Select The Hotel Location In The Dropdown
And user Select The Hotel In Hotels Dropdown
And user Select The Room Type In The Dropdown
And user Select The Number Of Rooms In The Dropdown
And user Enter The InDate In Check In Date Field
And user Enter THe OutDate In  Check Out Date Field
And user Choose The Adults Per Room In The Dropdown
And user Choose The Children per In The Dropdown
Then user Click The Search Button And Its Navigate To The Select Hotel Page

Scenario: User Select The Hotel In The Web Application
When user Click The Radio Button In The Sleect Hotel
Then User Click The Continue Button And It Navigate To The Book Hotel Page

Scenario: User Book The Hotel In The Web Application
When user Enter The First Name In The First Name Field
And user Enter The Last Name In The Last Name Field
And user Enter The Address In The Address Field
And user Enter The Credit Card Number In The Credit Card Field
And user Select The Credit Card Type In The Dropdown
And user Select The Expire Month In The Dropdown
And user Select The Expire Year In The Dropdown
And user Enter The Cvv Number In The Cvv Number Field
Then user Click The Booknow Button And It Navigate The Booking Conformation Page

Scenario: User Logout The Web Application
Then user Click The Logout Button And It Will Navigate To The Next Page And Show The Message You Have Successfully Logged Out

