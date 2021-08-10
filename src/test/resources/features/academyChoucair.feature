#Autor: Eduardo Dudley
@stories
Feature: Academy Choucair
  As a New User, I want to Create an account in Utest website using screenplay  with the knowledge learnt at the Choucair Academy automation course
  @Scenario1
  Scenario: Create a New User
    Given than Eduardo wants to create a new user at Utest
    When he fill out the Sign up form
      | strName | strLName| strEmail           |strMonth| strDay |strYear | strZip | strPassword  |
      | Eduardo | Dudley  |ewdy_rec@hotmail.com| June   | 25     |  1997  | 3655   | Choucair2021 |
    Then he completes the Sign up form
      | strComplete         |
      | Welcome to the world|
