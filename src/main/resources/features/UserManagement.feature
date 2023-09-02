Feature: Book Management
  As a user
  I want to be able to manage books
  So that I can add, get, update, and delete books

  #Ctrl + Alt + L


  @adduser
  Scenario: Verify the user added successfully
    Given the user has a new book
      | firstname | lastname | email                 | password |
      | John      | Doe      | tt21.doie@example.com | pass123  |
    When the user calls the AddUser request
    Then the user should be added successfully

  @searchuser
  Scenario: Verify the user searched successfully
    Given the user has an id to search
    When the user calls the getUser request
    Then the user should be searched successfully


