Feature: Book Management
  As a user
  I want to be able to manage books
  So that I can add, get, update, and delete books


@adduser
  Scenario: Verify the user added successfully
    Given the user has a new book
      | firstname  | lastname   | email                 | password   |
      | John       | Doe        | bin.doie@example.com | pass123    |
   When the user Call AddUser request
   Then the user should be added successfully

