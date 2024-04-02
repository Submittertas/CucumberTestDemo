Feature: Hooks in Cucumber

Scenario: Add new Customer
Given user is on Add New Customer page
When user fills the customer details
And click the Add button
Then customer is added


Scenario: Edit customer
Given the user is on the edit Customer page
When user edits the customer details
And click the Update button
Then Customer details is updated


Scenario: Delete Customer
Given user is on delete customer page
When user deletes customer
Then customer is deleted
