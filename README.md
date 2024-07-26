# Booking_Ticket_on_RedBus



#Project Description:
Objective:
Automate the process of searching for buses, selecting options, and booking a seat on the Abhibus website.

#Details:

#Dependencies:

Selenium WebDriver: Used for browser automation.
Cucumber: Used for defining BDD (Behavior Driven Development) tests.
WebDriverManager: Manages browser drivers.
Class: Steps

Contains step definitions for Cucumber scenarios.
#Step Definitions:

@Given("user is on homepage"):

Sets up the Firefox WebDriver.
Navigates to the Abhibus homepage and maximizes the browser window.
Waits for 3 seconds to ensure the page loads.
@When("user enters valid address,date and search"):

Interacts with input fields and buttons to:
Select 'From Station' (Bangalore).
Select 'To Station' (Hyderabad).
Click the 'Tomorrow' button to select the date.
Introduces delays to wait for each interaction to complete.
@Then("user clicks price drop, bus partners and three options"):

Clicks the 'Price Drop' checkbox.
Clicks the 'Bus Partner' dropdown.
Selects multiple options from the bus partners' list.
Waits for each action to be processed.
@Then("user select seat and dropping point"):

Clicks the 'Show Seats' button to view available seats.
Selects a seat (U7).
Chooses a dropping point (Electronic City).
Features of This Automation:
Search Functionality: Automates entering the source and destination locations, along with selecting the travel date.
Filter Options: Automates selecting filters like price drop and bus partners.
Seat Selection: Automates the process of selecting a seat and dropping point.
Notes:
Thread.sleep() is used for waiting between actions. In practice, it's better to use WebDriver’s explicit waits to handle dynamic content.
WebDriverManager simplifies the management of browser drivers.
